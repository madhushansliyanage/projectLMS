import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Timetable extends JFrame {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;


    /**
     * Creates new form Teacher
     */
    public Timetable() {
        initComponents();
        con = DatabaseConnection.getDBConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jComboBox1 = new JComboBox<>();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        jLabel8 = new JLabel();
        id = new JTextField();
        department = new JComboBox<>();
        submit = new JButton();
        newTeacher = new JButton();
        imageIcon = new JLabel();
        select = new JButton();
        mainmenu = new JButton();

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD TIMETABLE");

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("ADD TIMETABLE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ADMIN ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("ADD TIMETABLE");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("DEPARTMENT");

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        department.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        department.setModel(new DefaultComboBoxModel<>(new String[] { "ICT", "ET", "BST" }));

        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        newTeacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newTeacher.setText("NEW");
        newTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTeacherActionPerformed(evt);
            }
        });

        select.setText("SELECT IMAGE");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        mainmenu.setText("MAIN MENU");
        mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(submit)
                                                .addGap(108, 108, 108)
                                                .addComponent(newTeacher)
                                                .addGap(91, 91, 91)
                                                .addComponent(mainmenu))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(284, 284, 284)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(imageIcon, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(278, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel2))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(department, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(select)
                                        .addComponent(id, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
                                .addGap(332, 332, 332))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(65, 65, 65)
                                                .addComponent(id, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(department, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                                .addComponent(jLabel8)
                                                .addGap(66, 66, 66)))
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(select))
                                .addGap(39, 39, 39)
                                .addComponent(imageIcon, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(submit)
                                        .addComponent(newTeacher)
                                        .addComponent(mainmenu))
                                .addGap(105, 105, 105))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try
        {
            stmt = con.createStatement();


            String sId = id.getText();
            String sdepartment = (String) department.getSelectedItem();


            String query = " insert into Time_Table(Time_Table,Department_ID,Admin_ID) VALUES (?, ?, ?)";

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(3, sId);
            preparedStmt.setString(2, sdepartment);
            preparedStmt.setBytes(1, photo);

            preparedStmt.execute();
            JOptionPane.showMessageDialog(null, "ADDED");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void Reset()
    {
        id.setText("");

        imageIcon.setIcon(null);
    }

    private void newTeacherActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Reset();
    }

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        imageIcon.setIcon(new ImageIcon(file.toString()));
        filename = file.getAbsolutePath();

        try
        {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte [] buf = new byte [1024];
            for(int readnum; (readnum = fis.read(buf)) != -1;)
            {
                bos.write(buf, 0, readnum);
            }
            photo = bos.toByteArray();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    private void mainmenuActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        AdminPanal view = new AdminPanal();
        view.setVisible(true);

    }




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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Timetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JComboBox<String> department;
    private JTextField id;
    private JLabel imageIcon;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JButton mainmenu;
    private JButton newTeacher;
    private JButton select;
    private JButton submit;
    // End of variables declaration
    byte [] photo = null;
    String filename = null;

}
