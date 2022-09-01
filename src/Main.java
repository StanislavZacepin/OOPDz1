public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 1, Relationship.parent);
        Person vasya = new Person("Вася", 1, Relationship.parent);
        Person masha = new Person("Маша", 1, Relationship.children);
        Person jane = new Person("Женя", 1, Relationship.granddaughter);
        Person jana = new Person("Жана", 1, Relationship.grandmother);
        Person ivan = new Person("Ваня", 3, Relationship.single);
        GeoTree gt = new GeoTree();
        gt.appned(irina);
        gt.appned(vasya);
        gt.appned(masha);
        gt.appned(jane);
        gt.appned(jana);
        gt.appned(ivan);

        System.out.println(gt.getTree().toString());
    }

}
