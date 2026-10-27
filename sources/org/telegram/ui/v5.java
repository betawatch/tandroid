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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v5 extends FrameLayout {
    public final /* synthetic */ x5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(x5 x5Var, Activity activity) {
        super(activity);
        this.a = x5Var;
        setWillNotDraw(false);
        bi.j5 j5Var = new bi.j5(x5Var, getContext());
        bi.j5 j5Var2 = new bi.j5(x5Var, getContext());
        bi.j5 j5Var3 = new bi.j5(x5Var, getContext());
        j5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        j5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        j5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        final int i10 = 0;
        j5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.t5
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u6 u6Var;
                int i11 = i10;
                v5 v5Var = this.b;
                switch (i11) {
                    case 0:
                        x5 x5Var2 = v5Var.a;
                        long j10 = x5Var2.R;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = x5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = x5Var2.T;
                        int i12 = tg.j0.W0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && x5Var2.getParentActivity() != null) {
                            tg.j0 j0Var = new tg.j0(19, x5Var2.getCurrentAccount(), x5Var2.getParentActivity(), x5Var2, x5Var2.getResourceProvider());
                            j0Var.K1(canApplyBoost);
                            j0Var.J1(tL_premium_boostsStatus, true);
                            j0Var.L1(j10);
                            j0Var.g0 = null;
                            x5Var2.showDialog(j0Var);
                            break;
                        }
                        break;
                    case 1:
                        x5 x5Var3 = v5Var.a;
                        x5Var3.u0(true);
                        long j11 = x5Var3.R;
                        u6Var = ((org.telegram.ui.ActionBar.r2) x5Var3).resourceProvider;
                        vg.n.m(x5Var3, u6Var, j11, null);
                        vg.n.e.setOnHideListener(new u5(v5Var, 0));
                        break;
                    default:
                        x5 x5Var4 = v5Var.a;
                        tg.j0 j0Var2 = new tg.j0(31, x5Var4.S, v5Var.getContext(), x5Var4, x5Var4.getResourceProvider());
                        j0Var2.J1(x5Var4.T, true);
                        j0Var2.L1(x5Var4.R);
                        x5Var4.showDialog(j0Var2);
                        break;
                }
            }
        });
        final int i11 = 1;
        j5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.t5
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u6 u6Var;
                int i112 = i11;
                v5 v5Var = this.b;
                switch (i112) {
                    case 0:
                        x5 x5Var2 = v5Var.a;
                        long j10 = x5Var2.R;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = x5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = x5Var2.T;
                        int i12 = tg.j0.W0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && x5Var2.getParentActivity() != null) {
                            tg.j0 j0Var = new tg.j0(19, x5Var2.getCurrentAccount(), x5Var2.getParentActivity(), x5Var2, x5Var2.getResourceProvider());
                            j0Var.K1(canApplyBoost);
                            j0Var.J1(tL_premium_boostsStatus, true);
                            j0Var.L1(j10);
                            j0Var.g0 = null;
                            x5Var2.showDialog(j0Var);
                            break;
                        }
                        break;
                    case 1:
                        x5 x5Var3 = v5Var.a;
                        x5Var3.u0(true);
                        long j11 = x5Var3.R;
                        u6Var = ((org.telegram.ui.ActionBar.r2) x5Var3).resourceProvider;
                        vg.n.m(x5Var3, u6Var, j11, null);
                        vg.n.e.setOnHideListener(new u5(v5Var, 0));
                        break;
                    default:
                        x5 x5Var4 = v5Var.a;
                        tg.j0 j0Var2 = new tg.j0(31, x5Var4.S, v5Var.getContext(), x5Var4, x5Var4.getResourceProvider());
                        j0Var2.J1(x5Var4.T, true);
                        j0Var2.L1(x5Var4.R);
                        x5Var4.showDialog(j0Var2);
                        break;
                }
            }
        });
        final int i12 = 2;
        j5Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.t5
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u6 u6Var;
                int i112 = i12;
                v5 v5Var = this.b;
                switch (i112) {
                    case 0:
                        x5 x5Var2 = v5Var.a;
                        long j10 = x5Var2.R;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = x5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = x5Var2.T;
                        int i122 = tg.j0.W0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && x5Var2.getParentActivity() != null) {
                            tg.j0 j0Var = new tg.j0(19, x5Var2.getCurrentAccount(), x5Var2.getParentActivity(), x5Var2, x5Var2.getResourceProvider());
                            j0Var.K1(canApplyBoost);
                            j0Var.J1(tL_premium_boostsStatus, true);
                            j0Var.L1(j10);
                            j0Var.g0 = null;
                            x5Var2.showDialog(j0Var);
                            break;
                        }
                        break;
                    case 1:
                        x5 x5Var3 = v5Var.a;
                        x5Var3.u0(true);
                        long j11 = x5Var3.R;
                        u6Var = ((org.telegram.ui.ActionBar.r2) x5Var3).resourceProvider;
                        vg.n.m(x5Var3, u6Var, j11, null);
                        vg.n.e.setOnHideListener(new u5(v5Var, 0));
                        break;
                    default:
                        x5 x5Var4 = v5Var.a;
                        tg.j0 j0Var2 = new tg.j0(31, x5Var4.S, v5Var.getContext(), x5Var4, x5Var4.getResourceProvider());
                        j0Var2.J1(x5Var4.T, true);
                        j0Var2.L1(x5Var4.R);
                        x5Var4.showDialog(j0Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(j5Var, org.telegram.ui.Components.kb1.o(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(x5Var.S).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(x5Var.i0)) {
            linearLayout.addView(j5Var2, org.telegram.ui.Components.kb1.o(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(j5Var3, org.telegram.ui.Components.kb1.o(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, org.telegram.ui.Components.kb1.h(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
