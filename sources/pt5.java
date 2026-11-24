// default package

import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pt5 {
    public final ArrayList a;
    public final int b;
    public final kr7 c;
    public final gr7 d;
    public final CarText e;

    public pt5(ItemList itemList) {
        this.b = itemList.getSelectedIndex();
        this.c = itemList.getOnSelectedDelegate();
        this.d = itemList.getOnItemVisibilityChangedDelegate();
        this.e = itemList.getNoItemsMessage();
        this.a = new ArrayList(itemList.getItems());
    }
}
