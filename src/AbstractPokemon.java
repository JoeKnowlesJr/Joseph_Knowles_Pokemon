import java.util.Locale;

public abstract class AbstractPokemon implements PokemonInterface {
    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        return new Pokemon(name, health, type);
    }

    @Override
    public String pokemonInfo(Pokemon pokemon) {
        return String.format(Locale.getDefault(),
                "Name: %s\r\nHealth: %d\r\nType: %s",
                pokemon.getName(), pokemon.getHealth(), pokemon.getType());
    }
}
