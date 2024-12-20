package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {
      private String city;
      private String street;
      private String zipcode;

      protected Address() { // 아래와 같은 생성자를 사용하면 JPA가 테이블을 생성하지 못해서 기본 생성자를 부여함
            /*
            @Embeddable 타입은 자바 기본 생성자를 public 또는 protected로 설정함
            public으로 두는 것 보다 protected로 설정하는 것이 그나마 더 안전
            JPA가 이런 제약을 두는 이유는 JPA 구현 라이브러리가 객체를 생성할 때 리플렉션 같은 기술을 사용할 수 있도록
            지원해야 하기 때문이다.
             */
      }

      /*
      생성자에서 값을 모두 초기화해서 변경 불가능한 클래스로 만드는 것이 좋
       */
      public Address(String city, String street, String zipcode) {
            this.city = city;
            this.street = street;
            this.zipcode = zipcode;
      }
}
