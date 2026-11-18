package v4;

import android.util.SparseArray;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
