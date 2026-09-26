package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class xy0 extends s4.j {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public xy0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // s4.j
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override // s4.j
    public final void N() {
        AndroidUtilities.runOnUIThread(new il0(this, 28));
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        this.G.U4();
    }

    @Override // s4.j, s4.m0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new c3(this, 26));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
