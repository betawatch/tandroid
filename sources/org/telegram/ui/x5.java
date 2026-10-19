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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class x5 extends FrameLayout {
    public final /* synthetic */ z5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(z5 z5Var, Activity activity) {
        super(activity);
        this.a = z5Var;
        setWillNotDraw(false);
        ai.o5 o5Var = new ai.o5(z5Var, getContext());
        ai.o5 o5Var2 = new ai.o5(z5Var, getContext());
        ai.o5 o5Var3 = new ai.o5(z5Var, getContext());
        o5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        o5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        o5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        final int i10 = 0;
        o5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v5
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i11 = i10;
                x5 x5Var = this.b;
                switch (i11) {
                    case 0:
                        z5 z5Var2 = x5Var.a;
                        long j10 = z5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = z5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var2.R;
                        int i12 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            k0Var.H1(canApplyBoost);
                            k0Var.G1(tL_premium_boostsStatus, true);
                            k0Var.I1(j10);
                            k0Var.g0 = null;
                            z5Var2.showDialog(k0Var);
                            break;
                        }
                        break;
                    case 1:
                        z5 z5Var3 = x5Var.a;
                        z5Var3.x0(true);
                        long j11 = z5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.n2) z5Var3).resourceProvider;
                        ug.m.n(z5Var3, d6Var, j11, null);
                        ug.m.e.setOnHideListener(new w5(x5Var, 0));
                        break;
                    default:
                        z5 z5Var4 = x5Var.a;
                        sg.k0 k0Var2 = new sg.k0(31, z5Var4.Q, x5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        k0Var2.G1(z5Var4.R, true);
                        k0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(k0Var2);
                        break;
                }
            }
        });
        final int i11 = 1;
        o5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v5
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i112 = i11;
                x5 x5Var = this.b;
                switch (i112) {
                    case 0:
                        z5 z5Var2 = x5Var.a;
                        long j10 = z5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = z5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var2.R;
                        int i12 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            k0Var.H1(canApplyBoost);
                            k0Var.G1(tL_premium_boostsStatus, true);
                            k0Var.I1(j10);
                            k0Var.g0 = null;
                            z5Var2.showDialog(k0Var);
                            break;
                        }
                        break;
                    case 1:
                        z5 z5Var3 = x5Var.a;
                        z5Var3.x0(true);
                        long j11 = z5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.n2) z5Var3).resourceProvider;
                        ug.m.n(z5Var3, d6Var, j11, null);
                        ug.m.e.setOnHideListener(new w5(x5Var, 0));
                        break;
                    default:
                        z5 z5Var4 = x5Var.a;
                        sg.k0 k0Var2 = new sg.k0(31, z5Var4.Q, x5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        k0Var2.G1(z5Var4.R, true);
                        k0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(k0Var2);
                        break;
                }
            }
        });
        final int i12 = 2;
        o5Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v5
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d6 d6Var;
                int i112 = i12;
                x5 x5Var = this.b;
                switch (i112) {
                    case 0:
                        z5 z5Var2 = x5Var.a;
                        long j10 = z5Var2.P;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = z5Var2.S;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var2.R;
                        int i122 = sg.k0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.k0 k0Var = new sg.k0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            k0Var.H1(canApplyBoost);
                            k0Var.G1(tL_premium_boostsStatus, true);
                            k0Var.I1(j10);
                            k0Var.g0 = null;
                            z5Var2.showDialog(k0Var);
                            break;
                        }
                        break;
                    case 1:
                        z5 z5Var3 = x5Var.a;
                        z5Var3.x0(true);
                        long j11 = z5Var3.P;
                        d6Var = ((org.telegram.ui.ActionBar.n2) z5Var3).resourceProvider;
                        ug.m.n(z5Var3, d6Var, j11, null);
                        ug.m.e.setOnHideListener(new w5(x5Var, 0));
                        break;
                    default:
                        z5 z5Var4 = x5Var.a;
                        sg.k0 k0Var2 = new sg.k0(31, z5Var4.Q, x5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        k0Var2.G1(z5Var4.R, true);
                        k0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(k0Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(o5Var, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(z5Var.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(z5Var.g0)) {
            linearLayout.addView(o5Var2, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(o5Var3, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.z5.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
