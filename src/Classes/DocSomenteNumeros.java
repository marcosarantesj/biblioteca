/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;
 import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author MARK
 */
public class DocSomenteNumeros extends PlainDocument{
    @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
            //percorre a String inserida...
            for(int i=0;i<str.length();i++){
                //isDigit() verifica se é um numero, se não for ignora...
                if(Character.isDigit(str.charAt(i))){
                    //se for insere no documento
                    super.insertString(offs, Character.toString(str.charAt(i)), a);
                }
            }
        }

}
