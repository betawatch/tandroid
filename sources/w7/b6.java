package w7;

import java.util.ArrayList;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class b6 {
    public static ArrayList a(org.telegram.ui.ActionBar.i6 i6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, i10));
        }
        return arrayList;
    }
}
