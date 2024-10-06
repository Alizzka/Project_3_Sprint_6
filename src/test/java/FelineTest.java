import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        // Создаем экземпляр класса Feline
        Feline feline = new Feline();

        // Вызываем метод eatMeat() для получения списка еды
        List<String> food = feline.eatMeat();

        // Проверяем что возвращаемый список совпадает с ожидаемыми значениями
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void testGetFamily() {
        // Создаем экземпляр класса Feline
        Feline feline = new Feline();

        // Проверяем что метод getFamily() возвращает правильное название семейства
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensDefault() {
        // Создаем экземпляр класса Feline
        Feline feline = new Feline();

        // Проверяем что метод getKittens() возвращает 1 по умолчанию
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithArgument() {
        // Создаем экземпляр класса Feline
        Feline feline = new Feline();

        // Проверяем что метод getKittens(int count) возвращает ожидаемое количество котят
        assertEquals(3, feline.getKittens(3));
    }
}

