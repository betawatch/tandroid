package s4;

import android.util.SparseArray;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class v0 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((u0) sparseArray.valueAt(i10)).a.clear();
            i10++;
        }
    }

    public final u0 b(int i10) {
        SparseArray sparseArray = this.a;
        u0 u0Var = (u0) sparseArray.get(i10);
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0();
        sparseArray.put(i10, u0Var2);
        return u0Var2;
    }
}
