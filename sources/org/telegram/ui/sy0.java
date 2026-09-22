package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                if (view instanceof org.telegram.ui.Cells.c9) {
                    org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                    vh.o oVar = c9Var.a;
                    ProfileActivity profileActivity = this.b;
                    oVar.setLoading(profileActivity.i5);
                    c9Var.b.setLoading(profileActivity.i5);
                    break;
                }
                break;
            default:
                boolean z10 = view instanceof org.telegram.ui.Cells.m4;
                ProfileActivity profileActivity2 = this.b;
                if (z10) {
                    ((org.telegram.ui.Cells.m4) view).setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L6, profileActivity2.z0));
                } else if (view instanceof org.telegram.ui.Cells.c9) {
                    ((org.telegram.ui.Cells.c9) view).e();
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.i6.P1.linkColor = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, ((org.telegram.ui.Cells.j) view).I);
                } else if (view instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view).getCheckBox().invalidate();
                } else if (view instanceof hg.k1) {
                    hg.k1 k1Var = (hg.k1) view;
                    org.telegram.ui.Components.dq dqVar = k1Var.r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.i6.o6;
                    org.telegram.ui.ActionBar.e6 e6Var = k1Var.a;
                    int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
                    k1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.i6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
                    k1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.i6.l1(0.22f, v03);
                    dqVar.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
                    k1Var.a(v04);
                    dqVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) view).e();
                }
                a11 a11Var = profileActivity2.d;
                profileActivity2.a.getClass();
                RecyclerView.R(view);
                a11Var.getClass();
                profileActivity2.d.getClass();
                break;
        }
    }
}
