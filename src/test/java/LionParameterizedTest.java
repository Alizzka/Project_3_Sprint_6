import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

// Параметризованный тест
@RunWith(Parameterized.class)
public class LionParameterizedTest {

    // Поля для хранения данных параметров
    private final String sex; // Пол
    private final boolean expectedHasMane; // Ожидаемое наличие гривы

    // Конструктор для инициализации параметров
    public LionParameterizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    // Метод возвращающий данные для параметризованных тестов
    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},  // Для самца ожидается наличие гривы
                {"Самка", false}  // Для самки ожидается отсутствие гривы
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        // Создаем экземпляр класса Lion с заданным полом
        Lion lion = new Lion(sex, new Feline());

        // Проверяем соответствует ли результат ожиданиям
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}


