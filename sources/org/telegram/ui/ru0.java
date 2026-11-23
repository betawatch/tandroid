package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ru0 extends v4.l {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public ru0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // v4.l
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override // v4.l
    public final void N() {
        org.telegram.messenger.g0.g3(new qu0(this, 0));
    }

    @Override // v4.l
    public final void P(v4.f1 f1Var) {
        RectF rectF = ProfileActivity.Z6;
        this.G.s5();
    }

    @Override // v4.l, v4.n0
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
