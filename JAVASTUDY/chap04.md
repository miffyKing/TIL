- Chap4 조건문과 반복문

---

- chap4 1,2,3,4
  - 조건문 if 와 if else 문

- chap4 5,6,7,8
  - 중첩 if, if else 문
- chap4 9,10,11
  - switch 문
    - 처리해야하는 경우의 수가 많을 때 유용

``` JAVA
        System.out.println("현재 월을 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("1\n");
                break;
            case 2:
                System.out.println("2\n");
                break;
            case 3:
                System.out.println("3\n");
                break;
        }
```

- chap4 12
  - 임의의 정수 만들기
  - Math.random() - 0.0 ~ 1.0 사이 임의의 double 을 반환함.

``` JAVA
        for (int i = 1; i<= 5; i++)
        {
            System.out.println((int)(Math.random() * 10));
        }
```

- chap4 13, 14
  - for 문
  - 조건을 만족하는 동안 반복 - 반복횟수를 알 때 사용

- chap4 14, 15
  - 중첩 for문
  - 별찍기ㅋㅋ
  
- chap4 16,17,18,19
  - while 문, do - while 문
  - for는 반복 횟수 알 때, while은 모를 때 주로 씀.
  - while 같은 경우는 조건식이 거짓일 경우 아예 돌아가지도 않는데, do while은 순서가 반대라 적어도 한번은 돌아간다. 

- chap4 20,21,22,23,24
  - break, continue
  - break : 자신이 포함된 하나의 반복문을 벗어난다.
  - 이름붙은 반복문
  
``` JAVA
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

```

