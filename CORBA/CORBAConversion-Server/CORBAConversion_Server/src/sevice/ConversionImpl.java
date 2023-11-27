package sevice;

import corbaConversion.IConversionRemotePOA;

// The ConversionImpl class implements the IConversionRemotePOA interface.
public class ConversionImpl extends IConversionRemotePOA {

    // This method overrides the conversionMontant method declared in the IConversionRemotePOA interface.
    @Override
    public double conversionMontant(double mt) {
        // Perform a simple conversion by multiplying the given amount (mt) by 3.3.
        return mt * 3.3;
    }
}
