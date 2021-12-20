package com.denominations.driver;

public class MergeSortImplement {
	
	void merge(int notes[], int left, int mid, int right)
    {
        
        int size1 = mid - left + 1;
        int size2 = right - mid;
 
        
        int Left[] = new int [size1];
        int Right[] = new int [size2];
 
        
        for (int i=0; i<size1; ++i)
            Left[i] = notes[left + i];
        for (int j=0; j<size2; ++j)
            Right[j] = notes[mid + 1+ j];
        
        int i = 0, j = 0;
        
        int k = left;
        while (i < size1 && j < size2)
        {
            if (Left[i] >= Right[j])
            {
                notes[k] = Left[i];
                i++;
            }
            else
            {
                notes[k] = Right[j];
                j++;
            }
            k++;
        }
        
        while (i < size1)
        {
            notes[k] = Left[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < size2)
        {
            notes[k] = Right[j];
            j++;
            k++;
        }
    }
	
	void sort(int notes[], int left, int right)
    {
        if (left < right)
        {
            // Find the middle point
            int mid = (left+right)/2;
 
            // Sort first and second halves
            sort(notes, left, mid);
            sort(notes , mid+1, right);
 
            // Merge the sorted halves
            merge(notes, left, mid, right);
        }
    }

}
