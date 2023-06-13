# 실습 : 06-13 Spring Test

---

### 주제 : java와 annotation을 활용한 spring 프레임워크 동작방식 실습

---
### 설명 
* @Repository 클래스에 음료수를 임의로 등록하여 자판기 역할을 수행한다.
* 음료수는 총 4가지로 조회, 등록, 삭제, 판매가 가능하다.
* DrinkDTO 클래스 (int)sequence, (String)name, (int)price, (int)amount
* Application 에서는 사용자가 Scanner 로 번호를 입력받아 동작을 할 수 있다.
* 


> 주요 메소드
> > save() 등록 , delete() 삭제 , sell() 판매, findByDrink() 조회, findAllDrink() 전체 조회