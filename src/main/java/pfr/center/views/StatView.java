package pfr.center.views;


import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import pfr.center.models.Person;

public class StatView extends VerticalLayout implements View {
    public StatView() {
        Grid<Person> grid = new Grid<Person>();
        addComponent(grid);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }
}
