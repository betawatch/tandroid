package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xq extends s4.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ kr G;

    public xq(kr krVar) {
        this.G = krVar;
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
