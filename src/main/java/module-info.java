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
    opens com.aula.projetojavafx.gui to javafx.fxml;
    exports com.aula.projetojavafx.gui.util;
    opens com.aula.projetojavafx.gui.util to javafx.fxml;
    exports com.aula.projetojavafx.model.entities;
    opens com.aula.projetojavafx.model.entities to javafx.fxml;
    exports com.aula.projetojavafx.model.services;
    opens com.aula.projetojavafx.model.services to javafx.fxml;

}