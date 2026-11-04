package z2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import d2.p1;
import d2.r1;
import d2.s1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends r1 {
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
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            sparseArray2.put(sparseArray.keyAt(i3), new HashMap((Map) sparseArray.valueAt(i3)));
        }
        this.Q = sparseArray2;
        this.R = iVar.E0.clone();
    }

    @Override // d2.r1
    public final void a(p1 p1Var) {
        this.H.put(p1Var.a, p1Var);
    }

    @Override // d2.r1
    public final s1 b() {
        return new i(this);
    }

    @Override // d2.r1
    public final r1 c() {
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
