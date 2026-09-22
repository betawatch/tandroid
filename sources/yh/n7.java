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
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.mk;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class n7 extends za implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public w51 Y;
    public boolean Z;

    public n7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, e6Var);
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 24));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        int i11 = org.telegram.ui.ActionBar.i6.d6;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        c90 c90Var = new c90(context, e6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        c90Var.setTextSize(1, 12.0f);
        c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B6, e6Var));
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        c90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new x2(this, 7)));
        c90Var.setGravity(17);
        c90Var.setMaxWidth(ci.f4.a(c90Var.getText(), c90Var.getPaint()));
        frameLayout.addView(c90Var, w7.x5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, e6Var));
        this.containerView.addView(new r00(getContext()), w7.x5.c(-1.0f, -1));
        w51 w51Var = this.Y;
        if (w51Var != null) {
            w51Var.N(false);
        }
    }

    public static void P(n7 n7Var, int i10) {
        i51 G;
        w51 w51Var = n7Var.Y;
        if (w51Var == null || (G = w51Var.G(i10 - 1)) == null) {
            return;
        }
        w51 w51Var2 = n7Var.Y;
        if (G.d == -1) {
            n7Var.Z = !n7Var.Z;
            w51Var2.N(true);
            n7Var.d.v0(0, AndroidUtilities.dp(300.0f), null);
        } else if (G.G(j7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(n7Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            if (findActivity == null) {
                return;
            }
            u5.y(n7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(26, n7Var, G), null);
        }
    }

    public static void Q(n7 n7Var, i51 i51Var, Boolean bool, String str) {
        if (n7Var.getContext() == null) {
            return;
        }
        n7Var.dismiss();
        u5.y(n7Var.currentAccount, false).T(true);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (bool.booleanValue()) {
            vc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) i51Var.B, new Object[0])), R.raw.stars_topup).j();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.x0.c(true);
                return;
            }
            return;
        }
        if (str != null) {
            hg.c.s(R.string.UnknownErrorCode, new Object[]{str}, vc.a0(U), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, w51 w51Var) {
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = u5.y(this.currentAccount, false).z();
        if (z10 == null || z10.isEmpty()) {
            arrayList.add(i51.n(31));
            arrayList.add(i51.n(31));
            arrayList.add(i51.n(31));
            arrayList.add(i51.n(31));
            arrayList.add(i51.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < z10.size(); i12++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i12);
                if (!tL_starsTopupOption.extended || this.Z) {
                    arrayList.add(j7.a(i12, i11, tL_starsTopupOption));
                    i11++;
                } else {
                    i10++;
                }
            }
            boolean z11 = this.Z;
            if (!z11 && i10 > 0) {
                String string = LocaleController.getString(z11 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z12 = !this.Z;
                int i13 = f7.a;
                i51 J = i51.J(f7.class);
                J.d = -1;
                J.l = string;
                J.f = z12;
                J.q = true;
                arrayList.add(J);
            }
        }
        arrayList.add(i51.k(this.X));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (w51Var = this.Y) != null) {
            w51Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        mk mkVar;
        long j3 = u5.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof bo) {
            bo boVar = (bo) R;
            if (boVar.x9() && (mkVar = boVar.Y) != null) {
                mkVar.Q();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.za
    public final kl0 v(ll0 ll0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 29), this.resourcesProvider);
        this.Y = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
