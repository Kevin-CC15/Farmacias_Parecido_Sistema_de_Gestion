package view.frames;

import view.panels.admin.AdminPacientePanel;
import view.panels.admin.AdminMedicoPanel;
import view.panels.admin.AdminCitaPanel;

import javax.swing.*;
import java.awt.*;

public class AdminDashboardFrame extends JFrame {
    private JTabbedPane tabbedPane;

    public AdminDashboardFrame() {
        setTitle("SGCM - Panel Administrador");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Pacientes", new AdminPacientePanel());
        tabbedPane.addTab("Médicos", new AdminMedicoPanel());
        tabbedPane.addTab("Citas", new AdminCitaPanel());

        add(tabbedPane);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemLogout = new JMenuItem("Cerrar Sesión");
        itemLogout.addActionListener(e -> {
            new LoginFrame().setVisible(true);
            dispose();
        });
        menuArchivo.add(itemLogout);
        menuBar.add(menuArchivo);
        setJMenuBar(menuBar);
    }
}