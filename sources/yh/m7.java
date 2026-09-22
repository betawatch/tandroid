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
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mk;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class m7 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public m61 Y;
    public boolean Z;

    public m7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, f6Var);
        yl0 yl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i10, 0, i10, 0);
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
        n90 n90Var = new n90(context, f6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        n90Var.setTextSize(1, 12.0f);
        n90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, f6Var));
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        n90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new s2(this, 8)));
        n90Var.setGravity(17);
        n90Var.setMaxWidth(ci.f4.a(n90Var.getText(), n90Var.getPaint()));
        frameLayout.addView(n90Var, w7.y5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        this.containerView.addView(new r00(getContext()), w7.y5.c(-1.0f, -1));
        m61 m61Var = this.Y;
        if (m61Var != null) {
            m61Var.N(false);
        }
    }

    public static void P(m7 m7Var, int i10) {
        y51 G;
        m61 m61Var = m7Var.Y;
        if (m61Var == null || (G = m61Var.G(i10 - 1)) == null) {
            return;
        }
        m61 m61Var2 = m7Var.Y;
        if (G.d == -1) {
            m7Var.Z = !m7Var.Z;
            m61Var2.N(true);
            m7Var.d.w0(0, AndroidUtilities.dp(300.0f), null);
        } else if (G.G(i7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(m7Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            if (findActivity == null) {
                return;
            }
            u5.y(m7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(26, m7Var, G), null);
        }
    }

    public static void Q(m7 m7Var, y51 y51Var, Boolean bool, String str) {
        if (m7Var.getContext() == null) {
            return;
        }
        m7Var.dismiss();
        u5.y(m7Var.currentAccount, false).T(true);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (bool.booleanValue()) {
            xc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) y51Var.B, new Object[0])), R.raw.stars_topup).j();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.x0.c(true);
                return;
            }
            return;
        }
        if (str != null) {
            hg.k0.q(R.string.UnknownErrorCode, new Object[]{str}, xc.a0(U), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, m61 m61Var) {
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = u5.y(this.currentAccount, false).z();
        if (z10 == null || z10.isEmpty()) {
            arrayList.add(y51.n(31));
            arrayList.add(y51.n(31));
            arrayList.add(y51.n(31));
            arrayList.add(y51.n(31));
            arrayList.add(y51.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < z10.size(); i12++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i12);
                if (!tL_starsTopupOption.extended || this.Z) {
                    arrayList.add(i7.a(i12, i11, tL_starsTopupOption));
                    i11++;
                } else {
                    i10++;
                }
            }
            boolean z11 = this.Z;
            if (!z11 && i10 > 0) {
                String string = LocaleController.getString(z11 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z12 = !this.Z;
                int i13 = e7.a;
                y51 J = y51.J(e7.class);
                J.d = -1;
                J.l = string;
                J.f = z12;
                J.q = true;
                arrayList.add(J);
            }
        }
        arrayList.add(y51.k(this.X));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m61 m61Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (m61Var = this.Y) != null) {
            m61Var.N(true);
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
        if (R instanceof zn) {
            zn znVar = (zn) R;
            if (znVar.x9() && (mkVar = znVar.Y) != null) {
                mkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.ab
    public final xl0 v(yl0 yl0Var) {
        m61 m61Var = new m61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 29), this.resourcesProvider);
        this.Y = m61Var;
        m61Var.r = false;
        return m61Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return LocaleController.getString(R.string.StarsBuy);
    }
}
