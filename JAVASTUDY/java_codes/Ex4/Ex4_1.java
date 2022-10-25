import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
//        int a = 3;
//        int  b= 5;
//        if (a > b)
//        {
//            System.out.println("a is larger\n");
//        }
//        else
//        {
//            System.out.println("b is larger\n");
//        }
//        String s1 = "23";
//
//        System.out.println(s1 + 3);
//        System.out.printf("%s\n", s1+3);


        /// ** SWITCH ** ///
//        int a = 3;
//        System.out.println("현재 월을 입력하세요 : ");
//
//        Scanner scanner = new Scanner(System.in);
//        int month = scanner.nextInt();
//
//        switch (month) {
//            case 1:
//                System.out.println("1\n");
//                break;
//            case 2:
//                System.out.println("2\n");
//                break;
//            case 3:
//                System.out.println("3\n");
//                break;
//        }

        ///  ** math.random() ** ///
//        for (int i = 1; i<= 5; i++)
//        {
//            System.out.println((int)(Math.random() * 10));
//        }

        /// ** while ** ///
//        int i = 0;
//        while (i < 4)
//        {
//            int j = 0;
//            System.out.println("hihi");
//            i++;
//        }


        /// ** 이름 붙은 반복문 ** ///
        outer :
        for (int i = 0; i < 10; i++)
        {
            System.out.println("!!!!");
            for (int j = 0; j < 5; j++)
            {
                System.out.println(",,,,,");
                if (i == 3)
                {
                    System.out.println("??\n");
                    break outer;
                }
            }

        }
    }
}
