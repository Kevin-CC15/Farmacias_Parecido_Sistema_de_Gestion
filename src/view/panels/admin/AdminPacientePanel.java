package view.panels.admin;

import view.Components.TablePanel;
import javax.swing.*;
import java.awt.*;

public class AdminPacientePanel extends JPanel {
    private TablePanel tablePanel;
    private JButton btnRegistrar;

    public AdminPacientePanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String[] columnas = {"Expediente", "Nombre", "CURP", "Edad", "Estado"};
        tablePanel = new TablePanel(columnas);

        tablePanel.addRow(new Object[]{"EXP001", "Juan Pérez", "JUAN123456", 30, "Activo"});
        tablePanel.addRow(new Object[]{"EXP002", "María García", "MARIA789", 25, "Activo"});

        JPanel buttonPanel = new JPanel();
        btnRegistrar = new JButton("Registrar Paciente");
        buttonPanel.add(btnRegistrar);

        btnRegistrar.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Registro de paciente"));

        add(tablePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}