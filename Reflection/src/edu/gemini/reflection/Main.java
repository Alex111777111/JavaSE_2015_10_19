package edu.gemini.reflection;

import java.awt.Rectangle;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Пример работы с классами через механизм Reflection
 *
 * @author ASaburov
 */
public class Main
{

    /**
     * Создание объекта через reflection
     */
    static Object createObject(String className) {
        Object object = null;

        try {
            Class classDefinition = Class.forName(className);
            object = classDefinition.newInstance();
        } catch (InstantiationException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        return object;
    }

    /**
     * Обращение к полю объекта через reflection
     */
    static void printHeight(Object r, String field) {
        try {
            Class c = r.getClass();
            Field heightField = c.getField(field);
            Integer heightValue = (Integer) heightField.get(r);
            System.out.println("Height: " + heightValue.toString());
        } catch (NoSuchFieldException e) {
            System.out.println(e);
        } catch (SecurityException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }
    }

    /**
     * Изменение поля объекта через reflection
     */
    static void modifyWidth(Object r, Integer widthParam) {
        try {
            Class c = r.getClass();
            Field widthField = c.getField("width");
            widthField.set(r, widthParam);
        } catch (NoSuchFieldException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }
    }

    /**
     * Пример вызова метода для объекта с аргументами
     */
    public static String append(String firstWord, String secondWord) {
        // Поле для хранения результата
        String result = null;

        // Описание классов для параметров
        Class[] parameterTypes = new Class[]{String.class};
        // Создание значений параметров
        Object[] arguments = new Object[]{secondWord};
        // Специальный класс для указания на метод
        Method concatMethod;
        try {
            // Вызов метода "concat" для строки - см. описание String
            concatMethod = String.class.getMethod("concat", parameterTypes);
            result = (String) concatMethod.invoke(firstWord, arguments);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return result;
    }

    public static void main(String[] args) {
/*
        // Создание объекта
        Rectangle r = (Rectangle) createObject("java.awt.Rectangle");
        System.out.println(r.toString());

        // Доступ к полю
        r.height = 199;
        printHeight(r, "height");

        // Модификация поля
        System.out.println("Not modified: " + r.toString());
        modifyWidth(r, new Integer(300));
        System.out.println("Modified: " + r.toString());

        // Вызов метода
        String firstWord = "Hello ";
        String secondWord = "everybody.";
        String bothWords = append(firstWord, secondWord);
        System.out.println(bothWords);
*/
        try {
            // Пример обращение к private полю
            ReflectClass rc = new ReflectClass("Simple value");
            System.out.println(rc.toString());

            Field psf = ReflectClass.class.getDeclaredField("value");
            psf.setAccessible(true);
            String fieldValue = (String) psf.get(rc);
            System.out.println("fieldValue = " + fieldValue);
            psf.set(rc, "New simple value");
            System.out.println("fieldValue = " + rc.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
