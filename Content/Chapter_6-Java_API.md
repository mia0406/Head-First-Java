
### Chapter 6: 자바 API
#### 1. API
* 내장된 클래스는 모두 미리 컴파일이 된 상태로 제공
* 자바 API에서 클래스는 패키지 단위로 묶여있다.
* import를 사용하면 클래스가 커지는가? 아니다!

#### 2. ArrayList
* ArrayList는 객체다.
* Array는 arrayList가 되고 싶어할 뿐이다. Array가 메소드를 호출했다는 말을 들어본 적이 있는가?
* 객체이기 때문에 메소드도 있고, 레퍼런스를 그냥 null로 설정하는 것뿐만 아니라 그 레퍼런스를 진짜로 제거할 수도 있다.
* 필요에 따라 그 크기가 동적으로 바뀐다.
* ArrayList는 원래 원시 유형 값은 넣을 수가 없고 객체만 넣을 수 있다. 그러나 원시 유형도 wrapper 클래스 이용하여 Object 객체로 감싸면 arrayList에 넣을 수 있다.

##### ※ Wrapper 클래스
* arrayList는 원시 유형(기본자료형)의 값을 그대로 넣을 수 없다.
* 이런 경우를 고려해서 Java가 미리 각 기본 자료형에 해당하는 클래스를 만들어서 제공, 이 클래스를 Wrapper 클래스라고 부른다.

| 기본 자료형 | Wrapper Class |
| --- | --- |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |
| void | Void |

* 실제로 우리가 Integer 클래스는 많이 사용한다.
* Integer 클래스 예시
```JAVA
String str="453";
int i=1000;

int convertStr=Integer.parseInt(str); // String을 int형으로 변환
String convertI=Integer.toString(i); // int형을 String으로 변환

System.out.println("Convert String to int: " + convertStr);
System.out.println("Convert int to String: " + convertI);
System.out.println("Class of 'convertI': " + convertI.getClass());
```

#### 3. javax
* 표준 라이브러리에 속하지 않는 다양한 패키지 라이브러리가 등장하는데, 그걸 확장 패키지라고 불렀다.
* 표준 확장 패키지는 자바에 기본으로 포함되는 기본 라이브러리 패키지인 일급 패키지로 승격할 수 있다.
* 표준 확장 패키지에는 보통 java에 x를 붙인 javax라고 이름을 붙였다.
* 문제는 승격을 하게 되면 java라는 이름으로 바꿔야 되는데, 그럼 기존에 있는 프로젝트를 모두 바꿔야 되고 그 속에서 정말 많은 문제가 발생할 것
* 그래서 결국 이름을 바꾸지 않고 그대로 사용하기로 됨
    → 라이브러리에서 javax로 시작하는 이름을 가진 패키지는 처음에는 확장 패키지로 시작했다가 나중에 승격된 패키지라고 생각하면 된다.

#### 4. 기타
* 더 많은 API를 찾아보고 싶다면 HTML API 문서를 활용
