public class PuzzleTest {
    public static void main(String[] args){

        Puzzle generator = new Puzzle();

        System.out.println(generator.getTenRolls());
        System.out.println(generator.getRandomLetter());
        System.out.println(generator.generatePassword());
        System.out.println(generator.getNewPasswordSet(8));
    }
}
