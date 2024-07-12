package com.mycompany.laba;

// Класс позиции для автомобиля марки Audi
public class Audi implements AutoInterface
{
    private Integer unit;
    private String color;
    private Integer age;
    private String box;
    private String engine;
    private String fuel;

    // Конструктор без параметров
    public Audi(){
        this.unit = 2;
        this.color = "???";
        this.age = -1;
        this.box = "???";
        this.engine = "???";
        this.fuel = "???";
    }

    // Конструктор с параметрами
    public Audi(Integer unit, String color,Integer age,String box,String engine,String fuel){
        this.unit = unit;
        this.color = color;
        this.age = age;
        this.box = box;
        this.engine = engine;
        this.fuel = fuel;
    }

    // Конструктор копирования
    public Audi(Audi audi){
        this.unit = audi.unit;
        this.color = audi.color;
        this.age = audi.age;
        this.box = audi.box;
        this.engine = audi.engine;
        this.fuel = audi.fuel;

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
