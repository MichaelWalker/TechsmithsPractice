public class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Dog)) {
            return false;
        }

        return ((Dog) other).name.equals(name);
    }
}
