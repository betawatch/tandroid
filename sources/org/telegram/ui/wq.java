package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wq extends f2.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ lr G;

    public wq(lr lrVar) {
        this.G = lrVar;
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
    public final void P(f2.o1 o1Var) {
        this.G.c.invalidate();
    }

    @Override // f2.l, f2.v0
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
