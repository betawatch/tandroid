// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qm8 extends t26 {
    public final /* synthetic */ ProfileActivity I;

    public qm8(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // t26, d49
    public final int n0(int i, wg2 wg2Var, p49 p49Var) {
        ProfileActivity profileActivity = this.I;
        View m = profileActivity.c.m(0);
        if (m != null && !profileActivity.G0) {
            int top = m.getTop() - profileActivity.c2();
            if (profileActivity.p2) {
                if (i >= top) {
                    profileActivity.p2 = false;
                    i = top;
                } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.q2) {
                    i /= 2;
                }
            } else if (top > i) {
                if (!profileActivity.o0.Y0.isEmpty() && profileActivity.f0.getImageReceiver().E() && !gl.A1() && ((!profileActivity.o2 && !gl.O1()) || profileActivity.J0)) {
                    profileActivity.p2 = profileActivity.K2 == null;
                }
                i = top;
            }
        }
        if (!profileActivity.O1 || profileActivity.a.Q0) {
            return super.n0(i, wg2Var, p49Var);
        }
        return 0;
    }

    @Override // t26, d49
    public final boolean x0() {
        return this.I.r0 != null;
    }

    @Override // t26
    public final void y0(p49 p49Var, int[] iArr) {
        super.y0(p49Var, iArr);
        int i = iArr[0];
        RectF rectF = ProfileActivity.Z6;
        iArr[0] = Math.max(i, this.I.b2());
    }
}
