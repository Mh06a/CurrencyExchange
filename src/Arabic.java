import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Arabic extends JFrame {

     //*** Create Components for Window : ****
    public JPanel MainPanel;
    private JPanel NamePanel;
    private JPanel ButtonPanel;
    private JButton calculateButton;
    private JButton ExitButton;
    private JPanel CurrenciesPanel;
    private JLabel CurrencyFrom;
    private JLabel CurrencyTo;
    public JComboBox FromComboBox;
    public JComboBox ToComboBox;
    private JPanel AmountPanel;
    public JTextField Amount1TextField;
    public JTextField ResultTextField;
    private JButton ClearButton;
    private JButton SwapButton;
    private String FromComboBox2 ;
    private String ToComboBox2 ;
    // *** Components ***


    //*** Create Constructor ***
    public Arabic() {
        setContentPane(MainPanel);
        setSize(150 , 150 );
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Arabic page");



        // Button(((Convert))) :
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ** Create Object from ConvertFunctions Class because I can access the functions: **
                ConvertItem convertItem = new ConvertItem(Arabic.this) ;
                CalculateAmounts calculateAmounts = new CalculateAmounts(convertItem) ;
                SetAmounts setAmounts = new SetAmounts(Arabic.this , calculateAmounts) ;


                // here Used if Statements because Check iff Item = --حدد العملاه-- Show this message :
                if(FromComboBox.getSelectedIndex() == 0 || ToComboBox.getSelectedIndex() == 0 ) {
                    JOptionPane.showMessageDialog(null ,  "من فضلك اختر العمله"
                    ,  "تأكيد" , JOptionPane.WARNING_MESSAGE);
                }

                try {
                    convertItem.ConvertIA();
                    calculateAmounts.CalculateAmount() ;

                    if(calculateAmounts.CalculateAmount() != 0) {
                        setAmounts.SetAmountArabic();
                    }
                    else if(calculateAmounts.CalculateAmount() == 0) {
                        setAmounts.SetAmountZero();
                    }
                    else {
                        JOptionPane.showMessageDialog(null , "الرقم المدخل غير صحيح" ,  "خطأ" ,
                                JOptionPane.ERROR_MESSAGE);
                    }

                }
                catch (Exception ex ) {
                    JOptionPane.showMessageDialog(null , ex , "خطأ" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Button (((Clear)))
        ClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Amount1TextField.setText("");
                ResultTextField.setText("");
                FromComboBox.setSelectedIndex(0);
                ToComboBox.setSelectedIndex(0);
            }
        });

        // Button (((Exit))) :
        ExitButton.addActionListener(new ActionListener() {
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

 } // class