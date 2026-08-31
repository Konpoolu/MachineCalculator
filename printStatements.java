public class printStatements {
    public static void statementEntry() {
        System.out.println("1. Calculators");
        System.out.println("2. Data Lookup");
    }

    public static void calculatorPrint() {
        System.out.println("1. Mill");
        System.out.println("2. Lathe");
        System.out.println("3. General Math");
    }

    public static void lookUpPrint() {
        System.out.println("1. Existing Formulas");
        System.out.println("2. G-Code Commands");
        System.out.println("3. Tap Drill Sizing");
    }

    public static void millCalcPrint() {
        System.out.println("1. Feeds and Speeds");
        System.out.println("2. Endmill Calculations");
    }

    public static void latheCalcPrint() {
        System.out.println("1. Feeds and Speeds");
        System.out.println("2. Taper Angles and Speeds");
        System.out.println("3. Threading Speeds");
    }

    public static void genCalcPrint() {
        System.out.println("1. Hypotenuse Calculator");
        System.out.println("2. Leg Calculator");
        System.out.println("3. Metric & Imperial Calculators");
    }

    public static void hypotenuseInstructions() {
        System.out.println("Enter the two legs of the right triangle:");
    }

    public static void legInstructions() {
        System.out.println("Enter the leg and the hypotenuse of the right triangle, in that order.");
    }

    public static void metricImperialConvertPrint() {
        System.out.println("1. Inches to Millimeters");
        System.out.println("2. Millimeters to Inches");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Miles to Kilometers");
        System.out.println("6. Kilometers to Miles");
    }

    public static void inToMMPrint() {
        System.out.println("Enter Inches:");
    }

    public static void mmToInPrint() {
        System.out.println("Enter Millimeters:");
    }

    public static void feetToMeters() {
        System.out.println("Enter Feet:");
    }

    public static void metersToFeet() {
        System.out.println("Enter Meters:");
    }
    
    public static void milesToKilometers() {
        System.out.println("Enter Miles");
    }

    public static void kilometersToMiles() {
        System.out.println("Enter Kilometers:");
    }
}
