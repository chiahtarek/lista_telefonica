package ifpr.pgua.eic.listatelefonica.controllers;

import ifpr.pgua.eic.listatelefonica.App;
import ifpr.pgua.eic.listatelefonica.models.ListaTelefonica;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class JanelaCadastro {
    
    private VBox root;
    
    /*Componente para mostrar um rótulo na tela. Geralmente
     * é utilizado para identificar outro componente.
     */
    private Label lbNome;

    /*Componente para mostrar um campo de texto na tela. Permite
     * ao usuário digitar dados no teclado.
     */
    private TextField tfNome;

    private Label lbTelefone;
    private TextField tfTelefone;

<<<<<<< HEAD
    private Label lbemail;
    private TextField tfemail;

    private Label lbEmail;
    private TextField tfEmail;
>>>>>>> 07c6d97e1763895f957ff2367f35c17a89f8dabe

    private Button btCadastrar;
    private Button btVoltar;

    private ListaTelefonica listaTelefonica;

    public JanelaCadastro(ListaTelefonica listaTelefonica){
        this.listaTelefonica = listaTelefonica;
        inicializaComponentes();
    }

    private void inicializaComponentes(){
        lbNome = new Label("Nome:");
        tfNome = new TextField();

        lbTelefone = new Label("Telefone:");
        tfTelefone = new TextField();

<<<<<<< HEAD
        lbemail = new Label("E-mail:");
        tfemail = new TextField();
=======
        lbEmail = new Label("E-mail:");
        tfEmail = new TextField();
>>>>>>> 07c6d97e1763895f957ff2367f35c17a89f8dabe

        btCadastrar = new Button("Cadastrar");
        btCadastrar.setOnAction(this::cadastrar);

        btVoltar = new Button("Voltar");
        btVoltar.setOnAction(this::voltar);

        HBox botoes = new HBox();
        botoes.getChildren().addAll(btVoltar,btCadastrar);
        botoes.setSpacing(5.0);

        root = new VBox();
        root.setSpacing(5.0);
        root.setPadding(new Insets(20));

        root.getChildren().addAll(lbNome,tfNome);
        root.getChildren().addAll(lbTelefone,tfTelefone);
<<<<<<< HEAD
        root.getChildren().addAll(lbemail, tfemail);
        
=======
        root.getChildren().addAll(lbEmail,tfEmail);
>>>>>>> 07c6d97e1763895f957ff2367f35c17a89f8dabe
        root.getChildren().add(botoes);

    }
    

    public Parent getRoot(){
        return root;
    }


    /*Método que será executado quando clicar no botão de cadastrar. */
    private void cadastrar(ActionEvent evento){

        /*Pega o texto digitado pelo usuário e armazena em uma variável. */
        String nome = tfNome.getText();
        String telefone = tfTelefone.getText();
<<<<<<< HEAD
        String email = tfemail.getText();
=======
        String email  = tfEmail.getText();
>>>>>>> 07c6d97e1763895f957ff2367f35c17a89f8dabe

        String msg = "Cadastro realizado!";
        if(!listaTelefonica.adicionarContato(nome, telefone, email)){
            msg = "Cadastro não realizado!";
        }else{
            limpar();
        }

        Alert alert = new Alert(AlertType.INFORMATION,msg);
        alert.showAndWait();


    }

    private void limpar(){
        tfNome.clear();
        tfTelefone.clear();
<<<<<<< HEAD
        tfemail.clear();
=======
        tfEmail.clear();
>>>>>>> 07c6d97e1763895f957ff2367f35c17a89f8dabe
    }

    private void voltar(ActionEvent evento){
        App.popScreen();
    }


}
