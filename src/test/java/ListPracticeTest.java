import org.assertj.core.data.Percentage;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListPracticeTest {

    private static final List<String> listOfStrings = List.of(
            "voice", "payment", "clover", "books", "dust", "snakes", "vacation", "behavior", "caption", "chickens",
            "profit", "band", "chicken", "jeans", "purpose", "crush", "fork", "nest", "rabbits", "camp"
    );

    @Test
    public void checkNumbersOneToTen() {
        List<Integer> expectedNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> actualNumbers = ListPractice.listOfTheNumbersOneToTen();

        assertThat(actualNumbers).containsExactlyElementsOf(expectedNumbers);
    }

    @Test
    public void checkReturnsSixthElementFromList() {
        String sixthElement = ListPractice.getSixthElementFromList(listOfStrings);

        assertThat(sixthElement).isEqualTo("snakes");
    }

    @Test
    public void checkReturnsFirstLetterOfEachEntry() {
        List<String> expectedList = List.of(
                "v", "p", "c", "b", "d", "s", "v", "b", "c", "c", "p", "b", "c", "j", "p", "c", "f", "n", "r", "c"
        );

        List<String> actualList = ListPractice.getListOfFirstLetters(listOfStrings);

        assertThat(actualList).containsExactlyElementsOf(expectedList);
    }

    @Test
    public void checkReturnsEveryThirdCharacter() {
        List<String> expectedList = List.of(
                "clover", "snakes", "caption", "band", "purpose",  "nest"
        );

        List<String> actualList = ListPractice.getEveryThirdItem(listOfStrings);

        assertThat(actualList).containsExactlyElementsOf(expectedList);
    }

    @Test
    public void checkReturnsNamesOfDogs() {
        List<String> expectedList = List.of(
                "Calypso", "Cliff", "Molly", "Lotus", "Brian"
        );
        List<Dog> dogs = List.of(
                new Dog("Calypso"),
                new Dog("Cliff"),
                new Dog("Molly"),
                new Dog("Lotus"),
                new Dog("Brian")
        );

        List<String> actualList = ListPractice.getListOfTheNamesOfEachDog(dogs);

        assertThat(actualList).containsExactlyElementsOf(expectedList);
    }

    @Test
    public void checkReturnsDogsFromNames() {
        List<Dog> expectedList = List.of(
                new Dog("Calypso"),
                new Dog("Cliff"),
                new Dog("Molly"),
                new Dog("Lotus"),
                new Dog("Brian")
        );
        List<String> names = List.of(
                "Calypso", "Cliff", "Molly", "Lotus", "Brian"
        );

        List<Dog> actualList = ListPractice.getListOfDogs(names);

        assertThat(actualList).containsExactlyElementsOf(expectedList);
    }

    @Test
    public void checkReturnsLengthOfLongestItem() {
        Integer actualResponse = ListPractice.getLengthOfLongestItem(listOfStrings);

        assertThat(actualResponse).isEqualTo(8);
    }

    @Test
    public void checkReturnsAverageLengthOfItems() {
        Double actualResponse = ListPractice.getAverageLengthOfItems(listOfStrings);

        assertThat(actualResponse).isCloseTo(5.85, Percentage.withPercentage(0.1));
    }
}
