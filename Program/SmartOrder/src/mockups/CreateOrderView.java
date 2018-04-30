package mockups;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

/**
 * SmartOrder
 * filename.java
 * Purpose: 
 * @author Gruppe 1
 * @version 1.0 
 */
public class CreateOrderView extends JFrame {

	private static final long serialVersionUID = 1L;
	private static CreateOrderView frame;
	private JTextField txtOrderNumber;
	private JTextField txtDate;
	private JTextField txtSearchForCustomer;
	private JTable tblOrderLine;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new CreateOrderView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreateOrderView() {
		setTitle("Opret ordre\r\n");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.setSize(1400, 950);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		CustomerPanel panelCustomer = new CustomerPanel();
		panelCustomer.setBorder(new LineBorder(new Color(0, 0, 0)));;
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 15));
		tabbedPane.setBorder(null);
		
		JPanel panelOrderInfo = new JPanel();
		panelOrderInfo.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		txtSearchForCustomer = new JTextField();
		txtSearchForCustomer.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtSearchForCustomer.setText("S\u00F8g kunde via navn ");
		txtSearchForCustomer.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblOrderLines = new JLabel("Ordrelinjer");
		lblOrderLines.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblCustomer = new JLabel("Kunde");
		lblCustomer.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnCancel = new JButton("Annuller");
		
		JButton btnCreateOrder = new JButton("Opret ordre");
		btnCreateOrder.setBackground(Color.LIGHT_GRAY);
		
		JButton btnSaveOrder = new JButton("Gem ordre");
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnRemove = new JButton("Fjern vare fra ordre");
		btnRemove.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnRemove.setIcon(new ImageIcon(CreateOrderView.class.getResource("/mockups/redx.png")));
		
		JLabel lblCreateNewCustomer = new JLabel("Opret ny kunde");
		lblCreateNewCustomer.setForeground(Color.BLUE);
		lblCreateNewCustomer.setFont(new Font("Tahoma", Font.ITALIC, 13));
		
		JLabel lblOrderInfo = new JLabel("Ordreinfo");
		lblOrderInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderInfo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblAddProduct = new JLabel("Tilf\u00F8j vare");
		lblAddProduct.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddProduct.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(589)
					.addComponent(lblOrderLines)
					.addContainerGap(719, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnRemove)
							.addPreferredGap(ComponentPlacement.RELATED, 870, Short.MAX_VALUE)
							.addComponent(lblTotal, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(txtTotal, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1243, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnSaveOrder)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCreateOrder)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancel)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblOrderInfo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panelOrderInfo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtSearchForCustomer)
								.addComponent(panelCustomer, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
								.addComponent(lblCreateNewCustomer, Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(112)
									.addComponent(lblCustomer)))
							.addGap(98)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblAddProduct, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(tabbedPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE))))
					.addGap(313))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(65)
							.addComponent(panelOrderInfo, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblCustomer)
							.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
							.addComponent(txtSearchForCustomer, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelCustomer, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAddProduct)
								.addComponent(lblOrderInfo, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCreateNewCustomer)
					.addGap(35)
					.addComponent(lblOrderLines)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTotal))
							.addGap(33)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSaveOrder)
								.addComponent(btnCreateOrder)
								.addComponent(btnCancel)))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnRemove)))
					.addGap(18))
		);
		
		tblOrderLine = new JTable();
		tblOrderLine.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Varenr", "Beskrivelse", "Antal", "Pris per styk", "Deltotal"
			}
		));
		scrollPane.setViewportView(tblOrderLine);
		panelOrderInfo.setLayout(null);
		
		JLabel lblOrdrenr = new JLabel("Ordrenr:");
		lblOrdrenr.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOrdrenr.setBounds(45, 16, 56, 16);
		panelOrderInfo.add(lblOrdrenr);
		
		JLabel lblDato = new JLabel("Dato:\r\n");
		lblDato.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDato.setBounds(45, 48, 56, 16);
		panelOrderInfo.add(lblDato);
		
		txtOrderNumber = new JTextField();
		txtOrderNumber.setBounds(128, 13, 116, 22);
		panelOrderInfo.add(txtOrderNumber);
		txtOrderNumber.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(128, 45, 116, 22);
		panelOrderInfo.add(txtDate);
		
		JLabel lblOrdreType = new JLabel("Ordretype:");
		lblOrdreType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOrdreType.setBounds(45, 80, 84, 16);
		panelOrderInfo.add(lblOrdreType);
		
		JComboBox comboBoxOrderType = new JComboBox();
		comboBoxOrderType.setBounds(128, 80, 116, 22);
		panelOrderInfo.add(comboBoxOrderType);
		
		ProductInfoPanel productInfoPanel = new ProductInfoPanel();
		productInfoPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		tabbedPane.addTab("Hyldevare", null, productInfoPanel, null);
		
		JPanel panel = new MakeProductPanel();
		tabbedPane.addTab("Specialdesign", null, panel, null);
		getContentPane().setLayout(groupLayout);
	}
}
