package com.example;
import java.util.List;

public class Alex extends Lion {
    public Alex(Feline feline) throws Exception {
        super("Самец", feline); // Передаем "Самец" в конструктор родительского класса Lion
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман"); // Возвращаем список друзей Алекса
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк"; // Возвращаем место жительства Алекса
    }

    @Override
    public int getKittens() {
        return 0; // Переопределяем метод, так как у Алекса нет львят
    }
}
