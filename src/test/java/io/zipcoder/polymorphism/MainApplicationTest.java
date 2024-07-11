package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {
    @Test
    public void testMe(){
    }

//    You must support at least three types of pets.
//    Dog must be one of the types you support.
//    Cat must be one of the types you support.
    @Test
    public void testDragonConstructor() {
        String name = "Sol";
        Pet dragon = new Dragon(name);
        Assert.assertTrue(dragon instanceof Dragon);
    }

    @Test
    public void testDogConstructor() {
        String name = "Milo";
        Pet dog = new Dog(name);
        Assert.assertTrue(dog instanceof Dog);
    }

    @Test
    public void testCatConstructor() {
        String name = "Miko";
        Pet cat = new Cat(name);
        Assert.assertTrue(cat instanceof Cat);
    }



//    The Pet class must have a speak method that each subclass overrides.
    @Test
    public void testPetDragonCanSpeak() {
        String name = "Sol";
        String speak = "rawr";
        Pet dragon = new Dragon(name);
        Assert.assertEquals(speak, dragon.speak());
    }

    @Test
    public void testPetDogCanSpeak() {
        String name = "Milo";
        String speak = "bark";
        Pet dog = new Dog(name);
        Assert.assertEquals(speak, dog.speak());
    }

    @Test
    public void testPetCatCanSpeak() {
        String name = "Miko";
        String speak = "meow";
        Pet cat = new Cat(name);
        Assert.assertEquals(speak, cat.speak());
    }

//    The Pet class must have a name field with setters and getters.
    @Test
    public void testDragonGetName() {
        String name = "Sol";
        Dragon dragon = new Dragon(name);
        Assert.assertEquals(name, dragon.getName());
    }

    @Test
    public void testDogGetName() {
        String name = "Milo";
        Dog dog = new Dog(name);
        Assert.assertEquals(name, dog.getName());
    }

    @Test
    public void testCatGetName() {
        String name = "Miko";
        Cat cat = new Cat(name);
        Assert.assertEquals(name, cat.getName());
    }

    @Test
    public void testPetNameSetter() {
        String name = "Sol";
        Pet pet = new Dragon(name);
        pet.setName(name);
        Assert.assertEquals(name, pet.getName());
    }
}
