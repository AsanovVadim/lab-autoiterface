package com.mycompany.laba;

// Класс позиции для автомобиля марки Mazda
public class Mazda implements AutoInterface
{
    private Integer unit;
    private String color;
    private Integer age;
    private String box;
    private String engine;
    private String fuel;

    // Конструктор без параметров
    public Mazda(){
        this.unit = 1;
        this.color = "???";
        this.age = -1;
        this.box = "???";
        this.engine = "???";
        this.fuel = "???";
    }

    // Конструктор с параметрами
    public Mazda(Integer unit, String color,Integer age,String box, String engine, String fuel){
        this.unit = unit;
        this.color = color;
        this.age = age;
        this.box = box;
        this.engine = engine;
        this.fuel = fuel;
    }

    // Конструктор копирования
    public Mazda(Mazda mazda){
        this.unit = mazda.unit;
        this.color = mazda.color;
        this.age = mazda.age;
        this.box = mazda.box;
        this.engine = mazda.engine;
        this.fuel = mazda.fuel;
    }

    // Переопределение методов родителя
    @Override
    public Integer getUnit() {
        return unit;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getBox() {
        return box;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public String getFuel() {
        return fuel;
    }

    @Override
    public void destructor() {
        System.gc();
    }
}