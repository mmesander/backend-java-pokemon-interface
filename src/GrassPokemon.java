import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    // Variables
    private static final String type = "grass";
    private final List<String> attacks = Arrays.asList("LeafStorm", "solarBeam", "leaveBlade", "leechSeed");


    // Constructor
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }


    // Methods
    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(0));
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 65 hp");
                enemy.setHp(enemy.getHp() - 65);
            }
        }
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(1));
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 60 hp");
                enemy.setHp(enemy.getHp() - 60);
            }
        }
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(2));
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
        }
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(3));
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " transfers 35 hp to " + name.getName());
                enemy.setHp(enemy.getHp() - 35);
                name.setHp(getHp() + 35);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " transfers 15 hp to " + name.getName());
                enemy.setHp(enemy.getHp() - 15);
                name.setHp(getHp() + 15);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " transfers 25 hp to " + name.getName());
                enemy.setHp(enemy.getHp() - 25);
                name.setHp(getHp() + 25);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " transfers 45 hp to " + name.getName());
                enemy.setHp(enemy.getHp() - 45);
                name.setHp(getHp() + 45);
            }
        }
    }


    // Getters and Setters
    public List<String> getAttacks() {
        return attacks;
    }
}
