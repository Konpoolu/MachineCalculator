public class calculator {

    // calculates hypotenuse
    public static double hypotenuse(double leg1, double leg2) {
        double legOneSquare = leg1 * leg1;
        double legTwoSquare = leg2 * leg2;

        double hypoSquare = legOneSquare + legTwoSquare;
        double result = Math.sqrt(hypoSquare);

        return result;
    }

    // calculates missing leg
    public static double leg(double leg, double hypotenuse) {
        double legSquare = leg * leg;
        double hypoSquare = hypotenuse * hypotenuse;
        
        double resultLegSquare = hypoSquare - legSquare;
        double result = Math.sqrt(resultLegSquare);

        return result;
    }

    // calculates inches to millimeters
    public static double inToMM(double inches) {
        double result = inches * 25.4;
        return result;
    }

    // calculates millimeters to inches
    public static double mmToIn(double millimeters) {
        double result = millimeters / 25.4;
        return result;
    }

    // calculates feet to meters
    public static double feetToMeters(double feet) {
        double result = feet * 0.3048;
        return result;
    }

    // calculates meters to feet
    public static double metersToFeet(double meters) {
        double result = meters * 3.280839895;
        return result;
    }

    // calculates miles to kilometers
    public static double milesToKilometers(double miles) {
        double result = miles * 1.609344;
        return result;
    }

    // calculates kilometers to miles
    public static double kilometersToMiles(double kilometers) {
        double result = kilometers * 0.6213711922;
        return result;
    }
}
