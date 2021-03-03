# ServerProgramming
KOSTA Education :ServerProgramming   
_매일 **Pull Requests** 갱신_

<br>

2021-02-15
----------
### HTML Tag Document

#### - whatwg   
https://html.spec.whatwg.org/multipage/   
-> html tag가 정리되어 있는 사이트
   
#### - w3cshools   
https://www.w3schools.com/   
-> html, css 외에도 SQL, Python 공부에 좋음   
   
#### - REPL   
Chrome > console 창과 같이 한줄씩 실행시키는 셸 환경   
python 과 같은 인터프리터 언어도 이 환경에 해당 됨   
<br>
<br>

2021-02-16
----------
### Learn JS Basic

#### - console.log() 출력에 대한 잘못된 생각   
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

<br>
<br>

2021-02-22
----------
### Java Programming 
#### - Method Overloading
-> 생성자 오버로딩과 같은 규칙 적용   
-> **return 타입과는 별개**로 **매개변수의 타입, 개수, 순서**에만 적용   

#### - Return
반환 값이 없는 void타입의 메서드도   
함수에 제일 마지막 줄에    
`return;`   
이 존재 한다. (생략 가능)   

#### - (...) 열거
-> 입력 개수 제한이 없다.   
-> 입력 형식은 동일 타입 데이터 단순 열거   
-> 사용 형식은 배열과 동일 (배열명[0]), 타입도 배열과 동일하게 인식 됨    
+) 개수 제한이 없기 때문에 정확한 개수를 파악하기 힘들다.   
+) 그렇기 때문에 for-each문을 사용하는 경우가 많음   

#### - 새로운 주소 할당 : new Keyword
1. 새로운 객체 생성    
2. 값 출력   
3. 객체에 새로운 주소 할당 (**new**)   
4. 값 출력   

-> 이때 3번 과정을 하지 않을 경우 2,4번이 같은 결과를 가지게 된다.   
-> 즉, 다른 값을 출력하고 싶을 경우 새로운 주소 할당이 필요하다.   

#### - 접근 제어자 기호
(+) : public
(-) : private

#### - Class Diagram
강의자료 참고

<br>
<br>

2021-02-23
----------
### Java Programming 
#### - 정형화 된 Object Naming
-> VO(Value Object) : 정보를 담는 객체   
-> DTO(Data Transfer Object) : 데이터를 전달하는 객체   
-> DAO(Database Access Object) : 데이터베이스에 접근하는 기능을 담는 객체   

#### - 객체 속성 접근 : setter()/getter()
-> 객체 내 속성의 정보가 중요한 정보일 경우 은닉(private)한다.   
+) 은닉을 하는 순간 기존에 객체를 통해 속성을 접근하던 코드들은 사용불가  
-> 은닉 된 속성을 사용하기 위해 public method(setter()/getter())를 정의하여 사용 할 수 있도록 한다(캡슐화).   

#### - String Object concat()과 +의 차이점
```
String str = "aaa";
System.out.println(str.concat("bbb")); //aaabbb
System.out.println(str); //aaa
```
-> concat()은 문자를 연결하여 출력하는 것이 가능하지만    
-> +는 완전히 문자를 합치는 것   

+) **같은 기능을 하는 코드는 아래** : 재할당을 해줘야함      
```
String str1 = "aaa";
str1 = str.concat("bbb");

String str2 = "aaa";
str2 += "bbb";
```

#### - String Object endsWith() 와 startsWith()
-> 시작하거나 끝나는 문자열 비교   
-> 대상의 문자열이 기존의 문자열에서 끝나거나 시작하는 값인지 확인   
```
String str = "http://kireii333.blog.me/java.png";
System.out.println(str.endsWith(".png"));
System.out.println(str.startsWith("http")); 
```

#### - String Object Method 사용시 주의점
-> 재할당을 하지 않으면 값이 바뀌는 것이 아니다.     
-> 예시    
```
str = "hello/im/student/and/you";
System.out.println(str.replace("/", "&")); //hello&im&student&and&you
System.out.println(str); //hello/im/student/and/you
```

#### - String Object split() 와 StringTokenizer
-> 대상 문자를 기준으로 구분하여 배열로 반환    
-> 대상 문자가 연속되어있는 경우 빈 값이 출력 됨    
-> 또한, 구분자에 따라서 원하는 결과값이 나오지 않는 경우가 있음
-> StringTokenizer로 개선 가능 
```
str = "aaa:bbb::cccc:dd:";
System.out.println(str.split(":").length); //5
for (String x : str.split(":")) {
	System.out.println(x);
}
```
```
int cnt = 0;
StringTokenizer st = new StringTokenizer(str, "|");
while(st.hasMoreElements()) {
   System.out.println(st.nextElement());
   cnt ++;
}
System.out.println("개수 : " + cnt);
```
#### - 비효율적인 문자 할당 
-> 복합 할당 연산(+=, -= 등)은 연산 속도가 느리다.   
```
String txt = "";
for(int i = 0; i < 100000; i++) {
	txt += "kim";
}
// (처리 시간이 3초 정도 걸리는 코드)
```
-> 그렇기 때문에 효율적인 코드를 위해서 StringBuilder(StringBuffer)를 사용한다.   
```
StringBuilder sb = new StringBuilder();
for(int i = 0; i < 100000; i++) {
   sb.append("kim");
}
(처리 시간이 7미리세컨드 정도 걸리는 코드)
```

#### - Singleton Pattern 
-> 애플리케이션이 시작될 때 어떤 클래스가 최초 한번만 메모리를 할당(static)   
-> 그 메모리에 인스턴스를 만들어 사용하는 패턴    
-> 생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나   
-> 최초 생성 이후에 호출된 생성자는 최초에 생성한 객체를 반환   
-> _(자바에선 생성자를 private로 선언해서 생성 불가하게 하고 getInstance()로 받아쓰기도 함)_    
출처: https://jeong-pro.tistory.com/86 [기본기를 쌓는 정아마추어 코딩블로그]     

-> 프로그램 시작부터 끝날 때 까지 한 객체에 대해 한 주소만 사용하는 것 (?)   

#### - Overriding 요건
-> 반환타입,    
-> 매개변수(타입, 개수, 순서),    
-> 메서드이름   
이 같아야함   
+) 어노테이션(@Override)를 명시해 줄 경우, 요건에 위반될 시 알려줌

#### - final KeyWord
- field : 값 대입(값 변경) 불가
- method : Override(메서드 제정의) 불가
- class : extends(상속) 불가



<br>
<br>

2021-02-24
----------
### Java Programming 
#### - printStackTrace()에 대한 잘못된 생각
-> 에외가 발생하여 콘솔창에 출력되는 것과 같은 형태를 띄고 있다.   
-> catch문 안에서 printStackTrace()가 실행될 시,   
-> printStackTrace()는 에러 사항이 콘솔에 출력되고 다음줄이 계속 이어나가진다.   

#### - eclipse ShortCut
command + shift + o   
-> 없는 import 자동 생성 및 사용하지 않는 import 정리   
command + shift + f   
-> 자동 줄 정렬   
command + 1   
-> Quick Fix   


<br>
<br>

2021-02-25
----------
### Java Programming 
#### - ArrayList Value DataType
```
List list3 = new ArrayList();
list3.add(1000);
list3.add("String");
list3.add(true);
list3.add(new int[4]);
```
-> ArrayList를 선언할 때 값에 대한 데이터 타입을 선언 하지 않을 경우    
-> (제네릭을 명시하지 않을 경우)    
-> 모든 타입을 허용한다.   
-> 하지만 비효율적   

#### - UnsupportedOperationException    
-> Collection List를 생성할 때    
-> new ArrayList<>() or new List<>() 를 사용하지 않고   
-> List.of(value)를 사용할 수 있다.
-> 하지만 List.of()를 사용하여 배열을 생성할 경우   
-> 데이터에 접근(수정) 불가능 하여, 수정하려하면   
-> **UnsupportedOperationException** 이 발생한다.   
+) _List.of()의 return value는 List<> 이다._

#### - Random Number
_조건 : 범위가 1~45인 랜덤 수 뽑기_  
+ **방법 1.**
```
Random ran = new Random();
int i = ran.nextInt(45)+1;
```
+ **방법 2.**
```
int i = (int) (Math.random() * 45) + 1;
```
### JDBC
#### - oracle database 11g install
-> docker를 통한 설치
```
$ docker search oracle-xe-11g
$ docker pull jaspeen/oracle-xe-11g

$ docker run --name oracle11g -d -p 8080:8080 -p 1521:1521 -v /Users/kimhyoju/oracle jaspeen/oracle-xe-11g
$ docker exec -it oracle11g sqlplus

 // (default) id : system / pw : oracle
```
#### - SQL Developer 실행 : terminal
```
$ cd /Applications/SQLDeveloper.app/Contents/resources/sqldeveloper
$ zsh sqldeveloper.sh
```
#### - SQL
+ ##### Check User Name
```
SQL> show user;
```
+ ##### Create User
```
SQL> create user java(username) identified by hi123456(userpw) account unlock;
```
+ ##### 테이블 생성 권한, 접속 권한 주기 
```
SQL> grant connect,resource to java(username); 
```
+ ##### 다른 계정에 접속
```
SQL> conn java(username);
```
+ ##### Test Table structure
```
SQL> create table test(
num number primary key,
name varchar(20) not null,
age number
);
```

<br>
<br>

2021-02-26
----------   
### Java Programming    

#### - docker Restart   
```
$ docker start oracle11g
$ docker exec -it oracle11g sqlplus
```

#### - docker 실행 문제 : 정보 유실됨
```
// docker: Error response from daemon: Conflict. The container name "/oracle11g" is already in use by container "1cc23ec72a37ffe2321453427318354fdbe423609ce48b6dcefad3c087baa373". You have to remove (or rename) that container to be able to reuse that name.
```
에러 출력 시 `docker rm (containerName)`을 입력하고    
다시 `docker run --name oracle11g -d -p 8080:8080 -p 1521:1521 -v /Users/kimhyoju/oracle jaspeen/oracle-xe-11g` 입력하여 container 등록 후 재 실행   
+) running 일 경우 `docker stop oracle11g` 먼저 수행   

#### - java oracle 연동시 SQL 문 오류
-> sql문 입력 시, ;은 추가 하지 않도록 주의    

#### - SQL
+ ##### Select All Tablees
```
SQL> select * from tab
```
+ ##### Rollback / Commit
-> insert시 commit 전으로 되돌릴경우 (transaction 할 경우) rollback 입력   
```
SQL> rollback ;

SQL> commit; 		 // 방법 1
SQL> select * from test; // 방법 2
```
+ ##### oracle sequence
-> 자동 번호 부여기능 (MySQL : auto_increment)   
```
SQL> create sequence seq_test;	//생성
SQL> drop sequence seq_test;	//삭제
SQL> insert into test values(seq_test.nextval, 'kim', 33);
```

<br>
<br>

2021-03-02
----------   
### Oracle JDBC
#### - Error
SQL> conn iot
Enter password: 
ERROR:
ORA-01045: user IOT lacks CREATE SESSION privilege; logon denied

Warning: You are no longer connected to ORACLE.
-> 해결 방법 : grant connect to iot;


<br>
<br>

2021-03-03
----------   
### Oracle JDBC
#### - Like 
```
SQL> select * from table where date like '%12_%';   

// \_underbar는 한글자를 의미한다.   
이것은 반드시 한글자가 있어야된다는 뜻으로 12일은 해당할 수 없음 (12로 끝나는 겂은 나올 수 없음)   
```

#### - oracle SQL 용어
-> DDL : create, drop, alter, truncate   
-> DQL : select   
-> DML : insert, update, delete   
-> TCL : commit, rollback, savepoint   
