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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public final /* synthetic */ w5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(w5 w5Var, Activity activity) {
        super(activity);
        this.a = w5Var;
        setWillNotDraw(false);
        u5 u5Var = new u5(w5Var, getContext());
        u5 u5Var2 = new u5(w5Var, getContext());
        u5 u5Var3 = new u5(w5Var, getContext());
        u5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        u5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        u5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        final int i10 = 0;
        u5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r5
            public final /* synthetic */ t5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i11 = i10;
                t5 t5Var = this.b;
                switch (i11) {
                    case 0:
                        w5 w5Var2 = t5Var.a;
                        long j3 = w5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = w5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = w5Var2.R;
                        int i12 = qg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && w5Var2.getParentActivity() != null) {
                            qg.k0 k0Var = new qg.k0(19, w5Var2.getCurrentAccount(), w5Var2.getParentActivity(), w5Var2, w5Var2.getResourceProvider());
                            k0Var.G1(canApplyBoost);
                            k0Var.F1(tL_premium_boostsStatus, true);
                            k0Var.H1(j3);
                            k0Var.g0 = null;
                            w5Var2.showDialog(k0Var);
                            break;
                        }
                        break;
                    case 1:
                        w5 w5Var3 = t5Var.a;
                        w5Var3.w0(true);
                        long j10 = w5Var3.P;
                        f6Var = ((org.telegram.ui.ActionBar.p2) w5Var3).resourceProvider;
                        sg.m.m(w5Var3, f6Var, j10, null);
                        sg.m.e.setOnHideListener(new s5(t5Var, 0));
                        break;
                    default:
                        w5 w5Var4 = t5Var.a;
                        qg.k0 k0Var2 = new qg.k0(31, w5Var4.Q, t5Var.getContext(), w5Var4, w5Var4.getResourceProvider());
                        k0Var2.F1(w5Var4.R, true);
                        k0Var2.H1(w5Var4.P);
                        w5Var4.showDialog(k0Var2);
                        break;
                }
            }
        });
        final int i11 = 1;
        u5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r5
            public final /* synthetic */ t5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i112 = i11;
                t5 t5Var = this.b;
                switch (i112) {
                    case 0:
                        w5 w5Var2 = t5Var.a;
                        long j3 = w5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = w5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = w5Var2.R;
                        int i12 = qg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && w5Var2.getParentActivity() != null) {
                            qg.k0 k0Var = new qg.k0(19, w5Var2.getCurrentAccount(), w5Var2.getParentActivity(), w5Var2, w5Var2.getResourceProvider());
                            k0Var.G1(canApplyBoost);
                            k0Var.F1(tL_premium_boostsStatus, true);
                            k0Var.H1(j3);
                            k0Var.g0 = null;
                            w5Var2.showDialog(k0Var);
                            break;
                        }
                        break;
                    case 1:
                        w5 w5Var3 = t5Var.a;
                        w5Var3.w0(true);
                        long j10 = w5Var3.P;
                        f6Var = ((org.telegram.ui.ActionBar.p2) w5Var3).resourceProvider;
                        sg.m.m(w5Var3, f6Var, j10, null);
                        sg.m.e.setOnHideListener(new s5(t5Var, 0));
                        break;
                    default:
                        w5 w5Var4 = t5Var.a;
                        qg.k0 k0Var2 = new qg.k0(31, w5Var4.Q, t5Var.getContext(), w5Var4, w5Var4.getResourceProvider());
                        k0Var2.F1(w5Var4.R, true);
                        k0Var2.H1(w5Var4.P);
                        w5Var4.showDialog(k0Var2);
                        break;
                }
            }
        });
        final int i12 = 2;
        u5Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r5
            public final /* synthetic */ t5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f6 f6Var;
                int i112 = i12;
                t5 t5Var = this.b;
                switch (i112) {
                    case 0:
                        w5 w5Var2 = t5Var.a;
                        long j3 = w5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = w5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = w5Var2.R;
                        int i122 = qg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && w5Var2.getParentActivity() != null) {
                            qg.k0 k0Var = new qg.k0(19, w5Var2.getCurrentAccount(), w5Var2.getParentActivity(), w5Var2, w5Var2.getResourceProvider());
                            k0Var.G1(canApplyBoost);
                            k0Var.F1(tL_premium_boostsStatus, true);
                            k0Var.H1(j3);
                            k0Var.g0 = null;
                            w5Var2.showDialog(k0Var);
                            break;
                        }
                        break;
                    case 1:
                        w5 w5Var3 = t5Var.a;
                        w5Var3.w0(true);
                        long j10 = w5Var3.P;
                        f6Var = ((org.telegram.ui.ActionBar.p2) w5Var3).resourceProvider;
                        sg.m.m(w5Var3, f6Var, j10, null);
                        sg.m.e.setOnHideListener(new s5(t5Var, 0));
                        break;
                    default:
                        w5 w5Var4 = t5Var.a;
                        qg.k0 k0Var2 = new qg.k0(31, w5Var4.Q, t5Var.getContext(), w5Var4, w5Var4.getResourceProvider());
                        k0Var2.F1(w5Var4.R, true);
                        k0Var2.H1(w5Var4.P);
                        w5Var4.showDialog(k0Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(u5Var, w7.a6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(w5Var.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(w5Var.g0)) {
            linearLayout.addView(u5Var2, w7.a6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(u5Var3, w7.a6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.a6.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
