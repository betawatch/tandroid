package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xx0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ xx0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.b9) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    wh.n nVar = b9Var.a;
                    ProfileActivity profileActivity = this.b;
                    nVar.setLoading(profileActivity.k5);
                    b9Var.b.setLoading(profileActivity.k5);
                    break;
                }
                break;
            case 1:
                View view2 = (View) obj;
                boolean z10 = view2 instanceof org.telegram.ui.Cells.l4;
                ProfileActivity profileActivity2 = this.b;
                if (z10) {
                    ((org.telegram.ui.Cells.l4) view2).setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, profileActivity2.A0));
                } else if (view2 instanceof org.telegram.ui.Cells.b9) {
                    ((org.telegram.ui.Cells.b9) view2).e();
                } else if (view2 instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view2).v();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.h6.P1.linkColor = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, ((org.telegram.ui.Cells.j) view2).I);
                } else if (view2 instanceof org.telegram.ui.Cells.i5) {
                    ((org.telegram.ui.Cells.i5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof ig.i1) {
                    ig.i1 i1Var = (ig.i1) view2;
                    org.telegram.ui.Components.nq nqVar = i1Var.r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.h6.o6;
                    org.telegram.ui.ActionBar.d6 d6Var = i1Var.a;
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                    i1Var.a(w02);
                    int m12 = org.telegram.ui.ActionBar.h6.m1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                    i1Var.a(w03);
                    int m13 = org.telegram.ui.ActionBar.h6.m1(0.22f, w03);
                    nqVar.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, m12, m13, m13));
                    int w04 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                    i1Var.a(w04);
                    nqVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.g6) {
                    ((org.telegram.ui.Cells.g6) view2).d();
                }
                d01 d01Var = profileActivity2.d;
                profileActivity2.a.getClass();
                RecyclerView.R(view2);
                d01Var.getClass();
                profileActivity2.d.getClass();
                break;
            case 2:
                ProfileActivity.m0(this.b, (Boolean) obj);
                break;
            default:
                ProfileActivity profileActivity3 = this.b;
                profileActivity3.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity3.showDialog(new org.telegram.ui.Components.aw(profileActivity3, profileActivity3.getParentActivity(), profileActivity3.A0, arrayList));
                break;
        }
    }
}
