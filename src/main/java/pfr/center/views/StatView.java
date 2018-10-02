package pfr.center.views;


import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import pfr.center.Main;
import pfr.center.models.Person;

import java.util.ArrayList;
import java.util.List;


public class StatView extends VerticalLayout implements View {
    public StatView(Main main) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1l, "Шабалина", "Эльвира", "Даниловна", "специалист", 23, 172, 324, 488, 32, 34));
        people.add(new Person(2l, "Бабосова", "Нина", "Евлампиевна", "вед.специалист", 14, 171, 300, 445, 33, 39));
        people.add(new Person(3l, "Костина", "София", "Николаевна", "специалист", 22, 171, 382, 487, 31, 30));
        people.add(new Person(4l, "Воробейкин", "Эрнест", "Шавлович", "начальник", 25, 176, 365, 480, 37, 31));
        people.add(new Person(5l, "Кожина", "Анна", "Михайловна", "главный.спец.", 19, 178, 299, 491, 36, 38));
        people.add(new Person(6l, "Ярина", "Ольга", "Олеговна", "специалист", 15, 170, 304, 403, 36, 35));
        Grid<Person> grid = new Grid<>();
        grid.addColumn(Person::getFa).setCaption("ФАМ");
        grid.addColumn(Person::getIm).setCaption("Имя");
        grid.addColumn(Person::getOt).setCaption("Отчество");
        grid.addColumn(Person::getDolzhnost).setCaption("Должность");
        grid.addColumn(Person::getPens1).setCaption("");
        grid.addColumn(Person::getPens2).setCaption("");
        grid.addColumn(Person::getPens3).setCaption("");
        grid.addColumn(Person::getPens4).setCaption("");
        grid.addColumn(Person::getPens5).setCaption("");
        grid.addColumn(Person::getPens6).setCaption("");
        grid.setItems(people);
        grid.setWidth("100%");

        addComponent(grid);
        grid.setStyleName("ic-grid2");
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }
}
