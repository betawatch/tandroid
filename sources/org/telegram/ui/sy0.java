package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class sy0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ sy0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.d9) {
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                    vh.o oVar = d9Var.a;
                    ProfileActivity profileActivity = this.b;
                    oVar.setLoading(profileActivity.i5);
                    d9Var.b.setLoading(profileActivity.i5);
                    break;
                }
                break;
            default:
                boolean z10 = view instanceof org.telegram.ui.Cells.n4;
                ProfileActivity profileActivity2 = this.b;
                if (z10) {
                    ((org.telegram.ui.Cells.n4) view).setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, profileActivity2.z0));
                } else if (view instanceof org.telegram.ui.Cells.d9) {
                    ((org.telegram.ui.Cells.d9) view).e();
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.j6.P1.linkColor = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, ((org.telegram.ui.Cells.j) view).I);
                } else if (view instanceof org.telegram.ui.Cells.k5) {
                    ((org.telegram.ui.Cells.k5) view).getCheckBox().invalidate();
                } else if (view instanceof hg.j1) {
                    hg.j1 j1Var = (hg.j1) view;
                    org.telegram.ui.Components.dq dqVar = j1Var.r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.j6.o6;
                    org.telegram.ui.ActionBar.f6 f6Var = j1Var.a;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    j1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    j1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.j6.l1(0.22f, v03);
                    dqVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    j1Var.a(v04);
                    dqVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.i6) {
                    ((org.telegram.ui.Cells.i6) view).e();
                }
                z01 z01Var = profileActivity2.d;
                profileActivity2.a.getClass();
                RecyclerView.S(view);
                z01Var.getClass();
                profileActivity2.d.getClass();
                break;
        }
    }
}
