package v4;

import android.util.SparseArray;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class w0 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ((v0) sparseArray.valueAt(i7)).a.clear();
            i7++;
        }
    }

    public final v0 b(int i7) {
        SparseArray sparseArray = this.a;
        v0 v0Var = (v0) sparseArray.get(i7);
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0Var2 = new v0();
        sparseArray.put(i7, v0Var2);
        return v0Var2;
    }
}
