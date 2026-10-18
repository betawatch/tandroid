package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class qy0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ qy0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.b.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = this.b;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i10 != 2) {
                    profileActivity.G0 = false;
                }
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
                if (u0Var != null) {
                    boolean z10 = i10 != 0;
                    profileActivity.A1 = z10;
                    u0Var.setEnabled((z10 || profileActivity.q2) ? false : true);
                }
                pz0 pz0Var = profileActivity.O;
                boolean z11 = profileActivity.a.I1;
                pz0Var.getClass();
                break;
        }
    }

    @Override // s4.r0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                org.telegram.ui.Components.r40 r40Var = profileActivity.X;
                if (r40Var != null) {
                    r40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.D1 != null && !profileActivity.E1 && profileActivity.c.N0() > profileActivity.w4 - 8) {
                    profileActivity.R3(false);
                }
                pz0 pz0Var = profileActivity.O;
                pz0Var.setPinnedToTop(pz0Var.getY() <= 0.0f);
                profileActivity.U4();
                break;
        }
    }
}
