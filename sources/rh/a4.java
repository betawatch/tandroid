package rh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.aa;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a4 extends aa {
    public ArrayList S1;
    public LimitPreviewView T1;

    public final void d1(long j10) {
        ArrayList arrayList = this.S1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.T1.j((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j10, (TL_stars.StarGiftUpgradePrice) i0.a.g(1, arrayList));
    }
}
