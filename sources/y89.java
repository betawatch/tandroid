// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class y89 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z89 b;

    public /* synthetic */ y89(z89 z89Var, byte b) {
        this.a = b;
        this.b = z89Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        z89 z89Var = this.b;
        switch (b) {
            case 0:
                SparseArray sparseArray = z89Var.n;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((c99) sparseArray.valueAt(i)).getClass();
                    c99.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                f99 f99Var = z89Var.r;
                if (f99Var.E == z89Var) {
                    f99Var.p();
                    break;
                }
                break;
        }
    }
}
