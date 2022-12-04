/*
    p.136
    URL화: 문자열에 들어 있는 모든 공백을 '%20'으로 바꿔 주는 메서드를 작성하라. 
    최종적으로 모든 문자를 다 담을 수 있을 만큼 충분한 공간이 이미 확보되어 있으며 문자열의 최종 길익 함께 주어진다고 가정해도 된다.
    (자바로 구현한다면 배열 안에서 작업할 수 있도록 문자 배열(character array)을 이용하길 바란다.)
    예제
    - 입력: "Mr John Smith", 13
    - 출력: "Mr%20John%20Smith"
*/
import java.util.*;

class Q1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] result = s.split(", ");
        System.out.println(Arrays.toString(result));

        char[] str  = Arrays.copyOfRange(result[0].toCharArray(), 1, 14);
        int trueLength = Integer.parseInt(result[1]);

        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++){
            if (str[i] == ' '){
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        char[] converted = new char[index];
        
        for (i = trueLength - 1; i >= 0; i--){
            if (str[i] == ' '){
                converted[index - 1] = '0';
                converted[index - 2] = '2';
                converted[index - 3] = '%';
                index -= 3;
            }
            else{
                converted[index - 1] = str[i];
                index--;
            }
        }
        System.out.println(converted);
    }
}