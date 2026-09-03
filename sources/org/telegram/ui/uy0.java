package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class uy0 extends f2.l {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public uy0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // f2.l
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // f2.l
    public final void N() {
        AndroidUtilities.runOnUIThread(new gl0(this, 28));
    }

    @Override // f2.l
    public final void P(f2.l1 l1Var) {
        this.G.U4();
    }

    @Override // f2.l, f2.t0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new g3(this, 26));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
