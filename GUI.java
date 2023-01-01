package Ex_17_20;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


public class GUI extends Addresses implements ActionListener {

    private static JLabel name;
    private static JTextField nameTextField;
    private static JLabel street;
    private static JTextField streetTextField;
    private static JLabel city;
    private static JTextField cityTextField;
    private static JLabel state;
    private static JTextField stateTextField;
    private static JLabel zip;
    private static JTextField zipTextField;
    private static JButton add;
    private static JButton first;
    private static JButton next;
    private static JButton last;
    private static JButton prev;
    private static JButton update;
    private static JLabel info;

    ArrayList<Addresses> addressbook = new ArrayList<>();
    


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        name = new JLabel("Name");
        street = new JLabel("Street");
        nameTextField = new JTextField(20);
        streetTextField = new JTextField(20);
        city = new JLabel("City");
        cityTextField = new JTextField(20);
        state = new JLabel("State");
        stateTextField = new JTextField(20);
        zip = new JLabel("Zip");
        zipTextField = new JTextField(20);
        add = new JButton("Add");
        first = new JButton("First");
        next = new JButton("Next");
        last = new JButton("Last");
        prev = new JButton("Previous");
        update = new JButton("Update");
        info = new JLabel("");
        
        frame.setVisible(true);
        frame.setTitle("Address Book");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(375, 200);
        frame.add(panel);
        panel.add(nameTextField);
        panel.add(name);
        panel.add(street);
        panel.add(streetTextField);
        panel.setLayout(null);
        panel.add(city);
        panel.add(cityTextField);
        panel.add(state);
        panel.add(stateTextField);
        panel.add(zip);
        panel.add(zipTextField);
        panel.add(add);
        panel.add(first);
        panel.add(next);
        panel.add(prev);
        panel.add(last);
        panel.add(update);
        panel.add(info);

        
        // Label's and Text Fields

        name.setBounds(10, 20, 50 ,50);  
        nameTextField.setBounds(50,35,200,20);

        street.setBounds(10,50,50,50);
        streetTextField.setBounds(50,65,200,20);

        city.setBounds(10,75,50,50);
        cityTextField.setBounds(50,90,100,20);

        state.setBounds(150,75,50,50);
        stateTextField.setBounds(180,90,50,20);

        zip.setBounds(230,75,50,50);
        zipTextField.setBounds(250,90,75,20);

        info.setBounds(250,20,100,50);


        // Buttons

        add.setBounds(10,120, 50 ,35);
        add.addActionListener(new GUI());
        // first.addActionListener(actionPerformed());
        first.setBounds(60,120, 50 ,35);
        next.setBounds(110,120, 50 ,35);
        prev.setBounds(160,120, 70 ,35);
        last.setBounds(230,120, 50 ,35);
        update.setBounds(280,120, 60 ,35);

        






    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
    
    if (e.getSource()==add) {

        if(search(addressbook, nameTextField.getText()) == 0) {
            info.setText("Already Added");

        }
        else
        try {
        
            addressbook.add(new Addresses(nameTextField.getText(), streetTextField.getText(), cityTextField.getText(), stateTextField.getText(), (zipTextField.getText())));
            info.setText("Added to Book!");
        
        }
        catch (Exception ex) {
            info.setText("Not Complete");
        }
    
        System.out.println(addressbook);
    }

    else if (e.getSource()==first)
         {
            System.out.println(addressbook.size());
            System.out.println("first "+addressbook); // ADDRESS BOOK DOESN'T SAVE WHEN IT GETS HERE
            if(addressbook.size() >0) {
                nameTextField.setText(addressbook.get(0).name);
                streetTextField.setText(addressbook.get(0).street);
                cityTextField.setText(addressbook.get(0).city);
                zipTextField.setText(String.valueOf(addressbook.get(0).zip));
            }
         }
}
    
}
