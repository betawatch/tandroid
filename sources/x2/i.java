package x2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.r1;
import b2.t1;
import b2.u1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
    public final void a(r1 r1Var) {
        this.H.put(r1Var.a, r1Var);
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
