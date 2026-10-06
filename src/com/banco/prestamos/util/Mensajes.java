package com.banco.prestamos.util;

import javax.swing.JOptionPane;
import java.awt.Component;

public class Mensajes {
    public static void mostrarInfo(Component parent, String titulo, String mensaje) {
        JOptionPane.showMessageDialog(parent, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarError(Component parent, String titulo, String mensaje) {
        JOptionPane.showMessageDialog(parent, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarAdvertencia(Component parent, String titulo, String mensaje) {
        JOptionPane.showMessageDialog(parent, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
    }

    public static int mostrarConfirmacion(Component parent, String titulo, String mensaje) {
        return JOptionPane.showConfirmDialog(parent, mensaje, titulo, JOptionPane.YES_NO_OPTION);
    }
}
