package v4;

import android.util.SparseArray;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
