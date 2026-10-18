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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class x5 extends FrameLayout {
    public final /* synthetic */ z5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(z5 z5Var, Activity activity) {
        super(activity);
        this.a = z5Var;
        setWillNotDraw(false);
        ai.n5 n5Var = new ai.n5(z5Var, getContext());
        ai.n5 n5Var2 = new ai.n5(z5Var, getContext());
        ai.n5 n5Var3 = new ai.n5(z5Var, getContext());
        n5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        n5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        n5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        final int i10 = 0;
        n5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v5
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
                        int i12 = sg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.j0 j0Var = new sg.j0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            j0Var.H1(canApplyBoost);
                            j0Var.G1(tL_premium_boostsStatus, true);
                            j0Var.I1(j10);
                            j0Var.g0 = null;
                            z5Var2.showDialog(j0Var);
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
                        sg.j0 j0Var2 = new sg.j0(31, z5Var4.Q, x5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        j0Var2.G1(z5Var4.R, true);
                        j0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(j0Var2);
                        break;
                }
            }
        });
        final int i11 = 1;
        n5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v5
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
                        int i12 = sg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.j0 j0Var = new sg.j0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            j0Var.H1(canApplyBoost);
                            j0Var.G1(tL_premium_boostsStatus, true);
                            j0Var.I1(j10);
                            j0Var.g0 = null;
                            z5Var2.showDialog(j0Var);
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
                        sg.j0 j0Var2 = new sg.j0(31, z5Var4.Q, x5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        j0Var2.G1(z5Var4.R, true);
                        j0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(j0Var2);
                        break;
                }
            }
        });
        final int i12 = 2;
        n5Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v5
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
                        int i122 = sg.j0.V0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && z5Var2.getParentActivity() != null) {
                            sg.j0 j0Var = new sg.j0(19, z5Var2.getCurrentAccount(), z5Var2.getParentActivity(), z5Var2, z5Var2.getResourceProvider());
                            j0Var.H1(canApplyBoost);
                            j0Var.G1(tL_premium_boostsStatus, true);
                            j0Var.I1(j10);
                            j0Var.g0 = null;
                            z5Var2.showDialog(j0Var);
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
                        sg.j0 j0Var2 = new sg.j0(31, z5Var4.Q, x5Var.getContext(), z5Var4, z5Var4.getResourceProvider());
                        j0Var2.G1(z5Var4.R, true);
                        j0Var2.I1(z5Var4.P);
                        z5Var4.showDialog(j0Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(n5Var, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(z5Var.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(z5Var.g0)) {
            linearLayout.addView(n5Var2, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(n5Var3, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.z5.a(-2.0f, 0.0f, 19.0f, 0.0f, 0.0f, -2, 1));
    }
}
