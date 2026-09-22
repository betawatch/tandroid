package w7;

import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class b6 {
    public static ArrayList a(org.telegram.ui.ActionBar.k6 k6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, i10));
        }
        return arrayList;
    }
}
