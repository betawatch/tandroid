// default package

import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class st5 {
    public final ArrayList a;
    public final int b;
    public final hs7 c;
    public final ds7 d;
    public final CarText e;

    public st5(ItemList itemList) {
        this.b = itemList.getSelectedIndex();
        this.c = itemList.getOnSelectedDelegate();
        this.d = itemList.getOnItemVisibilityChangedDelegate();
        this.e = itemList.getNoItemsMessage();
        this.a = new ArrayList(itemList.getItems());
    }
}
