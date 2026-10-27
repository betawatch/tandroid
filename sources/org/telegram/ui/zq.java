package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zq extends s4.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ mr G;

    public zq(mr mrVar) {
        this.G = mrVar;
    }

    @Override // s4.l
    public final void N() {
        this.F.unlock();
    }

    @Override // s4.l
    public final void O() {
        this.G.c.invalidate();
    }

    @Override // s4.l
    public final void P(s4.e1 e1Var) {
        this.G.c.invalidate();
    }

    @Override // s4.l, s4.m0
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
