package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vt0 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ vt0(ProfileActivity profileActivity, int i3) {
        this.a = i3;
        this.b = profileActivity;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i3) {
            case 0:
                View view = (View) obj;
                RectF rectF = ProfileActivity.T6;
                if (view instanceof org.telegram.ui.Cells.w8) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    w8Var.a.setLoading(profileActivity.j5);
                    w8Var.b.setLoading(profileActivity.j5);
                    break;
                }
                break;
            case 1:
                ProfileActivity.q0(profileActivity, (Boolean) obj);
                break;
            case 2:
                RectF rectF2 = ProfileActivity.T6;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.pu(profileActivity, profileActivity.getParentActivity(), profileActivity.A0, arrayList));
                break;
            default:
                View view2 = (View) obj;
                RectF rectF3 = ProfileActivity.T6;
                if (view2 instanceof org.telegram.ui.Cells.n4) {
                    ((org.telegram.ui.Cells.n4) view2).setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, profileActivity.A0));
                } else if (view2 instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.l8) {
                    ((org.telegram.ui.Cells.l8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    ((org.telegram.ui.Cells.j) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.h5) {
                    ((org.telegram.ui.Cells.h5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof lg.g1) {
                    lg.g1 g1Var = (lg.g1) view2;
                    org.telegram.ui.Components.mp mpVar = g1Var.r;
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i10 = org.telegram.ui.ActionBar.k6.o6;
                    org.telegram.ui.ActionBar.e6 e6Var = g1Var.a;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
                    g1Var.a(w02);
                    int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
                    g1Var.a(w03);
                    int r13 = org.telegram.ui.ActionBar.k6.r1(0.22f, w03);
                    mpVar.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, r12, r13, r13));
                    int w04 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
                    g1Var.a(w04);
                    mpVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.e6) {
                    ((org.telegram.ui.Cells.e6) view2).updateColors();
                }
                bw0 bw0Var = profileActivity.d;
                profileActivity.a.getClass();
                bw0Var.d(RecyclerView.R(view2));
                profileActivity.d.getClass();
                break;
        }
    }
}
