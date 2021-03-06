/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.sistema.ActionListener;

import com.empresa.sistema.cointracker.frames.MainJFrame;
import com.empresa.sistema.cointracker.frames.internalFrames.RegisterAccountJInternalFrame;
import com.empresa.sistema.cointracker.frames.internalFrames.RegisterCategoryInternalJFrame;
import com.empresa.sistema.cointracker.frames.internalFrames.RegisterProviderJInternalFrame;
import cointracker.util.LogMaker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David .V
 */
public class MainActionListener implements ActionListener{
    MainJFrame frame;

    public MainActionListener(MainJFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if("buttonRegisterAccountClicked".equals(e.getActionCommand())){
            RegisterAccountJInternalFrame registerAccountJInternalFrame;
            try {
                registerAccountJInternalFrame = new RegisterAccountJInternalFrame(frame.getSession());
                frame.desktopPane.add(registerAccountJInternalFrame);
                registerAccountJInternalFrame.setVisible(true);
                LogMaker.log("Aberta janela de registro de contas");
            } catch (Exception ex) {
                LogMaker.log(ex.getMessage());
            }
        }else if("buttonRegisterProviderClicked".equals(e.getActionCommand())){
            RegisterProviderJInternalFrame registerProviderJInternalFrame = new RegisterProviderJInternalFrame(frame.getProviderList(), frame.getSession());
            frame.desktopPane.add(registerProviderJInternalFrame);
            registerProviderJInternalFrame.setVisible(true);
            LogMaker.log("Aberta janela de registro de fornecedores");
        }
        else if("AddCategory".equals(e.getActionCommand())){
            RegisterCategoryInternalJFrame registerCategoryInternalJFrame = new RegisterCategoryInternalJFrame(frame.getCategoriesList(), frame.getSession());
            frame.desktopPane.add(registerCategoryInternalJFrame);
            registerCategoryInternalJFrame.setVisible(true);
            LogMaker.log("Aberta janela de registro de categorias");
        }
    }
}
