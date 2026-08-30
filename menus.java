public class menus {
    public static void mainMenu() {
        printStatements.statementEntry();
        int choice = userInput.integerInput(1, 3);
        switch (choice) {
            case 1: formulasMenu(); break;
            case 2: lookUpMenu(); break;
        }
    }
    
    public static void formulasMenu() {
        printStatements.formulasPrint();
        while (true) {
            int choice = userInput.integerInput(1, 3);
            if (choice == 3) {
                break;
            }
        }
    }

    public static void lookUpMenu() {
        printStatements.lookUpPrint();
        while (true) {
            int choice = userInput.integerInput(1, 3);
            if (choice == 3) {
                break;
            }
        }
    }
}
