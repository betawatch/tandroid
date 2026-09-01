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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class w5 extends FrameLayout {
    public final /* synthetic */ y5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(y5 y5Var, Activity activity) {
        super(activity);
        this.a = y5Var;
        setWillNotDraw(false);
        eg.q1 q1Var = new eg.q1(y5Var, getContext());
        eg.q1 q1Var2 = new eg.q1(y5Var, getContext());
        eg.q1 q1Var3 = new eg.q1(y5Var, getContext());
        q1Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        q1Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        q1Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        final int i10 = 0;
        q1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u5
            public final /* synthetic */ w5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.g6 g6Var;
                int i11 = i10;
                w5 w5Var = this.b;
                switch (i11) {
                    case 0:
                        y5 y5Var2 = w5Var.a;
                        long j10 = y5Var2.M;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = y5Var2.P;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var2.O;
                        int i12 = fg.v0.S0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && y5Var2.getParentActivity() != null) {
                            fg.v0 v0Var = new fg.v0(19, y5Var2.getCurrentAccount(), y5Var2.getParentActivity(), y5Var2, y5Var2.getResourceProvider());
                            v0Var.G1(canApplyBoost);
                            v0Var.F1(tL_premium_boostsStatus, true);
                            v0Var.H1(j10);
                            v0Var.d0 = null;
                            y5Var2.showDialog(v0Var);
                            break;
                        }
                        break;
                    case 1:
                        y5 y5Var3 = w5Var.a;
                        y5Var3.w0(true);
                        long j11 = y5Var3.M;
                        g6Var = ((org.telegram.ui.ActionBar.p2) y5Var3).resourceProvider;
                        hg.x.m(y5Var3, g6Var, j11, null);
                        hg.x.e.setOnHideListener(new v5(w5Var, 0));
                        break;
                    default:
                        y5 y5Var4 = w5Var.a;
                        fg.v0 v0Var2 = new fg.v0(31, y5Var4.N, w5Var.getContext(), y5Var4, y5Var4.getResourceProvider());
                        v0Var2.F1(y5Var4.O, true);
                        v0Var2.H1(y5Var4.M);
                        y5Var4.showDialog(v0Var2);
                        break;
                }
            }
        });
        final int i11 = 1;
        q1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u5
            public final /* synthetic */ w5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.g6 g6Var;
                int i112 = i11;
                w5 w5Var = this.b;
                switch (i112) {
                    case 0:
                        y5 y5Var2 = w5Var.a;
                        long j10 = y5Var2.M;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = y5Var2.P;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var2.O;
                        int i12 = fg.v0.S0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && y5Var2.getParentActivity() != null) {
                            fg.v0 v0Var = new fg.v0(19, y5Var2.getCurrentAccount(), y5Var2.getParentActivity(), y5Var2, y5Var2.getResourceProvider());
                            v0Var.G1(canApplyBoost);
                            v0Var.F1(tL_premium_boostsStatus, true);
                            v0Var.H1(j10);
                            v0Var.d0 = null;
                            y5Var2.showDialog(v0Var);
                            break;
                        }
                        break;
                    case 1:
                        y5 y5Var3 = w5Var.a;
                        y5Var3.w0(true);
                        long j11 = y5Var3.M;
                        g6Var = ((org.telegram.ui.ActionBar.p2) y5Var3).resourceProvider;
                        hg.x.m(y5Var3, g6Var, j11, null);
                        hg.x.e.setOnHideListener(new v5(w5Var, 0));
                        break;
                    default:
                        y5 y5Var4 = w5Var.a;
                        fg.v0 v0Var2 = new fg.v0(31, y5Var4.N, w5Var.getContext(), y5Var4, y5Var4.getResourceProvider());
                        v0Var2.F1(y5Var4.O, true);
                        v0Var2.H1(y5Var4.M);
                        y5Var4.showDialog(v0Var2);
                        break;
                }
            }
        });
        final int i12 = 2;
        q1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u5
            public final /* synthetic */ w5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.g6 g6Var;
                int i112 = i12;
                w5 w5Var = this.b;
                switch (i112) {
                    case 0:
                        y5 y5Var2 = w5Var.a;
                        long j10 = y5Var2.M;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = y5Var2.P;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var2.O;
                        int i122 = fg.v0.S0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && y5Var2.getParentActivity() != null) {
                            fg.v0 v0Var = new fg.v0(19, y5Var2.getCurrentAccount(), y5Var2.getParentActivity(), y5Var2, y5Var2.getResourceProvider());
                            v0Var.G1(canApplyBoost);
                            v0Var.F1(tL_premium_boostsStatus, true);
                            v0Var.H1(j10);
                            v0Var.d0 = null;
                            y5Var2.showDialog(v0Var);
                            break;
                        }
                        break;
                    case 1:
                        y5 y5Var3 = w5Var.a;
                        y5Var3.w0(true);
                        long j11 = y5Var3.M;
                        g6Var = ((org.telegram.ui.ActionBar.p2) y5Var3).resourceProvider;
                        hg.x.m(y5Var3, g6Var, j11, null);
                        hg.x.e.setOnHideListener(new v5(w5Var, 0));
                        break;
                    default:
                        y5 y5Var4 = w5Var.a;
                        fg.v0 v0Var2 = new fg.v0(31, y5Var4.N, w5Var.getContext(), y5Var4, y5Var4.getResourceProvider());
                        v0Var2.F1(y5Var4.O, true);
                        v0Var2.H1(y5Var4.M);
                        y5Var4.showDialog(v0Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(q1Var, k7.c6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(y5Var.N).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(y5Var.d0)) {
            linearLayout.addView(q1Var2, k7.c6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(q1Var3, k7.c6.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, k7.c6.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
