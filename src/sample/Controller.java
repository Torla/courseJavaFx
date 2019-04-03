package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Observable;

public class Controller {

  public ListView veicoliList;

  public Label labelProva;
  public TextField autoTarga;
  public TextField autoAnno;
  public TextField autoCilindrata;
  public TextField autoPosti;
  public TextField autoPorte;
  public TextField autoAlimentazione;
  public TextField motoTarga;
  public TextField motoAnno;
  public TextField motoCilindrata;
  public TextField motoTempi;
  public TextField motoRapporti;

  public void load(ActionEvent actionEvent) {
    //todo load dei dati

    //lista a cui aggiungere ciò che si vuole mostrare nella lista
    ArrayList<String> list = new ArrayList<>();
    list.add("a");
    list.add("a2");
    ObservableList<String> observableList = FXCollections.observableList(list);
    veicoliList.setItems(observableList);
  }

  public void aggiungiAutomobile(ActionEvent actionEvent) {

  }

  public void addAuto(ActionEvent actionEvent) {
    autoTarga.getText();
  }

  public void addMoto(ActionEvent actionEvent) {
  }
}
