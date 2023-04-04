public class Main {
    public static void main(String[] args) {
        // Создание объектов "Игрушки"
        Toy bear = new Toy(1, "Bear");
        Toy car = new Toy(2, "Fox");
        Toy cubes = new Toy(3, "Car");
        Toy lego = new Toy(4, "Boing");
        Toy balloons = new Toy(5, "Iphone");
        Toy ball = new Toy(6, "Ball");
        Toy sword = new Toy(7, "Sword");

        // Создание объекта "Розыгрыш игрушек" с добавлением игрушек в розыгрыш
        Toy_Lottery toy_lottery = new Toy_Lottery();
        toy_lottery.add_toy_in_listToy(bear);
        toy_lottery.add_toy_in_listToy(car);
        toy_lottery.add_toy_in_listToy(cubes);
        toy_lottery.add_toy_in_listToy(lego);
        toy_lottery.add_toy_in_listToy(balloons);
        toy_lottery.add_toy_in_listToy(ball);
        toy_lottery.add_toy_in_listToy(sword);

        // Запускаем розыгрыш с управлением выпадения выигрыша, затем читаем файл
        toy_lottery.lottteryToy();
        toy_lottery.readFile();
        toy_lottery.lottteryToy();
        toy_lottery.readFile();
        // Проверяем оставшиеся игрушки в списке
        toy_lottery.getToys();
        // просматриваем число игрушек в списке
        toy_lottery.getToy_count();
    }    
}
