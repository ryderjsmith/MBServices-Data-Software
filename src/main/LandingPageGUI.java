package main;
import javax.swing.*;

import classes.BidSheet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LandingPageGUI {
    public LandingPageGUI() {
        JFrame frame = new JFrame("Home Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        // Creating a navigation bar
        JPanel navBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        navBar.add(new JLabel(new ImageIcon("images/MBlogo.png")));
        panel.add(navBar, BorderLayout.NORTH);

        // Creating the main container
        JPanel container = new JPanel(new GridLayout(1, 2));
        JButton createClientButton = new JButton("Create Client");
        JButton searchClientsButton = new JButton("Search Clients");
        JButton emailProposalButton = new JButton("Proposal");
        container.add(createClientButton);
        container.add(searchClientsButton);
        container.add(emailProposalButton);
        panel.add(container, BorderLayout.CENTER);

        // Event listener for Create Client button
        createClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your code for Create Client here
                new CreateClientGUI();
                frame.dispose();
            }
        });

        // Event listener for Search Clients button
        searchClientsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your code for Search Clients here
                new SearchClientGUI();    
                frame.dispose();
            }
        });

        // Event listener for Search Clients button
        emailProposalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BidSheet sheet = new BidSheet();
                new ProposalDocGUI(sheet).setVisible(true);;    
                frame.dispose();
            }
        });

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
