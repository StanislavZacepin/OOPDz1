public class Person {
    /**
     * Человек
     */
    private String fullName;

    private Integer idFamily;

    private Relationship Role;

    /**
     * @param fullName Имя
     * @param idFamily Ид Семьи
     */

    public Person(String fullName, Integer idFamily, Relationship Role) {
        this.fullName = fullName;
        this.idFamily = idFamily;
        this.Role = Role;

    }

    /**
     * @return Получения имени
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @return ПОлучения Ид семьи
     */
    public Integer getIdFamily() {
        return idFamily;
    }

    @Override
    public String toString() {
        return " :Номер семьи = '" + this.idFamily + '\'' +
                ",Имя = '" + this.fullName + '\'' +
                ",Роль = '" + this.Role;
    }

}
