package rh;

import ag.h;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import f2.l;
import f2.p0;
import fg.h0;
import fg.p2;
import gg.i;
import hg.v2;
import java.util.ArrayList;
import k7.c6;
import mh.a0;
import mh.ia;
import mh.ja;
import mh.p;
import mh.t7;
import mh.u9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.x51;
import org.telegram.ui.ib1;
import org.telegram.ui.iw0;
import org.telegram.ui.l20;
import org.telegram.ui.m20;
import org.telegram.ui.yh;
import qh.d4;
import qh.o9;
import sh.d3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class g extends m20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout M;
    public i N;
    public ia O;
    public iw0 P;
    public final boolean Q = B0();
    public LinearLayout R;
    public SpannableStringBuilder S;
    public k6 T;
    public k6 U;
    public o9 V;
    public qh.d W;
    public ib1 X;
    public qh.d Y;
    public qh.d Z;
    public boolean a0;
    public boolean b0;
    public d c0;

    public g() {
        this.J = true;
    }

    public static boolean B0() {
        return ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || BuildVars.isHuaweiStoreApp();
    }

    public static void x0(g gVar, int i10) {
        j51 G;
        d dVar = gVar.c0;
        if (dVar == null || (G = dVar.G(i10)) == null) {
            return;
        }
        int i11 = G.d;
        if (i11 == -1) {
            gVar.c0.N(true);
            return;
        }
        if (i11 == -2) {
            t7.y(gVar.currentAccount, true).u();
            v2.e0(1, BirthdayController.getInstance(gVar.currentAccount).getState());
        } else if (i11 == -3) {
            t7.y(gVar.currentAccount, true).W();
            gVar.c0.N(true);
        } else if (i11 == -4) {
            if (MessagesController.getInstance(gVar.currentAccount).isFrozen()) {
                org.telegram.ui.c.b(gVar.currentAccount);
            } else {
                gVar.presentFragment(new d3(gVar.getUserConfig().getClientUserId()));
            }
        }
    }

    public final void C0(ArrayList arrayList, x51 x51Var) {
        if (getParentActivity() == null) {
            return;
        }
        t7 y10 = t7.y(this.currentAccount, true);
        h0 h0Var = (h0) super.r0(getParentActivity());
        j51 j51Var = new j51(-2);
        j51Var.c = h0Var;
        arrayList.add(j51Var);
        arrayList.add(j51.k(this.R));
        boolean z4 = this.Q;
        if (z4) {
            yh.A(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean O = y10.O(0);
        this.a0 = O;
        if (!O) {
            arrayList.add(j51.l(this.P));
            return;
        }
        if (!z4) {
            arrayList.add(j51.B(null));
        }
        arrayList.add(j51.p(this.O, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
    }

    public final void D0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        t7 y10 = t7.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p10 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.S);
        spannableStringBuilder.append((CharSequence) ja.J0(p10, 0.66f, ' '));
        this.T.setText(spannableStringBuilder);
        int i10 = (int) ((p10.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            this.U.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.U.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = a0.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        final boolean z4 = (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.b0 == z4) {
            return;
        }
        this.b0 = z4;
        this.V.setVisibility(0);
        this.X.setVisibility(0);
        final int i11 = 0;
        this.V.animate().alpha(z4 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: rh.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        if (z4) {
                            this.b.V.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z4) {
                            this.b.X.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
        final int i12 = 1;
        this.X.animate().alpha(z4 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: rh.b
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        if (z4) {
                            this.b.V.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z4) {
                            this.b.X.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
    }

    @Override // org.telegram.ui.m20, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.D = false;
        this.B = AndroidUtilities.dp(238.0f);
        this.O = new ia(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.P = new iw0(this, context, 7);
        super.createView(context);
        f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.M = frameLayout;
        frameLayout.setClickable(true);
        i iVar = new i(context, 1, 4);
        this.N = iVar;
        gg.a aVar = iVar.b;
        aVar.w = org.telegram.ui.ActionBar.k6.fk;
        aVar.x = org.telegram.ui.ActionBar.k6.gk;
        aVar.b();
        this.N.setStarParticlesView(this.e);
        this.M.addView(this.N, c6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new e2.f(context, 11)), true), this.M, null);
        this.c.setOverScrollMode(2);
        l lVar = new l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setOnItemClickListener(new h(this, 18));
        this.s.addView(new s00(getParentActivity()), c6.c(-1.0f, -1));
        t7.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.R = linearLayout;
        linearLayout.setOrientation(1);
        this.R.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        k6 k6Var = new k6(getParentActivity(), false, true, false);
        this.T = k6Var;
        k6Var.setTypeface(AndroidUtilities.bold());
        this.T.setTextSize(AndroidUtilities.dp(32.0f));
        this.T.setGravity(17);
        this.T.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, this.resourceProvider));
        this.S = new SpannableStringBuilder("S");
        oq oqVar = new oq(R.drawable.mini_gram_72, 0);
        oqVar.setOverrideColor(-13397548);
        oqVar.setScale(0.5f, 0.5f);
        oqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.S.setSpan(oqVar, 0, 1, 33);
        this.R.addView(this.T, c6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        k6 k6Var2 = new k6(getParentActivity(), false, false, false);
        this.U = k6Var2;
        k6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.U.setGravity(17);
        this.U.setText(LocaleController.getString(R.string.YourTonBalance));
        this.U.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z6, this.resourceProvider));
        this.R.addView(this.U, c6.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        o9 o9Var = new o9(this, getParentActivity(), 1);
        this.V = o9Var;
        frameLayout2.addView(o9Var);
        boolean z4 = this.Q;
        if (z4) {
            qh.d dVar = new qh.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.W = dVar;
            dVar.e();
            this.W.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            final int i10 = 0;
            this.W.setOnClickListener(new View.OnClickListener(this) { // from class: rh.a
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            af.g.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        case 1:
                            af.g.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            g gVar = this.b;
                            gVar.presentFragment(new p(1, gVar.getUserConfig().getClientUserId()));
                            break;
                    }
                }
            });
            this.V.addView(this.W, c6.e(-1, 48, 119));
        }
        ib1 ib1Var = new ib1(this, getParentActivity(), 18);
        this.X = ib1Var;
        frameLayout2.addView(ib1Var);
        qh.d dVar2 = new qh.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.Y = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new oq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.Y.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: rh.a
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        af.g.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        af.g.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        g gVar = this.b;
                        gVar.presentFragment(new p(1, gVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        if (z4) {
            this.X.addView(this.Y, c6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        qh.d dVar3 = new qh.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.Z = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new oq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.Z.g(spannableStringBuilder2, false, true);
        final int i12 = 2;
        this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: rh.a
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        af.g.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        af.g.u(this.b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        g gVar = this.b;
                        gVar.presentFragment(new p(1, gVar.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        this.X.addView(this.Z, c6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.R.addView(frameLayout2, c6.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.V.animate().cancel();
        this.X.animate().cancel();
        this.X.setAlpha(this.b0 ? 1.0f : 0.0f);
        this.V.setAlpha(this.b0 ? 0.0f : 1.0f);
        this.X.setVisibility(this.b0 ? 0 : 8);
        this.V.setVisibility(this.b0 ? 8 : 0);
        D0();
        d dVar4 = this.c0;
        if (dVar4 != null) {
            dVar4.N(false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            d dVar = this.c0;
            if (dVar != null) {
                dVar.N(true);
            }
            if (this.K == 0 && this.L < 0) {
                this.L = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            t7 y10 = t7.y(this.currentAccount, true);
            if (this.a0 != y10.O(0)) {
                this.a0 = y10.O(0);
                s0();
                d dVar2 = this.c0;
                if (dVar2 != null) {
                    dVar2.N(true);
                }
                if (this.K == 0 && this.L < 0) {
                    this.L = 0;
                }
                l0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            d dVar3 = this.c0;
            if (dVar3 != null) {
                dVar3.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            D0();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            D0();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final int getNavigationBarColor() {
        return org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i5, false);
    }

    @Override // org.telegram.ui.m20
    public final p0 n0() {
        d dVar = new d(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new d4(this, 5), getResourceProvider());
        this.c0 = dVar;
        dVar.r = false;
        return dVar;
    }

    @Override // org.telegram.ui.m20
    public final l20 o0() {
        return new u9(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        t7.y(this.currentAccount, true).T(true);
        t7.y(this.currentAccount, true).S();
        t7.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.m20, org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(true);
            this.N.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.m20, org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(false);
            this.N.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.m20
    public final p2 p0() {
        return new c(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.m20
    public final boolean q0() {
        ia iaVar = this.O;
        boolean z4 = false;
        if (iaVar != null && (iaVar.getParent() instanceof View)) {
            if (this.c.getHeight() - ((View) this.O.getParent()).getBottom() >= 0) {
                z4 = true;
            }
        }
        return !z4;
    }

    @Override // org.telegram.ui.m20
    public final View r0(Context context) {
        throw null;
    }
}
