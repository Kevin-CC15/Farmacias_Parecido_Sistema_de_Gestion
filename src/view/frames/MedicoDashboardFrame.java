package view.frames;

import javax.swing.*;
import java.awt.*;

public class MedicoDashboardFrame extends JFrame {
    private JTabbedPane tabbedPane;

    public MedicoDashboardFrame() {
        setTitle("SGCM - Panel del Médico");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Mi Agenda", new JPanel());
        tabbedPane.addTab("Pacientes", new JPanel());
        tabbedPane.addTab("Consulta", new JPanel());

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

