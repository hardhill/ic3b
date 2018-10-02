package pfr.center.views;


import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import pfr.center.models.Person;

import java.util.ArrayList;
import java.util.List;

@Theme("mytheme")
public class StatView extends VerticalLayout implements View {
    public StatView() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1l, "Шабалина", "Эльвира", "Даниловна", "специалист", 23));
        people.add(new Person(2l, "Бабосова", "Нина", "Евлампиевна", "вед.специалист", 14));
        people.add(new Person(3l, "Костина", "София", "Николаевна", "специалист", 22));
        people.add(new Person(4l, "Воробейкин", "Эрнест", "Шавлович", "начальник", 25));
        people.add(new Person(5l, "Кожина", "Анна", "Михайловна", "главный.спец.", 19));
        people.add(new Person(6l, "Ярина", "Ольга", "Олеговна", "специалист", 15));
        Grid<Person> grid = new Grid<>();
        grid.addColumn(Person::getFa).setCaption("ФАМ");
        grid.addColumn(Person::getIm).setCaption("Имя");
        grid.addColumn(Person::getOt).setCaption("Отчество");
        grid.addColumn(Person::getDolzhnost).setCaption("Должность");
        grid.addColumn(Person::getPens).setCaption("");
        grid.setItems(people);

        addComponent(grid);
        grid.setStyleName("ic-grid2");
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }
}
