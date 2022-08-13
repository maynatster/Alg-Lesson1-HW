import java.util.Arrays;

public class Algorithms1Homework {
    public static void main(String[] args) {
        String [] names = {"Ivanov", "Petrov", "Konovalov", "Gomez", "Liu Xi", "Placido", "Schmidt", "Meyer", "Williams", "Kunz"};
        String temp;
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if(names[j].compareTo(names[i]) < 0){
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
            System.out.println(names[i]);
        }
    }
}