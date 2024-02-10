package MVC;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Tax_Calc implements ActionListener {
    JFrame frame;
    JLabel Income, Tax;
    JTextField IncomeEntry, TaxAns;
    JButton IncomeTAX, NewRegimeTax;

    public void initGUI() {
        frame = new JFrame();
        Income = new JLabel("Enter Your Income Here : ");
        Tax = new JLabel("Total Tax To Be Payed is :");
        IncomeEntry = new JTextField(25);
        TaxAns = new JTextField(25);
        IncomeTAX = new JButton("Calculate The Tax ");
        Container c = frame.getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        c.add(Income);
        c.add(IncomeEntry);
        c.add(Tax);
        c.add(TaxAns);
        c.add(IncomeTAX);
        IncomeTAX.addActionListener(this);
        frame.setTitle("Tax Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public Tax_Calc() {
        initGUI();
    }

    public void actionPerformed(ActionEvent ae) {
        String GetIncome, ReturnTax;
        float UserIncome, UserTax = 0;
        if (ae.getSource() == IncomeTAX) {
            GetIncome = IncomeEntry.getText();
            UserIncome = Integer.parseInt(GetIncome);
            if (UserIncome <= 250000) {
                UserTax = 0;
            } else if (UserIncome > 250000 && UserIncome <= 500000) {
                UserTax = (UserIncome * 5) / 100;
            } else if (UserIncome > 500000 && UserIncome <= 750000) {
                UserTax = (UserIncome * 20) / 100;
            } else if (UserIncome > 750000 && UserIncome <= 1000000) {
                UserTax = (UserIncome * 20) / 100;
            } else if (UserIncome > 1000000 && UserIncome <= 1250000) {
                UserTax = (UserIncome * 30) / 100;
            } else if (UserIncome > 1250000 && UserIncome <= 1500000) {
                UserTax = (UserIncome * 30) / 100;
            } else if (UserIncome > 1500000) {
                UserTax = (UserIncome * 30) / 100;
            }
            ReturnTax = UserTax + "";
            TaxAns.setText(ReturnTax);
        }
        if (ae.getSource() == NewRegimeTax) {
            GetIncome = IncomeEntry.getText();
            UserIncome = Integer.parseInt(GetIncome);
            if (UserIncome <= 250000) {
                UserTax = 0;
            } else if (UserIncome > 250000 && UserIncome <= 500000) {
                UserTax = (UserIncome * 5) / 100;
            } else if (UserIncome > 500000 && UserIncome <= 750000) {
                UserTax = (UserIncome * 10) / 100;
            } else if (UserIncome > 750000 && UserIncome <= 1000000) {
                UserTax = (UserIncome * 15) / 100;
            } else if (UserIncome > 1000000 && UserIncome <= 1250000) {
                UserTax = (UserIncome * 20) / 100;
            } else if (UserIncome > 1250000 && UserIncome <= 1500000) {
                UserTax = (UserIncome * 25) / 100;
            } else if (UserIncome > 1500000) {
                UserTax = (UserIncome * 30) / 100;
            }
            ReturnTax = UserTax + "";
            TaxAns.setText(ReturnTax);
        }
    }

    public static void main(String args[]) {
        Tax_Calc TX = new Tax_Calc();
    }
}
