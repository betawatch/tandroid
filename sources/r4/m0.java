package r4;

import android.util.SparseArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ m0(n0 n0Var, int i3) {
        this.a = i3;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SparseArray sparseArray = this.b.h;
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((p0) sparseArray.valueAt(i3)).getClass();
                    p0.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                n0 n0Var = this.b;
                s0 s0Var = n0Var.i;
                if (s0Var.E == n0Var) {
                    s0Var.p();
                    break;
                }
                break;
        }
    }
}
