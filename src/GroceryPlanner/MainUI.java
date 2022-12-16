
package GroceryPlanner;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


/**
 *
 * @author Saleh
 */

public class MainUI extends javax.swing.JFrame {
    
    private final DB dbobj;
    private final DefaultTableModel table;
    private final JTableHeader th;
    private final TableTextAlignment align;
    private final ImageIcon appIcon;
    
    private String name, cat;
    private int amount;
    private double price, tPrice;

    
    public MainUI() {
        initComponents();
        
        dbobj = new DB();
        appIcon = new ImageIcon(getClass().getResource("appicon.png"));
        this.setIconImage(appIcon.getImage());
        table = (DefaultTableModel) itemsTable.getModel();
        align = new TableTextAlignment();
        alignColText();
        th=itemsTable.getTableHeader();
        th.setFont(new Font("Arial",Font.BOLD, 14));
        th.setBackground(new Color(213,213,251));
        th.setForeground(new Color(44,44,84));

        dbobj.Retrive(table);
        
        /*this.addWindowListener (new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dbobj.TruncateTable();
                e.getWindow().dispose();
            }
        }); */
    }
    
    private void clickedRow(){
        itemNameTF.setText((table.getValueAt(itemsTable.getSelectedRow(), 1)).toString());
        itemCategoryDRPL.setSelectedItem(" "+(table.getValueAt(itemsTable.getSelectedRow(), 2)).toString());
        itemAmountDRPL.setSelectedItem(" "+(table.getValueAt(itemsTable.getSelectedRow(), 3)).toString());
        itemPricePerAmountTF.setText((table.getValueAt(itemsTable.getSelectedRow(), 4)).toString());
        itemNameTF.setEditable(false);
        itemCategoryDRPL.setEnabled(false);
    }
    
    private void resetValues(){
        itemNameTF.setText("");
        itemCategoryDRPL.setSelectedIndex(0);
        itemAmountDRPL.setSelectedIndex(0);
        itemPricePerAmountTF.setText("");
        price=0.0;
        tPrice=0.0;
        itemNameTF.setEditable(true);
        itemCategoryDRPL.setEnabled(true);
    }
    
    private void alignColText(){
        for(int i=0; i<table.getColumnCount(); i++){
            itemsTable.getColumnModel().getColumn(i).setCellRenderer(align);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        sideBarPanel = new javax.swing.JPanel();
        itemNameTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        itemCategoryDRPL = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        itemAmountDRPL = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        itemPricePerAmountTF = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        totalCostBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grocery planner");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setResizable(false);

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setMaximumSize(new java.awt.Dimension(1000, 650));
        BackGround.setMinimumSize(new java.awt.Dimension(1000, 650));

        titlePanel.setBackground(new java.awt.Color(112, 111, 211));
        titlePanel.setMaximumSize(new java.awt.Dimension(1000, 80));
        titlePanel.setMinimumSize(new java.awt.Dimension(1000, 80));
        titlePanel.setPreferredSize(new java.awt.Dimension(1000, 80));

        titleLabel.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryPlanner/icons/icons8_shopping_cart_28px.png"))); // NOI18N
        titleLabel.setText("Grocery planner");
        titleLabel.setIconTextGap(20);
        titleLabel.setMaximumSize(new java.awt.Dimension(1000, 35));
        titleLabel.setMinimumSize(new java.awt.Dimension(1000, 35));
        titleLabel.setPreferredSize(new java.awt.Dimension(1000, 35));

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        sideBarPanel.setBackground(new java.awt.Color(213, 213, 251));
        sideBarPanel.setMaximumSize(new java.awt.Dimension(400, 570));
        sideBarPanel.setMinimumSize(new java.awt.Dimension(400, 570));
        sideBarPanel.setPreferredSize(new java.awt.Dimension(400, 570));

        itemNameTF.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemNameTF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        itemNameTF.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 111, 211), 2), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        itemNameTF.setMaximumSize(new java.awt.Dimension(69, 40));
        itemNameTF.setMinimumSize(new java.awt.Dimension(69, 40));
        itemNameTF.setPreferredSize(new java.awt.Dimension(69, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 82, 155));
        jLabel1.setText("Item name");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(83, 82, 155));
        jLabel2.setText("Category");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        itemCategoryDRPL.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemCategoryDRPL.setMaximumRowCount(6);
        itemCategoryDRPL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Vegetable", " Rice", " Bread", " Pasta", " Oil", " Fruit", " Meat", " Fish", " Dry food", " Dairy", " Drinks", " Liquid", " Household", " Health and beauty", " Frozen Food", " Toiletries", " Other" }));
        itemCategoryDRPL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 111, 211)));
        itemCategoryDRPL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemCategoryDRPL.setMaximumSize(new java.awt.Dimension(69, 40));
        itemCategoryDRPL.setMinimumSize(new java.awt.Dimension(69, 40));
        itemCategoryDRPL.setPreferredSize(new java.awt.Dimension(69, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(83, 82, 155));
        jLabel3.setText("Amount (unit)");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        itemAmountDRPL.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemAmountDRPL.setMaximumRowCount(6);
        itemAmountDRPL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", " 10", " 11", " 12", " 13", " 14", " 15", " 16", " 17", " 18", " 19", " 20" }));
        itemAmountDRPL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 111, 211)));
        itemAmountDRPL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemAmountDRPL.setMaximumSize(new java.awt.Dimension(69, 40));
        itemAmountDRPL.setMinimumSize(new java.awt.Dimension(69, 40));
        itemAmountDRPL.setPreferredSize(new java.awt.Dimension(69, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(83, 82, 155));
        jLabel4.setText("Price/Amount");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        itemPricePerAmountTF.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemPricePerAmountTF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        itemPricePerAmountTF.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 111, 211), 2), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        itemPricePerAmountTF.setMaximumSize(new java.awt.Dimension(69, 40));
        itemPricePerAmountTF.setMinimumSize(new java.awt.Dimension(69, 40));
        itemPricePerAmountTF.setPreferredSize(new java.awt.Dimension(69, 40));

        addBTN.setBackground(new java.awt.Color(112, 111, 211));
        addBTN.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        addBTN.setForeground(new java.awt.Color(255, 255, 255));
        addBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryPlanner/icons/icons8_add_28px_1.png"))); // NOI18N
        addBTN.setText("ADD");
        addBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 111, 211)));
        addBTN.setFocusPainted(false);
        addBTN.setIconTextGap(10);
        addBTN.setMaximumSize(new java.awt.Dimension(140, 50));
        addBTN.setMinimumSize(new java.awt.Dimension(140, 50));
        addBTN.setPreferredSize(new java.awt.Dimension(140, 50));
        addBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sideBarPanelLayout = new javax.swing.GroupLayout(sideBarPanel);
        sideBarPanel.setLayout(sideBarPanelLayout);
        sideBarPanelLayout.setHorizontalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(itemCategoryDRPL, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sideBarPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemAmountDRPL, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemPricePerAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(itemNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemCategoryDRPL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemAmountDRPL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemPricePerAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 111, 211), 2));

        itemsTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Item name", "Category", "Amount", "Price/Amount", "Total price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemsTable.setFocusable(false);
        itemsTable.setGridColor(new java.awt.Color(181, 180, 232));
        itemsTable.setIntercellSpacing(new java.awt.Dimension(2, 2));
        itemsTable.setMaximumSize(new java.awt.Dimension(405, 60));
        itemsTable.setMinimumSize(new java.awt.Dimension(405, 60));
        itemsTable.setRowHeight(40);
        itemsTable.setSelectionBackground(new java.awt.Color(220, 220, 243));
        itemsTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        itemsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        itemsTable.getTableHeader().setReorderingAllowed(false);
        itemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemsTable);
        if (itemsTable.getColumnModel().getColumnCount() > 0) {
            itemsTable.getColumnModel().getColumn(0).setResizable(false);
            itemsTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            itemsTable.getColumnModel().getColumn(3).setResizable(false);
            itemsTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(83, 82, 155));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryPlanner/icons/icons8_bulleted_list_32px.png"))); // NOI18N
        jLabel5.setText("Item list");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jLabel5.setIconTextGap(16);

        totalCostBTN.setBackground(new java.awt.Color(135, 134, 217));
        totalCostBTN.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        totalCostBTN.setForeground(new java.awt.Color(255, 255, 255));
        totalCostBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryPlanner/icons/icons8_money_28px.png"))); // NOI18N
        totalCostBTN.setText("Total Cost");
        totalCostBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 111, 211)));
        totalCostBTN.setFocusPainted(false);
        totalCostBTN.setIconTextGap(10);
        totalCostBTN.setMaximumSize(new java.awt.Dimension(180, 40));
        totalCostBTN.setMinimumSize(new java.awt.Dimension(180, 40));
        totalCostBTN.setPreferredSize(new java.awt.Dimension(180, 40));
        totalCostBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalCostBTNMouseClicked(evt);
            }
        });

        deleteBTN.setBackground(new java.awt.Color(135, 134, 217));
        deleteBTN.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryPlanner/icons/icons8_delete_sign_28px.png"))); // NOI18N
        deleteBTN.setText("Delete");
        deleteBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 111, 211)));
        deleteBTN.setFocusPainted(false);
        deleteBTN.setIconTextGap(10);
        deleteBTN.setMaximumSize(new java.awt.Dimension(180, 40));
        deleteBTN.setMinimumSize(new java.awt.Dimension(180, 40));
        deleteBTN.setPreferredSize(new java.awt.Dimension(180, 40));
        deleteBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBTNMouseClicked(evt);
            }
        });

        updateBTN.setBackground(new java.awt.Color(135, 134, 217));
        updateBTN.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroceryPlanner/icons/icons8_update_left_rotation_28px.png"))); // NOI18N
        updateBTN.setText("Update");
        updateBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 111, 211)));
        updateBTN.setFocusPainted(false);
        updateBTN.setIconTextGap(10);
        updateBTN.setMaximumSize(new java.awt.Dimension(180, 40));
        updateBTN.setMinimumSize(new java.awt.Dimension(180, 40));
        updateBTN.setPreferredSize(new java.awt.Dimension(180, 40));
        updateBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBTNMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(83, 82, 155));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("(C)  2019, Saleh Ibne Omar");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(sideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                        .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(totalCostBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalCostBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1018, 697));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBTNMouseClicked
        
        if(itemPricePerAmountTF.getText().equals("") || itemNameTF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Some fields might be empty");
        }
        else if(!(itemPricePerAmountTF.getText().matches("[0-9/'.']+"))){
            JOptionPane.showMessageDialog(this, "Price only contains numbers!");
        }
        else if(dbobj.sameNameValidate(itemNameTF.getText().trim())){
            JOptionPane.showMessageDialog(this, "Same name conflict!");
        }
        else{
            name=itemNameTF.getText().trim();
            cat=itemCategoryDRPL.getItemAt(itemCategoryDRPL.getSelectedIndex()).trim();
            amount=Integer.parseInt(itemAmountDRPL.getItemAt(itemAmountDRPL.getSelectedIndex()).trim());
            price=Double.parseDouble(itemPricePerAmountTF.getText().replace(" ", ""));
            tPrice=((double)amount)*price;
            
            dbobj.Insert(name, cat, amount, price, tPrice);
            dbobj.Retrive(table);
            
            resetValues();
        }
    }//GEN-LAST:event_addBTNMouseClicked

    private void updateBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBTNMouseClicked
        
        try{
            String item_name = table.getValueAt(itemsTable.getSelectedRow(), 1).toString();
            int i=dbobj.getID(item_name);
            
                if(itemPricePerAmountTF.getText().equals("") || itemNameTF.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Some fields might be empty");
                }
                else if(!(itemPricePerAmountTF.getText().matches("[0-9/'.']+"))){
                    JOptionPane.showMessageDialog(this, "Price only contains numbers!");
                }
                else{
                    amount=Integer.parseInt(itemAmountDRPL.getItemAt(itemAmountDRPL.getSelectedIndex()).trim());
                    price=Double.parseDouble(itemPricePerAmountTF.getText().replace(" ", ""));
                    tPrice=((double)amount)*price;

                    dbobj.Update(amount, price, tPrice, i);
                    dbobj.Retrive(table);
                    
                    resetValues();
                }

        }
        catch(Exception e){
            if(table.getRowCount()<1){
                JOptionPane.showMessageDialog(this, "List empty!");
            }
            else{
                JOptionPane.showMessageDialog(this, "No row selected.");
            }
        }
    }//GEN-LAST:event_updateBTNMouseClicked

    private void deleteBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBTNMouseClicked
        
        try{
            String item_name = table.getValueAt(itemsTable.getSelectedRow(), 1).toString();
            dbobj.Delete(item_name);
            dbobj.Retrive(table);

            resetValues();  
        }
        catch(Exception e){
            if(table.getRowCount()<1){
                JOptionPane.showMessageDialog(this, "List empty!");
            }
            else{
                JOptionPane.showMessageDialog(this, "No row selected.");
            }
        }

    }//GEN-LAST:event_deleteBTNMouseClicked

    private void itemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsTableMouseClicked
        try{
            clickedRow();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Only works on left mouse click!");
        }
    }//GEN-LAST:event_itemsTableMouseClicked

    private void totalCostBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalCostBTNMouseClicked

        double cost=0;
        try{
            for(int i=0; i<table.getRowCount(); i++){
                String c=table.getValueAt(i, 5).toString();
                cost+=Double.parseDouble(c);
            }
            
            if(cost!=0){
                new CostUI(cost).setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "List empty!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "List empty!");
        }
   
    }//GEN-LAST:event_totalCostBTNMouseClicked

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton addBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JComboBox<String> itemAmountDRPL;
    private javax.swing.JComboBox<String> itemCategoryDRPL;
    private javax.swing.JTextField itemNameTF;
    private javax.swing.JTextField itemPricePerAmountTF;
    private javax.swing.JTable itemsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton totalCostBTN;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
