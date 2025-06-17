import java.util.Objects;

public class ConvertItem {
    // *** here Created Object from these Classes because I can access Components for: ***
    private Arabic arabic ;
    private EnglishPage english ;

    // *** here Create Variables because Use it when Convert: ***
    String from ;
    String to ;
    String fromConversionValues;
    String toConversionValues;
    String amountText ;


    // *** here Created 2 Constructor because Use it in Other Class: ***
    public ConvertItem(Arabic arabic) {
        this.arabic = arabic ;
    }
    public ConvertItem(EnglishPage english) {
        this.english = english ;
    }


    // Create a function because I can Use it in arabic Class :
    public void ConvertIA() {
        from = Objects.requireNonNull(arabic.FromComboBox.getSelectedItem()).toString();
        to = Objects.requireNonNull(arabic.ToComboBox.getSelectedItem()).toString() ;
        amountText = arabic.Amount1TextField.getText() ;
        fromConversionValues = from.split(" ")[from.split(" ").length - 1 ] ;
        toConversionValues = to.split(" ")[to.split(" ").length - 1 ] ;
    }

    // Create function ConvertE because I can Use it in English Class :
    public void ConvertIE() {
        from = Objects.requireNonNull(english.FromComboBox.getSelectedItem()).toString() ;
        to = Objects.requireNonNull(english.ToComboBox.getSelectedItem()).toString();
        amountText = english.AmountTextField.getText() ;
        fromConversionValues = from.split(" ")[from.split(" ").length - 1 ] ;
        toConversionValues = to.split(" ")[to.split(" ").length - 1 ] ;
    }


}