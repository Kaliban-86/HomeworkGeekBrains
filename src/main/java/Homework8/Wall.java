package Homework8;

public class Wall  {
    public int hight;


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

//    public void jump(Robot robot) {
//        if (hight <= robot.maxJumpHeight) {
//            System.out.println(robot.name + " успешно перепрыгнул " + hight + " метров!");
//        } else {
//            System.out.println(robot.name + " не смог перепрыгнуть " + hight + " метров!");
//        }
//
//    }

//    public void jump(Cat cat) {
//        if (hight <= cat.maxJumpHeight) {
//            System.out.println(cat.name + " успешно перепрыгнул " + hight + " метров!");
//        } else {
//            System.out.println(cat.name + " не смог перепрыгнуть " + hight + " метров!");
//        }
//
//    }
}
