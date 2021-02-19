# ServerProgramming
KOSTA Education :ServerProgramming   
_매일 **Pull Requests** 갱신_

<br>

2021-02-15
----------
### HTML Tag Document

##### - whatwg   
https://html.spec.whatwg.org/multipage/   
-> html tag가 정리되어 있는 사이트
   
##### - w3cshools   
https://www.w3schools.com/   
-> html, css 외에도 SQL, Python 공부에 좋음   
   
##### - REPL   
Chrome > console 창과 같이 한줄씩 실행시키는 셸 환경   
python 과 같은 인터프리터 언어도 이 환경에 해당 됨   
<br>
<br>

2021-02-16
----------
### Learn JS Basic

##### - console.log() 출력에 대한 잘못된 생각   
1. html script태그를 이용하여 console에 로그를 출력한다.   
2. innerText속성을 이용하여 값을 변경해준다.   
3. 그리고 콘솔의 내용을 확인한다.
4. 로그를 출력한 이후에 변경된 값이 출력된다.   

그 이유는 콘솔에 텍스트를 출력하면 변경되지 않겠지만, Element대상이 직접 연결되어 있기 때문에 변경 된 값이 출력된다.   
_(web3.html 코드 참고)_   

### Java Programming   
_Eclipse Java EE Install_
   
#### - Eclipse Setting   
Eclipse > Window > Preferences > Search 'Encoding'   
MS949 -> UTF-8

#### - Java Module
여러 프로젝트를 통합하는 개념
> **인터넷 조사내용**   
> Field + Method + Constructor + Inner Class = Class   
> Class + ... + Class = Package   
> Package + ... + Package = Module   

#### - 예상못한 에러 정리
- ClassNotFoundException  
      1. Eclipse > Project > Clean   
      2. Eclipse > Project > Check 'Build Automatically'

- JDK download    
      1. jdk.java.net/15/ 접속
      2. OS에 맞는 파일 설치
   
#### - Eclipse-Shortcut 
Ctrl+/ or Ctrl+Shift+C : 한줄 주석   
Ctrl+Shift+/ : 부분(여러줄) 주석   
Ctrl+Shift+\ : 부분(여러줄) 주석 해제   
Ctrl+M : 화면 키우기   
Ctrl+Y : Re-do (Ctrl+Z 반대)   
Alt+방향키 : 줄 이동   
<br>
<br>

2021-02-17
----------
### Java Programming 
#### - Eclipse-Shortcut
command+shift+x : 대문자 변환   
command+shift+y : 소문자 변환    

#### - Char Data Type
single quotation(' ') 은 1개의 문자(char)만 허용(공백불가)   

#### - Wrapper Class
다양한 정보 또는 명령을 수행할 수 있다   
문자를 **숫자로 변경**하거나 **최소값/최대값** 확인 가능   
> (WrapperClass).MIN_VALUE : 숫자 타입 값의 최소값을 확인   
> (WrapperClass).MAX_VALUE : 숫자 타입 값의 최대값을 확인   
> ex) Byte.MIN_VALUE/Byte.MAX_VALUE   

#### - Variable : 무엇을 변수로 만들어야 하는지에 대한 방법
소프트웨어에는 여러 기능(동작)들이 존재   
기능들은 특징이 존재하고, 그 특징을 변수로 지정   
즉, 특정 **대상의 속성**을 표현하는 명사를 변수로 지정   
_예를 들어 게시판 프로그램을 작성할 경우 : 제목, 내용, 작성자, 날짜 등 변수로 지정_   

#### - java.io를 이용하여 값을 받는 법
import java.io.BufferedReader;   
import java.io.InputStreamReader;   

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
br.readLine(); // IOException 발생

#### - 열거 연산자 : ...
function(int...num){}  
int타입의 값을 여러 개 받을 수 있다
<br>
<br>

2021-02-18
----------
### Java Programming    
#### - printf : %f(3.141592)
| 형식 | 결과 |    
|---|---|   
| `%f` | `3.141592` |   
| `%.2f` | `3.14` |
| `%2.2f` | `　3.14` |

_%(정수자리).(소수점자리)f_   

#### - new KeyWord
java에서 new키워드를 사용하여 변수를 생성하면   
(= 참조변수를 생성하면)   
4byte크기의 변수를 생성   

#### - 배열의 정적/동적 생성
정적 생성 : 배열의 크기를 지정하여 생성하는 것   
동적 생성 : 배열의 크기를 지정하지 않고 생성하는 것 (ex. literal Type으로 생성)   

<br>
<br>

2021-02-19
----------
### Java Programming 
#### - 프로젝트 오일러
https://euler.synap.co.kr/   
-> 회원가입 후 코딩 테스트가 가능

#### - 백준 알고리즘
https://www.acmicpc.net/problemset   
-> 현재까지도 활발하게 문제가 나오고 문제 수정, 조건 등록이   
사용자 참여형으로 진행 되고 있어 지속적인 업데이트를 하고 있다

#### - char Type의 Null
char : ' ' //공란 1칸   
+) char의 Null인 공란과 space로 작성하는 공란은 다른 문자이다   
+) char의 Null의 문자코드는 0, space는 32   
+) 숫자 0의 문자코드는 48 (문자코드와 실제 값 혼동 금지)  

##### - 2차원 배열의 예외
**NullPointerException**   
char[][] css = new char[2][];   
System.out.println(css[0][4]);   
-> 2차원 배열의 공간(주소)을 할당 해 주지 않은 상태로 호출   

**IndexOutOfBoundsException**   
char[][] css = new char[2][5];    
System.out.println(css[0][5]);   
-> 배열의 크기보다 큰 인덱스번호로 배열 호출   

#### - Constructor Overloading
같은 객체의 여러개의 생성자를 만드는 것   
매개변수의 **개수, 순서, 타입**으로 구분하며,    
매개변수가 존재하지 않을 수도 있다.(= default Contructor)      
+) 생성자를 단 한개도 선언해주지 않을 경우 컴파일러는 자동으로 기본생성자를 정의하여 실행시킨다.   
+) 즉, 기본 생성자 이외의 생성자가 존재할 경우 (컴파일러가 자동으로 생성하는)기본 생성자는 사용할 수 없다.   

#### - 변수 값 자동할당
클래스 내부에 필드를 선언하면 기본값이 자동으로 할당된다.   
!주의! **메서드 내부의 필드는 자동을 할당되지 않음**    
-> 즉, 메서드의 필드는 값을 할당하지 않고 호출할 경우 Syntax Error가 발생
-> 클래스의 필드는 값을 할당하지 않고 호출할 경우 NullPointerException 이 발생

#### - 객체 속성값 접근
1. **생성된객체.속성명 = 값** (속성의 은닉화 때문에 사용할 수 없는 경우가 많음 : private)     
2. **new 생성자();** (새로운 값을 대입하는 것 이기 때문에 한가지만 값 변경 불가)
3. **setter/getter**

#### - 접근 제어자
| 접근 제어자 | 접근 범위 |
|---|---|
| `public` | 모든 접근 허용 |
| `default` | 동일 패키지 내 접근 허용 (일부 경우 제외 기본값) |
| `protected` | 상속 관계에서 접근 허용 |
| `private` | 동일 클래스 내 접근 허용 |

#### - 캡슐화와 은닉화의 차이
캡슐화와 은닉화는 같이 쓰인다.    
내부의 중요한 객체, 속성, 클래스 등을 **마음대로 변경할 수 없도록   
접근을 막는다.**(은닉화)   
하지만 아예 사용을 하지 못하는건 안되기 때문에   
은닉 된 객체, 속성, 클래스 등에 **직접 접근하지 않고   
외부에서 사용할 수 있도록한다.**(캡슐화)   









