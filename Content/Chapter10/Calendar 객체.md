## Chapter 10. 숫자와 정적 변수, 정적 메소드
### java.util.Calendar
* 최근에 들어서는 java.util.Date보다는 java.util.Calendar API를 쓰도록 권고하고 있다.
* 특징: 리턴되는 각 컴퓨터에서 사용하는 지역 설정에 적합한 Calendar 객체가 리턴된다.
* **만약 '지금 날짜와 시각'에 대한 타임스탬프를 원하다면 Date 객체를, 그 외에 다른 용도로 사용할 때는 Calendar 객체를 사용하는 것을 권장**
* 특징 : 필드에 **상태** 가 저장된다.

```java
Calendar cal = new Calendar(); // 이렇게 사용 X
Calendar cal = Calendar.getInstance(); 		
```
* Calendar 클래스는 추상 클래스이기 때문에 Calendar 클래스의 인스턴스를 받는 것은 불가능하다. 하지만 정적 메소드는 특정 인스턴스가 아닌 클래스 자체에서 호출된다.
* Calendar 클래스의 getInstance() 메소드를 호출하면 구상 하위클래스의 인스턴스를 받을 수 있다. Calendar를 확장한, Calendar 클래스에서 선언한 메소드에 대해 응답할 수 있는 객체를 받을 수 있다.

1. 메소드
* getInstance() : Calendar 리턴
* roll(int field, int amount)
	*  지정한 필드의 값을 증가/감소
	* add()와 다른 점: 다른 필드에 영향을 미치지 않는다.

2. 필드
* DATE/DAY_OF_MONTH : 일
* HOUR/HOUR_OF_DAY : 시간
