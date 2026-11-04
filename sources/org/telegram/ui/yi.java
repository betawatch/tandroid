package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yi extends ni.l {
    public Runnable W;
    public final /* synthetic */ wm X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(wm wmVar, wm wmVar2, wi wiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(wmVar2, wiVar, e6Var);
        this.X = wmVar;
    }

    @Override // u4.k
    public final void F() {
        wm wmVar = this.X;
        if (wmVar.ba == -1) {
            wmVar.ba = wmVar.getNotificationCenter().q(wm.pd, wmVar.ba, false);
        }
    }

    @Override // ni.l, u4.k
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        xi xiVar = new xi(this, 1);
        this.W = xiVar;
        org.telegram.messenger.g0.h3(xiVar);
    }

    @Override // ni.l
    public final void W() {
        wm wmVar = this.X;
        wmVar.ba = wmVar.getNotificationCenter().q(wm.pd, wmVar.ba, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
        mi.b0 b0Var = wmVar.a0.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.g0.r(b0Var);
        b0Var.run();
        org.telegram.ui.Components.he heVar = wmVar.a0.Z3;
        org.telegram.messenger.g0.r(heVar);
        heVar.run();
    }

    @Override // ni.l, u4.k, u4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        xi xiVar = new xi(this, 0);
        this.W = xiVar;
        org.telegram.messenger.g0.h3(xiVar);
    }
}
