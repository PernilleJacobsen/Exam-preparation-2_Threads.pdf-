package threadsObserver;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import randomperson.RandomUser;

/**
 *
 * @author Lars Mortensen
 */
public class RandomUserForm extends javax.swing.JFrame implements Observer {

  /**
   * Creates new form RandomUserForm
   */
  public RandomUserForm() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    textLastName = new javax.swing.JTextField();
    textStreet = new javax.swing.JTextField();
    textCity = new javax.swing.JTextField();
    textEmail = new javax.swing.JTextField();
    textFirstName = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("New User");

    jLabel1.setText("First Name");

    jLabel2.setText("Last Name");

    jLabel3.setText("Street");

    jLabel4.setText("City");

    jLabel5.setText("Email");

    jButton1.setText("Add New Test User");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn1Clicked(evt);
      }
    });

    jButton2.setText("Save User (DOES NOTHING)");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(textFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
          .addComponent(jLabel4)
          .addComponent(jLabel2)
          .addComponent(jLabel3)
          .addComponent(jLabel1)
          .addComponent(jLabel5)
          .addComponent(textLastName)
          .addComponent(textStreet)
          .addComponent(textCity)
          .addComponent(textEmail))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton2))
        .addGap(26, 26, 26))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(textFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(textStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15)
            .addComponent(jLabel4))
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(13, 13, 13)
        .addComponent(textCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel5)
        .addGap(6, 6, 6)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton2))
        .addContainerGap(40, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

//  RandomUserControl randomUserControl = new RandomUserControl();


  private void btn1Clicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1Clicked
    
      RandomUserControl rand = new RandomUserControl();
      RandomUserForm ranf = new  RandomUserForm();
      
      rand.addObserver(ranf);
      rand.fetchRandomUser();
      
      
    
        


  }//GEN-LAST:event_btn1Clicked

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    JOptionPane.showMessageDialog(this, "Does nothing in this example");
  }//GEN-LAST:event_jButton2ActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
      e.printStackTrace();
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RandomUserForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JTextField textCity;
  private javax.swing.JTextField textEmail;
  private javax.swing.JTextField textFirstName;
  private javax.swing.JTextField textLastName;
  private javax.swing.JTextField textStreet;
  // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg)
    {
        RandomUser random = (RandomUser) arg;//caster arg til at være randomuser
        
        textFirstName.setText(random.getFirstName());
    textLastName.setText(random.getLastName());
    textStreet.setText(random.getStreet());
    textCity.setText(random.getCity());
    textEmail.setText(random.getEmail());
    }

}
