package s4;

import android.util.SparseArray;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class t0 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((s0) sparseArray.valueAt(i10)).a.clear();
            i10++;
        }
    }

    public final s0 b(int i10) {
        SparseArray sparseArray = this.a;
        s0 s0Var = (s0) sparseArray.get(i10);
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0Var2 = new s0();
        sparseArray.put(i10, s0Var2);
        return s0Var2;
    }
}
