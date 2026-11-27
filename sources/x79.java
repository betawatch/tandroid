// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class x79 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return;
            }
            ((w79) sparseArray.valueAt(i)).a.clear();
            i++;
        }
    }

    public final w79 b(int i) {
        SparseArray sparseArray = this.a;
        w79 w79Var = (w79) sparseArray.get(i);
        if (w79Var != null) {
            return w79Var;
        }
        w79 w79Var2 = new w79();
        sparseArray.put(i, w79Var2);
        return w79Var2;
    }
}
