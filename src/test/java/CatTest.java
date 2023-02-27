import org.junit.Test;
import ru.yandex.praktikum.animals.Cat;
import ru.yandex.praktikum.animals.Feline;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class CatTest {

    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void getSoundReturnMyau() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

}
