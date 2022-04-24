public class TPC35 {
    public static void main(String[] args) {
//        문자열 객체 따로 만들기
        String str1 = new String("APPLE");
        String str2 = new String("APPLE");

//        번지(주소)비교
        if (str1 == str2) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

//        값 비교
        if (str1.equals(str2)) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

        //    문자열 객체를 공통으로 만들기
        String str3="APPLE";
        String str4 = "APPLE";

        //        번지(주소)비교
        if(str3 == str4) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

//        값 비교
        if (str3.equals(str4)) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
