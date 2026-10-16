package zh;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import org.telegram.ui.sk;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class f7 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public a71 Y;
    public boolean Z;

    public f7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, c6Var);
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new bi.d(this, 24));
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        da0 da0Var = new da0(context, c6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        da0Var.setTextSize(1, 12.0f);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B6, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new zf.c(this, 19)));
        da0Var.setGravity(17);
        da0Var.setMaxWidth(di.d4.a(da0Var.getText(), da0Var.getPaint()));
        frameLayout.addView(da0Var, w7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        this.containerView.addView(new d10(getContext()), w7.z5.d(-1.0f, -1));
        a71 a71Var = this.Y;
        if (a71Var != null) {
            a71Var.N(false);
        }
    }

    public static void Q(f7 f7Var, int i10) {
        m61 G;
        a71 a71Var = f7Var.Y;
        if (a71Var == null || (G = a71Var.G(i10 - 1)) == null) {
            return;
        }
        a71 a71Var2 = f7Var.Y;
        if (G.d == -1) {
            f7Var.Z = !f7Var.Z;
            a71Var2.N(true);
            f7Var.d.v0(0, AndroidUtilities.dp(300.0f), null);
        } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(f7Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            if (findActivity == null) {
                return;
            }
            n5.y(f7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new rh.r(6, f7Var, G), null);
        }
    }

    public static void R(f7 f7Var, m61 m61Var, Boolean bool, String str) {
        if (f7Var.getContext() == null) {
            return;
        }
        f7Var.dismiss();
        n5.y(f7Var.currentAccount, false).T(true);
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (bool.booleanValue()) {
            zc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) m61Var.B, new Object[0])), R.raw.stars_topup).j();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.x0.c(true);
                return;
            }
            return;
        }
        if (str != null) {
            i2.d.s(R.string.UnknownErrorCode, new Object[]{str}, zc.a0(U), R.raw.error, 36);
        }
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence B() {
        return LocaleController.getString(R.string.StarsBuy);
    }

    public final void S(ArrayList arrayList, a71 a71Var) {
        i2.d.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = n5.y(this.currentAccount, false).z();
        if (z10 == null || z10.isEmpty()) {
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < z10.size(); i12++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i12);
                if (!tL_starsTopupOption.extended || this.Z) {
                    arrayList.add(b7.a(i12, i11, tL_starsTopupOption));
                    i11++;
                } else {
                    i10++;
                }
            }
            boolean z11 = this.Z;
            if (!z11 && i10 > 0) {
                String string = LocaleController.getString(z11 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z12 = !this.Z;
                int i13 = x6.a;
                m61 J = m61.J(x6.class);
                J.d = -1;
                J.l = string;
                J.f = z12;
                J.q = true;
                arrayList.add(J);
            }
        }
        arrayList.add(m61.k(this.X));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (a71Var = this.Y) != null) {
            a71Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        sk skVar;
        long j10 = n5.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R instanceof fo) {
            fo foVar = (fo) R;
            if (foVar.C9() && (skVar = foVar.Y) != null) {
                skVar.N();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 29), this.resourcesProvider);
        this.Y = a71Var;
        a71Var.r = false;
        return a71Var;
    }
}
