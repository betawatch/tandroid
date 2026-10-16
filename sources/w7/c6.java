package w7;

import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class c6 {
    public static ArrayList a(org.telegram.ui.ActionBar.h6 h6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i10));
        }
        return arrayList;
    }
}
