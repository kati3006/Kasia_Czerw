package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private String roll;
    private int burgers;
    private String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigMacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
