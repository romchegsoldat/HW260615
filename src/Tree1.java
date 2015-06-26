import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Fri Jun 26 15:20:59 EEST 2015
 */



/**
 * @author Roman Boiko
 */
public class Tree1 extends JFrame {
    public Tree1() {
        initComponents();
    }

    private void ZakazActionPerformed(ActionEvent e) {

        System.out.println("Zakaz");


        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Roman Boiko
        panel1 = new JPanel();
        JButton Zakaz = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new FormLayout(
            "23*(default, $lcgap), default",
            "15*(default, $lgap), default"));

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(new FormLayout(
                "8*(default, $lcgap), default",
                "2*(default, $lgap), default"));

            //---- Zakaz ----
            Zakaz.setText("text");
            Zakaz.addActionListener(e -> ZakazActionPerformed(e));
            panel1.add(Zakaz, CC.xywh(1, 1, 17, 5));
        }
        contentPane.add(panel1, CC.xy(19, 9));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Roman Boiko
    private JPanel panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
