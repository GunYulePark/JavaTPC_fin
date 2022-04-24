package kr;

public class IntArray {
//    구현해야 할 기능 :Create,Read,Update, size구하기
    private int count;
    private int arr[];

    public IntArray() {
        this(10);
    }

    public IntArray(int init) {
        arr=new int[init];
    }

    public void add(int data) {
        arr[count++]=data;
    }
    public int get(int index) {
        return arr[index];
    }

    public int size(){
        return count;
    }
}
