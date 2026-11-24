// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ro8 extends u46 {
    public final /* synthetic */ ProfileActivity I;

    public ro8(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // u46, f69
    public final int n0(int i, ki2 ki2Var, r69 r69Var) {
        ProfileActivity profileActivity = this.I;
        View m = profileActivity.c.m(0);
        if (m != null && !profileActivity.G0) {
            int top = m.getTop() - profileActivity.e2();
            if (profileActivity.p2) {
                if (i >= top) {
                    profileActivity.p2 = false;
                    i = top;
                } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.q2) {
                    i /= 2;
                }
            } else if (top > i) {
                if (!profileActivity.o0.Y0.isEmpty() && profileActivity.f0.getImageReceiver().E() && !gm.A1() && ((!profileActivity.o2 && !gm.O1()) || profileActivity.J0)) {
                    profileActivity.p2 = profileActivity.K2 == null;
                }
                i = top;
            }
        }
        if (!profileActivity.O1 || profileActivity.a.Q0) {
            return super.n0(i, ki2Var, r69Var);
        }
        return 0;
    }

    @Override // u46, f69
    public final boolean x0() {
        return this.I.r0 != null;
    }

    @Override // u46
    public final void y0(r69 r69Var, int[] iArr) {
        super.y0(r69Var, iArr);
        int i = iArr[0];
        RectF rectF = ProfileActivity.e7;
        iArr[0] = Math.max(i, this.I.d2());
    }
}
