/*
    p.136
    회문 수열: 주어진 문자열이 회문(palindrome)의 순열인지 아닌지 확인하는 함수를 작성하라.
    회문이란 앞으로 읽으나 뒤로 읽으나 같은 단어 혹은 구절을 의미하며, 순열이란 문자열을 재배치하는 것을 뜻한다.
    회문이 꼭 사전에 등장하는 단어로 제한될 필요는 없다.
    예제
    - 입력: Tact Coa
    - 출력: True(순열: "taco cat", "atco cta" 등)
*/
import java.util.*;

class Q1_4 {
    public static void main(String[] args){
        HashMap<String, Integer> counter = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();

        for (char c: input){
            String k = Character.toString(c).toLowerCase();
            if (c != ' ') {
                if (counter.containsKey(k)){
                    counter.put(k, counter.get(k)+1);
                } else {
                    counter.put(k, 1);
                }
            }
        }

        int odd = 0;
        for (String k : counter.keySet()){
            if (counter.get(k) % 2 != 0){
                odd++;
            }
        }
        if (odd > 1) {
        System.out.println(false);
        } else{
            System.out.println(true);
        }
    }
}