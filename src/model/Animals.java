package model;

public enum Animals {
    Tiger(3), Lion(2), Snake(1), Shark(2), Cat(5), Wolf(4);
    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Елемент перелічування '" + name() + "' має вік " + age + " рік / роки / років";
    }
}
