package view.panels.admin;

import view.Components.TablePanel;
import javax.swing.*;
import java.awt.*;

public class AdminCitaPanel extends JPanel {
    private TablePanel tablePanel;
    private JButton btnAgendar;

    public AdminCitaPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String[] columnas = {"ID", "Paciente", "Médico", "Fecha", "Hora", "Estado"};
        tablePanel = new TablePanel(columnas);

        // Datos de ejemplo
        tablePanel.addRow(new Object[]{1, "Juan Pérez", "Dr. Juan Pérez", "2024-01-15", "10:00", "Confirmada"});
        tablePanel.addRow(new Object[]{2, "María García", "Dra. María López", "2024-01-15", "11:00", "Pendiente"});

        JPanel buttonPanel = new JPanel();
        btnAgendar = new JButton("Agendar Cita");
        buttonPanel.add(btnAgendar);

        btnAgendar.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Agendar cita"));

        add(tablePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}
