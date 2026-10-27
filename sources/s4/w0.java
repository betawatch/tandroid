package s4;

import android.util.SparseArray;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class w0 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((v0) sparseArray.valueAt(i10)).a.clear();
            i10++;
        }
    }

    public final v0 b(int i10) {
        SparseArray sparseArray = this.a;
        v0 v0Var = (v0) sparseArray.get(i10);
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0Var2 = new v0();
        sparseArray.put(i10, v0Var2);
        return v0Var2;
    }
}
