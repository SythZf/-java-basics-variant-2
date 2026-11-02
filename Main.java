import java.util.Random;
public class Main { 
public static void main(String[] args) { 
        int[] temperatures = new int[10];
        Random random = new Random();

        // Заполнение массива случайными температурами от 50 до 100 градусов
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = random.nextInt(51) + 50; // Генерирует от 50 до 100
        }

        int sum = 0;

        // Вывод сгенерированных данных для наглядности
        System.out.print("📈 Показания датчика по минутам: ");
        for (int temp : temperatures) {
            System.out.print(temp + "°C ");
        }
        System.out.println("\n");

        // Цикл анализа данных
        for (int i = 0; i < temperatures.length; i++) {
            int currentTemp = temperatures[i];
            int minute = i + 1;

            sum += currentTemp;

            // Проверка превышения критической отметки в 80 градусов
            if (currentTemp > 80) {
                System.out.println("⚠️ ТРЕВОГА! На " + minute + "-й минуте температура превысила норму: " + currentTemp + "°C");
            }
        }

        // Расчет и вывод средней температуры
        double averageTemp = (double) sum / temperatures.length;
        System.out.println("\n📊 Мониторинг завершен.");
        System.out.printf("Средняя температура за весь период: %.1f°C\n", averageTemp);
    }
}

System.out.println("Модуль успешно инициализирован в Git!"); // xe xe nbgj nbgj
} 
} 
