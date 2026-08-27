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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public final /* synthetic */ v5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(v5 v5Var, Activity activity) {
        super(activity);
        this.a = v5Var;
        setWillNotDraw(false);
        ag.w wVar = new ag.w(v5Var, getContext());
        ag.w wVar2 = new ag.w(v5Var, getContext());
        ag.w wVar3 = new ag.w(v5Var, getContext());
        wVar.c(R.drawable.filled_boost_plus, LocaleController.getString(R.string.BoostBtn));
        wVar2.c(R.drawable.filled_gift_premium, LocaleController.getString(R.string.GiveawayBtn));
        wVar3.c(R.drawable.filled_info, LocaleController.getString(R.string.FeaturesBtn));
        final int i10 = 0;
        wVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r5
            public final /* synthetic */ t5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.c6 c6Var;
                int i11 = i10;
                t5 t5Var = this.b;
                switch (i11) {
                    case 0:
                        v5 v5Var2 = t5Var.a;
                        long j10 = v5Var2.L;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.O;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.N;
                        int i12 = ag.i1.R0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            ag.i1 i1Var = new ag.i1(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            i1Var.G1(canApplyBoost);
                            i1Var.F1(tL_premium_boostsStatus, true);
                            i1Var.H1(j10);
                            i1Var.c0 = null;
                            v5Var2.showDialog(i1Var);
                            break;
                        }
                        break;
                    case 1:
                        v5 v5Var3 = t5Var.a;
                        v5Var3.w0(true);
                        long j11 = v5Var3.L;
                        c6Var = ((org.telegram.ui.ActionBar.n2) v5Var3).resourceProvider;
                        cg.x.m(v5Var3, c6Var, j11, null);
                        cg.x.e.setOnHideListener(new s5(t5Var, 0));
                        break;
                    default:
                        v5 v5Var4 = t5Var.a;
                        ag.i1 i1Var2 = new ag.i1(31, v5Var4.M, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        i1Var2.F1(v5Var4.N, true);
                        i1Var2.H1(v5Var4.L);
                        v5Var4.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i11 = 1;
        wVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r5
            public final /* synthetic */ t5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.c6 c6Var;
                int i112 = i11;
                t5 t5Var = this.b;
                switch (i112) {
                    case 0:
                        v5 v5Var2 = t5Var.a;
                        long j10 = v5Var2.L;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.O;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.N;
                        int i12 = ag.i1.R0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            ag.i1 i1Var = new ag.i1(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            i1Var.G1(canApplyBoost);
                            i1Var.F1(tL_premium_boostsStatus, true);
                            i1Var.H1(j10);
                            i1Var.c0 = null;
                            v5Var2.showDialog(i1Var);
                            break;
                        }
                        break;
                    case 1:
                        v5 v5Var3 = t5Var.a;
                        v5Var3.w0(true);
                        long j11 = v5Var3.L;
                        c6Var = ((org.telegram.ui.ActionBar.n2) v5Var3).resourceProvider;
                        cg.x.m(v5Var3, c6Var, j11, null);
                        cg.x.e.setOnHideListener(new s5(t5Var, 0));
                        break;
                    default:
                        v5 v5Var4 = t5Var.a;
                        ag.i1 i1Var2 = new ag.i1(31, v5Var4.M, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        i1Var2.F1(v5Var4.N, true);
                        i1Var2.H1(v5Var4.L);
                        v5Var4.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i12 = 2;
        wVar3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r5
            public final /* synthetic */ t5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.c6 c6Var;
                int i112 = i12;
                t5 t5Var = this.b;
                switch (i112) {
                    case 0:
                        v5 v5Var2 = t5Var.a;
                        long j10 = v5Var2.L;
                        ChannelBoostsController.CanApplyBoost canApplyBoost = v5Var2.O;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var2.N;
                        int i122 = ag.i1.R0;
                        if (canApplyBoost != null && tL_premium_boostsStatus != null && v5Var2.getParentActivity() != null) {
                            ag.i1 i1Var = new ag.i1(19, v5Var2.getCurrentAccount(), v5Var2.getParentActivity(), v5Var2, v5Var2.getResourceProvider());
                            i1Var.G1(canApplyBoost);
                            i1Var.F1(tL_premium_boostsStatus, true);
                            i1Var.H1(j10);
                            i1Var.c0 = null;
                            v5Var2.showDialog(i1Var);
                            break;
                        }
                        break;
                    case 1:
                        v5 v5Var3 = t5Var.a;
                        v5Var3.w0(true);
                        long j11 = v5Var3.L;
                        c6Var = ((org.telegram.ui.ActionBar.n2) v5Var3).resourceProvider;
                        cg.x.m(v5Var3, c6Var, j11, null);
                        cg.x.e.setOnHideListener(new s5(t5Var, 0));
                        break;
                    default:
                        v5 v5Var4 = t5Var.a;
                        ag.i1 i1Var2 = new ag.i1(31, v5Var4.M, t5Var.getContext(), v5Var4, v5Var4.getResourceProvider());
                        i1Var2.F1(v5Var4.N, true);
                        i1Var2.H1(v5Var4.L);
                        v5Var4.showDialog(i1Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(wVar, h7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (MessagesController.getInstance(v5Var.M).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(v5Var.c0)) {
            linearLayout.addView(wVar2, h7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(wVar3, h7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, h7.z5.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
