public class Animal {
    // Attributs de l'animal
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur qui prend uniquement la famille de l'animal
    public Animal(String family) {
        this.family = family;
    }

    // Constructeur qui prend tous les attributs de l'animal
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Getters
    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    // Setters
    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    // Méthode pour afficher les informations de l'animal
    @Override
    public String toString() {
        return "Animal [Family=" + family + ", Name=" + name + ", Age=" + age + ", IsMammal=" + isMammal + "]";
    }
}
