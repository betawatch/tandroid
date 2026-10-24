package x2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.q1;
import b2.s1;
import b2.t1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class h extends s1 {
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public h(i iVar) {
        d(iVar);
        this.J = iVar.w0;
        this.K = iVar.x0;
        this.L = iVar.y0;
        this.M = iVar.z0;
        this.N = iVar.A0;
        this.O = iVar.B0;
        this.P = iVar.C0;
        SparseArray sparseArray = iVar.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.Q = sparseArray2;
        this.R = iVar.E0.clone();
    }

    @Override // b2.s1
    public final void a(q1 q1Var) {
        this.H.put(q1Var.a, q1Var);
    }

    @Override // b2.s1
    public final t1 b() {
        return new i(this);
    }

    @Override // b2.s1
    public final s1 c() {
        super.c();
        return this;
    }

    public h() {
        this.Q = new SparseArray();
        this.R = new SparseBooleanArray();
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
    }
}
