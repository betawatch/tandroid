package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wu0 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ wu0(ProfileActivity profileActivity, int i7) {
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
                uv0 uv0Var = profileActivity.O;
                boolean z11 = profileActivity.a.J1;
                uv0Var.getClass();
                break;
        }
    }

    @Override // v4.u0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                hi.u3 u3Var = profileActivity.X;
                if (u3Var != null) {
                    u3Var.f(true);
                }
                profileActivity.O3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.c.N0() > profileActivity.y4 - 8) {
                    profileActivity.h4(false);
                }
                uv0 uv0Var = profileActivity.O;
                uv0Var.setPinnedToTop(uv0Var.getY() <= 0.0f);
                profileActivity.s5();
                break;
        }
    }
}
