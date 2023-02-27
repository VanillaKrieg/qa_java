import org.junit.Test;
import ru.yandex.praktikum.animals.Feline;
import ru.yandex.praktikum.animals.FelineInterface;
import ru.yandex.praktikum.animals.LionAlex;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    FelineInterface feline = new Feline();

    @Test
    public void getKittensReturnKittensCount0() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void getFriendsReturnListAnimals() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман"), lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnZoo() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }
}
