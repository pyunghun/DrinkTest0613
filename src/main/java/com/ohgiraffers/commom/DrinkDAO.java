package com.ohgiraffers.commom;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DrinkDAO {

    private final Map<Integer, DrinkDTO> drinkMap;

    public DrinkDAO() {
        this.drinkMap = new HashMap<>();

        this.drinkMap.put(1,new DrinkDTO(1, "사이다", 3000, 3));
        this.drinkMap.put(2,new DrinkDTO(2, "콜라", 2000, 2));
        this.drinkMap.put(3,new DrinkDTO(3, "제로콜라", 2500, 4));
        this.drinkMap.put(4,new DrinkDTO(4, "나랑드사이다", 1500, 5));

    }

    public DrinkDTO findByDrink(int sequence) {

        return drinkMap.get(sequence);
    }

    public boolean save(DrinkDTO drinkDTO) {
        int before = drinkMap.size();

        drinkMap.put(drinkDTO.getSequence(), drinkDTO);

        int after = drinkMap.size();

        return after > before? true : false;
    }

    public boolean delete(DrinkDTO drinkDTO) {

        int before = drinkMap.size();

        drinkMap.remove(drinkDTO.getSequence(), drinkDTO);

        int after = drinkMap.size();

        return before > after? true : false;
    }

    public boolean sell(DrinkDTO drinkDTO) {
        int before = drinkDTO.getAmount();

        drinkMap.put(drinkDTO.getAmount(), drinkDTO);

        int after = drinkDTO.getAmount();

        return after > before? true : false;
    }

    public DrinkDTO findAllDrink(int sequence) {

        for(int i = 0; i < drinkMap.size(); i++) {
            System.out.println();
        }
        return drinkMap.get(sequence);
    }


//    public boolean delete(DrinkDTO drinkDTO) {
//        int before = drinkDTO.getAmount();
//
//        drinkMap
//    }
}
