package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r5 extends FrameLayout {
    public final /* synthetic */ t5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(t5 t5Var, Activity activity) {
        super(activity);
        this.a = t5Var;
        final int i7 = 0;
        setWillNotDraw(false);
        di.k4 k4Var = new di.k4(t5Var, getContext());
        di.k4 k4Var2 = new di.k4(t5Var, getContext());
        di.k4 k4Var3 = new di.k4(t5Var, getContext());
        k4Var.c(R.drawable.filled_boost_plus, org.telegram.messenger.hd.M0(2131753664, null));
        k4Var2.c(R.drawable.filled_gift_premium, org.telegram.messenger.hd.M0(2131749553, null));
        k4Var3.c(R.drawable.filled_info, org.telegram.messenger.hd.M0(2131750830, null));
        k4Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p5
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i10 = i7;
                r5 r5Var = this.b;
                switch (i10) {
                    case 0:
                        t5 t5Var2 = r5Var.a;
                        long j3 = t5Var2.S;
                        org.telegram.messenger.e3 e3Var = t5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.U;
                        int i11 = ug.j0.S2;
                        if (e3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.j0 j0Var = new ug.j0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            j0Var.A1(e3Var);
                            j0Var.z1(tL_premium_boostsStatus, true);
                            j0Var.B1(j3);
                            j0Var.c2 = null;
                            t5Var2.showDialog(j0Var);
                            break;
                        }
                        break;
                    case 1:
                        t5 t5Var3 = r5Var.a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.S;
                        e6Var = ((org.telegram.ui.ActionBar.e2) t5Var3).resourceProvider;
                        wg.l.I0(t5Var3, e6Var, j10, null);
                        wg.l.p1.I0 = new q5(r5Var, 0);
                        break;
                    default:
                        t5 t5Var4 = r5Var.a;
                        ug.j0 j0Var2 = new ug.j0(31, t5Var4.T, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        j0Var2.z1(t5Var4.U, true);
                        j0Var2.B1(t5Var4.S);
                        t5Var4.showDialog(j0Var2);
                        break;
                }
            }
        });
        final int i10 = 1;
        k4Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p5
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i102 = i10;
                r5 r5Var = this.b;
                switch (i102) {
                    case 0:
                        t5 t5Var2 = r5Var.a;
                        long j3 = t5Var2.S;
                        org.telegram.messenger.e3 e3Var = t5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.U;
                        int i11 = ug.j0.S2;
                        if (e3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.j0 j0Var = new ug.j0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            j0Var.A1(e3Var);
                            j0Var.z1(tL_premium_boostsStatus, true);
                            j0Var.B1(j3);
                            j0Var.c2 = null;
                            t5Var2.showDialog(j0Var);
                            break;
                        }
                        break;
                    case 1:
                        t5 t5Var3 = r5Var.a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.S;
                        e6Var = ((org.telegram.ui.ActionBar.e2) t5Var3).resourceProvider;
                        wg.l.I0(t5Var3, e6Var, j10, null);
                        wg.l.p1.I0 = new q5(r5Var, 0);
                        break;
                    default:
                        t5 t5Var4 = r5Var.a;
                        ug.j0 j0Var2 = new ug.j0(31, t5Var4.T, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        j0Var2.z1(t5Var4.U, true);
                        j0Var2.B1(t5Var4.S);
                        t5Var4.showDialog(j0Var2);
                        break;
                }
            }
        });
        final int i11 = 2;
        k4Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.p5
            public final /* synthetic */ r5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.e6 e6Var;
                int i102 = i11;
                r5 r5Var = this.b;
                switch (i102) {
                    case 0:
                        t5 t5Var2 = r5Var.a;
                        long j3 = t5Var2.S;
                        org.telegram.messenger.e3 e3Var = t5Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var2.U;
                        int i112 = ug.j0.S2;
                        if (e3Var != null && tL_premium_boostsStatus != null && t5Var2.getParentActivity() != null) {
                            ug.j0 j0Var = new ug.j0(19, t5Var2.getCurrentAccount(), t5Var2.getParentActivity(), t5Var2, t5Var2.getResourceProvider());
                            j0Var.A1(e3Var);
                            j0Var.z1(tL_premium_boostsStatus, true);
                            j0Var.B1(j3);
                            j0Var.c2 = null;
                            t5Var2.showDialog(j0Var);
                            break;
                        }
                        break;
                    case 1:
                        t5 t5Var3 = r5Var.a;
                        t5Var3.y0(true);
                        long j10 = t5Var3.S;
                        e6Var = ((org.telegram.ui.ActionBar.e2) t5Var3).resourceProvider;
                        wg.l.I0(t5Var3, e6Var, j10, null);
                        wg.l.p1.I0 = new q5(r5Var, 0);
                        break;
                    default:
                        t5 t5Var4 = r5Var.a;
                        ug.j0 j0Var2 = new ug.j0(31, t5Var4.T, r5Var.getContext(), t5Var4, t5Var4.getResourceProvider());
                        j0Var2.z1(t5Var4.U, true);
                        j0Var2.B1(t5Var4.S);
                        t5Var4.showDialog(j0Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(k4Var, c8.ja.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (org.telegram.messenger.np.s1(t5Var.T).q4 && org.telegram.messenger.t3.N(t5Var.j0)) {
            linearLayout.addView(k4Var2, c8.ja.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(k4Var3, c8.ja.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, c8.ja.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
