import java.util.HashMap;
import java.util.TreeMap;

public class Wordsbylength{
    public static void main(String[] args) {
        String st = "Задание 1: Подсчитайте количество различных слов в файле слов"; //задаем искомую строку
        String[] words = st.split(" "); // сплитим строку по словам в массив words
        TreeMap<String,Integer> keyValue = new TreeMap<String,Integer>(); //создаем HashMap keyValue
        for (int i=0; i<= words.length-1; i++) {
            if (keyValue.containsKey(words[i])) { //если HashMap keyValue содержит уже это слово, то
                int counter = keyValue.get(words[i]); //то забираем значение сколько раз оно встречалось
                keyValue.put(words[i], counter+1); //и добавляем к нему единицу
            }
            else {
                keyValue.put(words[i], 1); //если слово встречается один раз, то устанавливаем значение его повторов равным 1
            }
        }
        System.out.println("Вот сколько раз встречается каждое слово "+keyValue); //выдаем массив со значениями сколько раз встречается каждое слово
    }
}