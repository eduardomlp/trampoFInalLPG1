/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcvideira.trampo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Trampo extends javax.swing.JFrame {

    private int dependentesCounter = 0;
    
    /**
     * Creates new form Trampo
     */
    public Trampo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        homi = new javax.swing.JRadioButton();
        molier = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        diaNascimento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mesNascimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        anoNascimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rgField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cidadeField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cpfField = new javax.swing.JTextField();
        ruaFIeld = new javax.swing.JTextField();
        bairroField = new javax.swing.JTextField();
        numeroField = new javax.swing.JTextField();
        cargoLabel = new javax.swing.JLabel();
        cargoField = new javax.swing.JTextField();
        setorLabel = new javax.swing.JLabel();
        setorField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        trabalhoLabel = new javax.swing.JLabel();
        trabalhoField = new javax.swing.JTextField();
        dependentesButton = new javax.swing.JButton();
        salarioLabel = new javax.swing.JLabel();
        salarioField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        personType = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        profissaoLabel = new javax.swing.JLabel();
        profissaoField = new javax.swing.JTextField();
        rendaField = new javax.swing.JTextField();
        rendaLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        openRegistersButton = new javax.swing.JButton();
        tipoCliente = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        buttonGroup1.add(homi);
        homi.setSelected(true);
        homi.setText("Masculino");

        buttonGroup1.add(molier);
        molier.setText("Feminino");

        jLabel2.setText("Nascimento: ");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("/");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("/");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setText("RG: ");

        jLabel6.setText("CPF: ");

        jLabel7.setText("Cidade:");

        jLabel8.setText("Bairro:");

        jLabel9.setText("Rua: ");

        jLabel10.setText("Número: ");

        cargoLabel.setText("Cargo: ");
        cargoLabel.setEnabled(false);

        cargoField.setEnabled(false);

        setorLabel.setText("Setor: ");
        setorLabel.setEnabled(false);

        setorField.setEnabled(false);

        jLabel13.setText("Email: ");

        trabalhoLabel.setText("Carteira de Trabalho:");
        trabalhoLabel.setEnabled(false);

        trabalhoField.setEnabled(false);

        dependentesButton.setText("Adicionar Dependentes");
        dependentesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dependentesButtonMouseClicked(evt);
            }
        });
        dependentesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dependentesButtonActionPerformed(evt);
            }
        });

        salarioLabel.setText("Salário:");
        salarioLabel.setEnabled(false);

        salarioField.setEnabled(false);

        registerButton.setBackground(new java.awt.Color(0, 255, 11));
        registerButton.setText("Cadastrar");
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });

        personType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cliente", "Funcionário" }));
        personType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personTypeActionPerformed(evt);
            }
        });

        jLabel16.setText("Tipo:");

        jLabel17.setFont(new java.awt.Font("URW Bookman L", 3, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(44, 105, 110));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("UltraSoft");

        profissaoLabel.setText("Profissão: ");

        rendaLabel.setText("Renda: ");

        openRegistersButton.setBackground(new java.awt.Color(0, 15, 255));
        openRegistersButton.setText("Ver Cadastros");
        openRegistersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openRegistersButtonActionPerformed(evt);
            }
        });

        tipoCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bronze", "Prata", "Ouro", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cidadeField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ruaFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(numeroField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bairroField)))
                        .addContainerGap(86, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cpfField, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                    .addComponent(rgField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(homi)
                                .addGap(18, 18, 18)
                                .addComponent(molier)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(diaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(mesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(anoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(personType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(openRegistersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salarioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dependentesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cargoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cargoField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(setorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(setorField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(trabalhoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(trabalhoField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(profissaoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profissaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rendaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rendaField, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel1)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(diaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(mesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(anoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homi)
                    .addComponent(molier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rgField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ruaFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(bairroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(numeroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profissaoLabel)
                    .addComponent(profissaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rendaLabel)
                    .addComponent(rendaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargoLabel)
                    .addComponent(cargoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setorLabel)
                    .addComponent(setorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trabalhoLabel)
                    .addComponent(trabalhoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salarioLabel)
                            .addComponent(salarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(dependentesButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(openRegistersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personTypeActionPerformed
        if(personType.getSelectedItem().toString().equals("Cliente")){
            this.disableItens();
        }
        else{
            enableItens();
        }
    }//GEN-LAST:event_personTypeActionPerformed

    private void dependentesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dependentesButtonMouseClicked
        frameDependentes dependentes = new frameDependentes();
        dependentes.show();
    }//GEN-LAST:event_dependentesButtonMouseClicked

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        if(personType.getSelectedItem().toString().equals("Cliente")){
            this.criaCliente();
        }else{
            this.criaFuncionario();
        }
        dependentesCounter = 0;
    }//GEN-LAST:event_registerButtonMouseClicked

    private void dependentesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dependentesButtonActionPerformed
        dependentesCounter++;
    }//GEN-LAST:event_dependentesButtonActionPerformed

    private void openRegistersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openRegistersButtonActionPerformed
        String cadastro = "";
        
        try{
            ArrayList<String> list = new ArrayList<>();
            cadastro = "Último cadastro efetuado: \n"; 
                    
            list = FileManager.getInformations();
            for (String linha : list) {
                cadastro = cadastro + linha + "\n";
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Sem cadastros");
        }
        JOptionPane.showMessageDialog(null, cadastro);
    }//GEN-LAST:event_openRegistersButtonActionPerformed

    private void criaFuncionario(){
        String tipo = "Tipo: " + personType.getSelectedItem().toString();
        String name = "Nome: " + nameField.getText();
        String idade = "Idade: " + diaNascimento.getText() + "/" + mesNascimento.getText() + "/" + anoNascimento.getText();
        String rg = "RG: " + rgField.getText();
        String cpf = "CPF: " + cpfField.getText();
        String cidade = "Cidade: " + cidadeField.getText();
        String rua = "Rua: " + ruaFIeld.getText();
        String bairro = "Bairro: " + bairroField.getText();
        String numero = "Número: " + numeroField.getText();
        String cargo = "Cargo: " + cargoField.getText();
        String setor = "Setor: " + setorField.getText();
        String trabalho = "Carteira de Trabalho: " + trabalhoField.getText();
        String salario = "Salário: " + salarioField.getText();      
        String sexo;
        
        if(molier.isSelected()){
            sexo = "Feminino";
        }else{
            sexo = "Masculino";
        }
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(name);
        funcionario.setNascimento(idade);
        funcionario.setRg(rg);
        funcionario.setCpf(cpf);
        funcionario.setCidade(cidade);
        funcionario.setRua(rua);
        funcionario.setBairro(bairro);
        funcionario.setNumero(numero);
        funcionario.setCargo(cargo);
        funcionario.setSetor(setor);
        funcionario.setSalario(Double.parseDouble(salarioField.getText()));
        funcionario.setDependentes(dependentesCounter);
        funcionario.setSexo(sexo);
        funcionario.setCarteiraTrabalho(trabalho);
        
        String br = System.getProperty("line.separator");
        
        String result = tipo + br + 
                name + br +
                idade + br +
                rg + br +
                cpf + br +
                cidade + br +
                rua + br +
                bairro + br +
                numero + br + 
                "Dependentes: " + funcionario.getDependentes() + br +
                sexo + br +
                cargo + br +
                setor + br +
                trabalho + br +
                "Salário: " + funcionario.getSalario();
        
        try{
            FileManager.saveInformations(result);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Deu ruim ao salvar");
        }
    }
    
    private void criaCliente(){
        String tipo = "Tipo: " + personType.getSelectedItem().toString();
        String name = "Nome: " + nameField.getText();
        String idade = "Idade: " + diaNascimento.getText() + "/" + mesNascimento.getText() + "/" + anoNascimento.getText();
        String rg = "RG: " + rgField.getText();
        String cpf = "CPF: " + cpfField.getText();
        String cidade = "Cidade: " + cidadeField.getText();
        String rua = "Rua: " + ruaFIeld.getText();
        String bairro = "Bairro: " + bairroField.getText();
        String numero = "Número: " + numeroField.getText();
        String renda = "Renda: " + rendaField.getText();
        String profissao = "Profissão: " + profissaoField.getText();
        String dependentes = "Dependentes: " + dependentesCounter;
        String sexo;
        
        if(molier.isSelected()){
            sexo = "Feminino";
        }else{
            sexo = "Masculino";
        }
        
        Cliente cliente = new Cliente();
        cliente.setNome(name);
        cliente.setNascimento(idade);
        cliente.setRg(rg);
        cliente.setCpf(cpf);
        cliente.setCidade(cidade);
        cliente.setRua(rua);
        cliente.setBairro(bairro);
        cliente.setNumero(numero);
        cliente.setRenda(Double.parseDouble(rendaField.getText()));
        cliente.setProfissao(profissao);
        cliente.setTipoCliente(tipoCliente.getSelectedItem().toString());
        cliente.setDependentes(dependentesCounter);
        cliente.setSexo(sexo);
        
        String br = System.getProperty("line.separator");
        
        String result = name + br +
                idade + br +
                rg + br +
                cpf + br +
                cidade + br +
                rua + br +
                bairro + br +
                numero + br +
                renda + br +
                profissao + br +
                dependentes + br +
                sexo + br + 
                "Limite de crédito: " + cliente.getLimiteCredito();
        
        try{
            FileManager.saveInformations(result);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Deu ruim ao salvar");
        }
    }
    
    private void enableItens(){
        salarioLabel.setEnabled(true);
        salarioField.setEnabled(true);
        trabalhoLabel.setEnabled(true);
        trabalhoField.setEnabled(true);
        setorLabel.setEnabled(true);
        setorField.setEnabled(true);
        cargoLabel.setEnabled(true);
        cargoField.setEnabled(true);
        profissaoLabel.setEnabled(false);
        profissaoField.setEnabled(false);
        rendaLabel.setEnabled(false);
        rendaField.setEnabled(false);
        tipoCliente.setEnabled(false);
    }
    
    private void disableItens(){
        salarioLabel.setEnabled(false);
        salarioField.setEnabled(false);
        trabalhoLabel.setEnabled(false);
        trabalhoField.setEnabled(false);
        setorLabel.setEnabled(false);
        setorField.setEnabled(false);
        cargoLabel.setEnabled(false);
        cargoField.setEnabled(false);
        profissaoLabel.setEnabled(true);
        profissaoField.setEnabled(true);
        rendaLabel.setEnabled(true);
        rendaField.setEnabled(true);
        tipoCliente.setEnabled(true);
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Trampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trampo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoNascimento;
    private javax.swing.JTextField bairroField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JTextField cargoField;
    private javax.swing.JLabel cargoLabel;
    private javax.swing.JTextField cidadeField;
    private javax.swing.JTextField cpfField;
    private javax.swing.JButton dependentesButton;
    private javax.swing.JTextField diaNascimento;
    private javax.swing.JTextField emailField;
    private javax.swing.JRadioButton homi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField mesNascimento;
    private javax.swing.JRadioButton molier;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField numeroField;
    private javax.swing.JButton openRegistersButton;
    private javax.swing.JComboBox personType;
    private javax.swing.JTextField profissaoField;
    private javax.swing.JLabel profissaoLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField rendaField;
    private javax.swing.JLabel rendaLabel;
    private javax.swing.JTextField rgField;
    private javax.swing.JTextField ruaFIeld;
    private javax.swing.JTextField salarioField;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JTextField setorField;
    private javax.swing.JLabel setorLabel;
    private javax.swing.JComboBox tipoCliente;
    private javax.swing.JTextField trabalhoField;
    private javax.swing.JLabel trabalhoLabel;
    // End of variables declaration//GEN-END:variables
}
