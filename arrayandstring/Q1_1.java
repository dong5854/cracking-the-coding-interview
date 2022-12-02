/*
    p.136
    중복이 없는가: 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라.
    자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
*/
import java.util.*;

// 문쟈열은 ASCII 문자열이라고 가정
class Q1_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(isUniqueChars(input));

        sc.close();
    }


    static boolean isUniqueChars(String str){
        // ASCII CODE는 128 가지인데 문자열의 길이가 128이 넘으면 ASCII CODE 문자를 한번씩만 사용해서는 만들 수 없다.
        if (str.length() > 128) return false;
        boolean[] charList =  new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charList[val]){
                return false;
            } charList[val] = true;
        }
        return true;
    }
}