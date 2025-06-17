public class SetAmounts {
    // *** here Created Object from these Classes because I can access Components for: ***
    private Arabic arabic ;
    private EnglishPage english ;
    private final CalculateAmounts amounts;

    // *** here Created 2 Constructor because Use it in Other Class: ***
    public SetAmounts(Arabic arabic , CalculateAmounts amounts) {
        this.arabic = arabic ;
        this.amounts = amounts ;
    }
    public SetAmounts(EnglishPage english , CalculateAmounts amounts) {
        this.english = english ;
        this.amounts = amounts ;
    }

    // Create function SetAmount because I can Use it in English and Arabic Class :
    public void SetAmountArabic() {
        arabic.ResultTextField.setText(String.valueOf(amounts.Result));
    }
    public void SetAmountEnglish() {
        english.ResultTextField.setText(String.valueOf(amounts.Result));
    }
    public void SetAmountZero() {
        arabic.ResultTextField.setText("غير متوفر");
    }
    public void SetAmountZero2() {
        english.ResultTextField.setText("unavailable");
    }


} // Class