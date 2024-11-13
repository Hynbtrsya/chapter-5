import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner convert = new Scanner(System.in);//object name is convert
        
        System.out.println("Unit Conversions Available: ");
        System.out.println("1. Temperature (Celsius to Fahrenheit)");
        System.out.println("2. Distance (km to miles)");
        System.out.println("3. Length (meter to foot)");
        System.out.println("4. Weight (kg to pound)"); 

        System.out.print("Choose your converter: ");
        int choice = convert.nextInt(); 

        System.out.print("Insert Amount/Quantity: ");
        double amount = convert.nextDouble();  //viarable is amount
        
        // Initialize a variable to store the conversion result
        double result = 0; //viarable is reslut
        
        // Perform conversion based on user choice
        switch (choice) {
            case 1 -> {
                result = TemperatureConverter.celsiusToFahrenheit(amount); //method name is celsiusToFahrenheit
                System.out.printf("\n%.2f Celsius = %.2f Fahrenheit%n", amount, result);
            }
            case 2 -> {
                result = DistanceConverter.kmToMiles(amount);
                System.out.printf("\n%.2f km = %.2f miles%n", amount, result); //method name is kmToMiles
            }
            case 3 -> {
                result = LengthConverter.meterToFoot(amount);
                System.out.printf("\n%.2f meters = %.2f feet%n", amount, result); // method name is meterToFoot
            }

            case 4 -> {
                result = WeightConverter.kgToPounds(amount);
                System.out.printf("\n%.2f kg = %.2f pounds%n", amount, result); // method name is kgToPounds
            }
            default -> System.out.println("\nInvalid choice!");  
        }

        convert.close();
    }
}


