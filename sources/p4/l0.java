package p4;

import android.util.SparseArray;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ l0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SparseArray sparseArray = this.b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((o0) sparseArray.valueAt(i10)).getClass();
                    o0.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                m0 m0Var = this.b;
                r0 r0Var = m0Var.i;
                if (r0Var.y == m0Var) {
                    r0Var.p();
                    break;
                }
                break;
        }
    }
}
