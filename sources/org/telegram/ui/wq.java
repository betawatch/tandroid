package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wq extends f2.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ jr G;

    public wq(jr jrVar) {
        this.G = jrVar;
    }

    @Override // f2.l
    public final void N() {
        this.F.unlock();
    }

    @Override // f2.l
    public final void O() {
        this.G.c.invalidate();
    }

    @Override // f2.l
    public final void P(f2.n1 n1Var) {
        this.G.c.invalidate();
    }

    @Override // f2.l, f2.u0
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
