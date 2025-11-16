package model;

public enum Animals {
    TIGER(3), LION(2), SNAKE(1), SHARK(2), CAT(5), WOLF(4);
    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Елемент перелічування '" + name() + "' має вік " + age + " рік / роки / років";
    }
}
