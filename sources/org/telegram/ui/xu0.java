package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class xu0 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ xu0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // v4.u0
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
                if (profileActivity.G0 && i7 != 2) {
                    profileActivity.G0 = false;
                }
                if (i7 == 0 && !profileActivity.G1 && (m10 = profileActivity.c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                if (g5Var != null) {
                    boolean z10 = i7 != 0;
                    profileActivity.z1 = z10;
                    g5Var.setEnabled((z10 || profileActivity.q2) ? false : true);
                }
                vv0 vv0Var = profileActivity.O;
                boolean z11 = profileActivity.a.J1;
                vv0Var.getClass();
                break;
        }
    }

    @Override // v4.u0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                hi.l3 l3Var = profileActivity.X;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                profileActivity.O3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.c.N0() > profileActivity.y4 - 8) {
                    profileActivity.h4(false);
                }
                vv0 vv0Var = profileActivity.O;
                vv0Var.setPinnedToTop(vv0Var.getY() <= 0.0f);
                profileActivity.s5();
                break;
        }
    }
}
