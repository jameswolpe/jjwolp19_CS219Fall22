package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JPanel is the "base class". GUIPanel is the "derived" class.

public class GUIPanel extends JPanel {
    private JTextField zipcode;
    private  JButton submit;
    private JButton northernmost;
    private JTextArea output;

    private Database db; // The zipcode database

    public GUIPanel() {
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);
        // static, class name left of the dot

        this.submit = new JButton("Submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());


        this.northernmost = new JButton("Northernmost");
        this.add(this.northernmost);
        this.northernmost.addActionListener(new NorthernmostButtonListener());

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
    class NorthernmostButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // function will be called when the user presses MaxLatitudeButton

            Zipcode zc = db.getNorthern();
            WeatherObservation wob = zc.getWeatherData();

            output.setText(wob.toString());
        }
    }
}
