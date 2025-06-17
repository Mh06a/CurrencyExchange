public class CalculateAmounts {
    // *** here Created Object from these Classes because I can access Components for: ***
    ConversionValues V = new ConversionValues() ;
    private final ConvertItem convertItem ;

    // *** here Create Variables because Use it when Calculate: ***
    double amount ;
    double value ;
    double Result ;

    // *** here Created Constructor because Use it in Other Class: ***
    public CalculateAmounts(ConvertItem convertItem) {
        this.convertItem = convertItem;
    }

    // Create a function because Calculate Amount and get Value from Value Class :
    public Double CalculateAmount() {
        amount = Double.parseDouble(convertItem.amountText);
        value = V.getValue(convertItem.fromConversionValues , convertItem.toConversionValues) ;
        Result = amount * value;
        return Result ;
    }
}