package w7;

import java.util.ArrayList;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class c6 {
    public static ArrayList a(org.telegram.ui.ActionBar.i6 i6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, i10));
        }
        return arrayList;
    }
}
