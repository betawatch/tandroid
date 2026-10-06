package w7;

import java.util.ArrayList;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
