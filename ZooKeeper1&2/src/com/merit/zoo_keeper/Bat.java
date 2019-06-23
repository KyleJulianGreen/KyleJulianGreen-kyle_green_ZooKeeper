package com.merit.zoo_keeper;

public class Bat extends Mammal{
    public Bat(){
        this.energyLevel = 300;
    }
    public Bat fly(){
        System.out.println("The bat took off into the air with a whoosh! It lost 50 energy.");
        this.energyLevel -=50;
        return this;
    }
    public Bat eatHumans(){
        System.out.println("The Bat gained 25 energy.");
        this.energyLevel +=25;
        return this;
    }
    public Bat attackTown(){
        System.out.println("The Bat set the town on fire because he's a Jackass. The bat lost 100 energy");
        this.energyLevel -= 100;
        return this;
    }
}
