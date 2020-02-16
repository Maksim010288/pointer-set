package pointCarSet.com;
import java.util.*;

public class LinkedCar {

    Iterator<Car> car1;
    Scanner scan = new Scanner(System.in);

                                            /*Пошук по кольору автомобіля і діамерту шин*/
    void colorEndDiametr(LinkedHashSet<Car> nameCar) {
        int num = 0;
        System.out.println("Введите цвет");
        String txt = scan.nextLine();
        System.out.println("Введіть діаметер шин");
        String txt1 = scan.nextLine();
        int a = Integer.parseInt(txt1);
        car1 = nameCar.iterator();
        while (car1.hasNext()) {
            Car n = car1.next();
            try {

                if (n.getColor().equals(txt) && n.getRadius() == a) {
                    int f = n.setRadius(a);
                    num++;
                    System.out.println(num + ". " + n.getNames() + " diametr wheel " + f);
                }
            }catch (Exception e){
                System.out.println("Помилка");
                break;
            }
        }
    }

                                        /*Пошук по діаметру шин та видалення зі списку*/
    void deletedCar(LinkedHashSet<Car> nameCar) {
        int num = 0;
        System.out.println("Введіть діаметер шин");
        String txt1 = scan.nextLine();
        int a = Integer.parseInt(txt1);
        Iterator<Car> car = nameCar.iterator();
        try {
            while (car.hasNext()) {
                num++;
                Car n = car.next();
                if (n.getRadius() == a) {
                    nameCar.remove(car);
                    System.out.println(num + ". " + n.getNames() + " deleted");
                }
            }
        } catch (Exception e) {
            System.out.println("   ");
        }
    }
                                            /*Пошук в діапазоні діаметру шин та типу шин*/
    void typeShyn(LinkedHashSet<Car> nameCar) {
        int num = 0;
        System.out.println("Введіть діаметер шин мін");
        String txt = scan.nextLine();
        int a = Integer.parseInt(txt);
        System.out.println("Введіть діаметер шин мах");
        String txt1 = scan.nextLine();
        int b = Integer.parseInt(txt);
        System.out.println("Введіть тип шин");
        String txt2 = scan.nextLine();
        Iterator<Car> car = nameCar.iterator();
        try {
            for (Car c : nameCar) {
                num++;
                Car n = car.next();
                if (c.getDiameterHelm() >= a && c.getDiameterHelm() <= b || c.getTypeShyn().equals(txt2)) {
                    System.out.println(num + ". " + n.getNames() + ", тип шин: "
                            + n.getTypeShyn() + ", радіус: " + n.getRadius() + ", діаметер шин: "
                            + n.getDiameterHelm());
                }
            }
        } catch (Exception e) {
            System.out.println("   ");
        }
    }
}
