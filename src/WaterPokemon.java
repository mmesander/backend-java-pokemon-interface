import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    // Variables
    private final String type = "water";
    private final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");


    // Constructor
    public WaterPokemon(String name, int level, int hp, String food, String sound, String type) {
        super(name, level, hp, food, sound, type);
    }


    // Methods
    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(0));
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(getHp() - 5);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(getHp() - 40);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(getHp() - 15);
            }
        }
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(1));
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 55 hp");
                enemy.setHp(getHp() - 5);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(getHp() - 45);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(getHp() - 20);
            }
        }
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(2));
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 75 hp");
                enemy.setHp(getHp() - 5);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(getHp() - 45);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(getHp() - 20);
            }
        }
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(3));
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(getHp() - 5);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 60 hp");
                enemy.setHp(getHp() - 45);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(getHp() - 20);
            }
        }
    }
}

