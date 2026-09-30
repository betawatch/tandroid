package w7;

import java.util.ArrayList;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
