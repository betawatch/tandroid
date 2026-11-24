// default package

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qo8 extends sc3 {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public qo8(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // sc3
    public final long K(long j, long j2, long j3) {
        return 0L;
    }

    @Override // sc3
    public final void N() {
        gm.c3(new q78(this, (byte) 28));
    }

    @Override // sc3
    public final void P(u69 u69Var) {
        RectF rectF = ProfileActivity.e7;
        this.G.M3();
    }

    @Override // sc3, d69
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new fx7(this, (byte) 15));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().p(null, this.F, true);
        }
        super.m();
    }
}
