import java.util.Scanner;

public class Candidate_Cat_Rum_San {
    //include time and date

    public void Canditates() {
        System.out.println("***KEMTECH Software Engineering***\n" +
                "\nThe 2022 Bahamas National General Election" +
                "\nChoose the NUMBER for the canditate you would like to vote for.\n\n" +
                "1 - DNA: SAMUEL STRACHAN\n2 - FNM: GADVILLE McDONALD\n3 - PLP: PHILIP BRAVE DAVIS");


        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();


        String[] names = new String[4];
        names[1] = "SAMUEL STRACHAN";
        names[2] = "GADVILLE McDONALD";
        names[3] = "PHILIP BRAVE DAVIS";

        if (choice == 1) {
            System.out.println("\nYOU VOTED FOR " + names[1]);


        } else if (choice == 2) {
            System.out.println("\nYOU VOTED FOR " + names[2]);


        } else if (choice == 3) {
            System.out.println("\nYOU VOTED FOR " + names[3]);
        }


        else {
            System.err.println("Please choose a number between 1 and 3 to vote for your DNA, FNM or PLP canditate");
        }
    }

    public static void main(String[] args) {
        Candidate_Cat_Rum_San crs = new Candidate_Cat_Rum_San();
        crs.Canditates();
    }
}
