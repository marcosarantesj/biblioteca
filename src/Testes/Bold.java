/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testes;
import javax.swing.*;
import javax.swing.text.*;
/**
 *
 * @author MARK
 */
public class Bold {
public static void main(String[] args) throws BadLocationException {
        JTextPane text = new JTextPane();
        StyledDocument doc = text.getStyledDocument();
        fillDocument(doc);

        printElement("", doc.getDefaultRootElement());

        JOptionPane.showMessageDialog(null, text);
    }

    private static void fillDocument(StyledDocument doc) throws BadLocationException {
        Style def = StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
        Style bold = doc.addStyle("bold", def);
        StyleConstants.setBold(bold, true);

        doc.insertString(doc.getLength(), "texto ", def);
        doc.insertString(doc.getLength(), "negrito", bold);
        doc.insertString(doc.getLength(), " texto", def);
    }

    private static void printElement(String indent, Element element) throws BadLocationException {
        System.out.print(indent + element);
        if (element.isLeaf()) {
            System.out.println(indent + StyleConstants.isBold(element.getAttributes()));
            Document doc = element.getDocument();
            System.out.println(indent + "\"" +
                    doc.getText(element.getStartOffset(), element.getEndOffset()-element.getStartOffset())
                    + "\"");
        }
        for (int i = 0; i < element.getElementCount(); i++) {
            printElement(indent + ". ", element.getElement(i));
        }
    }  
}
