package w7;

import java.util.ArrayList;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public abstract class c6 {
    public static ArrayList a(org.telegram.ui.ActionBar.j6 j6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, i10));
        }
        return arrayList;
    }
}
