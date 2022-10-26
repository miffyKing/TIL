- chap5 배열

---

- chap5 - 1,2
  - 배열의 선언과 생성
    - **타입 [] 변수이름;**
    - -> **우테코에선 이 양식을 따르자!**
    - ```String[] name```

``` JAVA
int[] arr;      // 배열을 선언 (배열을 다루기 위한 참조변수 선언)
arr = new int[100000];    // 배열을 생성 (실제 저장공간을 생성)

// 용민이형 말론, C랑 다르게 new 로 새로운 객체를 생성하는 거라서 메모리의 실제 시작주소랑 arr변수가 가리키는데가 다름. 포인터로 찝어주는 것처럼 실제 물리적 배열의 주소가 arr 변수에 저장됨.
```

- chap5 4
  - 배열의 길이
  - **배열이름.length**
  - 배열은 한번 생성하면 그 길이를 바꿀 수 없다. -> 부족하면 새로 만들고 원래 내용을 복사해!   

- chap5 5
  - 배열의 각 요소에 처음 값을 저장하는것.
  - 기본값으로 int 는 0으로 초기화됨.

- chap5 6
  - 배열의 출력
  - int[] iarr = {100, 20, 30, 10};
    - 이걸 println(iarr) 로 출력하면 이상한 값 출력됨.
  - 그런데 ```char[] carr = {'a', 'b' };```
    - 이거는 ```println(carr)``` 하면 제대로 ab 나옴ㅋㅋ

``` JAVA
int[] arr;      // 배열을 선언 (배열을 다루기 위한 참조변수 선언)
    arr = new int[10];    // 배열을 생성 (실제 저장공간을 생성)
    for (int i = 0; i < 10; i++) {
        arr[i] = i;
    }       
    System.out.println(Arrays.toString(arr));  //옵션 + 엔터 자동 IMPORT
    // command + shift + enter 하면 자동으로 ;, { } 만들어줌.
```

- chap 5 8,9,10, 11
  - 배열의 활용

- chap5 14, 15 
  - String 클래스
  - String 클래스는 Char[] 와 메서드(기능) 을 결합한것
  - String 클래스 = char[] + 메서드(기능)
  - String 클래스는 내용 변경 불가 (READ ONLY)
  
  - charAt(int index) : index 위치에 있는 문자 반환.
  - int length() : 문자열 길이 반환
  - substring(int from , int to) : 해당 범위의 문자열 반환. to는 포함 안됨.
  - equals(Object obj) : 문자열 내용이 같은지 확인한다.
  - toCharArray() : 문자열을 문자배열 (char[]) 로 변환, 반환한다.

- char5 24
  - Arrays (클래스) 로 배열 다루기
  - 문자열 비교와 출력 - equals, toString.
  - 배열의 복사 - copyOf(), copyOfRange().
  - 배열의 정렬 - sort().