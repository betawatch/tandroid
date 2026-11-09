package v4;

import android.util.SparseArray;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class u0 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ((t0) sparseArray.valueAt(i7)).a.clear();
            i7++;
        }
    }

    public final t0 b(int i7) {
        SparseArray sparseArray = this.a;
        t0 t0Var = (t0) sparseArray.get(i7);
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0();
        sparseArray.put(i7, t0Var2);
        return t0Var2;
    }
}
