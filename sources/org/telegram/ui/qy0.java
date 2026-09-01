package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qy0 extends f2.j0 {
    public final /* synthetic */ ProfileActivity I;

    public qy0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override // f2.j0, f2.w0
    public final int o0(int i10, bf.f fVar, f2.j1 j1Var) {
        ProfileActivity profileActivity = this.I;
        View m9 = profileActivity.c.m(0);
        if (m9 != null && !profileActivity.C0) {
            int top = m9.getTop() - profileActivity.T3();
            boolean z4 = profileActivity.l2;
            if (z4 || top <= i10) {
                if (z4) {
                    if (i10 >= top) {
                        profileActivity.l2 = false;
                    } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.m2) {
                        i10 /= 2;
                    }
                }
            } else if (!profileActivity.k0.U0.isEmpty() && profileActivity.b0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.k2 && !AndroidUtilities.isTablet()) || profileActivity.F0)) {
                profileActivity.l2 = profileActivity.G2 == null;
            }
            i10 = top;
        }
        if (!profileActivity.L1 || profileActivity.a.L0) {
            return super.o0(i10, fVar, j1Var);
        }
        return 0;
    }

    @Override // f2.j0, f2.w0
    public final boolean y0() {
        return this.I.n0 != null;
    }
}
