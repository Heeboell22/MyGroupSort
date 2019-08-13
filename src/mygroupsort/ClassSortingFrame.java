package mygroupsort;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import mygroupsort.MyGroupSort;
import com.mysql.jdbc.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;

public class ClassSortingFrame extends javax.swing.JFrame implements ActionListener {

    Connection con;
    DefaultListModel dm = new DefaultListModel();

    public ClassSortingFrame() {
        initComponents();
    }

    //Add to list method:
    private void add(String student_name) {
        ListOfAllStudents.setModel(dm);
        dm.addElement(student_name);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jColorChooser1 = new javax.swing.JColorChooser();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        GroupSizeBox = new javax.swing.JComboBox<>();
        SortStudentButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputClassName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inputSubjectName = new javax.swing.JTextField();
        AddClassName = new javax.swing.JButton();
        AddSubjectName = new javax.swing.JButton();
        Instruction1ClassSubject = new javax.swing.JLabel();
        jComboBoxClassName = new javax.swing.JComboBox<>();
        jComboBoxSubjectName = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        DevideStudent1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        DevideStudent2 = new javax.swing.JComboBox<>();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        PairStudent1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        PairStudent2 = new javax.swing.JComboBox<>();
        jToggleButton3 = new javax.swing.JToggleButton();
        jButton8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        inputStudentName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        AddStudent = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListOfAllStudents = new javax.swing.JList<>();
        Instruction2Students = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ProgramTitle = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Group size:");

        GroupSizeBox.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        GroupSizeBox.setForeground(new java.awt.Color(0, 0, 102));
        GroupSizeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));
        GroupSizeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupSizeBoxActionPerformed(evt);
            }
        });

        SortStudentButton.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        SortStudentButton.setForeground(new java.awt.Color(0, 51, 153));
        SortStudentButton.setText("Sort Students");
        SortStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortStudentButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel13.setText("4. Select group size here, and press 'sort Students'  - done");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GroupSizeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(SortStudentButton)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GroupSizeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(SortStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Class:");

        inputClassName.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        inputClassName.setForeground(new java.awt.Color(0, 51, 153));
        inputClassName.setText("...");
        inputClassName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClassNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Subject name:");

        inputSubjectName.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        inputSubjectName.setForeground(new java.awt.Color(0, 0, 153));
        inputSubjectName.setText("...");
        inputSubjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSubjectNameActionPerformed(evt);
            }
        });

        AddClassName.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        AddClassName.setForeground(new java.awt.Color(0, 51, 153));
        AddClassName.setText("+ Add Class");
        AddClassName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassNameActionPerformed(evt);
            }
        });

        AddSubjectName.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        AddSubjectName.setForeground(new java.awt.Color(0, 51, 153));
        AddSubjectName.setText("+Add Subject");
        AddSubjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubjectNameActionPerformed(evt);
            }
        });

        Instruction1ClassSubject.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Instruction1ClassSubject.setText("1. Enter the name of the class and their subject here:");

        jComboBoxClassName.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jComboBoxClassName.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jComboBoxClassNameComponentShown(evt);
            }
        });
        jComboBoxClassName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClassNameActionPerformed(evt);
            }
        });

        jComboBoxSubjectName.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jComboBoxSubjectName.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jComboBoxSubjectNameComponentShown(evt);
            }
        });
        jComboBoxSubjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSubjectNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Instruction1ClassSubject)
                .addGap(0, 784, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxClassName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputClassName, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddClassName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxSubjectName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputSubjectName, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddSubjectName)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Instruction1ClassSubject)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(inputSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddClassName)
                    .addComponent(AddSubjectName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("DO NOT put these students in the same group:");

        DevideStudent1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        DevideStudent1.setForeground(new java.awt.Color(0, 0, 153));
        DevideStudent1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student name" }));
        DevideStudent1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                DevideStudent1ComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                DevideStudent1ComponentRemoved(evt);
            }
        });
        DevideStudent1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DevideStudent1MouseClicked(evt);
            }
        });
        DevideStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevideStudent1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("AND");

        DevideStudent2.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        DevideStudent2.setForeground(new java.awt.Color(0, 0, 153));
        DevideStudent2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student name" }));
        DevideStudent2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                DevideStudent2ComponentAdded(evt);
            }
        });
        DevideStudent2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DevideStudent2MouseClicked(evt);
            }
        });
        DevideStudent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevideStudent2ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(51, 255, 51));
        jToggleButton2.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(0, 0, 153));
        jToggleButton2.setText("on/off");

        jButton6.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 153));
        jButton6.setText("+ Add division");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Make sure these students are in the SAME group:");

        PairStudent1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        PairStudent1.setForeground(new java.awt.Color(0, 0, 153));
        PairStudent1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student name" }));
        PairStudent1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                PairStudent1ComponentAdded(evt);
            }
        });
        PairStudent1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PairStudent1MouseClicked(evt);
            }
        });
        PairStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PairStudent1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("AND");

        PairStudent2.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        PairStudent2.setForeground(new java.awt.Color(0, 0, 153));
        PairStudent2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student name" }));
        PairStudent2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                PairStudent2ComponentAdded(evt);
            }
        });
        PairStudent2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PairStudent2MouseClicked(evt);
            }
        });
        PairStudent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PairStudent2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(102, 255, 51));
        jToggleButton3.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(0, 0, 153));
        jToggleButton3.setText("on/off");

        jButton8.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 153));
        jButton8.setText("+ Add pairing");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel12.setText("3. Create rules for your sorting here:");

        jList2.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jList3.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(DevideStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DevideStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(PairStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PairStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8))))
                    .addComponent(jLabel12))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(DevideStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2)
                    .addComponent(DevideStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PairStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(PairStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Students");

        inputStudentName.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        inputStudentName.setForeground(new java.awt.Color(0, 51, 153));
        inputStudentName.setText("...");
        inputStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputStudentNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Present");

        jToggleButton1.setBackground(new java.awt.Color(0, 255, 51));
        jToggleButton1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 0, 153));
        jToggleButton1.setText("Yes/No");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        AddStudent.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        AddStudent.setForeground(new java.awt.Color(0, 0, 153));
        AddStudent.setText("+ Add Student");
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 153));
        jButton5.setText("Delete Class");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("Save Class");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ListOfAllStudents.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        ListOfAllStudents.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Student" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListOfAllStudents.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ListOfAllStudentsAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ListOfAllStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListOfAllStudentsMouseClicked(evt);
            }
        });
        ListOfAllStudents.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ListOfAllStudentsInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListOfAllStudents);
        ListOfAllStudents.getAccessibleContext().setAccessibleName(getName());

        Instruction2Students.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Instruction2Students.setText("2. Enter the student names here. - To alter or delete right-click on the name ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Instruction2Students)
                .addGap(0, 71, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(inputStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(AddStudent)))
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Instruction2Students)
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(inputStudentName)
                    .addComponent(AddStudent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addGap(21, 21, 21))
        );

        ProgramTitle.setFont(new java.awt.Font("Arial Narrow", 1, 40)); // NOI18N
        ProgramTitle.setForeground(new java.awt.Color(0, 0, 153));
        ProgramTitle.setText("GroupSort");

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 3, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("“Make it easy to get your students into the right groups”");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(589, 589, 589)
                .addComponent(ProgramTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(395, 395, 395))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ProgramTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputClassNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClassNameActionPerformed
        // try {

        String Class = inputClassName.getText();
        /*Statement stmt = con.createStatement();
           String dbop = ("INSERT INTO STUDENTS VALUES ('" + Class +"')");
           stmt.execute(dbop);
           stmt.close();
           
       } catch (SQLException ex) {
           Logger.getLogger(ClassSortingFrame.class.getName()).log(Level.SEVERE, null, ex);
       } */
    }//GEN-LAST:event_inputClassNameActionPerformed

    private void inputStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputStudentNameActionPerformed

    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed

        //try {
        String student_name = inputStudentName.getText();
        System.out.println(student_name);
        //AllStudentsInClass.addItem(student_name);
        DevideStudent1.addItem(student_name);
        DevideStudent2.addItem(student_name);
        PairStudent1.addItem(student_name);
        PairStudent2.addItem(student_name);
        add(inputStudentName.getText());
        inputStudentName.setText("");
        // ListOfAllStudents.setModel(ListOfAllStudents);

        /*Statement stmt = con.createStatement();
           String dbop = ("INSERT INTO STUDENTS VALUES ('" + student_name +"')");
           stmt.execute(dbop);
           stmt.close();
           
       } /*catch (SQLException ex) {
           Logger.getLogger(ClassSortingFrame.class.getName()).log(Level.SEVERE, null, ex);
       } */
    }//GEN-LAST:event_AddStudentActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        //Set student to 'not present'....
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void SortStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortStudentButtonActionPerformed
      int selectedGroupSize = (int)GroupSizeBox.getSelectedItem();
      //GroupGeneratorConfiguration config = new GroupGeneratorConfiguration(selectedGroupSize);
    }//GEN-LAST:event_SortStudentButtonActionPerformed

    private void DevideStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevideStudent1ActionPerformed
        String Students = inputStudentName.getText();
        DevideStudent1.addItem(Students);
    }//GEN-LAST:event_DevideStudent1ActionPerformed

    private void DevideStudent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevideStudent2ActionPerformed
        String Students = inputStudentName.getText();
        DevideStudent2.addItem(Students);
    }//GEN-LAST:event_DevideStudent2ActionPerformed

    private void PairStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PairStudent1ActionPerformed
        String Students = inputStudentName.getText();
        PairStudent1.addItem(Students);
    }//GEN-LAST:event_PairStudent1ActionPerformed

    private void PairStudent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PairStudent2ActionPerformed
        String Students = inputStudentName.getText();
        PairStudent2.addItem(Students);
    }//GEN-LAST:event_PairStudent2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void inputSubjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSubjectNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_inputSubjectNameActionPerformed

    private void DevideStudent1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_DevideStudent1ComponentAdded
        String Students = inputStudentName.getText();
    }//GEN-LAST:event_DevideStudent1ComponentAdded

    private void AddClassNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassNameActionPerformed
        String Class_name = inputClassName.getText();
        System.out.println(Class_name);
        jComboBoxClassName.addItem(Class_name);
        inputClassName.setText(""); 
        
    }//GEN-LAST:event_AddClassNameActionPerformed

    public void addClassesToClassNameBox(List<String> Classes){
        for(String s : Classes){
            jComboBoxClassName.addItem(s);
        }
    }
    
    private void AddSubjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubjectNameActionPerformed
        String subject_name = inputSubjectName.getText();
        System.out.println(subject_name);
        jComboBoxSubjectName.addItem(subject_name);
        inputSubjectName.setText(""); 
        
    }//GEN-LAST:event_AddSubjectNameActionPerformed

    public void addSubjecsToSubjectNameBox(List<String> Subjects){
        for(String s : Subjects){
            jComboBoxSubjectName.addItem(s);
        }
    }
    
    private void DevideStudent1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_DevideStudent1ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_DevideStudent1ComponentRemoved

    private void DevideStudent2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_DevideStudent2ComponentAdded
        String Students = inputStudentName.getText();
        DevideStudent2.addItem(Students);
    }//GEN-LAST:event_DevideStudent2ComponentAdded

    private void PairStudent1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_PairStudent1ComponentAdded
        String Students = inputStudentName.getText();
        PairStudent1.addItem(Students);
    }//GEN-LAST:event_PairStudent1ComponentAdded

    private void PairStudent2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_PairStudent2ComponentAdded
        String Students = inputStudentName.getText();
        PairStudent2.addItem(Students);
    }//GEN-LAST:event_PairStudent2ComponentAdded

    private void ListOfAllStudentsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListOfAllStudentsAncestorAdded

        // TODO add your handling code here:
    }//GEN-LAST:event_ListOfAllStudentsAncestorAdded

    private void ListOfAllStudentsInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ListOfAllStudentsInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ListOfAllStudentsInputMethodTextChanged

    private void ListOfAllStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListOfAllStudentsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ListOfAllStudentsMouseClicked

    private void DevideStudent1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevideStudent1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DevideStudent1MouseClicked

    private void DevideStudent2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevideStudent2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DevideStudent2MouseClicked

    private void PairStudent1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PairStudent1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PairStudent1MouseClicked

    private void PairStudent2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PairStudent2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PairStudent2MouseClicked

    private void jComboBoxClassNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClassNameActionPerformed
        System.out.println("Class Chosen: " + jComboBoxClassName.getSelectedItem());
        ListOfAllStudents.removeAll();
    }//GEN-LAST:event_jComboBoxClassNameActionPerformed

    private void GroupSizeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupSizeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GroupSizeBoxActionPerformed

    private void jComboBoxSubjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSubjectNameActionPerformed
        // TODO add your handling code here:
       System.out.println("Subject Chosen: " + jComboBoxSubjectName.getSelectedItem());
        ListOfAllStudents.removeAll();
    }//GEN-LAST:event_jComboBoxSubjectNameActionPerformed

    private void jComboBoxSubjectNameComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBoxSubjectNameComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSubjectNameComponentShown

    private void jComboBoxClassNameComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBoxClassNameComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClassNameComponentShown

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
            java.util.logging.Logger.getLogger(ClassSortingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassSortingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassSortingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassSortingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassSortingFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClassName;
    private javax.swing.JButton AddStudent;
    private javax.swing.JButton AddSubjectName;
    private javax.swing.JComboBox<String> DevideStudent1;
    private javax.swing.JComboBox<String> DevideStudent2;
    private javax.swing.JComboBox<String> GroupSizeBox;
    private javax.swing.JLabel Instruction1ClassSubject;
    private javax.swing.JLabel Instruction2Students;
    private javax.swing.JList<String> ListOfAllStudents;
    private javax.swing.JComboBox<String> PairStudent1;
    private javax.swing.JComboBox<String> PairStudent2;
    private javax.swing.JLabel ProgramTitle;
    private javax.swing.JButton SortStudentButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField inputClassName;
    private javax.swing.JTextField inputStudentName;
    private javax.swing.JTextField inputSubjectName;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBoxClassName;
    private javax.swing.JComboBox<String> jComboBoxSubjectName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables

    private void getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
