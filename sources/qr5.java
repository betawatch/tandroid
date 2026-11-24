// default package

import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qr5 {
    public final ArrayList a;
    public final int b;
    public final hp7 c;
    public final dp7 d;
    public final CarText e;

    public qr5(ItemList itemList) {
        this.b = itemList.getSelectedIndex();
        this.c = itemList.getOnSelectedDelegate();
        this.d = itemList.getOnItemVisibilityChangedDelegate();
        this.e = itemList.getNoItemsMessage();
        this.a = new ArrayList(itemList.getItems());
    }
}
