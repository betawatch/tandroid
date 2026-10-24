package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ zx0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.c9) {
                    org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                    wh.n nVar = c9Var.a;
                    ProfileActivity profileActivity = this.b;
                    nVar.setLoading(profileActivity.k5);
                    c9Var.b.setLoading(profileActivity.k5);
                    break;
                }
                break;
            case 1:
                ProfileActivity.m0(this.b, (Boolean) obj);
                break;
            case 2:
                ProfileActivity profileActivity2 = this.b;
                profileActivity2.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity2.showDialog(new org.telegram.ui.Components.aw(profileActivity2, profileActivity2.getParentActivity(), profileActivity2.A0, arrayList));
                break;
            default:
                View view2 = (View) obj;
                boolean z10 = view2 instanceof org.telegram.ui.Cells.l4;
                ProfileActivity profileActivity3 = this.b;
                if (z10) {
                    ((org.telegram.ui.Cells.l4) view2).setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, profileActivity3.A0));
                } else if (view2 instanceof org.telegram.ui.Cells.c9) {
                    ((org.telegram.ui.Cells.c9) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    ((org.telegram.ui.Cells.j) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.i5) {
                    ((org.telegram.ui.Cells.i5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof ig.h1) {
                    ig.h1 h1Var = (ig.h1) view2;
                    org.telegram.ui.Components.nq nqVar = h1Var.r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.k6.o6;
                    org.telegram.ui.ActionBar.g6 g6Var = h1Var.a;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                    h1Var.a(w02);
                    int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                    h1Var.a(w03);
                    int o13 = org.telegram.ui.ActionBar.k6.o1(0.22f, w03);
                    nqVar.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, o12, o13, o13));
                    int w04 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                    h1Var.a(w04);
                    nqVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) view2).updateColors();
                }
                f01 f01Var = profileActivity3.d;
                profileActivity3.a.getClass();
                RecyclerView.R(view2);
                f01Var.getClass();
                profileActivity3.d.getClass();
                break;
        }
    }
}
