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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class w5 extends FrameLayout {
    public final /* synthetic */ y5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(y5 y5Var, Activity activity) {
        super(activity);
        this.a = y5Var;
        setWillNotDraw(false);
        ai.o5 o5Var = new ai.o5(y5Var, getContext());
        ai.o5 o5Var2 = new ai.o5(y5Var, getContext());
        ai.o5 o5Var3 = new ai.o5(y5Var, getContext());
        o5Var.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        o5Var2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        o5Var3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        final int i10 = 0;
        o5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u5
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
                        long j10 = y5Var2.R;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = y5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var2.T;
                        int i12 = sg.j0.W0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && y5Var2.getParentActivity() != null) {
                            sg.j0 j0Var = new sg.j0(19, y5Var2.getCurrentAccount(), y5Var2.getParentActivity(), y5Var2, y5Var2.getResourceProvider());
                            j0Var.K1(canApplyBoost);
                            j0Var.J1(tL_premium_boostsStatus, true);
                            j0Var.L1(j10);
                            j0Var.g0 = null;
                            y5Var2.showDialog(j0Var);
                            break;
                        }
                        break;
                    case 1:
                        y5 y5Var3 = w5Var.a;
                        y5Var3.x0(true);
                        long j11 = y5Var3.R;
                        g6Var = ((org.telegram.ui.ActionBar.o2) y5Var3).resourceProvider;
                        ug.l.m(y5Var3, g6Var, j11, null);
                        ug.l.e.setOnHideListener(new v5(w5Var, 0));
                        break;
                    default:
                        y5 y5Var4 = w5Var.a;
                        sg.j0 j0Var2 = new sg.j0(31, y5Var4.S, w5Var.getContext(), y5Var4, y5Var4.getResourceProvider());
                        j0Var2.J1(y5Var4.T, true);
                        j0Var2.L1(y5Var4.R);
                        y5Var4.showDialog(j0Var2);
                        break;
                }
            }
        });
        final int i11 = 1;
        o5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u5
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
                        long j10 = y5Var2.R;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = y5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var2.T;
                        int i12 = sg.j0.W0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && y5Var2.getParentActivity() != null) {
                            sg.j0 j0Var = new sg.j0(19, y5Var2.getCurrentAccount(), y5Var2.getParentActivity(), y5Var2, y5Var2.getResourceProvider());
                            j0Var.K1(canApplyBoost);
                            j0Var.J1(tL_premium_boostsStatus, true);
                            j0Var.L1(j10);
                            j0Var.g0 = null;
                            y5Var2.showDialog(j0Var);
                            break;
                        }
                        break;
                    case 1:
                        y5 y5Var3 = w5Var.a;
                        y5Var3.x0(true);
                        long j11 = y5Var3.R;
                        g6Var = ((org.telegram.ui.ActionBar.o2) y5Var3).resourceProvider;
                        ug.l.m(y5Var3, g6Var, j11, null);
                        ug.l.e.setOnHideListener(new v5(w5Var, 0));
                        break;
                    default:
                        y5 y5Var4 = w5Var.a;
                        sg.j0 j0Var2 = new sg.j0(31, y5Var4.S, w5Var.getContext(), y5Var4, y5Var4.getResourceProvider());
                        j0Var2.J1(y5Var4.T, true);
                        j0Var2.L1(y5Var4.R);
                        y5Var4.showDialog(j0Var2);
                        break;
                }
            }
        });
        final int i12 = 2;
        o5Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u5
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
                        long j10 = y5Var2.R;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = y5Var2.U;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var2.T;
                        int i122 = sg.j0.W0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && y5Var2.getParentActivity() != null) {
                            sg.j0 j0Var = new sg.j0(19, y5Var2.getCurrentAccount(), y5Var2.getParentActivity(), y5Var2, y5Var2.getResourceProvider());
                            j0Var.K1(canApplyBoost);
                            j0Var.J1(tL_premium_boostsStatus, true);
                            j0Var.L1(j10);
                            j0Var.g0 = null;
                            y5Var2.showDialog(j0Var);
                            break;
                        }
                        break;
                    case 1:
                        y5 y5Var3 = w5Var.a;
                        y5Var3.x0(true);
                        long j11 = y5Var3.R;
                        g6Var = ((org.telegram.ui.ActionBar.o2) y5Var3).resourceProvider;
                        ug.l.m(y5Var3, g6Var, j11, null);
                        ug.l.e.setOnHideListener(new v5(w5Var, 0));
                        break;
                    default:
                        y5 y5Var4 = w5Var.a;
                        sg.j0 j0Var2 = new sg.j0(31, y5Var4.S, w5Var.getContext(), y5Var4, y5Var4.getResourceProvider());
                        j0Var2.J1(y5Var4.T, true);
                        j0Var2.L1(y5Var4.R);
                        y5Var4.showDialog(j0Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(o5Var, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(y5Var.S).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(y5Var.i0)) {
            linearLayout.addView(o5Var2, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(o5Var3, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.z5.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
