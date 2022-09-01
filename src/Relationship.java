/**
 * Перечисления Положений в семье
 */
public enum Relationship {
    parent("Родитель"),
    children("Ребёнок"),
    granddaughter("Дедушка"),
//    grandson,
//    grandfather,
    grandmother("Бабаушка"),
    single("Одиночка");

    private String title;
    Relationship(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return  title;

    }
}
