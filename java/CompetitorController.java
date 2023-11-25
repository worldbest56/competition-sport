import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public final class CompetitorController {
    private static CompetitorModel model;
    private static CompetitorView view;

    public CompetitorController(CompetitorModel model, CompetitorView view) {
        this.model = model;
        this.view = view;

        // Add action listeners to view components
        view.addBtnUpdateScoresActionListener(new UpdateScoresActionListener());
        view.addBtnUpdatesDetailsActionListener(new UpdatesDetailsActionListener());  // btnUpdatesDetails
        view.addBtnSearchActionListener(new SearchButtonListener()); //BtnSearch
        
        
        view.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    closeApplication();
                }
            });
        
        view.competitorsTable.getSelectionModel().addListSelectionListener(
                new TableSelectionListener(view.competitorsTable)
        );
        
        // Initialize or update view data
        updateView();
    }
    
    
    public void closeApplication(){
        // Logic for closing the application
            // You may want to prompt the user for confirmation
            int option = JOptionPane.showConfirmDialog(view, "Do you want to save data before closing?",
                    "Confirm Close", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                // Save data or perform any necessary cleanup before closing
                model.saveDataToFile(); 
            }
            System.exit(0); // Close the application
    }

    public void updateView() {
        view.setTableData(model.getCompetitorData(), model.getColumnNames());
    }

    private class UpdateScoresActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int competitor = view.getSelectedCompetitorNumber();
            int newScores[] = view.getUpdatedScores();
            model.updateScores(competitor,newScores);
            
            updateView();
            view.competitorsTable.updateUI();
            JOptionPane.showMessageDialog(view, "Score for Competitor " + competitor + " Updated Successfully ");
        }
    }  

    private class UpdatesDetailsActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String newDetails[] = view.getNewDetails();
            int compNo = view.getSelectedCompetitorNumber();
            model.updateDetails(compNo, newDetails);
            updateView();
            view.competitorsTable.updateUI();
            JOptionPane.showMessageDialog(view, "Details for Competitor " + compNo + " Updated Successfully ");
        }
    }

    
    
    private class SearchButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedCompetitorNumber = view.getSearchString();
            int comp = Integer.parseInt(selectedCompetitorNumber);
            String shortDetails = model.getCompetitorDetails(comp);
            view.displaySearchResults(shortDetails);
           
        }
    }
    
    
    
    
    private static class TableSelectionListener implements ListSelectionListener {
        private final JTable table;

        public TableSelectionListener(JTable table) {
            this.table = table;
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    // Get the value from the first column of the selected row
                    Object selectedValue = table.getValueAt(selectedRow, 0);
                    
                    
                    String competitorNo =  ""+table.getValueAt(selectedRow, 0);
                    String fullName = ""+table.getValueAt(selectedRow, 1);
                    String age = ""+table.getValueAt(selectedRow, 2);
                    String gender = ""+table.getValueAt(selectedRow, 3);
                    String country = ""+table.getValueAt(selectedRow, 4);
                    
                    
                    view.setValuesToEditPanel(competitorNo,fullName,age,gender,country);
                    
                    int scores[] = model.getCompetitorScores(Integer.parseInt(competitorNo));
                    view.setScoreGUI(scores);
                    
                    
                     
                    
                    // Show a JOptionPane with the selected value
                    //JOptionPane.showMessageDialog(table, "Selected Value: " + fullName);
                }
            }
        }
    }

    
    
     
     
     
}