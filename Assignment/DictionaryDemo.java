
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Container;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.border.BevelBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thanh
 */
public class DictionaryDemo extends javax.swing.JFrame {

    private final Dictionary dictionary;
    private final DictionaryManagement dict_manager;
    private final DefaultListModel<String> dlm = new DefaultListModel<String>();

    /**
     * Creates new form DictionaryDemo
     *
     * @throws java.io.IOException
     */
    public DictionaryDemo() throws IOException {
        initComponents();

        explain.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        autoWindow.setVisible(false);
        dictionary = new Dictionary();
        dict_manager = new DictionaryManagement(dictionary);
        dict_manager.insertFromFile();
    }

    public void add(String s) {
        autocomplete.setModel(dlm);
        dlm.addElement(s);
    }

    public void clear() {
        dlm.clear();
        autocomplete.setModel(dlm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        target = new javax.swing.JTextField();
        explain = new javax.swing.JLabel();
        autoWindow = new javax.swing.JScrollPane();
        autocomplete = new javax.swing.JList<>();
        changes = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(100000, 100000));
        getContentPane().setLayout(null);

        jButton1.setText("Translate!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 330, 120, 40);

        target.setColumns(2);
        target.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetActionPerformed(evt);
            }
        });
        target.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                targetKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                targetKeyReleased(evt);
            }
        });
        getContentPane().add(target);
        target.setBounds(110, 180, 520, 40);

        explain.setBackground(new java.awt.Color(0, 255, 0));
        explain.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        explain.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        explain.setAutoscrolls(true);
        explain.setName(""); // NOI18N
        getContentPane().add(explain);
        explain.setBounds(650, 180, 540, 130);

        autocomplete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        autocomplete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        autocomplete.setForeground(new java.awt.Color(255, 0, 51));
        autocomplete.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        autocomplete.setSelectionBackground(new java.awt.Color(255, 0, 51));
        autocomplete.setSelectionForeground(new java.awt.Color(255, 255, 102));
        autocomplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                autocompleteMouseClicked(evt);
            }
        });
        autoWindow.setViewportView(autocomplete);

        getContentPane().add(autoWindow);
        autoWindow.setBounds(110, 210, 520, 290);
        getContentPane().add(changes);
        changes.setBounds(510, 50, 100, 60);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Save Changes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Add Word...");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Delete Word...");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Remove Word...");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("jMenu4");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("jMenu5");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String English = target.getText();
        ArrayList<String> check = dictionary.searchWord(English);
        if (check == null) {
            explain.setText("Sorry, We did not find your word in our Dictionary");
        } else {
            System.out.println("We found " + check.size() + "result(s)");
            for (int i = 0; i < check.size(); i++) {
                explain.setText(check.get(i));
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void autocompleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autocompleteMouseClicked
        // TODO add your handling code here:
        String s = (String) autocomplete.getSelectedValue();
        target.setText(s);
        ArrayList<String> check = dictionary.searchWord(s);
        if (check == null) {
            explain.setText("Sorry, We did not find your word in our Dictionary");
            autoWindow.setVisible(false);
        } else {
            System.out.println("We found " + check.size() + "result(s)");
            for (int i = 0; i < check.size(); i++) {
                explain.setText(check.get(i));
                autoWindow.setVisible(false);
            }
        }
    }//GEN-LAST:event_autocompleteMouseClicked

    private void targetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_targetKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() != KeyEvent.VK_ENTER && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_UP) {
            String typed = target.getText();

            ArrayList<String> suggestions = dictionary.searcher(typed);
            if (suggestions == null) {
                explain.setText(" ");
                autoWindow.setVisible(false);
                clear();
            } else {

                clear();
                for (String suggestion : suggestions) {

                    add(suggestion);
                }
                autoWindow.setVisible(true);
            }
        }


    }//GEN-LAST:event_targetKeyReleased

    private void targetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetActionPerformed

    private void targetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_targetKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (autocomplete.getSelectedIndex() == -1) {
                autoWindow.setVisible(false);
                String typed = target.getText();
                ArrayList<String> results = dictionary.searchWord(typed);
                if (results == null) {
                    explain.setText("Not Found any explain word match your target word!");
                } else {
                    clear();
                    for (String result : results) {
                        explain.setText(result);
                    }
                }
            }
            else {
                String s = autocomplete.getSelectedValue();
                autoWindow.setVisible(false);
                target.setText(s);
                ArrayList<String> results = dictionary.searchWord(s);
                clear();
                for(String result : results) {
                    explain.setText(result);
                }
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {

            int index = autocomplete.getSelectedIndex();
            if (index == autocomplete.getModel().getSize() - 1) {
                evt.consume();
                autocomplete.setSelectedIndex(0);
                autocomplete.ensureIndexIsVisible(0);
                
            } else {
                autocomplete.setSelectedIndex(index + 1);
                autocomplete.ensureIndexIsVisible(index+1);

            }
            target.setText(autocomplete.getSelectedValue());
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {

            int index = autocomplete.getSelectedIndex();
            if (index == -1||index == 0) {
                evt.consume();
                autocomplete.setSelectedIndex(autocomplete.getModel().getSize()-1);
                autocomplete.ensureIndexIsVisible(autocomplete.getModel().getSize()-1);
                
            } else {
                autocomplete.setSelectedIndex(index - 1);
                autocomplete.ensureIndexIsVisible(index-1);

            }
            target.setText(autocomplete.getSelectedValue());
        }

    }//GEN-LAST:event_targetKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DictionaryDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new DictionaryDemo().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(DictionaryDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane autoWindow;
    private javax.swing.JList<String> autocomplete;
    private javax.swing.JLabel changes;
    private javax.swing.JLabel explain;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JTextField target;
    // End of variables declaration//GEN-END:variables
}
