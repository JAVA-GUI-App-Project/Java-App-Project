import javax.swing.JOptionPane;

public class gameSurvey{//Vural&Erik 
    public void surveyTwo(){
        String favGame = JOptionPane.showInputDialog("What is your favourite videogame?");//Vural&Erik 
        int hours = Integer.parseInt(JOptionPane.showInputDialog("How many hours a day do you play videogames?"));//Vural&Erik 
        String upcomingGame = JOptionPane.showInputDialog("What upcoming game are you most excited for?");//Vural&Erik 
        JOptionPane.showMessageDialog(null, "So your favourite game is " + favGame + ", you play videogames " + hours + " hours a day, and you can't wait to play " + upcomingGame + ". Awesome! Thanks!");
    }
}
    