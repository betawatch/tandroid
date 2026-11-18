package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class r5 extends FrameLayout {
    public final /* synthetic */ t5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(t5 t5Var, Activity activity) {
        super(activity);
        this.a = t5Var;
        final int i7 = 0;
        setWillNotDraw(false);
        di.n4 n4Var = new di.n4(t5Var, getContext());
        di.n4 n4Var2 = new di.n4(t5Var, getContext());
        di.n4 n4Var3 = new di.n4(t5Var, getContext());
        n4Var.c(R.drawable.filled_boost_plus, org.telegram.messenger.gd.M0(2131753662, null));
        n4Var2.c(R.drawable.filled_gift_premium, org.telegram.messenger.gd.M0(2131749378, null));
        n4Var3.c(R.drawable.filled_info, org.telegram.messenger.gd.M0(2131750819, null));
        n4Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p5
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.i6 i6Var;
                int i10 = i7;
                r5 r5Var = this.b;
                switch (i10) {
                    case 0:
                        t5 t5Var2 = r5Var.a;
                        long j3 = t5Var2.S;
                        org.telegram.messenger.g3 g3Var = t5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.U;
                        int i11 = ug.l0.S2;
                        if (g3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.l0 l0Var = new ug.l0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            l0Var.B1(g3Var);
                            l0Var.A1(tL_premium_boostsStatus, true);
                            l0Var.C1(j3);
                            l0Var.c2 = null;
                            t5Var2.showDialog(l0Var);
                            break;
                        }
                        break;
                    case 1:
                        t5 t5Var3 = r5Var.a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.S;
                        i6Var = ((org.telegram.ui.ActionBar.h2) t5Var3).resourceProvider;
                        wg.l.J0(t5Var3, i6Var, j10, null);
                        wg.l.p1.I0 = new q5(r5Var, 0);
                        break;
                    default:
                        t5 t5Var4 = r5Var.a;
                        ug.l0 l0Var2 = new ug.l0(31, t5Var4.T, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        l0Var2.A1(t5Var4.U, true);
                        l0Var2.C1(t5Var4.S);
                        t5Var4.showDialog(l0Var2);
                        break;
                }
            }
        });
        final int i10 = 1;
        n4Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p5
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.i6 i6Var;
                int i102 = i10;
                r5 r5Var = this.b;
                switch (i102) {
                    case 0:
                        t5 t5Var2 = r5Var.a;
                        long j3 = t5Var2.S;
                        org.telegram.messenger.g3 g3Var = t5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.U;
                        int i11 = ug.l0.S2;
                        if (g3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.l0 l0Var = new ug.l0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            l0Var.B1(g3Var);
                            l0Var.A1(tL_premium_boostsStatus, true);
                            l0Var.C1(j3);
                            l0Var.c2 = null;
                            t5Var2.showDialog(l0Var);
                            break;
                        }
                        break;
                    case 1:
                        t5 t5Var3 = r5Var.a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.S;
                        i6Var = ((org.telegram.ui.ActionBar.h2) t5Var3).resourceProvider;
                        wg.l.J0(t5Var3, i6Var, j10, null);
                        wg.l.p1.I0 = new q5(r5Var, 0);
                        break;
                    default:
                        t5 t5Var4 = r5Var.a;
                        ug.l0 l0Var2 = new ug.l0(31, t5Var4.T, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        l0Var2.A1(t5Var4.U, true);
                        l0Var2.C1(t5Var4.S);
                        t5Var4.showDialog(l0Var2);
                        break;
                }
            }
        });
        final int i11 = 2;
        n4Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p5
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.i6 i6Var;
                int i102 = i11;
                r5 r5Var = this.b;
                switch (i102) {
                    case 0:
                        t5 t5Var2 = r5Var.a;
                        long j3 = t5Var2.S;
                        org.telegram.messenger.g3 g3Var = t5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.U;
                        int i112 = ug.l0.S2;
                        if (g3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.l0 l0Var = new ug.l0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            l0Var.B1(g3Var);
                            l0Var.A1(tL_premium_boostsStatus, true);
                            l0Var.C1(j3);
                            l0Var.c2 = null;
                            t5Var2.showDialog(l0Var);
                            break;
                        }
                        break;
                    case 1:
                        t5 t5Var3 = r5Var.a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.S;
                        i6Var = ((org.telegram.ui.ActionBar.h2) t5Var3).resourceProvider;
                        wg.l.J0(t5Var3, i6Var, j10, null);
                        wg.l.p1.I0 = new q5(r5Var, 0);
                        break;
                    default:
                        t5 t5Var4 = r5Var.a;
                        ug.l0 l0Var2 = new ug.l0(31, t5Var4.T, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        l0Var2.A1(t5Var4.U, true);
                        l0Var2.C1(t5Var4.S);
                        t5Var4.showDialog(l0Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(n4Var, c8.ma.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (org.telegram.messenger.mp.u1(t5Var.T).s4 && org.telegram.messenger.v3.N(t5Var.j0)) {
            linearLayout.addView(n4Var2, c8.ma.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(n4Var3, c8.ma.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, c8.ma.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
