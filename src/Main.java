public class Main {

    public static void main(String[] args) {
        PokeDex dex = new PokeDex();
        Pokemon one = new Pokemon("Fred", 50, "PokeOne");
        dex.addPokemon(one);
        Pokemon two = new Pokemon("Barney", 50, "PokeTwo");
        Pokemon three = new Pokemon("Wilma", 50, "PokeThree");
        dex.addPokemon(two, three);
        dex.listPokemon();
        one.attackPokemon(two);
        three.attackPokemon(one);
        dex.listPokemon();
    }
}
