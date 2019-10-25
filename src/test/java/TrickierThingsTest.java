import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class TrickierThingsTest {

    private List<String> getSampleWords() throws IOException {
        String content = Files.readString(Path.of("src/test/resources/sample_paragraph.txt"));
        return List.of(content.split(" ")).stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    @Test
    public void checkCountUniqueWords() throws IOException {
        Integer actual = TrickierThings.countUniqueWords(getSampleWords());
        assertThat(actual).isEqualTo(148);
    }

    @Test
    public void checkCountOccurrencesOfWords() throws IOException {
        Map<String, Integer> actual = TrickierThings.countOccurrencesOfWords(getSampleWords());

        assertThat(actual.size()).isEqualTo(148);
        assertThat(actual.get("they")).isEqualTo(10);
        assertThat(actual.get("to")).isEqualTo(4);
        assertThat(actual).isNotEmpty();
    }

    @Test
    public void checkFindTheMostCommonFirstLetter() throws IOException {
        String actual = TrickierThings.findTheMostCommonFirstLetter(getSampleWords());

        assertThat(actual).isEqualTo("t");
    }

    @Test
    public void checkFindTheNameOfTheDogBelongingTo() {
        Map<String, List<Dog>> ownersToDogs = Map.of(
                "Mike", List.of(new Dog("Poppy"), new Dog("Maisie")),
                "Adam", List.of(new Dog("Molly")),
                "Sasha", new ArrayList<>()
        );

        assertThat(TrickierThings.findTheNameOfTheDogBelongingTo("Mike", ownersToDogs)).containsExactly("Poppy", "Maisie");
        assertThat(TrickierThings.findTheNameOfTheDogBelongingTo("Adam", ownersToDogs)).containsExactly("Molly");
        assertThat(TrickierThings.findTheNameOfTheDogBelongingTo("Sasha", ownersToDogs)).isEmpty();
    }
}
