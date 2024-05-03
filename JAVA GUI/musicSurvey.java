import javax.swing.JOptionPane;
//Vural&Erik 
public class musicSurvey{
    public void surveyOne(){
        String genre = JOptionPane.showInputDialog("What's your favourite genre of music?");
        int hours = Integer.parseInt(JOptionPane.showInputDialog("Cool! How many hours a day do you listen to music?")); 
        String favSong = JOptionPane.showInputDialog("Wow! What's your favourite song?");
        JOptionPane.showMessageDialog(null, "So your favourite genre is " + genre + ", you listen to music " + hours + " hours a day, and your favourite song is " + favSong + ". Awesome! Thanks!");
    }
}   