package view.panels.admin;

import view.Components.TablePanel;
import javax.swing.*;
import java.awt.*;

public class AdminMedicoPanel extends JPanel {
    private TablePanel tablePanel;
    private JButton btnRegistrar;

    public AdminMedicoPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String[] columnas = {"ID", "Nombre", "Especialidad", "Teléfono", "Estado"};
        tablePanel = new TablePanel(columnas);

        // Datos de ejemplo
        tablePanel.addRow(new Object[]{1, "Dr. Juan Pérez", "Cardiología", "555-1234", "Activo"});
        tablePanel.addRow(new Object[]{2, "Dra. María López", "Pediatría", "555-5678", "Activo"});

        JPanel buttonPanel = new JPanel();
        btnRegistrar = new JButton("Registrar Médico");
        buttonPanel.add(btnRegistrar);

        btnRegistrar.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Registro de médico"));

        add(tablePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}