package com.gmail.alinakotova102.generics.optional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Как не волноваться, что ссылка может хранить в себе null?

        // Можно использовать доп. аннотации, но для этого нужно брать сторонние библиотеки
        @Nonnull String hello = "Hello!";
        @Nullable String helloNull = null;
        System.out.println(hello + " - " + helloNull);

        // стоновятся разными ссылками не совместимыми друг с другом
        String text = "basic"; //обычная ссылка
        Optional<String> optionalText = Optional.of("basic");  //потенциально отсутствующая ссылка

        // Обертка Optional дает много возможностей
        // например: писать код без if-ов
        optionalText.ifPresent(System.out::println);

        // Главная особенность - избежать NullPointerException
    }
}