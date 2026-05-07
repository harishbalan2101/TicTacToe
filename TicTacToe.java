import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    // Reads an integer slot value from the user
    static int getUserSlot() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;  // return the entered value
    }
}
