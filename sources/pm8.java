// default package

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pm8 extends gb3 {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public pm8(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // gb3
    public final long K(long j, long j2, long j3) {
        return 0L;
    }

    @Override // gb3
    public final void N() {
        gl.c3(new w88(this, (byte) 20));
    }

    @Override // gb3
    public final void P(s49 s49Var) {
        RectF rectF = ProfileActivity.Z6;
        this.G.I3();
    }

    @Override // gb3, b49
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new u28(this, (byte) 13));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().q(null, this.F, true);
        }
        super.m();
    }
}
