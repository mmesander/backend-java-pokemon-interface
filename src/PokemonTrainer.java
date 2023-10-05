import java.util.List;

public class PokemonTrainer {
    // Variables
    private final String name;
    private List<Pokemon> pokemons;


    // Constructor
    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
