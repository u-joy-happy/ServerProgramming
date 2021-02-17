# ServerProgramming
KOSTA Education :ServerProgramming   
_매일 **Pull Requests** 갱신_

<br>

2021-02-15
----------
### HTML Tag Document

##### - whatwg   
https://html.spec.whatwg.org/multipage/   
html tag가 정리되어 있는 사이트
   
##### - w3cshools   
https://www.w3schools.com/   
html, css 외에도 SQL, Python 공부에 좋음   
   
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


