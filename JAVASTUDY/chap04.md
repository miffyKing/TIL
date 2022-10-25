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
  -  Math.random() - 0.0 ~ 1.0 사이 임의의 double 을 반환함.
``` JAVA
        for (int i = 1; i<= 5; i++)
        {
            System.out.println((int)(Math.random() * 10));
        }
```
