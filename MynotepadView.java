import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

public class MynotepadView extends JFrame {
     public MynotepadModel mynotepadModel;
     public JPanel contentPane;
	
	public JLabel lblNewLabel;
	public JTextArea textArea; 

    public MynotepadView() {
        this.mynotepadModel = new MynotepadModel();
        this.init();
    }

    private void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));

		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 50));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 0, 314, 39);
		panel.add(lblNewLabel);
		MynotepadController action =new MynotepadController(this);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(action);
		btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOpen.setBounds(398, 11, 89, 28);
		panel.add(btnOpen);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(action);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnSave.setBounds(497, 11, 89, 28);
		panel.add(btnSave);
		this.setVisible(true);
    }
}
