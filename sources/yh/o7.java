package yh;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.nk;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class o7 extends za implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public x51 Y;
    public boolean Z;

    public o7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, f6Var);
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 24));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        c90 c90Var = new c90(context, f6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        c90Var.setTextSize(1, 12.0f);
        c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, f6Var));
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        c90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new y2(this, 7)));
        c90Var.setGravity(17);
        c90Var.setMaxWidth(ci.f4.a(c90Var.getText(), c90Var.getPaint()));
        frameLayout.addView(c90Var, w7.x5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        this.containerView.addView(new r00(getContext()), w7.x5.c(-1.0f, -1));
        x51 x51Var = this.Y;
        if (x51Var != null) {
            x51Var.N(false);
        }
    }

    public static void P(o7 o7Var, int i10) {
        j51 G;
        x51 x51Var = o7Var.Y;
        if (x51Var == null || (G = x51Var.G(i10 - 1)) == null) {
            return;
        }
        x51 x51Var2 = o7Var.Y;
        if (G.d == -1) {
            o7Var.Z = !o7Var.Z;
            x51Var2.N(true);
            o7Var.d.w0(0, AndroidUtilities.dp(300.0f), null);
        } else if (G.G(k7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(o7Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            if (findActivity == null) {
                return;
            }
            v5.y(o7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(26, o7Var, G), null);
        }
    }

    public static void Q(o7 o7Var, j51 j51Var, Boolean bool, String str) {
        if (o7Var.getContext() == null) {
            return;
        }
        o7Var.dismiss();
        v5.y(o7Var.currentAccount, false).T(true);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (bool.booleanValue()) {
            vc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) j51Var.B, new Object[0])), R.raw.stars_topup).j();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.x0.c(true);
                return;
            }
            return;
        }
        if (str != null) {
            hg.k0.s(R.string.UnknownErrorCode, new Object[]{str}, vc.a0(U), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, x51 x51Var) {
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = v5.y(this.currentAccount, false).z();
        if (z10 == null || z10.isEmpty()) {
            arrayList.add(j51.n(31));
            arrayList.add(j51.n(31));
            arrayList.add(j51.n(31));
            arrayList.add(j51.n(31));
            arrayList.add(j51.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < z10.size(); i12++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i12);
                if (!tL_starsTopupOption.extended || this.Z) {
                    arrayList.add(k7.a(i12, i11, tL_starsTopupOption));
                    i11++;
                } else {
                    i10++;
                }
            }
            boolean z11 = this.Z;
            if (!z11 && i10 > 0) {
                String string = LocaleController.getString(z11 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z12 = !this.Z;
                int i13 = g7.a;
                j51 J = j51.J(g7.class);
                J.d = -1;
                J.l = string;
                J.f = z12;
                J.q = true;
                arrayList.add(J);
            }
        }
        arrayList.add(j51.k(this.X));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x51 x51Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (x51Var = this.Y) != null) {
            x51Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        nk nkVar;
        long j3 = v5.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof bo) {
            bo boVar = (bo) R;
            if (boVar.x9() && (nkVar = boVar.Y) != null) {
                nkVar.Q();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.za
    public final ll0 v(ml0 ml0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 29), this.resourcesProvider);
        this.Y = x51Var;
        x51Var.r = false;
        return x51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
