import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class EnglishPage extends JFrame {

    //*** Create Components for Window : ****
    private JPanel MainPanel;
    private JPanel NamePanel;
    private JPanel ButtonPanel;
    private JPanel AmountPanel;
    private JButton calculateButton;
    private JButton exitButton;
    private JPanel CurrenciesPanel;
    public JComboBox ToComboBox;
    public JComboBox FromComboBox;
    public JTextField AmountTextField;
    public JTextField ResultTextField;
    private JButton cleanButton;
    private JButton SwapButton;
    private String FromComboBox2 ;
    private String ToComboBox2 ;
    //*** Components ***


    // *** Create Constructor ***
    public EnglishPage() {
        setTitle("English Page");
        setContentPane(MainPanel);
        setTitle("Currency Exchange ");
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);


        // Button(((Convert)))
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ** Create Object from ConvertFunctions Class because I can access the functions: **
                ConvertItem convertItem = new ConvertItem(EnglishPage.this) ;
                CalculateAmounts calculateAmounts = new CalculateAmounts(convertItem) ;
                SetAmounts setAmounts = new SetAmounts(EnglishPage.this , calculateAmounts) ;

                // here Used if Statement because Check is Item = --select Currency-- Show this message :
                if(FromComboBox.getSelectedIndex() == 0 && ToComboBox.getSelectedIndex() == 0 ) {
                    JOptionPane.showMessageDialog(null , "Please select the currency" ,
                            "Error" , JOptionPane.WARNING_MESSAGE);
                }

                try {
                    convertItem.ConvertIE();
                    calculateAmounts.CalculateAmount() ;

                    if(calculateAmounts.CalculateAmount() != 0) {
                        setAmounts.SetAmountEnglish();
                    }
                    else if(calculateAmounts.CalculateAmount() == 0) {
                        setAmounts.SetAmountZero2();
                    }
                    else {
                        JOptionPane.showMessageDialog(null , "The entered number is incorrect"
                        , "Error" , JOptionPane.ERROR_MESSAGE);
                    }

                }
                catch (Exception ex ) {
                    JOptionPane.showMessageDialog(null , ex , "Error" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Button(((Clean)))
        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FromComboBox.setSelectedIndex(0);
                ToComboBox.setSelectedIndex(0);
                ResultTextField.setText("");
                AmountTextField.setText("") ;
            }
        });

        // Button(((Exit)))
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Button(((Swap)))
        SwapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FromComboBox2 = Objects.requireNonNull(FromComboBox.getSelectedItem()).toString() ;
                ToComboBox2 = Objects.requireNonNull(ToComboBox.getSelectedItem()).toString() ;
                FromComboBox.setSelectedItem(ToComboBox2);
                ToComboBox.setSelectedItem(FromComboBox2);
            }
        });
    } // *** Constructor ***

} // Class