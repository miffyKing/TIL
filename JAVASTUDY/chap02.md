**2장 기본적인 내용들의 공부**

---

- chap2 2
  - 단축어들을 계속 알려주시는데 윈도우 단축키라 의미가 없음
  - println , print -> println은 출력후 줄바꿈.
  - println() 안에 " " 따옴표 안에  넣으면 그냥 문자열로 출력.
    - 따옴표 없이 그냥 사칙연산을 하면 그 값으로 나온다.
  
- chap2 2~3
  - 변수의 선언.
  - 중요! 지역 변수는 다른 변수와 달리 초기에 0 으로 초기화 되지 않기 때문에 읽기 전에 꼭! 초기화 해야 함.
    - 변수의 종류
      - 클래스 변수
      - 인스턴스 변수
      - 지역변수 
- chap2 4
  - 변수의 타입 -> 저장할 값의 타입과 일치하도록 맞춰주어야 함.
  - 값의 타입
  - 값
    - 문자 
      - char
    - 숫자
      - 정수 - byte, short, int, long
      - 실수 - float, double
    - 논리
      - boolean
- chap2 5
  - 변수 : 하나의 값을 저장하기 위한 공간, 변경 O
  - 상수 : 한번만 값을 저장 가능한 변수, 변경 X
    - 상수 선언은 int 앞에 **final** 을 붙여주면 됨.
  - 리터럴 : 그 자체로 값을 의미하는 것. = 기존의 상수.
  
- chap2 6
  - 리터럴의 접두사와 접미사
<img width="455" alt="image" src="https://user-images.githubusercontent.com/87696004/197506022-0b4fbadd-4938-4d03-b3f9-539583f635e8.png">
  - L,f 잘 알고 쓰자.
  - 변수와 리터럴의 타입 불일치
    - 범위가 변수 > 리터럴인 경우, OK
    - 범위가 변수 < 리터럴인 경우, NO
- chap2 7,8
  - "" + 7 -> "7"
  - 숫자에 빈 문자열 더하면 숫자가 문자열로 변환됨.
  - **"" +7+7 **-> "7"+7 -> "7"+"7" -> "77"
  - **7+7+""** -> 14+"" -> "14" + "" -> "14"
  - 앞에서부터 연산 차례로ㅋㅋ

- chap2 9
  - 두 변수의 값 교환하기
    - tmp 둬서 두 수 서로 바꾸기

- chap2 10
  - 기본형과 참조형
    - 기본형 (primitive type)
      - 오직 8개
        - boolean , char, byte, short, int, long , float, double
      - 논리형
      - 문자형
      - 정수형
      - 실수형
    - 참조형 (reference type)
      - 기본형 제외 나머지
        - String, System 등
      - 메모리 주소를 저장 (4,8 byte)
- chap2 12,13
  - printf를 이용한 출력
  - println()의 단점 - 출력형식 지정불가
  - printf로 출력형식 지정 가능함.
  
``` JAVA
    System.out.printf("%.2f\n", 10.0/3);
    System.out.printf("%d\n", 23);
    System.out.printf("%X\n", 0x1C);
     System.out.printf("[%20s]%n", "www.codechobo.com");
     System.out.printf("[%-5d]%n", 10);
        System.out.printf("[%14.10f]%n", 1.2345678900);
    //전체자리 . 소수점 아래자리 f
```
