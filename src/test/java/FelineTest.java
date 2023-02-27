import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import ru.yandex.praktikum.animals.Feline;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void getFoodReturnMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }

    @Test
    public void getFamilyReturnFeline() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensReturnKittensCount() {
        assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void getKittensReturnKittensCountOneTime() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }
}
