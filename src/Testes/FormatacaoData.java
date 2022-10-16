/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author MARK
 */
public class FormatacaoData {

    public static void main(String args[]) {

        String data = "2010-01-20";
        DateFormat dfReservas = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date dtSQL = Date.valueOf(data);
//        java.util.Date dtR = null;
//        try {
//
//            dtR = dfReservas.parse(dfReservas.format(dtSQL));
//
//        } catch (ParseException ex) {
//            Logger.getLogger(FormatacaoData.class.getName()).log(Level.SEVERE, null, ex);
//        }
        String dataFormatada = dfReservas.format(dtSQL);
        System.out.println(dataFormatada);
//                java.util.Date dt = new java.util.Date(dtR.getTime());

//                String year = data.substring(0, 4);
//                String month = data.substring(5, 7);
//                String dayOfMonth = data.substring(8);
//                data = dayOfMonth + "/" + month + "/" + year;
//                String data2="01/11/2010";

//                DateFormat dtFPublic = new SimpleDateFormat("dd/MM/yyyy");
//                    java.util.Date dtP = null;
//                try {
//                    dtP = dtFPublic.parse(data2);
//                } catch (ParseException ex) {
//                    Logger.getLogger(FormatacaoData.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                    java.sql.Date dataPublicJDBC = new java.sql.Date(dtP.getTime());

//                try {
////                    dtR = dfReservas.parse(dfReservas.format(data));
////                  //Formata a data
////                    String d=dfReservas.format(data);
////                    dtR = dfReservas.parse(d);
////                    dt=dfReservas.parse(d);
////                    dtR=dfReservas.parse(d);
//                } catch (ParseException ex) {
//                    Logger.getLogger(FormatacaoData.class.getName()).log(Level.SEVERE, null, ex);
//                    System.out.println(ex.getMessage());
//                }

//               data=data.toString().replace("-", "/");
//                System.out.println(dtR);
//                System.out.println(dayOfMonth + "/" + month + "/" + year);
//                String s=dfReservas.format(new Date());
//                System.out.println();
//                System.out.println(d);
//                //A dataJDBC já retorna formatado corretamente
//                System.out.println(dfReservas.format(dtP));



    }
}
