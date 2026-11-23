package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class tu0 extends v4.c0 {
    public final /* synthetic */ ProfileActivity I;

    public tu0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // v4.c0, v4.p0
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.c.m(0);
        if (m10 != null && !profileActivity.G0) {
            int top = m10.getTop() - profileActivity.j4();
            boolean z10 = profileActivity.p2;
            if (z10 || top <= i7) {
                if (z10) {
                    if (i7 >= top) {
                        profileActivity.p2 = false;
                    } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.q2) {
                        i7 /= 2;
                    }
                }
            } else if (!profileActivity.o0.Y0.isEmpty() && profileActivity.f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1() && ((!profileActivity.o2 && !org.telegram.messenger.g0.Q1()) || profileActivity.J0)) {
                profileActivity.p2 = profileActivity.K2 == null;
            }
            i7 = top;
        }
        if (!profileActivity.O1 || profileActivity.a.Q0) {
            return super.o0(i7, x0Var, c1Var);
        }
        return 0;
    }

    @Override // v4.c0, v4.p0
    public final boolean y0() {
        return this.I.r0 != null;
    }

    @Override // v4.c0
    public final void z0(v4.c1 c1Var, int[] iArr) {
        super.z0(c1Var, iArr);
        iArr[0] = Math.max(iArr[0], ProfileActivity.J0(this.I));
    }
}
