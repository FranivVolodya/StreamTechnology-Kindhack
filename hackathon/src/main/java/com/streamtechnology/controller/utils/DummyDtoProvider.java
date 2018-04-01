package com.streamtechnology.controller.utils;

import com.streamtechnology.dto.GrannyFlatDTO;

public class DummyDtoProvider {

    private GrannyFlatDTO getTmpGrannyFlatDTO() {
        return new GrannyFlatDTO("Ім'я","Прізвище","+380670000000","07.08.1965",
                "Немає", false,false,"Жінка","Полюбляю настільні ігри",
                "Хочу допомогти студентам та веселіше проводити вечори :)","Чоловік/Жінка",
                "Немає значення","Не курить, не вживає алкоголь","5",3,
                200.0,true,"Прибирати у своїй кімнаті.",null,null,
                null);
    }

}
