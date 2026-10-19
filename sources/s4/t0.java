package s4;

import android.util.SparseArray;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
