package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qu0 extends v4.k {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public qu0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // v4.k
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override // v4.k
    public final void N() {
        org.telegram.messenger.g0.h3(new pu0(this, 0));
    }

    @Override // v4.k
    public final void P(v4.e1 e1Var) {
        RectF rectF = ProfileActivity.X6;
        this.G.r5();
    }

    @Override // v4.k, v4.m0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a3(this, 24));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().q(null, this.F, true);
        }
        super.m();
    }
}
