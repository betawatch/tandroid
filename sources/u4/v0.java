package u4;

import android.util.SparseArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v0 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((u0) sparseArray.valueAt(i3)).a.clear();
            i3++;
        }
    }

    public final u0 b(int i3) {
        SparseArray sparseArray = this.a;
        u0 u0Var = (u0) sparseArray.get(i3);
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0();
        sparseArray.put(i3, u0Var2);
        return u0Var2;
    }
}
