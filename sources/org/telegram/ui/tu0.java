package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class tu0 extends v4.b0 {
    public final /* synthetic */ ProfileActivity I;

    public tu0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // v4.b0, v4.n0
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.c.m(0);
        if (m10 != null && !profileActivity.F0) {
            int top = m10.getTop() - profileActivity.j4();
            boolean z9 = profileActivity.n2;
            if (z9 || top <= i7) {
                if (z9) {
                    if (i7 >= top) {
                        profileActivity.n2 = false;
                    } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.o2) {
                        i7 /= 2;
                    }
                }
            } else if (!profileActivity.n0.X0.isEmpty() && profileActivity.e0.getImageReceiver().L() && !org.telegram.messenger.g0.C1() && ((!profileActivity.m2 && !org.telegram.messenger.g0.Q1()) || profileActivity.I0)) {
                profileActivity.n2 = profileActivity.I2 == null;
            }
            i7 = top;
        }
        if (!profileActivity.N1 || profileActivity.a.P0) {
            return super.o0(i7, v0Var, a1Var);
        }
        return 0;
    }

    @Override // v4.b0, v4.n0
    public final boolean y0() {
        return this.I.q0 != null;
    }

    @Override // v4.b0
    public final void z0(v4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        iArr[0] = Math.max(iArr[0], ProfileActivity.J0(this.I));
    }
}
