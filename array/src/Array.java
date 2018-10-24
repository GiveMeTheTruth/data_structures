public class Array {

    private int[] data;
    private int size;

    // 构造函数，传入数组的容量capacity 构造Array
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // 无参数构造函数，默认的数组容量capacity=10
    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // 在所有元素后添加一个元素
    public void addLast(int e) {

//        if (size == data.length) {
//            throw new IllegalArgumentException("addList is failed");
//        }
//        data[size] = e;
//        size++;
        add(size, e);
    }

    public void addFirst(int e) {
        add(0, e);
    }

    //在第index位置插入一个新元素e
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("addList is failed");
        }

        if(index < 0 || index > size) {
            throw new IllegalArgumentException("add is failed index < 0 or index > size");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    int get(int index) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("get is failed");
        }

        return data[index];
    }

    void set(int index, int e) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("set is failed");
        }

        data[index] = e;
    }
    
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if(data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size = %d, capacity=%d \n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if(i != size - 1) {
                res.append(",");
            }
        }
        res.append("]");

        return res.toString();
    }
}
