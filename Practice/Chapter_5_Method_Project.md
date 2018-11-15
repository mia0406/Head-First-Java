

## Headfirst Java Chapter5 연습문제 코딩하면서 배운 것
#### Ⅰ. 배열에서 어떤 값이 위치하는 게 몇번째 자리인지 알 수 있는 방법
1. indexOf()
* 인자값으로 받은 것이 대상객체에 있다면 0 return, 없다면 -1 return

```JAVA
String[] rowLabel = {"A", "B", "C", "D", "E", "F", "G"};

String str="E5";
char firstChar=str.charAt(0);

for(int i=0;i<rowLabel.length;i++) {

  System.out.println(i + "번째: " + rowLabel[i].indexOf(firstChar));
}

/* 결과
0번째: -1
1번째: -1
2번째: -1
3번째: -1
4번째: 0
5번째: -1
6번째: -1
*/
```
2. char 형 → int형으로 변환
```JAVA
String str="E5";

char firstChar=str.charAt(0);
int secondIntFail=str.charAt(1);

// 둘 중 어느 것을 사용해도 같은 결과 값이 나온다.
int secondIntSuccess_1=str.charAt(1)-'0';
int secondIntSuccess_2=Character.getNumericValue(str.charAt(1));


System.out.println("secondIntFail: " + secondIntFail);
System.out.println("secondIntSuccess: " + secondIntSuccess_1);

/* 결과
secondIntFail: 53
secondIntSuccess: 5
*/
```
* 그냥 변환 없이 바로 하면 제대로 값 출력 X
* ```char-'0'```을 이용하면 아스키코드 값을 알 필요없이 int형으로 변환이 가능하다.
* ```Character.getNumericValue([String].charAt([숫자 위치]))```을 사용해도 된다.
