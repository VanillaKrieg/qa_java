import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.animals.Feline;
import ru.yandex.praktikum.animals.FelineInterface;
import ru.yandex.praktikum.animals.Lion;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;
    private final boolean result;
    private final String Exception;
    FelineInterface feline = new Feline();

    public LionTest(String sex, boolean result, String Exception) {
        this.sex = sex;
        this.result = result;
        this.Exception = Exception;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true, ""},
                {"Самка", false, ""},
                {"Самко", false, "Используйте допустимые значения пола животного - самец или самка"}
        };
    }


    @Test
    public void createLionHasMane() throws Exception {
        try {
            Lion lion = new Lion(sex, feline);
            assertEquals(result, lion.doesHaveMane());
        } catch (Exception e) {
            assertEquals(Exception, e.getMessage());
        }
    }

    @Test
    public void getKittensReturnKittensCount1() throws Exception {
        try {
            Lion lion = new Lion(sex, feline);
            assertEquals(1, lion.getKittens());
        } catch (Exception ignored) {}
    }

    @Test
    public void getFoodReturnMeat() throws Exception {
        try {
            Lion lion = new Lion(sex, feline);
            assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
        } catch (Exception ignored) {}
    }
}
