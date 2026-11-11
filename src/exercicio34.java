public class exercicio34 {
    public static double paraFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double paraKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        double tempCelsius = 25.0;

        System.out.println(tempCelsius + "°C em Fahrenheit: " + paraFahrenheit(tempCelsius) + "°F");
        System.out.println(tempCelsius + "°C em Kelvin: " + paraKelvin(tempCelsius) + "K");
    }
}
