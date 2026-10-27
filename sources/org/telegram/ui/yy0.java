package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yy0 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ yy0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // s4.u0
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
                if (profileActivity.F0 && i10 != 2) {
                    profileActivity.F0 = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                if (w0Var != null) {
                    boolean z10 = i10 != 0;
                    profileActivity.z1 = z10;
                    w0Var.setEnabled((z10 || profileActivity.p2) ? false : true);
                }
                xz0 xz0Var = profileActivity.N;
                boolean z11 = profileActivity.a.I1;
                xz0Var.getClass();
                break;
        }
    }

    @Override // s4.u0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                org.telegram.ui.Components.t40 t40Var = profileActivity.W;
                if (t40Var != null) {
                    t40Var.b(true);
                }
                profileActivity.I3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.c.N0() > profileActivity.A4 - 8) {
                    profileActivity.a4(false);
                }
                xz0 xz0Var = profileActivity.N;
                xz0Var.setPinnedToTop(xz0Var.getY() <= 0.0f);
                profileActivity.g5();
                break;
        }
    }
}
