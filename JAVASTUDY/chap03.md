- Chap3

---


- chap3 - 1,2
  - 연산자와 피연산자
  - 연산자 종류
    - 산술, 비교, 논리, 대입
  
- chap3 - 3,4
  - 연산자의 우선순위.
  - 연산자의 결합규칙.
  - 산술 > 비교 > 논리 > 대입.
  - 단항 > 이항> 삼항
- chap3 - 5
  - 증감 연산자.
    - 전위형 ++i 왼
    - 후위형 i++ 오
  - **증감 연산자가 독립적으로 상요된 경우, 전위형, 후위형의 차이가 없다.**
  - 헷갈릴때 방법!

``` JAVA
int j, i;
        j = ++i;
        ++i;
        j = i;
    // 전위연산자의 경우 ++i 를 위로,    
        j = i++;
        i++;
        j = i;
    // 후위연산자의 경우 i++ 을 밑으로.
        
```

- chap3 - 7,8
  - 형변환 연산자
    - (타입)피연산자
  - 자동 형변환

``` JAVA
float f = 1234;
```

- 형변환 생략되어도 자동으로 들어감.

``` JAVA
    float f = (float)1234;
    //자동으로 컴파일러가 형변환 해줌.
```

- chap3 - 9
  - 사칙연산자 + - * /
  - 연산 전에 피연산자의 타입을 일치시키는 것.
    - 두 피연산자의 타입을 같게 일치 시킴. (보다 큰 타입으로 일치)
    - 피연산자의 타입이 int 보다 작은 타입이면 Int 로 변환된다.
- chap3 - 11
  - 반올림 - Math.round()
    - 실수를 소수점 **첫째자리**에서 반올림한 정수를 반환.
    - 원하는 자릿수에서 반올림하고 싶다면 ?
  
``` JAVA
public class Ex3_1 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi*1000) / 1000.0;
        System.out.println(shortPi);
        
        //Math.round(3.141592 * 1000)
        // -> Math.round(3142.592)
        // -> 3142
        // 3142 / 1000.0 = 3.142
    }
}
```

- chap3 13,14
  - 비교 연산자, 문자열의 비교
  - 비교 현산자 > < >= <= == !=  ..
  - **문자열의 비교**
    - **문자열 비교는 == 대신 equals() 를 사용해라!!**

``` JAVA
    String s1, s2;
    s1 = "abcde";
    s2 = "abcdE";
    System.out.println(s1.equals(s2));

    // 결과는 다르니 false, 같으면 true.
```

- chap3 15,16
  - 논리연산자 && , ||

- chap3 17,18,19
  - 조건 연산자, 대입 연산자. **(?)**
  - 조건식의 결과에 따라 연산 결과가 다르다.
  - 대입연산자 - 오른쪽 값을 왼쪽에 저장.
  - 모든 연산자는 결과값을 반환함.
