package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class xu0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ xu0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        View m10;
        switch (this.a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = this.b;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.F0 && i7 != 2) {
                    profileActivity.F0 = false;
                }
                if (i7 == 0 && !profileActivity.F1 && (m10 = profileActivity.c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
                if (f5Var != null) {
                    boolean z9 = i7 != 0;
                    profileActivity.y1 = z9;
                    f5Var.setEnabled((z9 || profileActivity.o2) ? false : true);
                }
                vv0 vv0Var = profileActivity.N;
                boolean z10 = profileActivity.a.I1;
                vv0Var.getClass();
                break;
        }
    }

    @Override // v4.s0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                fi.m3 m3Var = profileActivity.W;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                profileActivity.O3();
                if (profileActivity.B1 != null && !profileActivity.C1 && profileActivity.c.N0() > profileActivity.u4 - 8) {
                    profileActivity.h4(false);
                }
                vv0 vv0Var = profileActivity.N;
                vv0Var.setPinnedToTop(vv0Var.getY() <= 0.0f);
                profileActivity.p5();
                break;
        }
    }
}
