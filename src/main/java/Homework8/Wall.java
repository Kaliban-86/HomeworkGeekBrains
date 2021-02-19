package Homework8;

public class Wall implements Obstructing {
    int hight;


    Wall(int hight) {
        this.hight = hight;
    }

    public void jump(Person person) {
        if (hight <= person.maxJumpHeight) {
            System.out.println(person.name + " успешно перепрыгнул " + hight + " метров!");
        } else {
            System.out.println(person.name + " не смог перепрыгнуть " + hight + " метров!");
        }

    }

}
