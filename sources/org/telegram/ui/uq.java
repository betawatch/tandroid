package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uq extends f2.n {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ jr G;

    public uq(jr jrVar) {
        this.G = jrVar;
    }

    @Override // f2.n
    public final void N() {
        this.F.unlock();
    }

    @Override // f2.n
    public final void O() {
        this.G.c.invalidate();
    }

    @Override // f2.n
    public final void P(f2.q1 q1Var) {
        this.G.c.invalidate();
    }

    @Override // f2.n, f2.w0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
