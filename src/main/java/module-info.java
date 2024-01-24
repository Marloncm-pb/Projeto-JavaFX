module com.aula.projetojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.aula.projetojavafx to javafx.fxml;
    exports com.aula.projetojavafx;
    exports com.aula.projetojavafx.gui;
}