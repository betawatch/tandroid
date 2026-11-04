package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tf0 extends ni.l {
    public Runnable W;

    @Override // ni.l, u4.k
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        sf0 sf0Var = new sf0(this, 0);
        this.W = sf0Var;
        org.telegram.messenger.g0.h3(sf0Var);
    }

    @Override // ni.l
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
    }

    @Override // ni.l, u4.k, u4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        sf0 sf0Var = new sf0(this, 1);
        this.W = sf0Var;
        org.telegram.messenger.g0.h3(sf0Var);
    }

    @Override // u4.k
    public final void F() {
    }
}
