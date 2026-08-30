package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yx0 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ yx0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.y8) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                    ih.s sVar = y8Var.a;
                    ProfileActivity profileActivity = this.b;
                    sVar.setLoading(profileActivity.f5);
                    y8Var.b.setLoading(profileActivity.f5);
                    break;
                }
                break;
            default:
                boolean z4 = view instanceof org.telegram.ui.Cells.m4;
                ProfileActivity profileActivity2 = this.b;
                if (z4) {
                    ((org.telegram.ui.Cells.m4) view).setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, profileActivity2.w0));
                } else if (view instanceof org.telegram.ui.Cells.y8) {
                    ((org.telegram.ui.Cells.y8) view).e();
                } else if (view instanceof org.telegram.ui.Cells.o8) {
                    ((org.telegram.ui.Cells.o8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.j6.P1.linkColor = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, ((org.telegram.ui.Cells.j) view).F);
                } else if (view instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view).getCheckBox().invalidate();
                } else if (view instanceof uf.a1) {
                    uf.a1 a1Var = (uf.a1) view;
                    org.telegram.ui.Components.bq bqVar = a1Var.r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.j6.o6;
                    org.telegram.ui.ActionBar.f6 f6Var = a1Var.a;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    a1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    a1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.j6.l1(0.22f, v03);
                    bqVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    a1Var.a(v04);
                    bqVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.g6) {
                    ((org.telegram.ui.Cells.g6) view).e();
                }
                g01 g01Var = profileActivity2.d;
                profileActivity2.a.getClass();
                RecyclerView.R(view);
                g01Var.getClass();
                profileActivity2.d.getClass();
                break;
        }
    }
}
