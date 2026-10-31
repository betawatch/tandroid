package x2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.q1;
import b2.t1;
import b2.u1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i extends t1 {
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public i(j jVar) {
        d(jVar);
        this.J = jVar.w0;
        this.K = jVar.x0;
        this.L = jVar.y0;
        this.M = jVar.z0;
        this.N = jVar.A0;
        this.O = jVar.B0;
        this.P = jVar.C0;
        SparseArray sparseArray = jVar.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.Q = sparseArray2;
        this.R = jVar.E0.clone();
    }

    @Override // b2.t1
    public final void a(q1 q1Var) {
        this.H.put(q1Var.a, q1Var);
    }

    @Override // b2.t1
    public final u1 b() {
        return new j(this);
    }

    @Override // b2.t1
    public final t1 c() {
        super.c();
        return this;
    }

    public i() {
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
