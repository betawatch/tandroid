package s4;

import android.util.SparseArray;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
