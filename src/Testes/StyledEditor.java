package Testes;

// StyledEditor.java
// An extension of SimpleEditor that adds styled-text features.
//
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.Toolkit;

public class StyledEditor extends SimpleEditor{

  public static void main(String[] args) {
    StyledEditor editor = new StyledEditor();
    editor.setVisible(true);
    editor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  // Create a styed editor.
  public StyledEditor() {
    updateInputMap();  // Install our style-related keystrokes
  }

  // Override to create a JTextPane.
  protected JTextComponent createTextComponent() {
    return new JTextPane();
  }

  // Add icons & friendly names for font actions.
  protected void makeActionsPretty() {
    super.makeActionsPretty();

    Action a;
    a = getTextComponent().getActionMap().get("font-bold");
    a.putValue(Action.SMALL_ICON, new ImageIcon("icons/bold.gif"));
    a.putValue(Action.NAME, "Bold");
    a = getTextComponent().getActionMap().get("font-italic");
    a.putValue(Action.SMALL_ICON, new ImageIcon("icons/italic.gif"));
    a.putValue(Action.NAME, "Italic");
    a = getTextComponent().getActionMap().get("font-underline");
    a.putValue(Action.SMALL_ICON, new ImageIcon("icons/underline.gif"));
    a.putValue(Action.NAME, "Underline");

    a = getTextComponent().getActionMap().get("font-family-SansSerif");
    a.putValue(Action.NAME, "SansSerif");
    a = getTextComponent().getActionMap().get("font-family-Monospaced");
    a.putValue(Action.NAME, "Monospaced");
    a = getTextComponent().getActionMap().get("font-family-Serif");
    a.putValue(Action.NAME, "Serif");

    a = getTextComponent().getActionMap().get("font-size-10");
    a.putValue(Action.NAME, "10");
    a = getTextComponent().getActionMap().get("font-size-12");
    a.putValue(Action.NAME, "12");
    a = getTextComponent().getActionMap().get("font-size-16");
    a.putValue(Action.NAME, "16");
    a = getTextComponent().getActionMap().get("font-size-24");
    a.putValue(Action.NAME, "24");
  }

  // Add key mappings for font style features.
  protected void updateInputMap() {
    // Extend the input map used by our text component.
    InputMap map = getTextComponent().getInputMap();
    int mask = Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();
    KeyStroke bold = KeyStroke.getKeyStroke(KeyEvent.VK_B, mask, false);
    KeyStroke italic = KeyStroke.getKeyStroke(KeyEvent.VK_I, mask, false);
    KeyStroke under = KeyStroke.getKeyStroke(KeyEvent.VK_U, mask, false);
    map.put(bold, "font-bold");
    map.put(italic, "font-italic");
    map.put(under, "font-underline");
  }

  // Add font actions to the toolbar.
  protected JToolBar createToolBar() {
    JToolBar bar = super.createToolBar();
    bar.addSeparator();

    bar.add(getTextComponent().getActionMap().get("font-bold")).setText("");
    bar.add(getTextComponent().getActionMap().get("font-italic")).setText("");
    bar.add(getTextComponent().getActionMap().get("font-underline")).setText("");

    return bar;
  }

  // Add font actions to the menu.
  protected JMenuBar createMenuBar() {
    JMenuBar menubar = super.createMenuBar();
    JMenu font = new JMenu("Font");
    menubar.add(font);

    JMenu style = new JMenu("Style");
    JMenu family = new JMenu("Family");
    JMenu size = new JMenu("Size");
    font.add(style);
    font.add(family);
    font.add(size);

    style.add(getTextComponent().getActionMap().get("font-bold"));
    style.add(getTextComponent().getActionMap().get("font-underline"));
    style.add(getTextComponent().getActionMap().get("font-italic"));

    family.add(getTextComponent().getActionMap().get("font-family-SansSerif"));
    family.add(getTextComponent().getActionMap().get("font-family-Monospaced"));
    family.add(getTextComponent().getActionMap().get("font-family-Serif"));

    size.add(getTextComponent().getActionMap().get("font-size-10"));
    size.add(getTextComponent().getActionMap().get("font-size-12"));
    size.add(getTextComponent().getActionMap().get("font-size-16"));
    size.add(getTextComponent().getActionMap().get("font-size-24"));

    // Don’t forget; we can define new actions too!
    size.add(new StyledEditorKit.FontSizeAction("64", 64));

    return menubar;
  }
}
