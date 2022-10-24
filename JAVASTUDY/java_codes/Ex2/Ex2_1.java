import java.util.*;

public class Ex2_1 {
    public static void main(String[] args) {
        int a, b;
        a = 3;
        b = 5;
//        System.out.println(a);
//        System.out.println(a + b);
//
//        System.out.printf("%.2f\n", 10.0/3);
//        System.out.printf("%d\n", 23);
//        System.out.printf("%X%n", 0x1C);
//
//        //다양한 출력 접두, 접미사들이 있다...
//
//        System.out.printf("[%20s]%n", "www.codechobo.com");
//        System.out.printf("[%-5d]%n", 10);
//        System.out.printf("[%14.10f]%n", 1.2345678900);

    // ** 입력받기 **

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num);
        System.out.println(num2);

//        String tostr = "asdfd";
//
//        System.out.printf("%s\n",tostr );
        String input = scanner.nextLine();
        //int num3 = Integer.parseInt(input);
        System.out.println(input);

        // 이상한 부분
        // num, num2 를 입력하고 출력한다음에 왜 input str을 안받지?
        // num, num2, input 까지 한번에 쓰고 엔터를 쳐야 제대로나옴.
        //
    }
}
