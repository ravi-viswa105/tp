public class Ui {

    private State state;
    public Ui(State state) {
        this.state = state;
    }
    public void drawLine() {
        System.out.println("____________________________________________________________");
    }

    public void showWelcome() {
        drawLine();
        System.out.println(" Welcome to BoboType!");
        System.out.println(" Type 'start' to start the game.");
        drawLine();
    }

    public void showExit() {
        drawLine();
        System.out.println(" Bye. Hope to see you again soon!");
        drawLine();
    }

    public void chooseDifficulty() {
        drawLine();
        System.out.println(" Select your difficulty: ");
        System.out.println(" Type: 'easy' or 'intermediate' or 'difficult'");
        drawLine();
    }

    public void showErrorMessage(String message) {
        System.out.println(" *** Oops! *** \n -> " + message);
    }

    public void showResult() {
        drawLine();
        System.out.println(" Hope you enjoyed the round! Here are your stats:");
    }

    public void showTypingSpeedWPM(int typingSpeedWPM) {
        System.out.println(" Typing speed (WPM): " + typingSpeedWPM + " WPM");
    }

    public void showTypingSpeedCPM(int typingSpeedCPM) {
        System.out.println(" Typing speed (CPM): " + typingSpeedCPM + " CPM");
    }

    public void showTypingAccuracy(double typeAccuracy) {
        drawLine();
        System.out.println(" Your typing accuracy is: " + typeAccuracy*100 + "%");
        drawLine();
    }

    public void showHighScore() {
        drawLine();
        System.out.println(" Your high score is: " + toString().valueOf(state.getHighScore()));
        drawLine();
    }

    public void showStartGame() {
        drawLine();
        System.out.println("Typing test started! Type the following text:");
    }

    public void showEndGame() {
        drawLine();
        System.out.println("You finished the practice! Please type \n" +
                "\t - 'result' to view the result \n" +
                "\t - 'typingaccuracy' to view your typing accuracy \n" +
                "\t - 'highscore' to view your high score \n" +
                "\t - 'exit' to exit or \n" +
                "\t - 'start' to start the new practice.");
        drawLine();

    }
}


