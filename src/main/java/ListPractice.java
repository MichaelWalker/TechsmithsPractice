import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    // Example
    // Return a list of the numbers from 1 to 10.
    public static List<Integer> listOfTheNumbersOneToTen() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        return numbers;
    }

    // Fill in the function so that it returns the 6th element of the 'inputList' list.
    public static String getSixthElementFromList(List<String> inputList) {
        return null;
    }

    // Fill in the function so that it returns a list a list of just the first letters of each of the inputs.
    // ie if input is ["dag", "cat", "house"], then we'd want to return ["d", "c", "h"]
    public static List<String> getListOfFirstLetters(List<String> inputList) {
        return null;
    }

    // Fill in the function so that it returns every third element of the input list
    // ie if the input is ["1", "2", "3", "4", "5", "6", "7", "8", "9"], then we'd want to return ["1", "2", "3"]
    public static List<String> getEveryThirdItem(List<String> inputList) {
        return null;
    }

    // Fill in the function so that it returns a list of the names of all of the dogs.
    public static List<String> getListOfTheNamesOfEachDog(List<Dog> inputList) {
        return null;
    }

    // Fill in the function so that it returns a list of dogs from the names in the input list
    // ie if the input is ["Scott", "Brian"], then we'd want a list of [<a_dog_called_Scott>, <a_dog_called_brian>]
    public static List<Dog> getListOfDogs(List<String> inputList) {
        return null;
    }

    // Fill in the function so that it returns the length of the longest item in the list
    // ie if the input is ["Jake", "Chris", "Kapil", "Alexandru", "Jed"], then we'd want to return 9, as "Alexandru"
    // is the longest name and has 9 characters in it.
    public static Integer getLengthOfLongestItem(List<String> inputList) {
        return 0;
    }

    // Fill in the function so that it returns the average length of the items in the list.
    // ie, if the input is ["Jake", "Chris"] then we'd want to return 4.5, as that's the average of 4 and 5.
    public static Double getAverageLengthOfItems(List<String> inputList) {
        return 0.0;
    }
}
