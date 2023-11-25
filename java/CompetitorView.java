
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class CompetitorView extends JFrame {

    public JTable competitorsTable;
    private JPanel panelAddNew;
    private JPanel panelEdit;
    private JPanel panelTable;
    private JButton btnSearch;
    private JButton btnUpdateScores;
    private JButton btnUpdatesDetails;

    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JLabel lblAddNewCompetitorBanner;
    private JLabel lblAddNewCompetitorBanner1;
    private JLabel lblAge;
    private JLabel lblCompNo;
    private JLabel lblCompetitorNo;
    private JTextField lblCompetitorNoSearch;
    private JLabel lblCountry;
    private JLabel lblFirstName;
    private JLabel lblGender;
    private JLabel lblMiddleName;
    private JLabel lblScore1;
    private JLabel lblScore2;
    private JLabel lblScore3;
    private JLabel lblScore4;
    private JLabel lblScore5;
    private JLabel lblSurname;
    private JTextField txtAge;
    private JTextField txtCompetitorNo;

    private JTextField txtCompetitorNoEdit;
    private JTextField txtCountry;
    private JTextField txtGender;

    private JTextField txtFirstName;
    private JTextField txtMiddleName;
    private JTextField txtSurname;

    private JTextField txtScore1;
    private JTextField txtScore2;
    private JTextField txtScore3;
    private JTextField txtScore4;
    private JTextArea txtSearchResults;

    public CompetitorView() {
        createGUI();
        
    }

    public void setTableData(Object[][] data, Object[] columnNames) {
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        competitorsTable.setModel(model);
        competitorsTable.updateUI();
    }
    
    

    public int getSelectedCompetitorNumber() {
        return Integer.parseInt(this.txtCompetitorNo.getText());
    }

    private void createGUI() {
        GridBagConstraints gridBagConstraints;

        panelTable = new JPanel();
        jScrollPane1 = new JScrollPane();
        competitorsTable = new JTable();
        panelAddNew = new JPanel();
        lblAddNewCompetitorBanner = new JLabel();
        lblScore1 = new JLabel();
        lblScore2 = new JLabel();
        lblScore3 = new JLabel();
        lblScore4 = new JLabel();
        txtScore4 = new JTextField();
        txtCompetitorNo = new JTextField();
        txtScore2 = new JTextField();
        txtScore3 = new JTextField();
        btnUpdateScores = new JButton();
        lblScore5 = new JLabel();
        txtScore1 = new JTextField();
        lblAddNewCompetitorBanner1 = new JLabel();
        lblCompetitorNo = new JLabel();
        lblCompetitorNoSearch = new JTextField();
        jScrollPane2 = new JScrollPane();
        txtSearchResults = new JTextArea();
        btnSearch = new JButton();
        panelEdit = new JPanel();
        jLabel1 = new JLabel();
        lblCompNo = new JLabel();
        txtCompetitorNoEdit = new JTextField();
        lblFirstName = new JLabel();
        txtFirstName = new JTextField();
        lblMiddleName = new JLabel();
        txtMiddleName = new JTextField();
        lblSurname = new JLabel();
        txtSurname = new JTextField();
        lblAge = new JLabel();
        txtAge = new JTextField();
        btnUpdatesDetails = new JButton();
        lblCountry = new JLabel();
        txtCountry = new JTextField();
        lblGender = new JLabel();
        txtGender = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(1, 0));

        panelTable.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder(""), "Table"));
        panelTable.setLayout(new BorderLayout());

        
        jScrollPane1.setViewportView(competitorsTable);

        panelTable.add(jScrollPane1, BorderLayout.CENTER);

        getContentPane().add(panelTable);

        panelAddNew.setBorder(BorderFactory.createTitledBorder("Add New"));
        panelAddNew.setLayout(new GridBagLayout());

        lblAddNewCompetitorBanner.setFont(new Font("Segoe UI", 1, 12));
        lblAddNewCompetitorBanner.setHorizontalAlignment(SwingConstants.CENTER);
        lblAddNewCompetitorBanner.setText("FIND SPECIFIC COMPETITOR");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 298;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(13, 20, 0, 0);
        panelAddNew.add(lblAddNewCompetitorBanner, gridBagConstraints);

        lblScore1.setFont(new Font("Segoe UI", 1, 14));
        lblScore1.setText("Score 4");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 30, 0, 0);
        panelAddNew.add(lblScore1, gridBagConstraints);

        lblScore2.setFont(new Font("Segoe UI", 1, 14));
        lblScore2.setText("No");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(15, 30, 0, 0);
        panelAddNew.add(lblScore2, gridBagConstraints);

        lblScore3.setFont(new Font("Segoe UI", 1, 14));
        lblScore3.setText("Score 2");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 30, 0, 0);
        panelAddNew.add(lblScore3, gridBagConstraints);

        lblScore4.setFont(new Font("Segoe UI", 1, 14));
        lblScore4.setText("Score 3");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 30, 0, 0);
        panelAddNew.add(lblScore4, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 10, 0, 0);
        panelAddNew.add(txtScore4, gridBagConstraints);

        txtCompetitorNo.setEditable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(15, 10, 0, 0);
        panelAddNew.add(txtCompetitorNo, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 10, 0, 0);
        panelAddNew.add(txtScore2, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 10, 0, 0);
        panelAddNew.add(txtScore3, gridBagConstraints);

        btnUpdateScores.setFont(new Font("Segoe UI", 1, 14));
        btnUpdateScores.setText("UPDATE SCORES");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(20, 80, 0, 0);
        panelAddNew.add(btnUpdateScores, gridBagConstraints);

        lblScore5.setFont(new Font("Segoe UI", 1, 14));
        lblScore5.setText("Score 1");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 30, 0, 0);
        panelAddNew.add(lblScore5, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 10, 0, 0);
        panelAddNew.add(txtScore1, gridBagConstraints);

        lblAddNewCompetitorBanner1.setFont(new Font("Segoe UI", 1, 12));
        lblAddNewCompetitorBanner1.setHorizontalAlignment(SwingConstants.CENTER);
        lblAddNewCompetitorBanner1.setText("EDIT COMPETITOR SCORES");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 306;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 11, 0, 0);
        panelAddNew.add(lblAddNewCompetitorBanner1, gridBagConstraints);

        lblCompetitorNo.setFont(new Font("Segoe UI", 1, 12));
        lblCompetitorNo.setHorizontalAlignment(SwingConstants.CENTER);
        lblCompetitorNo.setText("Competitor No:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(49, 30, 0, 0);
        panelAddNew.add(lblCompetitorNo, gridBagConstraints);

        lblCompetitorNoSearch.setFont(new Font("Segoe UI", 1, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(45, 20, 0, 0);
        panelAddNew.add(lblCompetitorNoSearch, gridBagConstraints);

        txtSearchResults.setEditable(false);
        txtSearchResults.setColumns(20);
        txtSearchResults.setRows(5);
        jScrollPane2.setViewportView(txtSearchResults);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 454;
        gridBagConstraints.ipady = 84;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(8, 10, 12, 4);
        panelAddNew.add(jScrollPane2, gridBagConstraints);

        btnSearch.setFont(new Font("Segoe UI", 1, 14));
        btnSearch.setText("Search");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(43, 20, 0, 0);
        panelAddNew.add(btnSearch, gridBagConstraints);

        getContentPane().add(panelAddNew);

        panelEdit.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder(""), "Edit Record"));
        panelEdit.setLayout(new GridBagLayout());

        jLabel1.setFont(new Font("Segoe UI", 1, 14));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("EDIT COMPETITOR DETAILS");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 285;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(34, 9, 0, 9);
        panelEdit.add(jLabel1, gridBagConstraints);

        lblCompNo.setFont(new Font("Segoe UI", 1, 14));
        lblCompNo.setText("No");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(6, 15, 0, 0);
        panelEdit.add(lblCompNo, gridBagConstraints);

        txtCompetitorNoEdit.setEditable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 277;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(6, 6, 0, 0);
        panelEdit.add(txtCompetitorNoEdit, gridBagConstraints);

        lblFirstName.setFont(new Font("Segoe UI", 1, 14));
        lblFirstName.setText("First Name");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 15, 0, 0);
        panelEdit.add(lblFirstName, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 277;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 6, 0, 0);
        panelEdit.add(txtFirstName, gridBagConstraints);

        lblMiddleName.setFont(new Font("Segoe UI", 1, 14));
        lblMiddleName.setText("Middle Name");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 15, 0, 0);
        panelEdit.add(lblMiddleName, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 277;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 6, 0, 0);
        panelEdit.add(txtMiddleName, gridBagConstraints);

        lblSurname.setFont(new Font("Segoe UI", 1, 14));
        lblSurname.setText("Surname");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 15, 0, 0);
        panelEdit.add(lblSurname, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 277;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 6, 0, 0);
        panelEdit.add(txtSurname, gridBagConstraints);

        lblAge.setFont(new Font("Segoe UI", 1, 14));
        lblAge.setText("Age");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 15, 0, 0);
        panelEdit.add(lblAge, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 277;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 6, 0, 0);
        panelEdit.add(txtAge, gridBagConstraints);

        btnUpdatesDetails.setFont(new Font("Segoe UI", 1, 14));
        btnUpdatesDetails.setText("SAVE DETAILS");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 123, 105, 0);
        panelEdit.add(btnUpdatesDetails, gridBagConstraints);

        lblCountry.setFont(new Font("Segoe UI", 1, 14));
        lblCountry.setText("Country");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 15, 0, 0);
        panelEdit.add(lblCountry, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 277;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(19, 6, 0, 0);
        panelEdit.add(txtCountry, gridBagConstraints);

        lblGender.setFont(new Font("Segoe UI", 1, 14));
        lblGender.setText("Gender");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 15, 0, 0);
        panelEdit.add(lblGender, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 277;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(19, 6, 0, 0);
        panelEdit.add(txtGender, gridBagConstraints);

        getContentPane().add(panelEdit);

        pack();
    }

    public void setValuesToEditPanel(String competitorNo, String fullName, String age, String gender, String country) {
        this.txtCompetitorNo.setText(competitorNo);
        this.txtAge.setText(age);
        this.txtCompetitorNoEdit.setText(competitorNo);
        this.txtCountry.setText(country);
        this.txtGender.setText(gender);

        String names[] = fullName.split(" ");

        String fname = "";
        String middleName = "";
        String lastName = "";

        if (names.length > 0) {
            if (names.length == 2) {
                fname = names[0];
                middleName = names[1];
            } else if (names.length == 3) {
                fname = names[0];
                middleName = names[1];
                lastName = names[2];
            }
        }
        this.txtFirstName.setText(fname);
        this.txtMiddleName.setText(middleName);
        this.txtSurname.setText(lastName);

    }

    public void setScoreGUI(int scores[]) {
        this.txtScore1.setText(scores[0] + "");
        this.txtScore2.setText(scores[1] + "");
        this.txtScore3.setText(scores[2] + "");
        this.txtScore4.setText(scores[3] + "");
    }
    
    public String getSearchString(){
        return this.lblCompetitorNoSearch.getText().trim();
    }

    public void addBtnUpdateScoresActionListener(ActionListener listener) {
        this.btnUpdateScores.addActionListener(listener);
    }

    public void addBtnUpdatesDetailsActionListener(ActionListener listener) {
        this.btnUpdatesDetails.addActionListener(listener);
    }

    public void addBtnSearchActionListener(ActionListener listener) {
        this.btnSearch.addActionListener(listener);
    }

    void displaySearchResults(String shortDetails) {
        this.txtSearchResults.setText(shortDetails);
    }
    
    public int[] getUpdatedScores(){
        String scr1 = this.txtScore1.getText();
        String scr2 = this.txtScore2.getText();
        String scr3 = this.txtScore3.getText();
        String scr4 = this.txtScore4.getText();
        
        int vl1 = Integer.parseInt(scr1);
        int vl2 = Integer.parseInt(scr2);
        int vl3 = Integer.parseInt(scr3);
        int vl4 = Integer.parseInt(scr4);
        
        int [] updScores = new int[4];
        updScores[0] = vl1;
        updScores[1] = vl2;
        updScores[2] = vl3;
        updScores[3] = vl4;
        
        return updScores;
        
        
    }

    String[] getNewDetails() {
       String fname = this.txtFirstName.getText();
       String mName = this.txtMiddleName.getText();
       String sName = this.txtSurname.getText();
       String ctry = this.txtCountry.getText();
       String age = this.txtAge.getText();
       String gnder = this.txtGender.getText();
       
       String details[] = new String[6];
       details[0] = fname;
       details[1] = mName;
       details[2] = sName;
       details[3] = ctry;
       details[4] = age;
       details[5] = gnder;
       
       return details;
    }

    

}
