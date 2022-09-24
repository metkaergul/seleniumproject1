package com.cydeo.tests.RandomPractice;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FakerPractice {



    @Test

    public void fakerPractice(){


        Faker faker=new Faker();

        String s = faker.name().fullName();
        System.out.println(s);

    }
}
