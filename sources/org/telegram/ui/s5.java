package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class s5 extends FrameLayout {
    public final /* synthetic */ v5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(v5 v5Var, Activity activity) {
        super(activity);
        this.a = v5Var;
        setWillNotDraw(false);
        t5 t5Var = new t5(v5Var, getContext());
        t5 t5Var2 = new t5(v5Var, getContext());
        t5 t5Var3 = new t5(v5Var, getContext());
        t5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        t5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        t5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        final int i10 = 0;
        t5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.q5
            public final /* synthetic */ s5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i11 = i10;
                s5 s5Var = this.b;
                switch (i11) {
                    case 0:
                        v5 v5Var2 = s5Var.a;
                        long j3 = v5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.R;
                        int i12 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            k0Var.G1(canApplyBoost);
                            k0Var.F1(tL_premium_boostsStatus, true);
                            k0Var.H1(j3);
                            k0Var.g0 = null;
                            v5Var2.showDialog(k0Var);
                            break;
                        }
                        break;
                    case 1:
                        v5 v5Var3 = s5Var.a;
                        v5Var3.w0(true);
                        long j10 = v5Var3.P;
                        f6Var = ((org.telegram.ui.ActionBar.n2) v5Var3).resourceProvider;
                        ug.n.m(v5Var3, f6Var, j10, null);
                        ug.n.e.setOnHideListener(new r5(s5Var, 0));
                        break;
                    default:
                        v5 v5Var4 = s5Var.a;
                        sg.k0 k0Var2 = new sg.k0(31, v5Var4.Q, s5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        k0Var2.F1(v5Var4.R, true);
                        k0Var2.H1(v5Var4.P);
                        v5Var4.showDialog(k0Var2);
                        break;
                }
            }
        });
        final int i11 = 1;
        t5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.q5
            public final /* synthetic */ s5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i112 = i11;
                s5 s5Var = this.b;
                switch (i112) {
                    case 0:
                        v5 v5Var2 = s5Var.a;
                        long j3 = v5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.R;
                        int i12 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            k0Var.G1(canApplyBoost);
                            k0Var.F1(tL_premium_boostsStatus, true);
                            k0Var.H1(j3);
                            k0Var.g0 = null;
                            v5Var2.showDialog(k0Var);
                            break;
                        }
                        break;
                    case 1:
                        v5 v5Var3 = s5Var.a;
                        v5Var3.w0(true);
                        long j10 = v5Var3.P;
                        f6Var = ((org.telegram.ui.ActionBar.n2) v5Var3).resourceProvider;
                        ug.n.m(v5Var3, f6Var, j10, null);
                        ug.n.e.setOnHideListener(new r5(s5Var, 0));
                        break;
                    default:
                        v5 v5Var4 = s5Var.a;
                        sg.k0 k0Var2 = new sg.k0(31, v5Var4.Q, s5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        k0Var2.F1(v5Var4.R, true);
                        k0Var2.H1(v5Var4.P);
                        v5Var4.showDialog(k0Var2);
                        break;
                }
            }
        });
        final int i12 = 2;
        t5Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.q5
            public final /* synthetic */ s5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i112 = i12;
                s5 s5Var = this.b;
                switch (i112) {
                    case 0:
                        v5 v5Var2 = s5Var.a;
                        long j3 = v5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.R;
                        int i122 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            k0Var.G1(canApplyBoost);
                            k0Var.F1(tL_premium_boostsStatus, true);
                            k0Var.H1(j3);
                            k0Var.g0 = null;
                            v5Var2.showDialog(k0Var);
                            break;
                        }
                        break;
                    case 1:
                        v5 v5Var3 = s5Var.a;
                        v5Var3.w0(true);
                        long j10 = v5Var3.P;
                        f6Var = ((org.telegram.ui.ActionBar.n2) v5Var3).resourceProvider;
                        ug.n.m(v5Var3, f6Var, j10, null);
                        ug.n.e.setOnHideListener(new r5(s5Var, 0));
                        break;
                    default:
                        v5 v5Var4 = s5Var.a;
                        sg.k0 k0Var2 = new sg.k0(31, v5Var4.Q, s5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        k0Var2.F1(v5Var4.R, true);
                        k0Var2.H1(v5Var4.P);
                        v5Var4.showDialog(k0Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(t5Var, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(v5Var.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(v5Var.g0)) {
            linearLayout.addView(t5Var2, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(t5Var3, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.x5.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
