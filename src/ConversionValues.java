import java.util.HashMap;
import java.util.Map;

public class ConversionValues { 
    // Create Map because Save values :
    Map<String , Double> vales = new HashMap<>() ;

    // ***Create a Constructor because I acn Use Map: ***
    public ConversionValues() {
        // مورتنيه
        vales.put("MRU->SDG", 15.19);
        vales.put("MRU->EGP", 1.26);
        vales.put("MRU->AED", 0.093);
        vales.put("MRU->MAD", 0.23);
        vales.put("MRU->JOD", 0.018);
        vales.put("MRU->BHD", 0.0095);
        vales.put("MRU->TND", 0.074);
        vales.put("MRU->DZD", 3.29);
        vales.put("MRU->IQD", 32.98);
        vales.put("MRU->KWD", 0.0077);
        vales.put("MRU->LYD", 0.14);
        vales.put("MRU->SAR", 0.095);
        vales.put("MRU->OMR", 0.0097);
        vales.put("MRU->QAR", 0.092);
        vales.put("MRU->YER", 6.16);
        vales.put("MRU->SOS" , 14.34) ;
        vales.put("MRU->DJF" , 4.48) ;
        vales.put("MRU->KMF" , 10.79) ;
        vales.put("MRU->LYP" , 327.8 );
        vales.put("MRU->LBP", 2256.938);


        // السودان
        vales.put("SDG->MRU" , 0.066) ;
        vales.put("SDG->EGP", 0.083);
        vales.put("SDG->AED", 0.0061);
        vales.put("SDG->MAD", 0.015);
        vales.put("SDG->JOD", 0.0012);
        vales.put("SDG->BHD", 0.00063);
        vales.put("SDG->TND", 0.0049);
        vales.put("SDG->DZD", 0.22);
        vales.put("SDG->IQD", 2.18);
        vales.put("SDG->KWD", 0.00051);
        vales.put("SDG->LYD", 0.0091);
        vales.put("SDG->SAR" , 0.0062) ;
        vales.put("SDG->OMR", 0.0064);
        vales.put("SDG->QAR", 0.0061);
        vales.put("SDG->YER", 0.41);
        vales.put("SDG->SOS" , 0.94) ;
        vales.put("SDG->DJF" , 0.30) ;
        vales.put("SDG->KMF" , 0.71) ;
        vales.put("SDG->LBP", 149.21);
        vales.put("SDG->SYP", 21.71);

        // مصر
        vales.put("EGP->MRU" , 0.80) ;
        vales.put("EGP->SDG", 11.86);
        vales.put("EGP->AED", 0.072);
        vales.put("EGP->MAD", 0.18);
        vales.put("EGP->JOD", 0.014);
        vales.put("EGP->BHD", 0.0074);
        vales.put("EGP->TND", 0.059);
        vales.put("EGP->DZD", 2.61);
        vales.put("EGP->IQD", 25.85);
        vales.put("EGP->KWD", 0.0061);
        vales.put("EGP->LYD", 0.11);
        vales.put("EGP->SAR", 0.074);
        vales.put("EGP->OMR", 0.0076);
        vales.put("EGP->QAR", 0.072);
        vales.put("EGP->YER", 4.83);
        vales.put("EGP->SOS" , 11.44) ;
        vales.put("EGP->DJF" , 3.56) ;
        vales.put("EGP->KMF" , 8.58) ;
        vales.put("EGP->LBP", 1768.09);
        vales.put("EGP->SYP", 262.15);


        // الامارت
        vales.put("AED->MRU" , 10.76) ;
        vales.put("AED->SDG", 163.49);
        vales.put("AED->EGP", 13.80);
        vales.put("AED->MAD", 2.51);
        vales.put("AED->JOD", 0.19);
        vales.put("AED->BHD", 0.10);
        vales.put("AED->TND", 0.82);
        vales.put("AED->DZD", 36.11);
        vales.put("AED->IQD", 356.44);
        vales.put("AED->KWD", 0.084);
        vales.put("AED->LYD", 1.49);
        vales.put("AED->SAR", 1.02);
        vales.put("AED->OMR", 0.10);
        vales.put("AED->QAR", 0.99);
        vales.put("AED->YER", 66.57);
        vales.put("AED->SOS" , 154.36) ;
        vales.put("AED->DJF" , 48.25) ;
        vales.put("AED->KMF" , 116.13) ;
        vales.put("AED->LBP", 24376.73);
        vales.put("AED->SYP", 3539.44);

        // المغرب
        vales.put("MAD->MRU" , 4.33) ;
        vales.put("MAD->SDG", 65.01);
        vales.put("MAD->EGP", 5.49);
        vales.put("MAD->AED", 0.40);
        vales.put("MAD->JOD", 0.077);
        vales.put("MAD->BHD", 0.041);
        vales.put("MAD->TND", 0.32);
        vales.put("MAD->DZD", 14.36);
        vales.put("MAD->IQD", 141.73);
        vales.put("MAD->KWD", 0.033);
        vales.put("MAD->LYD", 0.59);
        vales.put("MAD->SAR", 0.41);
        vales.put("MAD->OMR", 0.042);
        vales.put("MAD->QAR", 0.39);
        vales.put("MAD->YER", 26.47);
        vales.put("MAD->SOS" , 62.16) ;
        vales.put("MAD->DJF" , 19.43) ;
        vales.put("MAD->KMF" , 46.77) ;
        vales.put("MAD->LBP", 9693.13);
        vales.put("MAD->SYP", 1418.95);


        // الاردن
        vales.put("JOD->MRU" , 55.75) ;
        vales.put("JOD->SDG", 846.61);
        vales.put("JOD->EGP", 71.40);
        vales.put("JOD->AED", 5.18);
        vales.put("JOD->MAD", 13.01);
        vales.put("JOD->BHD", 0.53);
        vales.put("JOD->TND", 4.23);
        vales.put("JOD->DZD", 186.98);
        vales.put("JOD->IQD", 1845.75);
        vales.put("JOD->KWD", 0.43);
        vales.put("JOD->LYD", 7.72);
        vales.put("JOD->SAR", 5.29);
        vales.put("JOD->OMR", 0.54);
        vales.put("JOD->QAR", 5.13);
        vales.put("JOD->YER", 344.71);
        vales.put("JOD->SOS" , 799.56) ;
        vales.put("JOD->DJF" , 249.94) ;
        vales.put("JOD->KMF" , 601.55) ;
        vales.put("JOD->LBP", 126230.27);
        vales.put("JOD->SYP", 18361.58);


        // البحرين
        vales.put("BHD->MRU" , 104.85) ;
        vales.put("BHD->SDG", 1592.89);
        vales.put("BHD->EGP", 134.35);
        vales.put("BHD->AED", 9.75);
        vales.put("BHD->MAD", 24.48);
        vales.put("BHD->JOD", 1.88);
        vales.put("BHD->TND", 7.95);
        vales.put("BHD->DZD", 351.81);
        vales.put("BHD->IQD", 3472.77);
        vales.put("BHD->KWD", 0.81);
        vales.put("BHD->LYD", 14.53);
        vales.put("BHD->SAR", 9.95);
        vales.put("BHD->OMR", 1.02);
        vales.put("BHD->QAR", 9.66);
        vales.put("BHD->YER", 648.56);
        vales.put("BHD->SOS" , 1503.83) ;
        vales.put("BHD->DJF" , 470.09) ;
        vales.put("BHD->KMF" , 1131.41) ;
        vales.put("BHD->LBP", 237501.16);
        vales.put("BHD->SYP", 344820.76);


        // تونس
        vales.put("TND->MRU" , 13.47) ;
        vales.put("TND->SDG", 200.19);
        vales.put("TND->EGP", 16.88);
        vales.put("TND->AED", 1.22);
        vales.put("TND->MAD", 3.08);
        vales.put("TND->JOD", 0.24);
        vales.put("TND->BHD", 0.13);
        vales.put("TND->DZD", 44.24);
        vales.put("TND->IQD", 437.00);
        vales.put("TND->KWD", 0.10);
        vales.put("TND->LYD", 1.82);
        vales.put("TND->SAR", 1.25);
        vales.put("TND->OMR", 0.13);
        vales.put("TND->QAR", 1.22);
        vales.put("TND->YER", 81.60);
        vales.put("TND->SOS" , 193.16) ;
        vales.put("TND->DJF" , 60.38) ;
        vales.put("TND->KMF" , 145.32) ;
        vales.put("TND->LBP", 29901.68);
        vales.put("TND->SYP", 441500.01);


        // الجزائر
        vales.put("DZD->MRU" , 0.30) ;
        vales.put("DZD->SDG", 4.53);
        vales.put("DZD->EGP", 0.38);
        vales.put("DZD->AED", 0.028);
        vales.put("DZD->MAD", 0.069);
        vales.put("DZD->JOD", 0.0054);
        vales.put("DZD->BHD", 0.0028);
        vales.put("DZD->TND", 0.023);
        vales.put("DZD->IQD", 9.88);
        vales.put("DZD->KWD", 0.0023);
        vales.put("DZD->LYD", 0.041);
        vales.put("DZD->SAR", 0.028);
        vales.put("DZD->OMR", 0.0029);
        vales.put("DZD->QAR", 0.027);
        vales.put("DZD->YER", 1.84);
        vales.put("DZD->SOS" , 4.36) ;
        vales.put("DZD->DJF" , 1.36) ;
        vales.put("DZD->KMF" , 3.28) ;
        vales.put("DZD->LBP", 675.82);
        vales.put("DZD->SYP", 99.35);


        // العراق
        vales.put("IQD->MRU" , 0.030) ;
        vales.put("IQD->SDG", 0.46);
        vales.put("IQD->EGP", 0.039);
        vales.put("IQD->AED", 0.0028);
        vales.put("IQD->MAD", 0.0070);
        vales.put("IQD->JOD", 0.00054);
        vales.put("IQD->BHD", 0.00029);
        vales.put("IQD->TND", 0.0023);
        vales.put("IQD->DZD", 0.10);
        vales.put("IQD->KWD", 0.00023);
        vales.put("IQD->LYD", 0.0042);
        vales.put("IQD->SAR", 0.0029);
        vales.put("IQD->OMR", 0.00029);
        vales.put("IQD->QAR", 0.0028);
        vales.put("IQD->YER", 0.19);
        vales.put("IQD->SOS" , 0.43) ;
        vales.put("IQD->DJF" , 0.14) ;
        vales.put("IQD->KMF" , 0.33) ;
        vales.put("IQD->LBP", 68.40);
        vales.put("IQD->SYP", 9.93);


        // الكويت
        vales.put("KWD->MRU" , 129.08) ;
        vales.put("KWD->SDG", 1958.64);
        vales.put("KWD->EGP", 165.17);
        vales.put("KWD->AED", 11.98);
        vales.put("KWD->MAD", 30.03);
        vales.put("KWD->JOD", 2.31);
        vales.put("KWD->BHD", 1.23);
        vales.put("KWD->TND", 9.78);
        vales.put("KWD->DZD", 432.35);
        vales.put("KWD->IQD", 4270.90);
        vales.put("KWD->LYD", 17.80);
        vales.put("KWD->SAR", 12.24);
        vales.put("KWD->OMR", 1.26);
        vales.put("KWD->QAR", 11.88);
        vales.put("KWD->YER", 797.46);
        vales.put("KWD->SOS" , 1851.24) ;
        vales.put("KWD->DJF" , 578.69) ;
        vales.put("KWD->KMF" , 1392.79) ;
        vales.put("KWD->LBP", 292232.58);
        vales.put("KWD->SYP", 424140.36);


        // ليبيا
        vales.put("LYD->MRU" , 7.27) ;
        vales.put("LYD->SDG", 110.00);
        vales.put("LYD->EGP", 9.28);
        vales.put("LYD->AED", 0.67);
        vales.put("LYD->MAD", 1.69);
        vales.put("LYD->JOD", 0.13);
        vales.put("LYD->BHD", 0.069);
        vales.put("LYD->TND", 0.55);
        vales.put("LYD->DZD", 24.28);
        vales.put("LYD->IQD", 239.87);
        vales.put("LYD->KWD", 0.056);
        vales.put("LYD->SAR", 0.69);
        vales.put("LYD->OMR", 0.071);
        vales.put("LYD->QAR", 0.67);
        vales.put("LYD->YER", 44.79);
        vales.put("LYD->SOS" , 104.21) ;
        vales.put("LYD->DJF" , 32.58) ;
        vales.put("LYD->KMF" , 78.40) ;
        vales.put("LYD->LBP", 16412.92);
        vales.put("LYD->SYP", 238500.32);


        // السعوديه
        vales.put("SAR->MRU" , 10.54) ;
        vales.put("SAR->SDG", 160.09);
        vales.put("SAR->EGP", 13.50);
        vales.put("SAR->AED", 0.98);
        vales.put("SAR->MAD", 2.46);
        vales.put("SAR->JOD", 0.19);
        vales.put("SAR->BHD", 0.10);
        vales.put("SAR->TND", 0.80);
        vales.put("SAR->DZD", 35.36);
        vales.put("SAR->IQD", 349.04);
        vales.put("SAR->KWD", 0.082);
        vales.put("SAR->LYD", 1.46);
        vales.put("SAR->OMR", 0.10);
        vales.put("SAR->QAR", 0.97);
        vales.put("SAR->YER", 65.20);
        vales.put("SAR->SOS" , 151.11) ;
        vales.put("SAR->DJF" , 47.24) ;
        vales.put("SAR->KMF" , 113.69) ;
        vales.put("SAR->LBP", 23882.52);
        vales.put("SAR->SYP", 346600.30);


        // عمان
        vales.put("OMR->MRU" , 102.86) ;
        vales.put("OMR->SDG", 1559.82);
        vales.put("OMR->EGP", 131.54);
        vales.put("OMR->AED", 9.54);
        vales.put("OMR->MAD", 23.91);
        vales.put("OMR->JOD", 1.84);
        vales.put("OMR->BHD", 0.98);
        vales.put("OMR->TND", 7.79);
        vales.put("OMR->DZD", 344.36);
        vales.put("OMR->IQD", 3401.35);
        vales.put("OMR->KWD", 0.80);
        vales.put("OMR->LYD", 14.18);
        vales.put("OMR->SAR", 9.74);
        vales.put("OMR->QAR", 9.46);
        vales.put("OMR->YER", 635.09);
        vales.put("OMR->SOS" , 1475.28) ;
        vales.put("OMR->DJF" , 461.17) ;
        vales.put("OMR->KMF" , 1109.93) ;
        vales.put("OMR->LBP", 232734.64);
        vales.put("OMR->SYP", 337660.23);


        // قطر
        vales.put("QAR->MRU" , 10.86) ;
        vales.put("QAR->SDG", 164.73);
        vales.put("QAR->EGP", 13.89);
        vales.put("QAR->AED", 1.01);
        vales.put("QAR->MAD", 2.53);
        vales.put("QAR->JOD", 0.19);
        vales.put("QAR->BHD", 0.10);
        vales.put("QAR->TND", 0.82);
        vales.put("QAR->DZD", 36.37);
        vales.put("QAR->IQD", 359.20);
        vales.put("QAR->KWD", 0.084);
        vales.put("QAR->LYD", 1.50);
        vales.put("QAR->SAR", 1.03);
        vales.put("QAR->OMR", 0.11);
        vales.put("QAR->YER", 67.07);
        vales.put("QAR->SOS" , 155.71) ;
        vales.put("QAR->DJF" , 48.68) ;
        vales.put("QAR->KMF" , 117.15) ;
        vales.put("QAR->LBP", 24578.18);
        vales.put("QAR->SYP", 357100.43);


        // اليمن
        vales.put("YER->MRU" , 0.16) ;
        vales.put("YER->SDG", 2.46);
        vales.put("YER->EGP", 0.21);
        vales.put("YER->AED", 0.015);
        vales.put("YER->MAD", 0.038);
        vales.put("YER->JOD", 0.0029);
        vales.put("YER->BHD", 0.0015);
        vales.put("YER->TND", 0.012);
        vales.put("YER->DZD", 0.54);
        vales.put("YER->IQD", 5.36);
        vales.put("YER->KWD", 0.0013);
        vales.put("YER->LYD", 0.022);
        vales.put("YER->SAR", 0.015);
        vales.put("YER->OMR", 0.0016);
        vales.put("YER->QAR", 0.015);
        vales.put("YER->SOS" , 2.33) ;
        vales.put("YER->DJF" , 0.73) ;
        vales.put("YER->KMF" , 1.75) ;
        vales.put("YER->LBP", 366.46);
        vales.put("YER->SYP", 53.49);

        //الصومال
        vales.put("SOS->MRU" , 0.069) ;
        vales.put("SOS->SDG", 1.06);
        vales.put("SOS->EGP", 0.087);
        vales.put("SOS->AED", 0.0065);
        vales.put("SOS->MAD", 0.016);
        vales.put("SOS->JOD", 0.0012);
        vales.put("SOS->BHD", 0.00066);
        vales.put("SOS->TND", 0.0052);
        vales.put("SOS->DZD", 0.23);
        vales.put("SOS->IQD", 2.29);
        vales.put("SOS->KWD", 0.00054);
        vales.put("SOS->LYD", 0.0096);
        vales.put("SOS->SAR", 0.0066);
        vales.put("SOS->OMR", 0.00068);
        vales.put("SOS->QAR", 0.0064);
        vales.put("SOS->YER", 0.043);
        vales.put("SOS->DJF" , 0.31) ;
        vales.put("SOS->KMF" , 0.75) ;
        vales.put("SOS->SYP" , 22.75 ) ;
        vales.put("SOS->LBP", 156.78);

        // جيبوتي
        vales.put("DJF->MRU" , 0.22) ;
        vales.put("DJF->SDG", 3.39);
        vales.put("DJF->EGP", 0.28);
        vales.put("DJF->AED", 0.021);
        vales.put("DJF->MAD", 0.052);
        vales.put("DJF->JOD", 0.0040);
        vales.put("DJF->BHD", 0.0021);
        vales.put("DJF->TND", 0.017);
        vales.put("DJF->DZD", 0.73);
        vales.put("DJF->IQD", 7.35);
        vales.put("DJF->KWD", 0.0017);
        vales.put("DJF->LYD", 0.031);
        vales.put("DJF->SAR", 0.021);
        vales.put("DJF->OMR", 0.0022);
        vales.put("DJF->QAR", 0.021);
        vales.put("DJF->YER", 1.37);
        vales.put("DJF->SOS" , 3.20) ;
        vales.put("DJF->KMF" , 2.41) ;
        vales.put("DJF->SYP" , 73.30) ;
        vales.put("DJF->LBP", 503.16);


        // لجزر القمر
        vales.put("KMF->MRU" , 0.093) ;
        vales.put("KMF->SDG", 1.41);
        vales.put("KMF->EGP", 0.12);
        vales.put("KMF->AED", 0.0086);
        vales.put("KMF->MAD", 0.021);
        vales.put("KMF->JOD", 0.0017);
        vales.put("KMF->BHD", 0.00088);
        vales.put("KMF->TND", 0.0069);
        vales.put("KMF->DZD", 0.30);
        vales.put("KMF->IQD", 3.06);
        vales.put("KMF->KWD", 0.00072);
        vales.put("KMF->LYD", 0.013);
        vales.put("KMF->SAR", 0.0088);
        vales.put("KMF->OMR", 0.00090);
        vales.put("KMF->QAR", 0.0085);
        vales.put("KMF->YER", 0.57);
        vales.put("KMF->SOS" , 1.33) ;
        vales.put("KMF->DJF" , 0.42) ;
        vales.put("KMF->SYP" , 30.53) ;
        vales.put("KMF->LBP", 209.16);


        //سوريه
        vales.put("SYP->MRU" , 0.0);
        vales.put("SYP->SDG", 0.0);
        vales.put("SYP->EGP", 0.0);
        vales.put("SYP->AED", 0.0);
        vales.put("SYP->MAD", 0.0);
        vales.put("SYP->JOD", 0.0);
        vales.put("SYP->BHD", 0.0);
        vales.put("SYP->TND", 0.0);
        vales.put("SYP->DZD", 0.0);
        vales.put("SYP->IQD", 0.0);
        vales.put("SYP->KWD", 0.0);
        vales.put("SYP->LYD", 0.0);
        vales.put("SYP->SAR", 0.0);
        vales.put("SYP->OMR", 0.0);
        vales.put("SYP->QAR", 0.0);
        vales.put("SYP->YER", 0.0);
        vales.put("SYP->SOS" , 0.0);
        vales.put("SYP->FDJ" , 0.0);
        vales.put("SYP->KMF" , 0.0);
        vales.put("SYP->LBP", 0.0);


        // لبنان
        vales.put("LBP->MRU" , 0.00044) ;
        vales.put("LBP->SDG", 0.0067);
        vales.put("LBP->EGP", 0.00057);
        vales.put("LBP->AED", 0.000041);
        vales.put("LBP->MAD", 0.00010);
        vales.put("LBP->JOD", 0.0000079);
        vales.put("LBP->BHD", 0.0000042);
        vales.put("LBP->TND", 0.000033);
        vales.put("LBP->DZD", 0.0015);
        vales.put("LBP->IQD", 0.015);
        vales.put("LBP->KWD", 0.0000034);
        vales.put("LBP->LYD", 0.000061);
        vales.put("LBP->SAR", 0.000042);
        vales.put("LBP->OMR", 0.0000043);
        vales.put("LBP->QAR", 0.000041);
        vales.put("LBP->YER", 0.0027);
        vales.put("LBP->SOS" , 0.0064) ;
        vales.put("LBP->FDJ" , 0.0020) ;
        vales.put("LBP->KMF" , 0.0048) ;
        vales.put("LBP->SYP", 0.15);

    }  //  ***Constructor***



    // Create method because it Ues value :
    public double getValue(String from, String to) {
        String key = from + "->" + to;
        if (vales.containsKey(key)) {
            return vales.get(key) ;
        }
        else {
            return vales.getOrDefault(key, 0.0);
        }
    }

} // Class