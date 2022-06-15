package playlist_ed;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class MainFrame extends javax.swing.JFrame {

    Playlist[] playlistsDeEjemplo;
    
    
    public MainFrame() {
        initComponents();
        //Configuraciones visuales
        this.setLocationRelativeTo(null);
        ImageIcon icon=new ImageIcon(getClass().getResource("/images/corchea_image.png"));
        this.setIconImage(icon.getImage());
        UIManager.getDefaults().put("TableHeader.cellBorder" , BorderFactory.createEmptyBorder(0,0,0,0));
        ListaDePlayLists.getTableHeader().setBackground(Color.WHITE);
        ListaDePlayLists.getTableHeader().setOpaque(true);
        ListaDeCanciones.getTableHeader().setBackground(Color.WHITE);
        ListaDeCanciones.getTableHeader().setOpaque(true);
        jScrollPane1.setBorder(null);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        jScrollPane2.setBorder(null);
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        
        
        //Creacion de las PlayList
        playlistsDeEjemplo=new Playlist[3];
        playlistsDeEjemplo[0]=new Playlist("PlayList1");
        playlistsDeEjemplo[1]=new Playlist("PlayList2");
        playlistsDeEjemplo[2]=new Playlist("PlayList3");
        Date d1 = new Date("04/02/2007");
        Cancion c1=new Cancion("Niña Bonita",3.30f,d1);
        Date d2 = new Date("01/03/1999");
        Cancion c2=new Cancion("Cholo soy",3.50f,d2);
        Date d3 = new Date("10/11/1980");
        Cancion c3=new Cancion("That's Life",4.10f,d3);
        playlistsDeEjemplo[0].agregarCancion(c1);
        playlistsDeEjemplo[0].agregarCancion(c2);
        playlistsDeEjemplo[0].agregarCancion(c3);
        actualizarVistaListaPlayList(playlistsDeEjemplo);   
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDeNavegacion = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        OpcionPlayLists = new javax.swing.JPanel();
        OpcionTitulo = new javax.swing.JLabel();
        ElementosDeLista = new javax.swing.JLabel();
        TituloDePanel = new javax.swing.JLabel();
        PanelListaDeCanciones = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaDeCanciones = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        TipoDeOrdenamiento = new javax.swing.JComboBox<>();
        PanelListaDePlayLists = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDePlayLists = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Playlist");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelDeNavegacion.setBackground(new java.awt.Color(0, 0, 51));
        PanelDeNavegacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/corchea_image.png"))); // NOI18N
        PanelDeNavegacion.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 130));

        OpcionPlayLists.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        OpcionPlayLists.setOpaque(false);
        OpcionPlayLists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcionPlayListsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OpcionPlayListsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OpcionPlayListsMouseExited(evt);
            }
        });
        OpcionPlayLists.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OpcionTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        OpcionTitulo.setForeground(new java.awt.Color(255, 255, 255));
        OpcionTitulo.setText("PlayLists");
        OpcionPlayLists.add(OpcionTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 25, -1, -1));

        PanelDeNavegacion.add(OpcionPlayLists, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 270, 70));

        getContentPane().add(PanelDeNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 600));

        ElementosDeLista.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        ElementosDeLista.setForeground(new java.awt.Color(0, 0, 51));
        ElementosDeLista.setText("N listas de reproducción");
        getContentPane().add(ElementosDeLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 130, 270, 30));

        TituloDePanel.setBackground(new java.awt.Color(153, 204, 255));
        TituloDePanel.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        TituloDePanel.setForeground(new java.awt.Color(0, 0, 51));
        TituloDePanel.setText("  Mis Playlist");
        TituloDePanel.setToolTipText("");
        TituloDePanel.setOpaque(true);
        getContentPane().add(TituloDePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 600, 200));

        PanelListaDeCanciones.setBackground(new java.awt.Color(255, 255, 255));
        PanelListaDeCanciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setOpaque(false);

        ListaDeCanciones.setBackground(new java.awt.Color(255, 255, 255));
        ListaDeCanciones.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ListaDeCanciones.setForeground(new java.awt.Color(0, 0, 51));
        ListaDeCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nombre de canción", "Fecha de lanzamiento", "Duración"
            }
        ));
        ListaDeCanciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ListaDeCanciones.setFillsViewportHeight(true);
        ListaDeCanciones.setFocusable(false);
        ListaDeCanciones.setGridColor(new java.awt.Color(0, 0, 0));
        ListaDeCanciones.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ListaDeCanciones.setRowHeight(50);
        ListaDeCanciones.setRowSelectionAllowed(false);
        ListaDeCanciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListaDeCanciones.setShowGrid(true);
        ListaDeCanciones.setShowVerticalLines(false);
        ListaDeCanciones.setSurrendersFocusOnKeystroke(true);
        ListaDeCanciones.getTableHeader().setResizingAllowed(false);
        ListaDeCanciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(ListaDeCanciones);
        if (ListaDeCanciones.getColumnModel().getColumnCount() > 0) {
            ListaDeCanciones.getColumnModel().getColumn(0).setResizable(false);
            ListaDeCanciones.getColumnModel().getColumn(0).setPreferredWidth(75);
            ListaDeCanciones.getColumnModel().getColumn(1).setResizable(false);
            ListaDeCanciones.getColumnModel().getColumn(1).setPreferredWidth(400);
            ListaDeCanciones.getColumnModel().getColumn(2).setResizable(false);
            ListaDeCanciones.getColumnModel().getColumn(2).setPreferredWidth(200);
            ListaDeCanciones.getColumnModel().getColumn(3).setResizable(false);
        }

        PanelListaDeCanciones.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 580, 330));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Debug");
        jRadioButton1.setBorder(null);
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.setFocusPainted(false);
        jRadioButton1.setFocusable(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        PanelListaDeCanciones.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 25, -1, -1));

        TipoDeOrdenamiento.setBackground(new java.awt.Color(255, 255, 255));
        TipoDeOrdenamiento.setForeground(new java.awt.Color(0, 0, 0));
        TipoDeOrdenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar por nombre", "Ordenar por fecha", "Ordenar por duración" }));
        TipoDeOrdenamiento.setBorder(null);
        TipoDeOrdenamiento.setFocusable(false);
        TipoDeOrdenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoDeOrdenamientoActionPerformed(evt);
            }
        });
        PanelListaDeCanciones.add(TipoDeOrdenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 170, -1));

        getContentPane().add(PanelListaDeCanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 600, 400));

        PanelListaDePlayLists.setBackground(new java.awt.Color(255, 255, 255));
        PanelListaDePlayLists.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setOpaque(false);

        ListaDePlayLists.setBackground(new java.awt.Color(255, 255, 255));
        ListaDePlayLists.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        ListaDePlayLists.setForeground(new java.awt.Color(0, 0, 51));
        ListaDePlayLists.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Título de PlayList", "# Canciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ListaDePlayLists.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ListaDePlayLists.setFocusable(false);
        ListaDePlayLists.setGridColor(new java.awt.Color(0, 0, 0));
        ListaDePlayLists.setIntercellSpacing(new java.awt.Dimension(0, 1));
        ListaDePlayLists.setRowHeight(75);
        ListaDePlayLists.setSelectionBackground(new java.awt.Color(0, 102, 153));
        ListaDePlayLists.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ListaDePlayLists.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListaDePlayLists.setShowGrid(true);
        ListaDePlayLists.setShowVerticalLines(false);
        ListaDePlayLists.setSurrendersFocusOnKeystroke(true);
        ListaDePlayLists.getTableHeader().setResizingAllowed(false);
        ListaDePlayLists.getTableHeader().setReorderingAllowed(false);
        ListaDePlayLists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaDePlayListsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaDePlayLists);
        if (ListaDePlayLists.getColumnModel().getColumnCount() > 0) {
            ListaDePlayLists.getColumnModel().getColumn(0).setResizable(false);
            ListaDePlayLists.getColumnModel().getColumn(0).setPreferredWidth(75);
            ListaDePlayLists.getColumnModel().getColumn(1).setResizable(false);
            ListaDePlayLists.getColumnModel().getColumn(1).setPreferredWidth(400);
            ListaDePlayLists.getColumnModel().getColumn(2).setResizable(false);
            ListaDePlayLists.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        PanelListaDePlayLists.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 380));

        getContentPane().add(PanelListaDePlayLists, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void actualizarVistaListaPlayList(Playlist[] playlists){
        PanelListaDeCanciones.setVisible(false);
        PanelListaDePlayLists.setVisible(true);
        TituloDePanel.setText("  Mis Playlists");
        ElementosDeLista.setText(playlistsDeEjemplo.length+" listas de reprodución");
        DefaultTableModel modelo=(DefaultTableModel)ListaDePlayLists.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < playlists.length; i++) {
            Object[] infoDePlaylist={
                i,playlists[i].getTitulo(),
                playlists[i].tamanio()+" canciones"
            };
            modelo.addRow(infoDePlaylist);
        }
        ListaDePlayLists.setModel(modelo);
    }
    
    public void actualizarVistaListaCanciones(Playlist playlist){
        PanelListaDeCanciones.setVisible(true);
        PanelListaDePlayLists.setVisible(false);
        TituloDePanel.setText("  "+playlist.getTitulo());
        ElementosDeLista.setText(playlist.tamanio()+" canciones");
        DefaultTableModel modelo=(DefaultTableModel)ListaDeCanciones.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < playlist.tamanio(); i++) {
            Cancion actual=playlist.obtenerCancion(i);
            Object[] infoDePlaylist={
                i,actual.getNombre(),
                new SimpleDateFormat("dd/MM/YY").format(actual.getFecha()),
                actual.getDuracion()
            };
            modelo.addRow(infoDePlaylist);
        }
        ListaDeCanciones.setModel(modelo);
    }
    
    private void OpcionPlayListsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionPlayListsMouseClicked
        actualizarVistaListaPlayList(playlistsDeEjemplo);
    }//GEN-LAST:event_OpcionPlayListsMouseClicked

    private void OpcionPlayListsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionPlayListsMouseEntered
        OpcionPlayLists.setBackground(new Color(255,255,255,255));
        OpcionTitulo.setForeground(Color.BLACK);
        OpcionPlayLists.setOpaque(true);
        //OpcionTitulo.
    }//GEN-LAST:event_OpcionPlayListsMouseEntered

    private void OpcionPlayListsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionPlayListsMouseExited
        OpcionPlayLists.setBackground(new Color(255,255,255,0));
        OpcionTitulo.setForeground(Color.WHITE);
        OpcionPlayLists.setOpaque(false);
    }//GEN-LAST:event_OpcionPlayListsMouseExited

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void TipoDeOrdenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoDeOrdenamientoActionPerformed
        switch(TipoDeOrdenamiento.getSelectedIndex()){
            case 0:
                playlistsDeEjemplo[ListaDePlayLists.getSelectedRow()].ordenarXNombre();
                break;
            case 1:
                playlistsDeEjemplo[ListaDePlayLists.getSelectedRow()].ordenarXFecha();
                break;
            case 2:
                playlistsDeEjemplo[ListaDePlayLists.getSelectedRow()].ordenarXDuracion();
                break;
        }
        actualizarVistaListaCanciones(playlistsDeEjemplo[ListaDePlayLists.getSelectedRow()]);
    }//GEN-LAST:event_TipoDeOrdenamientoActionPerformed

    private void ListaDePlayListsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaDePlayListsMouseClicked
        if(evt.getClickCount()==2){
            actualizarVistaListaCanciones(playlistsDeEjemplo[ListaDePlayLists.getSelectedRow()]);
        }
    }//GEN-LAST:event_ListaDePlayListsMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ElementosDeLista;
    private javax.swing.JLabel LOGO;
    private javax.swing.JTable ListaDeCanciones;
    private javax.swing.JTable ListaDePlayLists;
    private javax.swing.JPanel OpcionPlayLists;
    private javax.swing.JLabel OpcionTitulo;
    private javax.swing.JPanel PanelDeNavegacion;
    private javax.swing.JPanel PanelListaDeCanciones;
    private javax.swing.JPanel PanelListaDePlayLists;
    private javax.swing.JComboBox<String> TipoDeOrdenamiento;
    private javax.swing.JLabel TituloDePanel;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
