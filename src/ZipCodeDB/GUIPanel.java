package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JPanel is the "base class". GUIPanel is the "derived" class.

public class GUIPanel extends JPanel {
    private JTextField zipcode;
    private  JButton submit;
    private JTextArea output;

    private Database db; // The zipcode database

    public GUIPanel() {
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);
        // static, class name left of the dot

        this.submit = new JButton("Submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());


        this.output = new JTextArea(5,20);
        this.add(this.output);
        // adding an event handler to the button

        this.db = new Database();  // load the zipcodes
    }

    class SubmitButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // this function will get called when the user presses submit

            // get the zipcode out of the text field
            String code = zipcode.getText();
            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());
            System.out.println(wob);
        }
    }
}
// sample question add a max latitude button that when pressed
