import kr.IntArray;

public class TPC36 {
    public static void main(String[] args) {
        IntArray arr = new IntArray(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}