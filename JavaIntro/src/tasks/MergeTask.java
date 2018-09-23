package tasks;

public class MergeTask {

    public double[] mergeArrays(double[] sourceArray, double[] insertArray) {
        if (sourceArray == null) {
            return insertArray;
        }

        if (insertArray == null) {
            return sourceArray;
        }

        double[] result = new double[sourceArray.length + insertArray.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < sourceArray.length && j < insertArray.length) {
            result[k++] = (sourceArray[i] < insertArray[j])
                    ? sourceArray[i++]
                    : insertArray[j++];
        }

        while (i < sourceArray.length) {
            result[k++] = sourceArray[i++];
        }

        while (j < insertArray.length) {
            result[k++] = insertArray[j++];
        }

        return result;
    }
}