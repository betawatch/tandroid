package x2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.m1;
import b2.p1;
import b2.q1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class h extends p1 {
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final SparseArray M;
    public final SparseBooleanArray N;

    public h(i iVar) {
        d(iVar);
        this.F = iVar.o0;
        this.G = iVar.p0;
        this.H = iVar.q0;
        this.I = iVar.r0;
        this.J = iVar.s0;
        this.K = iVar.t0;
        this.L = iVar.u0;
        SparseArray sparseArray = iVar.v0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.M = sparseArray2;
        this.N = iVar.w0.clone();
    }

    @Override // b2.p1
    public final void a(m1 m1Var) {
        this.D.put(m1Var.a, m1Var);
    }

    @Override // b2.p1
    public final q1 b() {
        return new i(this);
    }

    @Override // b2.p1
    public final p1 c() {
        super.c();
        return this;
    }

    public h() {
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = true;
        this.K = true;
        this.L = true;
    }
}
