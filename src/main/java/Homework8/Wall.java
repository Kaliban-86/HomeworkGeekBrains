package Homework8;

public class Wall {
    public int hight;
    Person person;

    Wall(int hight, Person person) {
        this.hight = hight;
        this.person = person;
    }

    public void jump() {
        if (hight <= person.maxJumpHeight) {
            System.out.println(person.name + " перепрыгнул " + hight + " метров! ");
        } else {
            System.out.println(person.name + " не перепрыгнул " + hight + " метров! ");
        }

    }
}
