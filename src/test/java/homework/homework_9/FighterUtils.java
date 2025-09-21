package homework.homework_9;

public class FighterUtils {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (firstAttacker.equals(fighter1.name)) {
            while (true) {
                fighter2.health -= fighter1.damagePerAttack;

                if (fighter1.health <= 0) {
                    return fighter2.name;
                } else if (fighter2.health <= 0) {
                    return fighter1.name;
                }

                fighter1.health -= fighter2.damagePerAttack;

                if (fighter1.health <= 0) {
                    return fighter2.name;
                } else if (fighter2.health <= 0) {
                    return fighter1.name;
                }
            }
        } else {
            while (true) {
                fighter1.health -= fighter2.damagePerAttack;

                if (fighter1.health <= 0) {
                    return fighter2.name;
                } else if (fighter2.health <= 0) {
                    return fighter1.name;
                }

                fighter2.health -= fighter1.damagePerAttack;

                if (fighter1.health <= 0) {
                    return fighter2.name;
                } else if (fighter2.health <= 0) {
                    return fighter1.name;
                }
            }
        }
    }
}