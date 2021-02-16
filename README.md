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

>210215 강의자료   
>[/210215/Web/](https://github.com/u-joy-happy/ServerProgramming/tree/210215/Web)

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
   
#### - Eclopse-Shortcut 
Ctrl+/ or Ctrl+Shift+C : 한줄 주석   
Ctrl+Shift+/ : 부분(여러줄) 주석   
Ctrl+Shift+\ : 부분(여러줄) 주석 해제   
Ctrl+M : 화면 키우기   
Ctrl+Y : Re-do (Ctrl+Z 반대)   
Alt+방향키 : 줄 이동   
