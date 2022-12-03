/*
    p.136
    순열 확인: 문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지
    확인하는 메서드를 작성하라.
    ※ 순열이란: 다른 문자열을 정렬했을 때 동일한 문자가 되는 관계
*/
import java.util.*;

class Q1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(s);
        String[] sArray = s.split(" ");

        System.out.println(premutationChecker(sArray[0], sArray[1]));
    }

    static String sort(String s) {
        char content[] = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    static boolean premutationChecker(String one, String two){
        if (one.length() != two.length()) {
            return false;
        }
        return sort(one).equals(sort(two));
    }
}