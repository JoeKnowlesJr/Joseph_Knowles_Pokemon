import java.util.ArrayList;
import java.util.List;

public class PokeDex extends AbstractPokemon {
    private List<Pokemon> myPokemons = new ArrayList<>();

    public void addPokemon(Pokemon p) {
        if (myPokemons.contains(p)) return;
        myPokemons.add(p);
    }

    public void addPokemon(Pokemon... p) {
        for (Pokemon pokemon : p) addPokemon(pokemon);
    }

    public void removePokemon(Pokemon p) {
        if (!(myPokemons.contains(p))) return;
        myPokemons.remove(p);
    }

    @Override
    public void listPokemon() {
        for (Pokemon p : myPokemons) {
            System.out.println(p.toString());
        }

    }
}
