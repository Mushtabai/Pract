
public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        }
        return null;
    }


}