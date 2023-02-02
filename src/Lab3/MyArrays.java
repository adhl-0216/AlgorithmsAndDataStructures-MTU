package Lab3;

public class MyArrays {
    public static int insert (int[] values, int currentSize, int pos, int newElement) throws IllegalArgumentException{
        if (pos >= values.length) throw new IllegalArgumentException("pos must be less than " + values.length);
        if (pos < 0) throw new IllegalArgumentException("pos can not be less than 0 ");
        if (currentSize < values.length) {
            for (int i = currentSize-1; i >= pos; i--) {
                values[i+1] = values[i];
            }
            values[pos] = newElement;
            currentSize++;
        }
        return currentSize;
    }
}
