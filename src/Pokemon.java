import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public class Pokemon {
    private static int numPokemon;
    private String name;
    private int health;
    private String type;

    public static int getNumPokemon() { return numPokemon; }

    Pokemon(String n, int h, String t) {
        numPokemon++;
        name = n;
        health = h;
        type = t;
    }

    String getName() { return name; }
    int getHealth() { return health; }
    private void setHealth(int health) { this.health = health; }
    String getType() { return type; }

    public void attackPokemon(@NotNull Pokemon pokemon) {
        pokemon.setHealth(pokemon.getHealth() - 10);
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(),
                "\r\n\tName: %s - Health: %d - Type: %s",
                this.name, this.health, this.type);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        else if (!(obj instanceof Pokemon)) return false;
        Pokemon p = (Pokemon)obj;
        return (this.name.equals(p.name) && this.type.equals(p.type));
    }
}
