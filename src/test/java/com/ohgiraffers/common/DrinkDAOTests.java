package com.ohgiraffers.common;


import com.ohgiraffers.commom.DrinkDAO;
import com.ohgiraffers.commom.DrinkDTO;
import com.ohgiraffers.section01.java.ContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = {ContextConfiguration.class})
public class DrinkDAOTests {

    @Autowired
    private DrinkDAO drinkDAO;

    @Test
    public void testCreateDrinkDAO() {

        assertNotNull(drinkDAO);
    }

    @Test
    public void testSave() {

        DrinkDTO drinkDTO = new DrinkDTO(5, "환타", 2300, 5);

        boolean result = drinkDAO.save(drinkDTO);

        assertTrue(result);

    }

    @Test
    public void testDelete() {

        DrinkDTO drinkDTO = new DrinkDTO(5,"환타", 2300, 3);

        boolean result = drinkDAO.delete(drinkDTO);

//        assertEquals(result);
    }

}
