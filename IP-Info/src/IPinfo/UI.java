package IPinfo;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
	
    // Create labels for each JSON field
	
    JLabel continentLabel = new JLabel();
    JLabel countryLabel = new JLabel();
    JLabel regionNameLabel = new JLabel();
    JLabel cityLabel = new JLabel();
    JLabel zipLabel = new JLabel();
    JLabel latLabel = new JLabel();
    JLabel lonLabel = new JLabel();
    JLabel timezoneLabel = new JLabel();
    JLabel ispLabel = new JLabel();
    JLabel orgLabel = new JLabel();
    JLabel mobileLabel = new JLabel();
    JLabel proxyLabel = new JLabel();
    JLabel hostingLabel = new JLabel();
    JLabel ipLabel = new JLabel();
    JLabel cacheTimestampLabel = new JLabel();
    //    
    JTextField IPInputField = new JTextField(20);
    // Create a button to process JSON
    JButton submitButton = new JButton("Get Info");
    JFrame frame;
	public void init() {
		SwingUtilities.invokeLater(() -> {
            frame = new JFrame("JSON Data Display");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a panel to hold the labels
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0, 2)); // Two columns

            // Add labels to the panel
            panel.add(new JLabel("     Continent: "));
            panel.add(continentLabel);

            panel.add(new JLabel("     Country: "));
            panel.add(countryLabel);

            panel.add(new JLabel("     Region Name: "));
            panel.add(regionNameLabel);

            panel.add(new JLabel("     City: "));
            panel.add(cityLabel);

            panel.add(new JLabel("     ZIP: "));
            panel.add(zipLabel);

            panel.add(new JLabel("     Latitude: "));
            panel.add(latLabel);

            panel.add(new JLabel("     Longitude: "));
            panel.add(lonLabel);

            panel.add(new JLabel("     Timezone: "));
            panel.add(timezoneLabel);

            panel.add(new JLabel("     ISP: "));
            panel.add(ispLabel);

            panel.add(new JLabel("     Organization: "));
            panel.add(orgLabel);

            panel.add(new JLabel("     Mobile: "));
            panel.add(mobileLabel);

            panel.add(new JLabel("     Proxy: "));
            panel.add(proxyLabel);

            panel.add(new JLabel("     Hosting: "));
            panel.add(hostingLabel);

            panel.add(new JLabel("     IP Address: "));
            panel.add(ipLabel);


            panel.add(new JLabel("     Cache Timestamp: "));
            panel.add(cacheTimestampLabel);

            // Read the JSON data and populate labels
            // Set data
            set_text(get_data(null));
            
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	set_text(get_data(IPInputField.getText()));
                }
            });
            
            JPanel inputPanel = new JPanel();
            inputPanel.add(IPInputField);
            inputPanel.add(submitButton);

            // Add the input panel to the bottom of the frame
            frame.add(inputPanel, BorderLayout.SOUTH);

            frame.setSize(400, 600);
            frame.setVisible(true);
           
            frame.getContentPane().add(panel);
            frame.setSize(400, 600);
            frame.setVisible(true);
        });
	}
	public schema get_data(String data){
		//fetch api
		api_fetch fetcher = new api_fetch();
		String a = fetcher.fetch("https://api.techniknews.net/ipgeo/", data);
		System.out.println(a);
		// handle resp		
		json resp = new json();
		schema rcv_data = resp.parseString(a);
		return rcv_data;
	}
	public void set_text(schema data){
		if(data.status.equals("fail")) {
			if(data.message.equals("No Internet :("))
				JOptionPane.showMessageDialog(frame,"Can't Connect to Internet", "No Internet", JOptionPane.ERROR_MESSAGE);
			else
				JOptionPane.showMessageDialog(frame, "You entered a "+data.message+" ip\nEnter a valid Ip Address", "Invalid IP", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else {
        continentLabel.setText(data.continent);
        countryLabel.setText(data.country);
        regionNameLabel.setText(data.regionName);
         cityLabel.setText(data.city);
        zipLabel.setText(data.zip);
        latLabel.setText(String.valueOf(data.lat));
        lonLabel.setText(String.valueOf(data.lon));
        timezoneLabel.setText(data.timezone);
        ispLabel.setText(data.isp);
        orgLabel.setText(data.org);
        mobileLabel.setText(String.valueOf(data.mobile));
        proxyLabel.setText(String.valueOf(data.proxy));
        hostingLabel.setText(String.valueOf(data.hosting) );
        ipLabel.setText(data.ip);
        cacheTimestampLabel.setText(String.valueOf(data.cacheTimestamp));
		}
	}
}
