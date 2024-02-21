public class CustomLinkedList<T> {
    ListValue<T> firstValue;

    CustomLinkedList() {
        this.firstValue = null;
    }

    long getListSize() {
        ListValue<T> value = this.firstValue;
        long count = 0;
        while (value != null) {
            count += 1;
            value = value.nextValue;
        }
        return count;
    }

    void push_front(T value) {
        if (this.firstValue == null) {
            this.firstValue = new ListValue<T>(value);
            return;
        }
        ListValue<T> listValue = new ListValue<T>(value);
        listValue.nextValue = this.firstValue;
        this.firstValue = listValue;
    }

    void push_back(T value) {
        if (this.firstValue == null) {
            this.firstValue = new ListValue<T>(value);
            return;
        }
        ListValue<T> listValue = this.firstValue;
        while (listValue.nextValue != null) {
            listValue = listValue.nextValue;
        }
        listValue.nextValue = new ListValue<T>(value);
    }

    T get(long index) {
        if (getListSize() <= index || index < 0) throw new IndexOutOfBoundsException("size = " + getListSize() + ", requested index " + index + " is out of bounds.");
        ListValue<T> value = this.firstValue;
        for (long i = 0; i < index; i++) {
            value = value.nextValue;
        }
        return value.value;
    }
}

class ListValue<T> {
    public T value;
    public ListValue<T> nextValue;

    ListValue(T value) {
        this.value = value;
        nextValue = null;
    }
}