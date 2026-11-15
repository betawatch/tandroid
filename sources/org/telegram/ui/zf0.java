package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zf0 extends pi.k {
    public Runnable W;

    @Override // pi.k, v4.k
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        yf0 yf0Var = new yf0(this, 0);
        this.W = yf0Var;
        org.telegram.messenger.g0.h3(yf0Var);
    }

    @Override // pi.k
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

    @Override // pi.k, v4.k, v4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        yf0 yf0Var = new yf0(this, 1);
        this.W = yf0Var;
        org.telegram.messenger.g0.h3(yf0Var);
    }

    @Override // v4.k
    public final void F() {
    }
}
