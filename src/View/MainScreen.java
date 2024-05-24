package View;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MainScreen extends javax.swing.JFrame {

    
    public MainScreen() {
        initComponents();
        
        icon();
        
        
         this.setSize(436, 530);
        
        
        this.setLocationRelativeTo(null);
        
       
        ImageIcon icon = new ImageIcon("C:\\Users\\wesle\\OneDrive\\Área de Trabalho\\SpeakUpRegister\\Icons\\Fisk Red Logo.png");
        setIconImage(icon.getImage());
        setVisible(true);
        
    }
    
    
    public void icon(){
        Icon i = jLabel1.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        jLabel1.setIcon(new ImageIcon(image));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        regBtn = new javax.swing.JButton();
        upBtn = new javax.swing.JButton();
        atBtn = new javax.swing.JButton();
        stuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Screen");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(195, 195, 195));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\wesle\\OneDrive\\Área de Trabalho\\SpeakUpRegister\\Icons\\Fisk Speak Up Offensive.png")); // NOI18N

        regBtn.setBackground(new java.awt.Color(121, 0, 0));
        regBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regBtn.setForeground(new java.awt.Color(255, 255, 255));
        regBtn.setText("Register");
        regBtn.setFocusable(false);
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });

        upBtn.setBackground(new java.awt.Color(121, 0, 0));
        upBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        upBtn.setForeground(new java.awt.Color(255, 255, 255));
        upBtn.setText("Update");
        upBtn.setFocusable(false);
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });

        atBtn.setBackground(new java.awt.Color(121, 0, 0));
        atBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        atBtn.setForeground(new java.awt.Color(255, 255, 255));
        atBtn.setText("Attendance");
        atBtn.setFocusable(false);
        atBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atBtnActionPerformed(evt);
            }
        });

        stuBtn.setBackground(new java.awt.Color(121, 0, 0));
        stuBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stuBtn.setForeground(new java.awt.Color(255, 255, 255));
        stuBtn.setText("Students");
        stuBtn.setFocusable(false);
        stuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 278, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 420, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed
        Register r = new Register();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_regBtnActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        UpdateList ups = new UpdateList();
        ups.setVisible(true);
        dispose();
    }//GEN-LAST:event_upBtnActionPerformed

    private void atBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atBtnActionPerformed
        AttendList al = new AttendList();
        al.setVisible(true);
        dispose();
    }//GEN-LAST:event_atBtnActionPerformed

    private void stuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuBtnActionPerformed
        StudentsList sl = new StudentsList();
        sl.setVisible(true);
        dispose();
    }//GEN-LAST:event_stuBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regBtn;
    private javax.swing.JButton stuBtn;
    private javax.swing.JButton upBtn;
    // End of variables declaration//GEN-END:variables
}
