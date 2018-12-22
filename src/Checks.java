import sun.plugin.dom.exception.InvalidStateException;

import java.util.Scanner;

public class Checks {

    public Checks(){
        start();
    }

    private void start() throws InvalidStateException {

        // Show choices
        menuDisplay();

        // Get Input
        int choice = getInput();

        // Enter chosen choice function
        menu(choice);

    }

    private void menuDisplay(){
        System.out.println("Menu");
        System.out.println("1) Simple Parity Check");
        System.out.println("2) Two-dimensional Parity Check");
        System.out.println("3) Checksum");
        System.out.println("4) Cyclic Redundancy Check");
    }

    private void menu(int choice){
        switch (choice){
        case 1:
            new SimpleParityCheckUI();
            break;
        case 2:
            new TwoDimensionalParityCheckUI();
            // Two Dimensional Parity Check
            break;
        case 3:
            // Checksum
            break;
        case 4:
            // Cyclic Redundancy Check
            break;
        default:
            throw new InvalidStateException("In Checks switch case");

    }

    }

    private int getInput() {
        int choice;
        Scanner sc = new Scanner(System.in);

        do{
            choice = sc.nextInt();
        }while(choice > 4 || choice < 1);
        return choice;
    }

}
