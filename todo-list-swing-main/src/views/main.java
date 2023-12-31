package views;

import entities.Category;
import entities.Task;
import entities.User;

import dao.CategoryDAO;
import dao.TaskDAO;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {

    CategoryDAO cat_dao = new CategoryDAO();
    TaskDAO task_dao = new TaskDAO();
    Category cat = new Category();
    Task task = new Task();
    User user = new User();

    public main() {
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

        cb_priority = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_task = new javax.swing.JTextField();
        btn_addTask = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tb_tasks = new javax.swing.JTable();
        btn_deleteTask = new javax.swing.JButton();
        btn_updateTask = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_catAdd = new javax.swing.JTextField();
        btn_catAdd = new javax.swing.JButton();
        btn_catDel = new javax.swing.JButton();
        btn_catEdit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_category = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        subMenu_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        subMenu_about = new javax.swing.JMenuItem();

        cb_priority.setEditable(true);
        cb_priority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VERY HIGH", "High", "Medium", "Low", "Very low" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("To Do List");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tarefa"));

        txt_task.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_taskKeyPressed(evt);
            }
        });

        btn_addTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        btn_addTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_task)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_addTask, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_addTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_task, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel1.setText("To Do List");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lista de Tarefas"));

        jScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tb_tasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Done", "Desc", "Priority", "Due Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_tasks.setRequestFocusEnabled(false);
        tb_tasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tasksMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tb_tasks);
        if (tb_tasks.getColumnModel().getColumnCount() > 0) {
            tb_tasks.getColumnModel().getColumn(2).setCellEditor(new javax.swing.DefaultCellEditor(cb_priority));
        }

        btn_deleteTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/recycle-bin.png"))); // NOI18N
        btn_deleteTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteTaskActionPerformed(evt);
            }
        });

        btn_updateTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/note.png"))); // NOI18N
        btn_updateTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_updateTask, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(btn_deleteTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_updateTask, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_deleteTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        btn_exit.setText(" FECHAR");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Linux Biolinum G", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Categorias");

        txt_catAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_catAddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_catAddFocusLost(evt);
            }
        });
        txt_catAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_catAddKeyPressed(evt);
            }
        });

        btn_catAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        btn_catAdd.setText("ADD");
        btn_catAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_catAddActionPerformed(evt);
            }
        });

        btn_catDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        btn_catDel.setText("DELETAR");
        btn_catDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_catDelActionPerformed(evt);
            }
        });

        btn_catEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        btn_catEdit.setText("EDITAR");
        btn_catEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_catEditActionPerformed(evt);
            }
        });

        tb_category.setBackground(new java.awt.Color(240, 240, 240));
        tb_category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tb_category.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_category.setGridColor(new java.awt.Color(240, 240, 240));
        tb_category.setMinimumSize(new java.awt.Dimension(20, 0));
        tb_category.setRowHeight(30);
        tb_category.setRowMargin(5);
        tb_category.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tb_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_categoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_category);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_catAdd)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_catAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_catEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_catDel)))))
                .addGap(7, 7, 7))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txt_catAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_catAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_catDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_catEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jMenu1.setText("Arquivo");

        subMenu_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        subMenu_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sbClose.png"))); // NOI18N
        subMenu_exit.setText(" Sair");
        subMenu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenu_exitActionPerformed(evt);
            }
        });
        jMenu1.add(subMenu_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Perfil");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sbUser.png"))); // NOI18N
        jMenuItem1.setText("Perfil");
        jMenuItem1.setEnabled(false);
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");

        subMenu_about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        subMenu_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sbNote.png"))); // NOI18N
        subMenu_about.setText("Sobre");
        subMenu_about.setEnabled(false);
        jMenu3.add(subMenu_about);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void taskSetDefaultValues() {
        task.setDescr(txt_task.getText().strip());
        task.setDone(false);
        task.setPriority("Select here");
        task.setDueDate("Never");
        task.setFk_cat_id(cat.getCat_id());
    }

    private void btn_addTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addTaskActionPerformed
        if (cat.getCat_name() == null){
            JOptionPane.showMessageDialog(rootPane, "Por favor, selecione uma categoria.", "Categoria não selecionada", JOptionPane.ERROR_MESSAGE);
            
        } else if (txt_task.getText().strip().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Por favor, digite o nome da tarefa.", "Tarefa sem nome", JOptionPane.ERROR_MESSAGE);
            
        }else{           
            Object[] options = {"Sim", "Não"};
            int answer = JOptionPane.showOptionDialog(null, "Deseja adicionar tarefa na categoria '" + cat.getCat_name() + "' ?", "Adicionar tarefa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (answer == JOptionPane.YES_OPTION) {

                taskSetDefaultValues();
                task_dao.insertTask(task);
                task_dao.ReadTasks(tb_tasks, task);
            }
        }
    }//GEN-LAST:event_btn_addTaskActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        LogIn login = new LogIn(this, rootPaneCheckingEnabled);
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_deleteTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteTaskActionPerformed
        int row = tb_tasks.getSelectedRow();
        if (row >= 0) {
            
            task_dao.deleteTask(task);
            task_dao.ReadTasks(tb_tasks, task);
        
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor, Selecione uma categoria.", "Nenhum item selecionado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_deleteTaskActionPerformed

    private void btn_catDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_catDelActionPerformed
        int row = tb_category.getSelectedRow();
        if (row >= 0) {

            Object[] options = {"Sim", "Não"};
            int answer = JOptionPane.showOptionDialog(null, "Tem certeza que deseja deletar a categoria '" + cat.getCat_name() + "' ?", "Deletar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (answer == JOptionPane.YES_OPTION) {

                cat_dao.ReadCatIDWhereName(cat);
                cat_dao.deleteCat(cat);
                cat_dao.ReadCat(tb_category, cat);
                
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor, Selecione uma categoria.", "Nenhum item selecionado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_catDelActionPerformed

    private void tb_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_categoryMouseClicked
        int row = tb_category.getSelectedRow();
        if (row >= 0) {

            cat.setCat_name(tb_category.getModel().getValueAt(row, 0).toString());
            txt_catAdd.setText(cat.getCat_name());
            txt_catAdd.setForeground(Color.gray);

            cat_dao.ReadCatIDWhereName(cat);
            task.setFk_cat_id(cat.getCat_id());
            task_dao.ReadTasks(tb_tasks, task);
        }
    }//GEN-LAST:event_tb_categoryMouseClicked

    private void subMenu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenu_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_subMenu_exitActionPerformed

    private void btn_catEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_catEditActionPerformed
        int row = tb_category.getSelectedRow();
        if (row >= 0) {

            Object[] options = {"Sim", "Não"};
            int answer = JOptionPane.showOptionDialog(rootPane, "Tem certeza que deseja editar esta categoria '" + cat.getCat_name() + "' ?", "Deletar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (answer == JOptionPane.YES_OPTION) {

                cat_dao.ReadCatIDWhereName(cat);
                cat.setCat_name(txt_catAdd.getText().strip());
                cat_dao.UpdateCat(cat);
                cat_dao.ReadCat(tb_category, cat);
                
            }
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor, Selecione uma categoria.", "Nenhum item selecionado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_catEditActionPerformed

    private void txt_catAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_catAddFocusGained
        txt_catAdd.setForeground(Color.black);
    }//GEN-LAST:event_txt_catAddFocusGained

    private void txt_catAddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_catAddFocusLost
        txt_catAdd.setForeground(Color.gray);
    }//GEN-LAST:event_txt_catAddFocusLost

    private void txt_taskKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_taskKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { btn_addTask.doClick(); }
    }//GEN-LAST:event_txt_taskKeyPressed

    private void btn_updateTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateTaskActionPerformed
        int row = tb_tasks.getSelectedRow();

        if (row >= 0) {

            task_dao.ReadTaskIDWhereName(task);

            Object[] options = {"Sim", "Não"};
            int answer = JOptionPane.showOptionDialog(null, "Deseja alterar a tarefa '" + task.getDescr() + "' ?", "Alterar tarefa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (answer == JOptionPane.YES_OPTION) {
                                                                            
                //enviando dados atualizados
                task_dao.UpdateTask(task);
                task_dao.ReadTasks(tb_tasks, task);
            }
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor, Selecione uma categoria.", "Nenhum item selecionado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_updateTaskActionPerformed

    private void tb_tasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tasksMouseClicked
        int row = tb_tasks.getSelectedRow();
        
        if (row >= 0) {
            
            //Capturando valores           
            task.setDone(Boolean.valueOf(tb_tasks.getModel().getValueAt(row, 0).toString()));
            task.setDescr(String.valueOf(tb_tasks.getValueAt(row, 1)));
            task.setPriority(String.valueOf(tb_tasks.getValueAt(row, 2)));
            task.setDueDate(String.valueOf(tb_tasks.getValueAt(row, 3)));                                  
            
            task_dao.ReadTaskIDWhereName(task);
        }        
    }//GEN-LAST:event_tb_tasksMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txt_task.requestFocus();

        cat.setFk_User(user.getId());
        cat_dao.ReadCat(tb_category, cat);

        //Lendo a primeira categoria para aparecer as tasks na inicializacao
        cat_dao.ReadFirstCatID(cat, task);              
        task_dao.ReadTasks(tb_tasks, task);

        cb_priority.getEditor().getEditorComponent().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                cb_priority.showPopup();
            }
        });

    }//GEN-LAST:event_formWindowOpened

    private void btn_catAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_catAddActionPerformed
        if (txt_catAdd.getText().strip().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, digite um nome.", "Categoria sem nome", JOptionPane.ERROR_MESSAGE);

        } else {
            cat.setCat_name(txt_catAdd.getText().strip());
            cat_dao.saveCategory(cat);
            cat_dao.ReadCat(tb_category, cat);
        }
    }//GEN-LAST:event_btn_catAddActionPerformed

    private void txt_catAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_catAddKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { btn_catAdd.doClick(); }
    }//GEN-LAST:event_txt_catAddKeyPressed

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
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addTask;
    private javax.swing.JButton btn_catAdd;
    private javax.swing.JButton btn_catDel;
    private javax.swing.JButton btn_catEdit;
    private javax.swing.JButton btn_deleteTask;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_updateTask;
    private javax.swing.JComboBox<String> cb_priority;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem subMenu_about;
    private javax.swing.JMenuItem subMenu_exit;
    private javax.swing.JTable tb_category;
    private javax.swing.JTable tb_tasks;
    private javax.swing.JTextField txt_catAdd;
    private javax.swing.JTextField txt_task;
    // End of variables declaration//GEN-END:variables
}
