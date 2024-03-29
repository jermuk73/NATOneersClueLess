/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natoneers.client;

import java.awt.Image;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author jermukuokkanen
 */
public class ClueLessClientMinimal extends javax.swing.JFrame {
   
    //Memebers from design document
    private int playerNum;
    private String playerName;
    private int playerLocation;
    private String locationName;
    
    //Member from previous increment
    private static final long serialVersionUID = 1L;

    private boolean connected;
    // the Client object
    private Client client;
    // the default port number
    private final int defaultPort;
    private final String defaultHost;
    
    InetAddress ipAddr;
    
    /**
     * Creates new form ClueLessClientMinimal
     */
    public ClueLessClientMinimal(String host, int port) {
        initComponents();
        
        defaultPort = port;
        defaultHost = host;
        playerLocation=-1;
        locationName = "HomeRoom";
    }

    public String getIP(){
        try {
            ipAddr = InetAddress.getLocalHost();
            System.out.println(ipAddr.getHostAddress());
            
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        return ipAddr.getHostAddress()+"";
    }
    

    // called by the Client to append text in the TextArea 
    void append(String str) {
        jtaGameMessages.append(str);
        jtaGameMessages.setCaretPosition(jtaGameMessages.getText().length() - 1);
    }
    // called by the GUI is the connection failed
    // we reset our buttons, label, textfield

    void connectionFailed() {
        jtbLogin.setEnabled(true);
        jtbLogout.setEnabled(false);
        jbCurrentPlayers.setEnabled(false);
 
        connected = false;

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbLogin = new javax.swing.JToggleButton();
        jtfServer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtbLogout = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaMyCards = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaPlayerPosition = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaGameMessages = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jtbStartGame = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbSuggestion = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jbEndTurn = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jcbSuggestionPlayer = new javax.swing.JComboBox<>();
        jcbSuggestionWeapon = new javax.swing.JComboBox<>();
        jcbAccusationPlayer = new javax.swing.JComboBox<>();
        jcbAccusationWeapon = new javax.swing.JComboBox<>();
        jcbAccusationRoom = new javax.swing.JComboBox<>();
        jbCurrentPlayers = new javax.swing.JButton();
        jtfTestMessage = new javax.swing.JTextField();
        jcbPlayer = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtbLogin.setText("LOGIN");
        jtbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbLoginActionPerformed(evt);
            }
        });

        jtfServer.setText("127.0.0.1");

        jLabel1.setText("Server IP Address");

        jtbLogout.setText("LOGOUT");

        jtaMyCards.setColumns(20);
        jtaMyCards.setRows(5);
        jScrollPane1.setViewportView(jtaMyCards);

        jLabel2.setText("My Cards");

        jtaPlayerPosition.setColumns(20);
        jtaPlayerPosition.setRows(5);
        jScrollPane2.setViewportView(jtaPlayerPosition);

        jLabel3.setText("Player Positions");

        jtaGameMessages.setColumns(20);
        jtaGameMessages.setRows(5);
        jScrollPane3.setViewportView(jtaGameMessages);

        jLabel4.setText("Game Messages");

        jtbStartGame.setText("Start Game");
        jtbStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbStartGameActionPerformed(evt);
            }
        });

        jButton1.setText("LOGIN");

        jButton3.setText("Move");

        jbSuggestion.setText("Suggestion");
        jbSuggestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSuggestionActionPerformed(evt);
            }
        });

        jButton5.setText("Accusation");

        jbEndTurn.setText("End Turn");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "North", "East", "South", "West", "Secret Passage" }));

        jcbSuggestionPlayer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ColonelMustard", "MissScarlet", "ProfessorPlum", "MrsWhite", "MrGreen", "MrsPeacock" }));

        jcbSuggestionWeapon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Candlestick", "Dagger", "LeadPipe", "Revolver", "Rope", "Spanner" }));

        jcbAccusationPlayer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ColonelMustard", "MissScarlet", "ProfessorPlum", "MrsWhite", "MrGreen", "MrsPeacock" }));

        jcbAccusationWeapon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Candlestick", "Dagger", "LeadPipe", "Revolver", "Rope", "Spanner" }));

        jcbAccusationRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kitchen", "Ballroom", "Conservatory", "BillardRoom", "Library", "Study", "Hall", "Lounge", "DiningRoom" }));

        jbCurrentPlayers.setText("Current Players");
        jbCurrentPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCurrentPlayersActionPerformed(evt);
            }
        });

        jtfTestMessage.setText("testing");
        jtfTestMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTestMessageActionPerformed(evt);
            }
        });

        jcbPlayer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ColonelMustard", "MissScarlet", "ProfessorPlum", "MrsWhite", "MrGreen", "MrsPeacock" }));

        jLabel5.setText("Player");

        jLabel6.setText("Weapon");

        jLabel7.setText("Room ");

        jLabel8.setText("Test brodcast message");

        jLabel9.setText("Choose Player");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jbEndTurn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(jbSuggestion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jtbLogout))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbAccusationPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                        .addComponent(jcbAccusationWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbAccusationRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbCurrentPlayers)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jcbSuggestionPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jcbSuggestionWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(15, 15, 15)
                                                        .addComponent(jLabel5)
                                                        .addGap(124, 124, 124)
                                                        .addComponent(jLabel6)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7))
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcbPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(125, 125, 125))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel9)
                                        .addGap(120, 120, 120)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jtfTestMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtbLogin)
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jtfServer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton1)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtbStartGame)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtbLogin)
                                        .addComponent(jtfServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1))
                                .addGap(35, 35, 35))
                            .addComponent(jtbLogout))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtbStartGame)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbEndTurn)
                                    .addComponent(jbCurrentPlayers)))
                            .addComponent(jcbPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfTestMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbSuggestion)
                                    .addComponent(jcbSuggestionPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbSuggestionWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5)
                                    .addComponent(jcbAccusationPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbAccusationWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbAccusationRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbLoginActionPerformed

        // empty serverAddress ignore it
        String server =jtfServer.getText().trim();
        if (server.length() == 0) {
            return;
        }
        // Use port 59001
        int port = 59001;
   
        try {
            ipAddr = InetAddress.getLocalHost(); 

        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        String username = ipAddr.getHostAddress();
        // try creating a new Client with GUI
        client = new Client(server, port, username, this);
        // test if we can start the Client
        if (!client.start()) {
            return;
        }
     
        connected = true;

        // disable login button
        jtbLogin.setEnabled(false);

        // enable the 2 buttons
        jtbLogout.setEnabled(true);
        jbCurrentPlayers.setEnabled(true);
        // disable the Server and Port JTextField
        jtfServer.setEditable(false);
   
    }//GEN-LAST:event_jtbLoginActionPerformed

    private void jbCurrentPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCurrentPlayersActionPerformed
        client.sendMessage(new GameMessage(GameMessage.WHOISIN, ""));
        return;
    }//GEN-LAST:event_jbCurrentPlayersActionPerformed

    private void jtfTestMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTestMessageActionPerformed
        if (connected) {
            // just have to send the message
            client.sendMessage(new GameMessage(GameMessage.MESSAGE, jtfTestMessage.getText()));
            jtfTestMessage.setText("");
            return;
        }
    }//GEN-LAST:event_jtfTestMessageActionPerformed

    private void jbSuggestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSuggestionActionPerformed
        

        //Get Suspect
        int temp_index = jcbSuggestionPlayer.getSelectedIndex();
        String str1 = jcbSuggestionPlayer.getItemAt(temp_index);
        
        // Get Weapon
        temp_index = jcbSuggestionWeapon.getSelectedIndex();
        String str2 = jcbSuggestionWeapon.getItemAt(temp_index);
        
        // Get Room , for Suggestion always current room
        String str3 = locationName;
        String Suggestionstr = "SuggestionMessage: " + this.playerName + " suggests that " + str1 + " did it with the " +  str2 + " in the " + str3;  
        client.sendMessage(new GameMessage(GameMessage.MESSAGE, Suggestionstr));
        jtfTestMessage.setText("");
        return;
    }//GEN-LAST:event_jbSuggestionActionPerformed

    private void jtbStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbStartGameActionPerformed
        this.playerNum=jcbPlayer.getSelectedIndex();
        this.playerName=jcbPlayer.getItemAt(this.playerNum);
        String message = "JoinMessage: " + this.playerName + " has joined the game.";
        client.sendMessage(new GameMessage(GameMessage.MESSAGE, message));
    }//GEN-LAST:event_jtbStartGameActionPerformed

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
            java.util.logging.Logger.getLogger(ClueLessClientMinimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClueLessClientMinimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClueLessClientMinimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClueLessClientMinimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClueLessClientMinimal("localhost", 1000).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbCurrentPlayers;
    private javax.swing.JButton jbEndTurn;
    private javax.swing.JButton jbSuggestion;
    private javax.swing.JComboBox<String> jcbAccusationPlayer;
    private javax.swing.JComboBox<String> jcbAccusationRoom;
    private javax.swing.JComboBox<String> jcbAccusationWeapon;
    private javax.swing.JComboBox<String> jcbPlayer;
    private javax.swing.JComboBox<String> jcbSuggestionPlayer;
    private javax.swing.JComboBox<String> jcbSuggestionWeapon;
    private javax.swing.JTextArea jtaGameMessages;
    private javax.swing.JTextArea jtaMyCards;
    private javax.swing.JTextArea jtaPlayerPosition;
    private javax.swing.JToggleButton jtbLogin;
    private javax.swing.JToggleButton jtbLogout;
    private javax.swing.JToggleButton jtbStartGame;
    private javax.swing.JTextField jtfServer;
    private javax.swing.JTextField jtfTestMessage;
    // End of variables declaration//GEN-END:variables
}
