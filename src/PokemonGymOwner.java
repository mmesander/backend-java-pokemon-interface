import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    // Variables
    private final String town;


    // Constructor
    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        super(name, pokemons);
        this.town = town;
    }


    // Getters and Setters
    public String getTown() {
        return town;
    }
}
