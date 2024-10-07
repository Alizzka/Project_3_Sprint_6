import com.example.Alex;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexTest {
    private Feline feline;
    private Alex alex;

    @Before
    public void setUp() throws Exception {
        feline = Mockito.mock(Feline.class); // Создали мок объекта Feline
        alex = new Alex(feline); // Создали экземпляр Alex с мок объектом Feline
    }

    @Test
    public void testGetFriends() {
        // Проверяем что метод getFriends() возвращает список друзей
        List<String> friends = alex.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), friends);
    }

    @Test
    public void testGetPlaceOfLiving() {
        // Проверяем что метод getPlaceOfLiving() возвращает место жительства
        String placeOfLiving = alex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", placeOfLiving);
    }

    @Test
    public void testGetKittens() {
        // Проверяем что метод getKittens() возвращает 0
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void testDoesHaveMane() {
        // Проверяем что у Алекса есть грива
        assertTrue(alex.doesHaveMane());
    }
}

