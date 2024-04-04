# Java-practice

## Mini Assignment 01 

### 소스 코드 

src/day02/MiniAssignment01.java

### 과제 
- 객체 : `핸드폰(Phone)`, `상점(Store)`, `사람(Person)`

### 기능

- `Store` 객체 -> `Person` 객체 사용 
  - 생성자 
  ```java
  Store(int stock) {
  this.stock = stock;
  this.staff = new Person("직원");
  } 
  ```
  - 핸드폰 판매 메서드 
      ```java
        void sellPhone(Person customer, boolean isSamsung) {
              if (stock > 0) {
                  customer.buyPhone(isSamsung); // customer은 삼성 혹은 아이폰을 구매
                  this.stock--; // 재고 감소
                  staff.say(customer.getName() + "님 구매해주셔서 감사합니다 또오세용!");
              }
              else
                  staff.say("품절되었습니다 ㅠㅠ");
          }
      }
      ```

- `Person` 객체 -> `Phone` 객체 사용 
   - 핸드폰 구입 메서드
  ```java
    // 핸드폰 구입 메서드
    void buyPhone(boolean isSamsung) {
        if (isSamsung)
            phone = new SamsungPhone(); // 메서드 내에서 객체를 생성하면 의존성이 높아진다.
        else
            phone = new IPhone();
    }
    ```
  - 핸드폰 키는 메서드
    ```java
      void turnOnPhone() {
          if (phone != null) // 객체와 상호작용
              phone.turnOn(); // System.out.println(phone.getSound());
          else
              System.out.println("핸드폰이 없는디요");
      }
    ```
  

