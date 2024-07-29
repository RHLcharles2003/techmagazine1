import java.awt.*;
import java.awt.event.*;

class Simple {
    Simple(){
        Frame frame = new Frame("Form");
        
        Label email = new Label("Email");
        email.setBounds(100,50,100,30);
        TextField emailInput=new TextField("enter email");
        emailInput.setBounds(200,50,100,30);

        Label password = new Label("Password");
        password.setBounds(100,100,100,30);
        TextField passwordInput=new TextField("enter password");
        passwordInput.setBounds(200,100,100,30);
      
        Label age= new Label("Age");
        age.setBounds(100,150,100,30);
        TextField ageInput=new TextField("enter age");
        ageInput.setBounds(200,160,100,30);

        Button submit=new Button("Submit");
        submit.setBounds(230,250,50,30);
        ButtonListener buttonListener = new ButtonListener(emailInput, passwordInput, ageInput);


       /*  ActionListener submitListener=new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(emailInput.getText());
                System.out.println(passwordInput.getText());
                System.out.println(ageInput.getText());
            }
        }; */

        submit.addActionListener(buttonListener);


     frame.add(email);
     frame.add(password);
     frame.add(age);
     frame.add(emailInput);
     frame.add(passwordInput);   
     frame.add(ageInput);
     frame.add(submit);

      //frame.add(btn2);
       frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
        

    }
    public static void main(String[] args){
        new Simple();
    }
}

class ButtonListener implements ActionListener{
    TextField emailInput;
    TextField passwordInput;
    TextField ageInput;
    ButtonListener(TextField emailInput, TextField passwordInput, TextField ageInput){
        this.emailInput=emailInput;
        this.passwordInput=passwordInput;
        this.ageInput=ageInput;
    }
    public void actionPerformed(ActionEvent e){
        System.out.println(emailInput.getText());
        System.out.println(passwordInput.getText());
        System.out.println(ageInput.getText());
    }
}
