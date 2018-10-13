package by.bsuir.Akentyeva.Task5.util;

public class LongestSubsequenceTask {

    private int findIndex(int numArray[],int leftIndex,
                          int rightIndex, int key)
    {
        while (rightIndex - leftIndex > 1)
        {
            int middle = leftIndex + (rightIndex - leftIndex)/2;
            if (numArray[middle] >= key)
                rightIndex = middle;
            else
                leftIndex = middle;
        }

        return rightIndex;
    }

    public int fingLongestIncreasingSubsequenceLength(int numArray[]) {
        if ((numArray == null) || (numArray.length == 0)) {
            return 0;
        }

        int size = numArray.length;
        int[] tailTable   = new int[size];
        int maxLength = 1;
        tailTable[0] = numArray[0];

        for (int i = 1; i < size; i++)
        {
            int element = numArray[i];

            if (element < tailTable[0]) {
                tailTable[0] = element;
            } else if (element > tailTable[maxLength - 1]) {
                tailTable[maxLength++]  = element;
            } else {
                tailTable[findIndex(tailTable,-1,
                        maxLength - 1, element)] = element;
            }
        }

        return maxLength;
    }
}
