package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public final /* synthetic */ v5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(v5 v5Var, Activity activity) {
        super(activity);
        this.a = v5Var;
        final int i3 = 0;
        setWillNotDraw(false);
        ci.t4 t4Var = new ci.t4(v5Var, getContext());
        ci.t4 t4Var2 = new ci.t4(v5Var, getContext());
        ci.t4 t4Var3 = new ci.t4(v5Var, getContext());
        t4Var.c(R.drawable.filled_boost_plus, org.telegram.messenger.bd.M0(2131753664, null));
        t4Var2.c(R.drawable.filled_gift_premium, org.telegram.messenger.bd.M0(2131749561, null));
        t4Var3.c(R.drawable.filled_info, org.telegram.messenger.bd.M0(2131750831, null));
        t4Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r5
            public final /* synthetic */ t5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i10 = i3;
                t5 t5Var = this.b;
                switch (i10) {
                    case 0:
                        v5 v5Var2 = t5Var.a;
                        long j10 = v5Var2.S;
                        org.telegram.messenger.e3 e3Var = v5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.U;
                        int i11 = vg.i0.P2;
                        if (e3Var != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            vg.i0 i0Var = new vg.i0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            i0Var.A1(e3Var);
                            i0Var.z1(tL_premium_boostsStatus, true);
                            i0Var.B1(j10);
                            i0Var.Z1 = null;
                            v5Var2.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        v5 v5Var3 = t5Var.a;
                        v5Var3.y0(true);
                        long j11 = v5Var3.S;
                        e6Var = ((org.telegram.ui.ActionBar.d2) v5Var3).resourceProvider;
                        xg.n.I0(v5Var3, e6Var, j11, null);
                        xg.n.m1.I0 = new s5(t5Var, 0);
                        break;
                    default:
                        v5 v5Var4 = t5Var.a;
                        vg.i0 i0Var2 = new vg.i0(31, v5Var4.T, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        i0Var2.z1(v5Var4.U, true);
                        i0Var2.B1(v5Var4.S);
                        v5Var4.showDialog(i0Var2);
                        break;
                }
            }
        });
        final int i10 = 1;
        t4Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r5
            public final /* synthetic */ t5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i102 = i10;
                t5 t5Var = this.b;
                switch (i102) {
                    case 0:
                        v5 v5Var2 = t5Var.a;
                        long j10 = v5Var2.S;
                        org.telegram.messenger.e3 e3Var = v5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.U;
                        int i11 = vg.i0.P2;
                        if (e3Var != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            vg.i0 i0Var = new vg.i0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            i0Var.A1(e3Var);
                            i0Var.z1(tL_premium_boostsStatus, true);
                            i0Var.B1(j10);
                            i0Var.Z1 = null;
                            v5Var2.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        v5 v5Var3 = t5Var.a;
                        v5Var3.y0(true);
                        long j11 = v5Var3.S;
                        e6Var = ((org.telegram.ui.ActionBar.d2) v5Var3).resourceProvider;
                        xg.n.I0(v5Var3, e6Var, j11, null);
                        xg.n.m1.I0 = new s5(t5Var, 0);
                        break;
                    default:
                        v5 v5Var4 = t5Var.a;
                        vg.i0 i0Var2 = new vg.i0(31, v5Var4.T, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        i0Var2.z1(v5Var4.U, true);
                        i0Var2.B1(v5Var4.S);
                        v5Var4.showDialog(i0Var2);
                        break;
                }
            }
        });
        final int i11 = 2;
        t4Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r5
            public final /* synthetic */ t5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i102 = i11;
                t5 t5Var = this.b;
                switch (i102) {
                    case 0:
                        v5 v5Var2 = t5Var.a;
                        long j10 = v5Var2.S;
                        org.telegram.messenger.e3 e3Var = v5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.U;
                        int i112 = vg.i0.P2;
                        if (e3Var != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            vg.i0 i0Var = new vg.i0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            i0Var.A1(e3Var);
                            i0Var.z1(tL_premium_boostsStatus, true);
                            i0Var.B1(j10);
                            i0Var.Z1 = null;
                            v5Var2.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        v5 v5Var3 = t5Var.a;
                        v5Var3.y0(true);
                        long j11 = v5Var3.S;
                        e6Var = ((org.telegram.ui.ActionBar.d2) v5Var3).resourceProvider;
                        xg.n.I0(v5Var3, e6Var, j11, null);
                        xg.n.m1.I0 = new s5(t5Var, 0);
                        break;
                    default:
                        v5 v5Var4 = t5Var.a;
                        vg.i0 i0Var2 = new vg.i0(31, v5Var4.T, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        i0Var2.z1(v5Var4.U, true);
                        i0Var2.B1(v5Var4.S);
                        v5Var4.showDialog(i0Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(t4Var, b8.mf.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (org.telegram.messenger.hp.s1(v5Var.T).p4 && org.telegram.messenger.t3.N(v5Var.j0)) {
            linearLayout.addView(t4Var2, b8.mf.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(t4Var3, b8.mf.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, b8.mf.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
