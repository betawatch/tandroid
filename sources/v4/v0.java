package v4;

import android.util.SparseArray;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class v0 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ((u0) sparseArray.valueAt(i7)).a.clear();
            i7++;
        }
    }

    public final u0 b(int i7) {
        SparseArray sparseArray = this.a;
        u0 u0Var = (u0) sparseArray.get(i7);
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0();
        sparseArray.put(i7, u0Var2);
        return u0Var2;
    }
}
