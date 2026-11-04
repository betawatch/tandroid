package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zp extends u4.k {
    public final g2.g F = new g2.g((int[]) null);
    public final /* synthetic */ nq G;

    public zp(nq nqVar) {
        this.G = nqVar;
    }

    @Override // u4.k
    public final void N() {
        this.F.e();
    }

    @Override // u4.k
    public final void O() {
        this.G.c.invalidate();
    }

    @Override // u4.k
    public final void P(u4.d1 d1Var) {
        this.G.c.invalidate();
    }

    @Override // u4.k, u4.m0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.d();
        }
        super.m();
    }
}
