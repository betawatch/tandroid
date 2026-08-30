package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ty0 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ ty0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // f2.z0
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
                if (profileActivity.C0 && i10 != 2) {
                    profileActivity.C0 = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                if (w0Var != null) {
                    boolean z4 = i10 != 0;
                    profileActivity.w1 = z4;
                    w0Var.setEnabled((z4 || profileActivity.m2) ? false : true);
                }
                sz0 sz0Var = profileActivity.L;
                boolean z10 = profileActivity.a.H1;
                sz0Var.getClass();
                break;
        }
    }

    @Override // f2.z0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                org.telegram.ui.Components.k40 k40Var = profileActivity.U;
                if (k40Var != null) {
                    k40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.z1 != null && !profileActivity.A1 && profileActivity.c.N0() > profileActivity.s4 - 8) {
                    profileActivity.R3(false);
                }
                sz0 sz0Var = profileActivity.L;
                sz0Var.setPinnedToTop(sz0Var.getY() <= 0.0f);
                profileActivity.U4();
                break;
        }
    }
}
