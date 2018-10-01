package pfr.center.views;


import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import pfr.center.models.Person;

public class OstatView extends VerticalLayout implements View {
    public OstatView() {
        Grid<Person> grid = new Grid<>();
        grid.addColumn("Фамилия");
        grid.addColumn("Имя");
        grid.addColumn("Отчество");
        grid.addColumn("Должность");

        addComponent(grid);

    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }
}
