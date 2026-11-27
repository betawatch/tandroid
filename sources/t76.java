// default package

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class t76 {
    public final boolean a;
    public final ItemList b;
    public final ArrayList c;
    public final CarText d;
    public final Action e;
    public final ActionStrip f;
    public final ArrayList g;

    public t76(ListTemplate listTemplate) {
        this.a = listTemplate.isLoading();
        this.e = listTemplate.getHeaderAction();
        this.d = listTemplate.getTitle();
        this.b = listTemplate.getSingleList();
        this.c = new ArrayList(listTemplate.getSectionedLists());
        this.f = listTemplate.getActionStrip();
        this.g = new ArrayList(listTemplate.getActions());
    }
}
