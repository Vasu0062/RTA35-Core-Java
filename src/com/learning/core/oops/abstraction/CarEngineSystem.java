package com.learning.core.oops.abstraction;

    abstract class Car {
        public abstract void startEngine();
    }

    class ElectricCar extends Car {
        @Override
        public void startEngine() {
            System.out.println("Electric Car: Engine started.");
        }
    }

    class PetrolCar extends Car {
        @Override
        public void startEngine() {
            System.out.println("Petrol Car: Engine started.");
        }
    }

   public class CarEngineSystem {
        public static void main(String[] args) {
            Car myElectricCar = new ElectricCar();
            Car myPetrolCar = new PetrolCar();

            myElectricCar.startEngine();
            myPetrolCar.startEngine();
        }
    }

