import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PokemonManager manager = new PokemonManager();
        manager.loadPokemonsFromCSV();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar un Pokémon a tu colección");
            System.out.println("2. Mostrar tu colección");
            System.out.println("3. Mostrar tu colección ordenada por Tipo 1");
            System.out.println("4. Mostrar todos los Pokémon ordenados por Tipo 1");
            System.out.println("5. Buscar Pokémon por habilidad");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.print("Introduce el nombre del Pokémon que deseas agregar: ");
                String si = scanner.nextLine();
                manager.addPokemonToUserCollection(si);
            } else if (option == 2) {
                manager.showUserCollection();
            } else if (option == 3) {
                manager.showUserCollectionByType1();
            } else if (option == 4) {
                manager.showAllPokemonsByType1();
            } else if (option == 5) {
                System.out.print("Introduce la habilidad que deseas buscar: ");
                String ability = scanner.nextLine();
                manager.searchPokemonByAbility(ability);
            } else if (option == 6) {
                System.out.println("Saliendo del programa.");
                break;
            } else {
                System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
}