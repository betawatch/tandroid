package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qy0 extends s4.l {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public qy0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // s4.l
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // s4.l
    public final void N() {
        AndroidUtilities.runOnUIThread(new my0(this, 1));
    }

    @Override // s4.l
    public final void P(s4.e1 e1Var) {
        int i10 = ProfileActivity.R6;
        this.G.g5();
    }

    @Override // s4.l, s4.m0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new b3(this, 25));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
