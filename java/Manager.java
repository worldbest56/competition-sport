

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Manager {

    public static void main(String[] args) {
        CompetitorList competitorList = new CompetitorList();
        competitorList.readCompetitorsFromCSV("RunCompetitor.csv");
        // Populate the competitorList with data
        CompetitorView view = new CompetitorView();
        CompetitorModel model = new CompetitorModel(competitorList);

        CompetitorController controller = new CompetitorController(model, view);

        // Display the GUI
        SwingUtilities.invokeLater(() -> {
            view.setExtendedState(JFrame.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            view.setVisible(true);
        });
    }
}
