package com.hillel.homework5;


    public abstract class Wild extends Animal {
        public Wild(String id, int age, int weight, String color, boolean isPredator) {
            super(id, age, weight, color);
            this.isPredator = isPredator;
        }

        protected boolean isPredator;

        public boolean isPredator() {
            return isPredator;
        }

        public void setPredator(boolean predator) {
            isPredator = predator;
        }
    }

