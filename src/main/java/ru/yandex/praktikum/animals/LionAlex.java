package ru.yandex.praktikum.animals;

import java.util.List;

public class LionAlex extends Lion {

    private final List<String> friends = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
    private final String address = "Нью-Йоркский зоопарк";

    public LionAlex(FelineInterface feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return friends;
    }

    public String getPlaceOfLiving() {
        return address;
    }
}
