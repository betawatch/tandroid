package p4;

import android.util.SparseArray;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ m0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SparseArray sparseArray = this.b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p0) sparseArray.valueAt(i10)).getClass();
                    p0.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                n0 n0Var = this.b;
                s0 s0Var = n0Var.i;
                if (s0Var.D == n0Var) {
                    s0Var.p();
                    break;
                }
                break;
        }
    }
}
