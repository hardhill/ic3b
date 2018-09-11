package pfr.center.components;

import com.vaadin.event.LayoutEvents;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

import java.util.ArrayList;

public class RoleSelector extends HorizontalLayout {
    final private String IMG_SIZE = "120px";
    ImageAndCaption imgCaption0 = new ImageAndCaption("/images/Leader.jpg", "Руководители");
    ImageAndCaption imgCaption1 = new ImageAndCaption("/images/Nachalniki.jpg", "Начальники");
    ImageAndCaption imgCaption2 = new ImageAndCaption("/images/Feg.jpg", "ФЭГ");
    ImageAndCaption imgCaption3 = new ImageAndCaption("/images/Sotrud.jpg", "Сотрудники");

    private int idxselector = -1;
    private ArrayList<IRoleSelectorListener> listeners = new ArrayList<IRoleSelectorListener>();


    public RoleSelector() {
        setMargin(false);

        //setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        addComponents(imgCaption0, imgCaption1, imgCaption2, imgCaption3);
        setComponentAlignment(imgCaption0, Alignment.MIDDLE_CENTER);
        setComponentAlignment(imgCaption1, Alignment.MIDDLE_CENTER);
        setComponentAlignment(imgCaption2, Alignment.MIDDLE_CENTER);
        setComponentAlignment(imgCaption3, Alignment.MIDDLE_CENTER);
        imgCaption0.addOnClickListener(event -> DoClickMenu(event, 0));
        imgCaption1.addOnClickListener(event -> DoClickMenu(event, 1));
        imgCaption2.addOnClickListener(event -> DoClickMenu(event, 2));
        imgCaption3.addOnClickListener(event -> DoClickMenu(event, 3));
    }

    private void DoClickMenu(LayoutEvents.LayoutClickEvent event, int idx) {
        idxselector = (short) idx;

        switch (idx) {
            case 0:
                imgCaption0.setStyleName("ic-selector-active");
                imgCaption1.setStyleName("ic-selector-unactive");
                imgCaption2.setStyleName("ic-selector-unactive");
                imgCaption3.setStyleName("ic-selector-unactive");
                break;
            case 1:
                imgCaption0.setStyleName("ic-selector-unactive");
                imgCaption1.setStyleName("ic-selector-active");
                imgCaption2.setStyleName("ic-selector-unactive");
                imgCaption3.setStyleName("ic-selector-unactive");
                break;
            case 2:
                imgCaption0.setStyleName("ic-selector-unactive");
                imgCaption1.setStyleName("ic-selector-unactive");
                imgCaption2.setStyleName("ic-selector-active");
                imgCaption3.setStyleName("ic-selector-unactive");
                break;
            case 3:
                imgCaption0.setStyleName("ic-selector-unactive");
                imgCaption1.setStyleName("ic-selector-unactive");
                imgCaption2.setStyleName("ic-selector-unactive");
                imgCaption3.setStyleName("ic-selector-active");
            default:
        }
        fireSelector(idxselector);
    }


    public int getIdxselector() {
        return idxselector;
    }

    public void setIdxselector(short idxselector) {
        this.idxselector = idxselector;
        DoClickMenu(null, idxselector);
    }

    public void addOnSelectorListener(IRoleSelectorListener listener) {
        listeners.add(listener);
    }

    public void deleteOnSelectorListener(IRoleSelectorListener listener) {
        if (listeners.size() > 0)
            listeners.remove(listener);
    }

    private void fireSelector(int idx) {

        for (IRoleSelectorListener listener : listeners) {
            listener.OnSelectRole(idx);
        }
    }

    //-------------------------------------------------------------------------------------------------------------------
    public interface IRoleSelectorListener {
        void OnSelectRole(int idx);
    }


}
