package homework_2;

public class Homework_3 {
    /*
    Создать программу дележа добычи на пиратском корабле.
    По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану,
    остальное делится поровну между всеми членами команды, включая капитана.

    Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.

    Вывести на экран кому сколько пиастров полагается
    Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?
     */

    public static void main(String[] args) {
        int totalCatch = 1245;
        int piratesCount = 16;
        
        int ownerShare = totalCatch / 2;
        totalCatch -= ownerShare;

        int captainShare = totalCatch / 2;
        totalCatch -= captainShare;

        int perPirates = totalCatch / (piratesCount + 1);
        totalCatch -= perPirates * (piratesCount + 1);

        System.out.println("Owner share " + ownerShare);
        System.out.println("Captain share " + (captainShare + perPirates));
        System.out.println("Per pirate " + perPirates);
        System.out.println("Left " + totalCatch);
        System.out.println("Jack share " + (ownerShare + captainShare + perPirates));
    }
}
