package com.ohgiraffers.commom;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class DrinkDTO {

    private int sequence;
    private String name;
    private int price;
    private int amount;
}
