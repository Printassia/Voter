import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class VoterCat_Rum_San extends Application{

    Label selectionLabel = new Label("BALLOT: ");


    Button FNMbutton, DNAbutton, PLPbutton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override public void start(Stage stage) throws Exception{
        selectionLabel.setFont(Font.font("Geeza Pro",  15));
        selectionLabel.setTextFill(Color.WHITE);

        Label instruction = new Label("SELECT THE CANDIDATE YOU WISH TO VOTE FOR:");
        instruction.setFont(Font.font("Geeza Pro",15));
        instruction.setTextFill(Color.WHITE);
        instruction.setPadding(new Insets(0,0,0,50));
        // DNA IMAGE
        FileInputStream DNAinput = new FileInputStream("dna.png");
        Image DNAimage = new Image(DNAinput);
        ImageView DNAimageView = new ImageView(DNAimage);

        DNAbutton = new Button("SAMUEL STRACHAN");
        DNAbutton.setPrefWidth(200);
        DNAbutton.setStyle("-fx-background-color:green;");
        DNAbutton.setPadding(new Insets(20,20,20,10));
        DNAbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                printMessage("YOU VOTED FOR: SAMUEL STRACHAN");
            }
        });

        // FNM IMAGE
        FileInputStream FNMinput = new FileInputStream("fnm.png");
        Image FNMimage = new Image(FNMinput);
        ImageView FNMimageView = new ImageView(FNMimage);

        FNMbutton = new Button("GADVILLE McDONALD");
        FNMbutton.setPrefWidth(200);
        FNMbutton.setPadding(new Insets(20,20,20,10));
        FNMbutton.setStyle("-fx-background-color:red;");
        FNMbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                printMessage("YOU VOTED FOR: GADVILLE McDONALD");
            }
        });

        //PLP IMAGE FOR BUTTON
        FileInputStream PLPinput = new FileInputStream("plp.png");
        Image PLPimage = new Image(PLPinput);
        ImageView PLPImageView = new ImageView(PLPimage);

        PLPbutton = new Button("PHILIP BRAVE DAVIS");
        PLPbutton.setPrefWidth(200);
        PLPbutton.setPadding(new Insets(20,20,20,10));
        PLPbutton.setStyle("-fx-background-color:yellow;");
        PLPbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                printMessage("YOU VOTED FOR:  PHILIP BRAVE DAVIS");
            }
        });

        //Create Grid
        GridPane grid  = new GridPane();
        grid.setVgap(20);
        //SetSize
        grid.setMinSize(500,250);

        //ADD BUTTONS, IMAGES AND LABEL
        grid.addRow(0,instruction);

        grid.addRow(4,selectionLabel);
        grid.setConstraints(DNAimageView,1,1);
        grid.setConstraints(DNAbutton, 0,1);
        grid.setConstraints(FNMbutton,0,2);
        grid.setConstraints(FNMimageView,1,2);
        grid.setConstraints(PLPbutton,0,3);
        grid.setConstraints(PLPImageView,1,3);
        grid.setPadding(new Insets(10, 10, 10, 10));


        grid.getChildren().addAll(DNAimageView,DNAbutton,FNMimageView,FNMbutton,PLPImageView,PLPbutton);

        grid.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;"+
                "-fx-background-image: url('flag.png');" +
                "-fx-background-repeat: no-repeat;" +
                "-fx-background-size: cover;"
        );

        //Create Scene
        Scene scene = new Scene(grid);

        //Set Stage
        stage.setScene(scene);
        //Set title
        stage.setTitle("2022 Bahamas National General Election");
        //Display
        stage.show();

    }

    public void printMessage(String message){
        selectionLabel.setText(message);
    }




}
