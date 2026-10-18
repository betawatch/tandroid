package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class wq extends s4.k {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ jr G;

    public wq(jr jrVar) {
        this.G = jrVar;
    }

    @Override // s4.k
    public final void N() {
        this.F.unlock();
    }

    @Override // s4.k
    public final void O() {
        this.G.c.invalidate();
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        this.G.c.invalidate();
    }

    @Override // s4.k, s4.l0
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
