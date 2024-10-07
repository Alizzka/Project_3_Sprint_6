import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CatTest {
    private Feline feline; // Объявляем переменную для класса Feline
    private Cat cat; // Объявляем переменную для класса Cat

    @Before
    public void setUp() {
        // Создаем мок объект для класса Feline
        feline = Mockito.mock(Feline.class);
        // Инициализируем объект Cat, передавая ему мок объект Feline
        cat = new Cat(feline);
    }

    @Test
    public void testGetSound() {
        // Проверяем что метод getSound() возвращает правильный звук для кошки
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        // Настраиваем мок объект чтобы метод eatMeat() возвращал список с "Мясо"
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Мясо"));

        // Получаем еду для кошки
        List<String> food = cat.getFood();

        // Проверяем что возвращаемый список еды совпадает с ожидаемым значением
        assertEquals(List.of("Мясо"), food);

        // Проверяем что метод eatMeat() был вызван один раз на мок объекте feline
        Mockito.verify(feline).eatMeat();
    }
}

