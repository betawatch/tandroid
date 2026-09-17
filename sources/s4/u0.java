package s4;

import android.util.SparseArray;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class u0 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((t0) sparseArray.valueAt(i10)).a.clear();
            i10++;
        }
    }

    public final t0 b(int i10) {
        SparseArray sparseArray = this.a;
        t0 t0Var = (t0) sparseArray.get(i10);
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0();
        sparseArray.put(i10, t0Var2);
        return t0Var2;
    }
}
