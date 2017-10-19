package baekjoon;

/**
 * Created by ds on 2017-07-14.
 */

/**
 * 재용이는 최신 컴퓨터 10대를 가지고 있다. 어느 날 재용이는 많은 데이터를 처리해야 될 일이 생겨서 각 컴퓨터에 1번부터 10번까지의 번호를 부여하고
 * 10대의 컴퓨터가 다음과 같은 방법으로 데이터들을 처리하기로 하였다.
 * 1번 데이터는 1번 컴퓨터, 2번 데이터는 2번 컴퓨터, 3번 데이터는 3번 컴퓨터, ... ,
 * 10번 데이터는 10번 컴퓨터, 11번 데이터는 1번 컴퓨터, 12번 데이터는 2번 컴퓨터, ...
 * 총 데이터의 개수는 항상 a^b개의 형태로 주어진다. 재용이는 문득 마지막 데이터가 처리될 컴퓨터의 번호가 궁금해졌다. 이를 수행해주는 프로그램을 작성하라.
*/

import java.util.*;

public class Main_1009 {

    static Scanner input = new Scanner(System.in);
    static int t, i, j, a, b, result;
    static String s;
    static int[] arr = new int[10];

    public static void main(String[] args) {
        t = input.nextInt();
        for(i = 0; i < t; i++) {
            a = input.nextInt();
            b = input.nextInt();
            a = a % 10;
            switch (a) {
                case 0:
                    result = 10;
                    break;
                case 1:
                    result = 1;
                    break;
                case 2:
                    if(b % 4 == 0) {
                        result = 6;
                    }else if(b % 4 == 1) {
                        result = 2;
                    }else if(b % 4 == 2) {
                        result = 4;
                    }else {
                        result = 8;
                    }
                    break;
                case 3:
                    if(b % 4 == 0) {
                        result = 1;
                    }else if(b % 4 == 1) {
                        result = 3;
                    }else if(b % 4 == 2) {
                        result = 9;
                    }else {
                        result = 7;
                    }
                    break;
                case 4:
                    result = (b % 2 == 1) ? 4 : 6;
                    break;
                case 5:
                    result = 5;
                    break;
                case 6:
                    result = 6;
                    break;
                case 7:
                    if(b % 4 == 0) {
                        result = 1;
                    }else if(b % 4 == 1) {
                        result = 7;
                    }else if(b % 4 == 2) {
                        result = 9;
                    }else {
                        result = 3;
                    }
                    break;
                case 8:
                    if(b % 4 == 0) {
                        result = 6;
                    }else if(b % 4 == 1) {
                        result = 8;
                    }else if(b % 4 == 2) {
                        result = 4;
                    }else {
                        result = 2;
                    }
                    break;
                case 9:
                    result = (b % 2 == 1) ? 9 : 1;
                    break;
                default:
                    break;
            }
            System.out.println(result);
        }
    }
}
