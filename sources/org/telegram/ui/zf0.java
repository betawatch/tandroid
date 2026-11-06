package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class zf0 extends mi.l {
    public Runnable W;

    @Override // mi.l, v4.k
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

    @Override // mi.l
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

    @Override // mi.l, v4.k, v4.l0
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
