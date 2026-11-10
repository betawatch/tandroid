package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r5 extends FrameLayout {
    public final /* synthetic */ t5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(t5 t5Var, Activity activity) {
        super(activity);
        this.a = t5Var;
        final int i7 = 0;
        setWillNotDraw(false);
        bi.m5 m5Var = new bi.m5(t5Var, getContext());
        bi.m5 m5Var2 = new bi.m5(t5Var, getContext());
        bi.m5 m5Var3 = new bi.m5(t5Var, getContext());
        m5Var.c(R.drawable.filled_boost_plus, org.telegram.messenger.id.M0(2131753664, null));
        m5Var2.c(R.drawable.filled_gift_premium, org.telegram.messenger.id.M0(2131749553, null));
        m5Var3.c(R.drawable.filled_info, org.telegram.messenger.id.M0(2131750830, null));
        m5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p5
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.h6 h6Var;
                int i10 = i7;
                r5 r5Var = this.b;
                switch (i10) {
                    case 0:
                        t5 t5Var2 = r5Var.a;
                        long j3 = t5Var2.R;
                        org.telegram.messenger.e3 e3Var = t5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.T;
                        int i11 = ug.i0.R2;
                        if (e3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.i0 i0Var = new ug.i0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            i0Var.A1(e3Var);
                            i0Var.z1(tL_premium_boostsStatus, true);
                            i0Var.B1(j3);
                            i0Var.b2 = null;
                            t5Var2.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        t5 t5Var3 = r5Var.a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.R;
                        h6Var = ((org.telegram.ui.ActionBar.f2) t5Var3).resourceProvider;
                        wg.l.I0(t5Var3, h6Var, j10, null);
                        wg.l.o1.H0 = new q5(r5Var, 0);
                        break;
                    default:
                        t5 t5Var4 = r5Var.a;
                        ug.i0 i0Var2 = new ug.i0(31, t5Var4.S, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        i0Var2.z1(t5Var4.T, true);
                        i0Var2.B1(t5Var4.R);
                        t5Var4.showDialog(i0Var2);
                        break;
                }
            }
        });
        final int i10 = 1;
        m5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p5
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.h6 h6Var;
                int i102 = i10;
                r5 r5Var = this.b;
                switch (i102) {
                    case 0:
                        t5 t5Var2 = r5Var.a;
                        long j3 = t5Var2.R;
                        org.telegram.messenger.e3 e3Var = t5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.T;
                        int i11 = ug.i0.R2;
                        if (e3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.i0 i0Var = new ug.i0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            i0Var.A1(e3Var);
                            i0Var.z1(tL_premium_boostsStatus, true);
                            i0Var.B1(j3);
                            i0Var.b2 = null;
                            t5Var2.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        t5 t5Var3 = r5Var.a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.R;
                        h6Var = ((org.telegram.ui.ActionBar.f2) t5Var3).resourceProvider;
                        wg.l.I0(t5Var3, h6Var, j10, null);
                        wg.l.o1.H0 = new q5(r5Var, 0);
                        break;
                    default:
                        t5 t5Var4 = r5Var.a;
                        ug.i0 i0Var2 = new ug.i0(31, t5Var4.S, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        i0Var2.z1(t5Var4.T, true);
                        i0Var2.B1(t5Var4.R);
                        t5Var4.showDialog(i0Var2);
                        break;
                }
            }
        });
        final int i11 = 2;
        m5Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p5
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.h6 h6Var;
                int i102 = i11;
                r5 r5Var = this.b;
                switch (i102) {
                    case 0:
                        t5 t5Var2 = r5Var.a;
                        long j3 = t5Var2.R;
                        org.telegram.messenger.e3 e3Var = t5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.T;
                        int i112 = ug.i0.R2;
                        if (e3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.i0 i0Var = new ug.i0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            i0Var.A1(e3Var);
                            i0Var.z1(tL_premium_boostsStatus, true);
                            i0Var.B1(j3);
                            i0Var.b2 = null;
                            t5Var2.showDialog(i0Var);
                            break;
                        }
                        break;
                    case 1:
                        t5 t5Var3 = r5Var.a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.R;
                        h6Var = ((org.telegram.ui.ActionBar.f2) t5Var3).resourceProvider;
                        wg.l.I0(t5Var3, h6Var, j10, null);
                        wg.l.o1.H0 = new q5(r5Var, 0);
                        break;
                    default:
                        t5 t5Var4 = r5Var.a;
                        ug.i0 i0Var2 = new ug.i0(31, t5Var4.S, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        i0Var2.z1(t5Var4.T, true);
                        i0Var2.B1(t5Var4.R);
                        t5Var4.showDialog(i0Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(m5Var, c8.ha.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (org.telegram.messenger.qp.s1(t5Var.S).p4 && org.telegram.messenger.t3.N(t5Var.i0)) {
            linearLayout.addView(m5Var2, c8.ha.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(m5Var3, c8.ha.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, c8.ha.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
