public class menus {
    public static void mainMenu() {
        while (true) {
            printStatements.statementEntry();
            int choice = userInput.integerInput(1, 3);
            switch (choice) {
                case 1: formulasMenu(); break;
                case 2: lookUpMenu(); break;
            }
            if (choice == 3) {
                break;
            }
        }
    }
    
    // ALL CALCULATORS
    public static void formulasMenu() {
        while (true) {
            printStatements.calculatorPrint();
            int choice = userInput.integerInput(1, 4);
            switch (choice) {
                case 1: millCalculator(); break;
                case 2: latheCalculator(); break;
                case 3: generalCalculator(); break;
                case 4: break;
            }
            if (choice == 4) {
                break;
            }
        }
    }

    public static void millCalculator() {
        while (true) {
            printStatements.millCalcPrint();
            int choice = userInput.integerInput(1, 3);
            switch (choice) {
                case 1: break;
                case 2: break;
                case 3: break;
            }
            if (choice == 3) {
                break;
            }
        }
    }

    public static void latheCalculator() {
        while (true) {
            printStatements.latheCalcPrint();
            int choice = userInput.integerInput(1, 4);
            if (choice == 4) {
                printStatements.calculatorPrint();
                break;
            }
        }
    }

    public static void generalCalculator() {
        while (true) {
            printStatements.genCalcPrint();
            int choice = userInput.integerInput(1, 4);
            switch (choice) {
                case 1: {
                    printStatements.hypotenuseInstructions(); 
                    double result = calculator.hypotenuse(userInput.doubleEntry(), userInput.doubleEntry());
                    System.out.println("Hypotenuse length is: " + result);
                } break;
                case 2: {
                    printStatements.legInstructions();
                    double result = calculator.leg(userInput.doubleEntry(), userInput.doubleEntry());
                    System.out.println("Remaining leg length is: " + result);
                } break;
                case 3: imperialMetricCalculator(); break;
                case 4: break;
                
            }
            if (choice == 4) {
                break;
            }
        }
    }

    public static void imperialMetricCalculator() {
        while (true) {
            printStatements.metricImperialConvertPrint();
            int choice = userInput.integerInput(1, 7);
            switch (choice) {
                case 1: {
                    printStatements.inToMMPrint();
                    double result = calculator.inToMM(userInput.doubleEntry());
                    System.out.println("Length in Millimeters is: " + result);
                } break;
                case 2: {
                    printStatements.mmToInPrint();
                    double result = calculator.mmToIn(userInput.doubleEntry());
                    System.out.println("Length in Inches is: " + result);
                } break;
                case 3: {
                    printStatements.feetToMeters();
                    double result = calculator.feetToMeters(userInput.doubleEntry());
                    System.out.println("Length in Meters is: " + result);
                } break;
                case 4: {
                    printStatements.metersToFeet();
                    double result = calculator.metersToFeet(userInput.doubleEntry());
                    System.out.println("Length in Feet is: " + result);
                } break;
                case 5: {
                    printStatements.milesToKilometers();
                    double result = calculator.milesToKilometers(userInput.doubleEntry());
                    System.out.println("Length in Kilometers is: " + result);
                } break;
                case 6: {
                    printStatements.kilometersToMiles();
                    double result = calculator.kilometersToMiles(userInput.doubleEntry());
                    System.out.println("Length in Miles is: " + result);
                } break;
                case 7: break;
            }
            if (choice == 7) {
                break;
            }
        }
    }

    // ALL LOOKUPS
    public static void lookUpMenu() {
        while (true) {
            printStatements.lookUpPrint();
            int choice = userInput.integerInput(1, 4);
            if (choice == 4) {
                break;
            }
        }
    }
}
