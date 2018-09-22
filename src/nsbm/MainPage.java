/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;


import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author Tharindu
 */
public class MainPage extends javax.swing.JFrame {
    String mnth;
    String school, month;
    ResultSet rs;
    
    DBOperations dbOps = new DBOperations();

    
    public MainPage() {
        initComponents();
        setIcon();
        setPannel();        
        
        }
    
    public void tableLoad(){//Loading query data to the jtable
        try {
        
        rs = dbOps.gradeLoad();//get result from DBOperations
        jTable3.setModel(DbUtils.resultSetToTableModel(rs));//Using the library rs2xml.jar
        
        jTable3.getColumnModel().getColumn(0).setHeaderValue("Student ID");
        jTable3.getColumnModel().getColumn(5).setHeaderValue("Assignment no");
        jTable3.getColumnModel().getColumn(6).setHeaderValue("Assignment Marks");
        
        
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void teacherTableLoad(){
        try {
            rs = dbOps.teacherLoad();
            jTable4.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void studentTableLoad(){
        try {
            rs = dbOps.studentLoad();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Student ID");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Name in full");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Name with initials");
            
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void subjectTableLoad(){
        try {
            rs = dbOps.subjectLoad();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
            jTable2.getColumnModel().getColumn(0).setHeaderValue("Student ID");
            
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void classTableLoad1(){
        rs = dbOps.classLoad();
        jTable5.setModel(DbUtils.resultSetToTableModel(rs));
        
        jTable5.getColumnModel().getColumn(3).setHeaderValue("Student ID");
        jTable5.getColumnModel().getColumn(2).setHeaderValue("Lecture Hall");
        
        
        
    }
    
    public void classTableLoad2(){
        rs = dbOps.classLoad2();
        jTable6.setModel(DbUtils.resultSetToTableModel(rs));
        
        jTable6.getColumnModel().getColumn(3).setHeaderValue("Student ID");
        jTable6.getColumnModel().getColumn(2).setHeaderValue("Lab");
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        dashBoard = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        enrolment = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        grading = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton22 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        student = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        teacher = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jLabel34 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        classShedule = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NSBM Green University");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(28, 33, 86));

        jButton2.setBackground(new java.awt.Color(38, 96, 168));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Enrollment");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(38, 96, 168));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Grading");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(38, 96, 168));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Student");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(38, 96, 168));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Teacher");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(38, 96, 168));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Class Scheduling");
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(224, 90, 58));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Logout");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(38, 96, 168));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Dash board");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/avatar.JPG"))); // NOI18N
        jLabel13.setAlignmentY(0.0F);
        jLabel13.setMaximumSize(new java.awt.Dimension(264, 264));
        jLabel13.setMinimumSize(new java.awt.Dimension(264, 264));
        jLabel13.setName(""); // NOI18N
        jLabel13.setPreferredSize(new java.awt.Dimension(264, 264));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Welcome Administrator");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("jLabel15");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.CardLayout());

        dashBoard.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/Wall-2.JPG"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tharindu\\Desktop\\Untitled Export\\Capture1.JPG")); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tharindu\\Desktop\\Untitled Export\\Capture2.JPG")); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tharindu\\Desktop\\Untitled Export\\Capture6.JPG")); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/Capture3-2.JPG"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tharindu\\Desktop\\Untitled Export\\Capture5.JPG")); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tharindu\\Desktop\\Untitled Export\\Capture7.JPG")); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tharindu\\Desktop\\Untitled Export\\Capture4.JPG")); // NOI18N

        javax.swing.GroupLayout dashBoardLayout = new javax.swing.GroupLayout(dashBoard);
        dashBoard.setLayout(dashBoardLayout);
        dashBoardLayout.setHorizontalGroup(
            dashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoardLayout.createSequentialGroup()
                .addGroup(dashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dashBoardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dashBoardLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        dashBoardLayout.setVerticalGroup(
            dashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoardLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addGroup(dashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel5.add(dashBoard, "card2");

        enrolment.setBackground(new java.awt.Color(255, 255, 255));

        jToggleButton1.setBackground(new java.awt.Color(38, 96, 168));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("School of Business");
        jToggleButton1.setPreferredSize(new java.awt.Dimension(163, 25));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(38, 96, 168));
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("School of Computing");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(38, 96, 168));
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("School of Engineering");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(38, 96, 168));
        jToggleButton4.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setText("Bachelor Course (BSC)");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setBackground(new java.awt.Color(38, 96, 168));
        jToggleButton5.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton5.setText("Master Courses (MSC)");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setBackground(new java.awt.Color(38, 96, 168));
        jToggleButton6.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton6.setText("February");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setBackground(new java.awt.Color(38, 96, 168));
        jToggleButton7.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setText("July");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enrolment Month");

        jButton8.setBackground(new java.awt.Color(0, 170, 90));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Add student details");
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Enter Year of Enrolment");

        jButton9.setBackground(new java.awt.Color(0, 170, 90));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Select Subjects");
        jButton9.setToolTipText("");
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel9.setText("Payment");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Your Total fee for one semester Rs: 45200");

        jLabel11.setText("Minimum payment for one semester Rs: 4500");

        jLabel12.setText("Rs:");

        jPanel1.setBackground(new java.awt.Color(202, 97, 26));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student Enrollment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jLabel23.setText("Select Course");

        jLabel24.setText("Select Faculty");

        javax.swing.GroupLayout enrolmentLayout = new javax.swing.GroupLayout(enrolment);
        enrolment.setLayout(enrolmentLayout);
        enrolmentLayout.setHorizontalGroup(
            enrolmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(enrolmentLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(enrolmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(enrolmentLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(enrolmentLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(enrolmentLayout.createSequentialGroup()
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23)
                    .addComponent(jLabel2)
                    .addGroup(enrolmentLayout.createSequentialGroup()
                        .addGroup(enrolmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enrolmentLayout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(enrolmentLayout.createSequentialGroup()
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(enrolmentLayout.createSequentialGroup()
                                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        enrolmentLayout.setVerticalGroup(
            enrolmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enrolmentLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(enrolmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(10, 10, 10)
                .addGroup(enrolmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addGroup(enrolmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(enrolmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(enrolmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(enrolmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jPanel5.add(enrolment, "card3");

        grading.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(202, 97, 26));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Grading");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setText("Assignment Result");

        jLabel26.setText("Assignment Number");

        jLabel27.setText("Subject Code");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel28.setText("Student ID");

        jLabel29.setText("Examination Result");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel32.setText("Year");

        jLabel33.setText("Semester");

        jToggleButton8.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton8.setText("1");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton9.setText("2");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton10.setText("3");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton11.setText("4");
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jToggleButton13.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton13.setText("1");
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });

        jToggleButton14.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton14.setText("2");
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Year", "Semester", "Subject Code", "Examination Result", "Assignment No", "Assignment Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.setRowHeight(25);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);

        jButton22.setBackground(new java.awt.Color(38, 96, 168));
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Search");
        jButton22.setBorderPainted(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(0, 170, 90));
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Save");
        jButton24.setBorderPainted(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(38, 96, 168));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Update");
        jButton25.setBorderPainted(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(38, 96, 168));
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Delete");
        jButton26.setBorderPainted(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jLabel30.setText("Student ID");

        javax.swing.GroupLayout gradingLayout = new javax.swing.GroupLayout(grading);
        grading.setLayout(gradingLayout);
        gradingLayout.setHorizontalGroup(
            gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(gradingLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradingLayout.createSequentialGroup()
                        .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradingLayout.createSequentialGroup()
                                .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gradingLayout.createSequentialGroup()
                                        .addComponent(jToggleButton8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton11))
                                    .addGroup(gradingLayout.createSequentialGroup()
                                        .addComponent(jToggleButton13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton14))
                                    .addComponent(jTextField6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField7)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4))
                        .addGap(180, 180, 180)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(gradingLayout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addGroup(gradingLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton22)
                        .addGap(422, 422, 422))))
        );
        gradingLayout.setVerticalGroup(
            gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradingLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jButton22)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradingLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel33)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradingLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradingLayout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradingLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel26)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel25)))
                .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradingLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradingLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gradingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton24)
                            .addComponent(jButton25)
                            .addComponent(jButton26))
                        .addGap(40, 40, 40))))
        );

        jPanel5.add(grading, "card4");

        student.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(202, 97, 26));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Student Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Student ID");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2016cs075", "Tharindu Kumarasiri", "T Kumarasiri", "Male", "18/108, Elawella rd, Matara", "0710991877", "ku.tharindu@gmail.com", "A B C", "1028"},
                {"2016en112", "Kasun chamindu", "K Chamindu", "Male", "Nugegoda, Colombo", "077886546", "kasun@gmail.com", "A A B", "995"},
                {"2014cs045", "Pubudu Malshan", "P Malshan", "Male", "Galle", "0712556987", "pubudu@yahoo.com", "C A C", "2014"},
                {"2017en115", "Malsha nishadi", "M Nishadi", "Female", "Matara", "0718663254", "malsha@gmail.com", "B A B", "150"},
                {"2017bs096", "nipuni tharuka", "N Tharuka", "Female", "Kandy", "0784523657", "tharuka@hotmail.com", "B B B ", "520"}
            },
            new String [] {
                "Registration Number", "Full Name", "Name with Initials", "Gender", "Address", "Phone No", "Email", "A/L Results", "Island Rank"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Enrolment Details", jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2016cs075", "1", "1", "scs1101", "Mathematics I"},
                {null, null, null, "scs1102", "Introduction to Computer Science"},
                {null, null, null, "scs1103", "Programming in C"},
                {null, "", "", "scs1105", "Professional Development"},
                {"2016cs075", "1", "2", "scs1201", "Object Oriented Programming with Java"},
                {null, null, null, "scs1202", "Database Management Systems"},
                {null, null, null, "scs1205", "Algorithms and Data structures"},
                {null, null, null, "scs1206", "Computer Architecture"},
                {null, null, null, "scs1208", "Data communications and networks"}
            },
            new String [] {
                "Student ID", "Year", "Semester", "Subject code", "Subject Name"
            }
        ));
        jTable2.setRowHeight(25);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(7);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(7);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jTabbedPane1.addTab("Selected Subjects", jScrollPane2);

        jButton14.setBackground(new java.awt.Color(38, 96, 168));
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Search");
        jButton14.setBorderPainted(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(38, 96, 168));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Delete");
        jButton15.setBorderPainted(false);

        jButton16.setBackground(new java.awt.Color(0, 170, 90));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Update Subjects");
        jButton16.setBorderPainted(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 170, 90));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Update Student Details");
        jButton17.setBorderPainted(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(224, 90, 58));
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Email");
        jButton21.setBorderPainted(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentLayout = new javax.swing.GroupLayout(student);
        student.setLayout(studentLayout);
        studentLayout.setHorizontalGroup(
            studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(studentLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(studentLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentLayout.createSequentialGroup()
                                .addComponent(jButton17)
                                .addGap(18, 18, 18)
                                .addComponent(jButton16))
                            .addGroup(studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(studentLayout.createSequentialGroup()
                                    .addComponent(jButton14)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton15))
                                .addComponent(jTextField9))
                            .addComponent(jButton21))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        studentLayout.setVerticalGroup(
            studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addGap(38, 38, 38)
                .addGroup(studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(jButton16))
                .addGap(32, 32, 32)
                .addComponent(jButton21)
                .addGap(45, 45, 45)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel5.add(student, "card5");

        teacher.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(202, 97, 26));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teacher Details");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToggleButton12.setBackground(new java.awt.Color(38, 96, 168));
        jToggleButton12.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton12.setText("Lecturer");
        jToggleButton12.setBorderPainted(false);
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        jToggleButton15.setBackground(new java.awt.Color(38, 96, 168));
        jToggleButton15.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton15.setText("Instructor");
        jToggleButton15.setBorderPainted(false);
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });

        jLabel34.setText("Name");

        jLabel35.setText("Subject");

        jButton12.setBackground(new java.awt.Color(0, 170, 90));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Save");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Lecturer", "Prasad Wimalarathna", "Web Based Application Development"},
                {null, null, "Programming"},
                {null, null, "Softwear Mangement"},
                {"Lecturer", "Kasun Shanaka", "Computational Theory"},
                {null, null, "Programming Languages and Compiler Design"},
                {null, null, "Mobile Application Development"},
                {null, null, "Computer Architecture"},
                {null, null, "Algorithms and Data structures"},
                {"Instructor", "Nayana damayanthi", "Programming Languages and Compiler Design"},
                {null, null, "Softwear Mangement"},
                {"Instructor", "Nimal kamal", "Computational Theory"},
                {null, null, "Programming"}
            },
            new String [] {
                "Post", "Name", "Subjects"
            }
        ));
        jTable4.setRowHeight(25);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable4);

        jLabel37.setText("Name");

        jButton13.setBackground(new java.awt.Color(38, 96, 168));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Search");
        jButton13.setBorderPainted(false);

        jLabel38.setText("Select Post");

        jButton11.setBackground(new java.awt.Color(38, 96, 168));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Update");
        jButton11.setBorderPainted(false);

        jButton20.setBackground(new java.awt.Color(38, 96, 168));
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Delete");
        jButton20.setBorderPainted(false);

        javax.swing.GroupLayout teacherLayout = new javax.swing.GroupLayout(teacher);
        teacher.setLayout(teacherLayout);
        teacherLayout.setHorizontalGroup(
            teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jButton20)
                .addGap(119, 119, 119))
            .addGroup(teacherLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(teacherLayout.createSequentialGroup()
                                .addGroup(teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35))
                                .addGap(18, 18, 18)
                                .addGroup(teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(teacherLayout.createSequentialGroup()
                                        .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(teacherLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        teacherLayout.setVerticalGroup(
            teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(23, 23, 23)
                .addGroup(teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton11)
                    .addComponent(jButton20))
                .addGap(33, 33, 33))
        );

        jPanel5.add(teacher, "card6");

        classShedule.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(202, 97, 26));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Class Allocation");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Subject");

        jButton23.setBackground(new java.awt.Color(38, 96, 168));
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Search");
        jButton23.setBorderPainted(false);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"scs2101", "Nimal patabendhi", "s1011", "2016cs075"},
                {null, null, "s1011", "2016cs045"},
                {null, null, "s1011", "2016cs102"},
                {null, null, "s1011", "2016cs111"},
                {null, null, "s1011", "2016cs046"},
                {null, null, "s1011", "2016cs78"},
                {null, null, "s1011", "2016cs98"},
                {null, null, "s1011", "2016cs47"},
                {null, null, "s1011", "2016cs75"},
                {null, null, "s1011", "2016cs36"},
                {null, null, "s1011", "2016cs56"},
                {null, null, "s1011", "2016cs58"},
                {null, null, "s1011", "2016cs35"}
            },
            new String [] {
                "Subject", "Lecturer", "Lecture Hall", "Student ID"
            }
        ));
        jTable5.setRowHeight(25);
        jScrollPane5.setViewportView(jTable5);

        jTabbedPane2.addTab("Lecture Allocation", jScrollPane5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"scs2101", "nimesha thanage", "A", "2016cs85"},
                {null, "supun chamindu", "A", "2016cs78"},
                {null, null, "A", "2016cs89"},
                {null, null, "A", "2016cs35"},
                {null, null, "A", "2016cs78"},
                {null, null, "A", "2016cs59"},
                {null, null, "A", "2016cs36"},
                {null, null, "A", "2016cs364"},
                {null, null, "A", "2016cs754"},
                {null, null, "A", "2016cs965"},
                {null, null, "A", "2016cs356"},
                {null, null, "A", "2016cs12"},
                {null, null, "A", "2016cs13"},
                {null, null, "B", "2016cs14"},
                {null, null, "B", "2016cs15"},
                {null, null, "B", "2016cs17"},
                {null, null, "B", "2016cs18"},
                {null, null, "B", "2016cs19"},
                {null, null, "B", "2016cs78"},
                {null, null, "B", "2016cs79"},
                {null, null, "B", "2016cs80"},
                {null, null, "B", "2016cs61"},
                {null, null, "B", "2016cs62"},
                {null, null, "B", "2016cs63"},
                {null, null, "B", "2016cs64"},
                {null, null, "B", "2016cs98"},
                {null, null, "B", "2016cs78"},
                {null, null, "B", "2016cs63"}
            },
            new String [] {
                "Subject", "Instructors", "Lab", "Student ID"
            }
        ));
        jTable6.setRowHeight(25);
        jScrollPane6.setViewportView(jTable6);

        jTabbedPane2.addTab("Practical Allocation", jScrollPane6);

        javax.swing.GroupLayout classSheduleLayout = new javax.swing.GroupLayout(classShedule);
        classShedule.setLayout(classSheduleLayout);
        classSheduleLayout.setHorizontalGroup(
            classSheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(classSheduleLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(classSheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                    .addGroup(classSheduleLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        classSheduleLayout.setVerticalGroup(
            classSheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classSheduleLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(classSheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23))
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jPanel5.add(classShedule, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        if(jToggleButton1.isSelected()){//Selecting which school to enter the query
            school = "School of Buisness";
        }else if(jToggleButton2.isSelected()){
            school = "School of Computing";
        }else if(jToggleButton3.isSelected()){
            school = "School of Engineering";
        }
        
        if(jToggleButton6.isSelected()){//Selecting which month to enter the query
            month = "February";
        }else if(jToggleButton7.isSelected()){
            month = "July";
        }
        
        Enrolment enrol = new Enrolment();
        if(jToggleButton4.isSelected()){//Showing which pannel BSC or MSC according to the selection
            enrol.setVisible(true);
            enrol.showPannelBSC();
            enrol.basicDetails("BSC", school, month);
        }else if(jToggleButton5.isSelected()){
            enrol.setVisible(true);
            enrol.showPannelMSC();
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton5.isSelected()){
            jToggleButton5.setSelected(false);
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton4.isSelected()){
            jToggleButton4.setSelected(false);
        }
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton2.isSelected() || jToggleButton3.isSelected()){
            jToggleButton2.setSelected(false);
            jToggleButton3.setSelected(false);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton1.isSelected() || jToggleButton3.isSelected()){
            jToggleButton1.setSelected(false);
            jToggleButton3.setSelected(false);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton1.isSelected() || jToggleButton2.isSelected()){
            jToggleButton1.setSelected(false);
            jToggleButton2.setSelected(false);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton7.isSelected()){
            jToggleButton7.setSelected(false);
        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton6.isSelected()){
            jToggleButton6.setSelected(false);
        }
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        SelectSubjects slct = new SelectSubjects();
        slct.setVisible(true);
        
        if(jToggleButton6.isSelected()){
            slct.showFeb();
        }else if(jToggleButton7.isSelected()){
            slct.showJul();
        }
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setPannel();
        dashBoard.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        setPannel();
        classShedule.setVisible(true);
        
        classTableLoad1();
        classTableLoad2();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setPannel();
        teacher.setVisible(true);
        teacherTableLoad();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setPannel();
        student.setVisible(true);
        studentTableLoad();
        subjectTableLoad();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        setPannel();
        grading.setVisible(true);
        tableLoad();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setPannel();
        enrolment.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        jToggleButton9.setSelected(false);
        jToggleButton10.setSelected(false);
        jToggleButton11.setSelected(false);
        
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
        jToggleButton8.setSelected(false);
        jToggleButton10.setSelected(false);
        jToggleButton11.setSelected(false);
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        // TODO add your handling code here:
        jToggleButton9.setSelected(false);
        jToggleButton8.setSelected(false);
        jToggleButton11.setSelected(false);
        
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        // TODO add your handling code here:
        jToggleButton9.setSelected(false);
        jToggleButton10.setSelected(false);
        jToggleButton8.setSelected(false);
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
        // TODO add your handling code here:
        jToggleButton14.setSelected(false);
        
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
        // TODO add your handling code here:
        jToggleButton13.setSelected(false);
    }//GEN-LAST:event_jToggleButton14ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        // TODO add your handling code here:
        jToggleButton15.setSelected(false);
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        
        try {
            
            StudentGrading sg = new StudentGrading();
            
            sg.setReg_id(jTextField6.getText());
            if(jToggleButton8.isSelected()){
                sg.setYear("1");
            }else if(jToggleButton9.isSelected()){
                sg.setYear("2");
            }else if(jToggleButton10.isSelected()){
                sg.setYear("3");
            }else if(jToggleButton11.isSelected()){
                sg.setYear("4");
            }
            
            if(jToggleButton13.isSelected()){
                sg.setSemester("1");
            }else if(jToggleButton14.isSelected()){
                sg.setSemester("2");
            }
            sg.setSubject_code(jTextField3.getText());
            sg.setExam_result(jTextField7.getText());
            sg.setAss_no(jTextField4.getText());
            sg.setAss_result(jTextField5.getText());
            
            boolean result = dbOps.addGrading(sg);
            
            if(result){
                JOptionPane.showMessageDialog(this,"Successfully Inserted");
            }else{
                JOptionPane.showMessageDialog(this,"Error Occured in Detail Insertion");
            }
            
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            
            jToggleButton8.setSelected(false);
            jToggleButton9.setSelected(false);
            jToggleButton10.setSelected(false);
            jToggleButton11.setSelected(false);
            jToggleButton12.setSelected(false);
            jToggleButton13.setSelected(false);
            jToggleButton14.setSelected(false);
            
            tableLoad();
            
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        //Getting value from the table to the text boxs when table is selected
        
        int r = jTable3.getSelectedRow();
        
        String id = jTable3.getValueAt(r,0).toString();
        String year = jTable3.getValueAt(r,1).toString();
        String sem  = jTable3.getValueAt(r,2).toString();
        String code = jTable3.getValueAt(r,3).toString();
        String examRes = jTable3.getValueAt(r,4).toString();
        String assNo = jTable3.getValueAt(r,5).toString();
        String assRes = jTable3.getValueAt(r,6).toString();
        
        
        switch (year) {
            case "1":
                jToggleButton8.setSelected(true);
                jToggleButton9.setSelected(false);
                jToggleButton10.setSelected(false);
                jToggleButton11.setSelected(false);
                break;
            case "2":
                jToggleButton8.setSelected(false);
                jToggleButton9.setSelected(true);
                jToggleButton10.setSelected(false);
                jToggleButton11.setSelected(false);
                break;
            case "3":
                jToggleButton8.setSelected(false);
                jToggleButton9.setSelected(false);
                jToggleButton10.setSelected(true);
                jToggleButton11.setSelected(false);
                break;
            case "4":
                jToggleButton8.setSelected(false);
                jToggleButton9.setSelected(false);
                jToggleButton10.setSelected(false);
                jToggleButton11.setSelected(true);
                break;
            default:
                break;
        }
        
        switch(sem){
            case "1":
                jToggleButton13.setSelected(true);
                jToggleButton14.setSelected(false);
                break;
            case "2":
                jToggleButton13.setSelected(false);
                jToggleButton14.setSelected(true);
            default:
                break;
        }
        
        jTextField6.setText(id);
        jTextField3.setText(code);
        jTextField4.setText(examRes);
        jTextField5.setText(assNo);
        jTextField7.setText(assRes);
        
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        try {
            TeacherDetails tdObj = new TeacherDetails();
            if (jToggleButton12.isSelected()) {
                tdObj.setPost("Lecturer");
            } else if (jToggleButton15.isSelected()) {
                tdObj.setPost("Instuctor");
            }
            tdObj.setName(jTextField10.getText());
            tdObj.setSubject(jTextField11.getText());
            boolean result = dbOps.addLecturer(tdObj);
            if (result) {
                JOptionPane.showMessageDialog(this, "Successfully Inserted");
            } else {
                JOptionPane.showMessageDialog(this, "Error Occured in Detail Insertion");
            }
            jToggleButton12.setSelected(false);
            jToggleButton15.setSelected(false);
            jTextField10.setText("");
            jTextField11.setText("");
            
            teacherTableLoad();
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
        // TODO add your handling code here:
        jToggleButton12.setSelected(false);
    }//GEN-LAST:event_jToggleButton15ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        
        int r = jTable4.getSelectedRow();
        
        String post = jTable4.getValueAt(r,0).toString();
        String name = jTable4.getValueAt(r,1).toString();
        String subject = jTable4.getValueAt(r,2).toString();
        
        switch(post){
            case "Lecturer":
                jToggleButton12.setSelected(true);
                jToggleButton15.setSelected(false);
                break;
                
            case "Instructor":
                jToggleButton12.setSelected(false);
                jToggleButton15.setSelected(true);
                break;
                
            default:
                break;
        }
        
        jTextField10.setText(name);
        jTextField11.setText(subject);
        
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        try {
            // TODO add your handling code here:
            String id = jTextField8.getText();//search word
            rs = dbOps.searchGrade(id);
            
            jTable3.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        String id = jTextField9.getText();
        int x = jTabbedPane1.getSelectedIndex();
        
        if (x == 0) {
            try {
                rs = dbOps.searchStudent(id);
                
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                rs = dbOps.searchSubject(id);
                
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // Updating Student details by changing the values of the table 
        
        int r = jTable1.getSelectedRow();
        
        String reg_id = jTable1.getValueAt(r,0).toString();
        String f_name = jTable1.getValueAt(r,1).toString();
        String ini_name  = jTable1.getValueAt(r,2).toString();
        String gender = jTable1.getValueAt(r,3).toString();
        String address = jTable1.getValueAt(r,4).toString();
        String phone_num = jTable1.getValueAt(r,5).toString();
        String email = jTable1.getValueAt(r,6).toString();
        String result = jTable1.getValueAt(r,7).toString();
        String rank = jTable1.getValueAt(r,8).toString();
        
        String query = "UPDATE student_details SET f_name = '"+ f_name +"' , ini_name = '"+ ini_name +"' , gender = '"+ gender +"' , address = '"+ address +"' , phone_num = '"+ phone_num +"' , email = '"+ email +"', result = '"+ result +"' , rank = '"+ rank +"' WHERE reg_id = '"+ reg_id +"' ";
        
        dbOps.updateQuery(query);
        
        studentTableLoad();
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        int r = jTable2.getSelectedRow();
        
        String reg_id = jTable2.getValueAt(r,0).toString();
        String year = jTable2.getValueAt(r,1).toString();
        String semester  = jTable2.getValueAt(r,2).toString();
        String subject = jTable2.getValueAt(r,3).toString();
        
        String query = "UPDATE select_subjects SET year = '"+ year +"' , semester = '"+ semester +"' , subject = '"+ subject +"' WHERE reg_id = '"+ reg_id +"' ";
        
        dbOps.updateQuery(query);
        
        subjectTableLoad();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        String year = null, semester = null;
        if(jToggleButton8.isSelected()){
                  year = "1";
            }else if(jToggleButton9.isSelected()){
                  year = "2";
            }else if(jToggleButton10.isSelected()){
                  year = "3";
            }else if(jToggleButton11.isSelected()){
            }
            
            if(jToggleButton13.isSelected()){
                  semester = "1";
            }else if(jToggleButton14.isSelected()){
                  semester = "2";
            }
            
            String reg_id = jTextField6.getText();
            String subject_code  =jTextField3.getText();
            String exam_result = jTextField7.getText();
            String ass_no = jTextField4.getText();
            String ass_result = jTextField5.getText();
            
            
            String query = "UPDATE student_grading SET year = '"+ year +"' , semester = '"+ semester +"' , subject_code = '"+ subject_code +"' , exam_result = '"+ exam_result +"' , ass_no = '"+ ass_no +"' , ass_result = '"+ ass_result +"' WHERE reg_id = '"+ reg_id +"' ";
            
            dbOps.updateQuery(query);
            
            tableLoad();
            
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // DElete the selected entries from the database
        
        String id = jTextField6.getText();
        
        String query = "DELETE FROM student_grading WHERE reg_id = '"+ id +"'";
        
        dbOps.updateQuery(query);
            
        tableLoad();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        /*
        // Recipient's email ID needs to be mentioned.
      String to = "ku.tharindu@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "700view@gmail.com";

      // Assuming you are sending email from localhost
      String host = "localhost";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.setProperty("mail.smtp.host", host);

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties);

      try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("This is the Subject Line!");

         // Now set the actual message
         message.setText("This is actual message");

         // Send message
         Transport.send(message);
         JOptionPane.showMessageDialog(this, "Email send successful");
      } catch (MessagingException mex) {
         //mex.printStackTrace();
         JOptionPane.showMessageDialog(this, "Something went wrong email send unsuccessful");
          System.out.println(mex);
      } */
    
        try{
            String host ="smtp.gmail.com" ;
            String user = "700view@gmail.com";
            String pass = "hambuger";
            String to = "ku.tharindu@gmail.com";
            String from = "700view@gmail.com";
            String subject = "sample message from java";
            String messageText = "Your Is Test Email :";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

           Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           System.out.println("message send successfully");
        }catch(MessagingException ex)
        {
            System.out.println(ex);
        }

    


        
    }//GEN-LAST:event_jButton21ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel classShedule;
    private javax.swing.JPanel dashBoard;
    private javax.swing.JPanel enrolment;
    private javax.swing.JPanel grading;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JPanel student;
    private javax.swing.JPanel teacher;
    // End of variables declaration//GEN-END:variables

    private void setPannel() {
        dashBoard.setVisible(false);
        enrolment.setVisible(false);
        grading.setVisible(false);
        student.setVisible(false);
        teacher.setVisible(false);
        classShedule.setVisible(false);
    }

    void adName(String uName) {
        try{
            DBOperations dbOps = new DBOperations();

            String name = dbOps.adminName(uName);
            jLabel15.setText(name);

        }
        catch(SQLException ex){
            System.out.println("Exeption");
        }
    }
}
