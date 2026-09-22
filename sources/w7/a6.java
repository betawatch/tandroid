package w7;

import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class a6 {
    public static ArrayList a(org.telegram.ui.ActionBar.j6 j6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, i10));
        }
        return arrayList;
    }
}
