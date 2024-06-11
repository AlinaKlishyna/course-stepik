package com.gmail.alinakotova102.generics.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //Optional.of() - положить значение
        Optional<String> text = Optional.of("Okey");
        Optional<String> textIsEmpty = Optional.empty();

        //text.ifPresent() - if, который проверяет значение на null и выводит его, если не null
        // if(text != null) {
        // System.out.println(text);
        // }
        text.ifPresent(System.out::println); //Вывод: Okey
        textIsEmpty.ifPresent(System.out::println); //Не выведет, так как не прошел проверку

        //text.isPresent() - проверка на наличие значения(не null)
        if (text.isPresent()){
            System.out.println("I have value!");
        }

        //text.orElse() - выводит нужный нам текст(other) при наличии null
        //чтобы обойтись от ошибки NullPointerException
        System.out.println(text.orElse("Default value! Non found!"));
        System.out.println(textIsEmpty.orElse("Default value! Non found!"));
    }
}
