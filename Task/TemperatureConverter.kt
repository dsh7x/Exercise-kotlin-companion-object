class TemperatureConverter {
    companion object {
        fun celsiusToFahrenheit(celsius: Double): Double {
            return (celsius * 9 / 5) + 32
        }

        fun fahrenheitToCelsius(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5 / 9
        }

        fun celsiusToKelvin(celsius: Double): Double {
            return celsius + 273.15
        }

        fun kelvinToCelsius(kelvin: Double): Double {
            return kelvin - 273.15
        }
        fun fahrenheitToKelvin(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5 / 9 + 273.15
        }
        fun kelvinToFahrenheit(kelvin: Double): Double {
            return (kelvin - 273.15) * 9 / 5 + 32
        }
    }
}
fun main () {
    val celsius = 30.6
    val fahrenheit = 77.2
    val kelvin = 300.3

    println("${celsius}C to Fahrenheit: " +
            String.format("%.2f",
                TemperatureConverter.celsiusToFahrenheit(celsius)) + "F")

    println("${fahrenheit}F to Celsius: " +
            String.format("%.2f",
                TemperatureConverter.fahrenheitToCelsius(fahrenheit)) + "C")

    println("${celsius}C to Kelvin: " +
            String.format("%.2f",
                TemperatureConverter.celsiusToKelvin(celsius)) + "K")

    println("${kelvin}K to Celsius: " +
            String.format("%.2f",
                TemperatureConverter.kelvinToCelsius(kelvin)) + "C")

    println("${fahrenheit}F to Kelvin: " +
            String.format("%.2f",
                TemperatureConverter.fahrenheitToKelvin(fahrenheit)) + "K")

    println("${kelvin}K to Fahrenheit: " +
            String.format("%.2f",
                TemperatureConverter.kelvinToFahrenheit(kelvin)) + "F")
}

