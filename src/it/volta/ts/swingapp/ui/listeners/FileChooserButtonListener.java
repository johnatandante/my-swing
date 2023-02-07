package it.volta.ts.swingapp.ui.listeners;

import java.awt.event.*;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

public class FileChooserButtonListener implements ActionListener {

    JTextField component;

    public FileChooserButtonListener(JTextField component) {
        this.component = component;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        JFileChooser fchooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int result = fchooser.showOpenDialog(component.getParent());

        switch(result) {
            case JFileChooser.ERROR:
            case JFileChooser.ABORT:
            case JFileChooser.CANCEL_OPTION:
                return;
        }

        File[] files = fchooser.getSelectedFiles();
        for( int i = 0; i < files.length ;i++) {
            component.setText(files[i].getPath());
        }
        
        File file = fchooser.getSelectedFile();
        component.setText(file.getPath());

    }
    
}
