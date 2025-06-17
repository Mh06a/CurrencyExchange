import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginPage extends JFrame {
    // Create Components for Window :
    private JPanel MainPanel;
    private JButton loginButton;
    private JButton exitButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel InfPanel;
    private JPanel ButtonPanel;
    private JComboBox LangComboBox;
    private JCheckBox verificationCheckBox;
    // *** Components ***

    
    // *** Create Constructor  because ...  ***
    public LoginPage(){
        setContentPane(MainPanel);
        setTitle("CurrencyExchange");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

        //Button(((Exit)))
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // ComboBok Language if the User Select English go to english page Or vice versa
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(LangComboBox.getSelectedIndex() == 0 ) {
                    JOptionPane.showMessageDialog(null , "Please Select The language"
                    , "Sure" , JOptionPane.WARNING_MESSAGE);
                }

                if(LangComboBox.getSelectedIndex() == 1) {
                    EnglishPage page1 = new EnglishPage() ;
                    page1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    JOptionPane.showMessageDialog(null ,
                            "The last update of the currencies is on 6/16/2025 ");
                }

                if (LangComboBox.getSelectedIndex() == 2) {
                    Arabic page2 = new Arabic() ;
                    page2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    JOptionPane.showMessageDialog(null ,
                            "اخر تحديث للعملات هو بتاريخ ٢٠٢٥ /  ٦ / ١٦ ");
                }

            }
        });
    } // *** Constructor ***


} // Class