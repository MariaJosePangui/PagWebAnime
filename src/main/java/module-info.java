module com.example.implementacionpagwebhtlm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.implementacionpagwebhtlm to javafx.fxml;
    exports com.example.implementacionpagwebhtlm;
}