import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void getName() {
        // Given
        Person person = new Person();
        String expected = "Dawar";

        // When
        person.setName(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAge() {
        // Given
        Person person = new Person();
        Integer expected = 24;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWeight() {
        // Given
        Person person = new Person();
        Integer expected = 150;

        // When
        person.setWeight(expected);

        // Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

}
