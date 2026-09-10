package sg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.fa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.wy;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h0 extends qg.m1 {
    public static h0 S0;
    public final ug.a Q0;
    public final String R0;

    public h0(p2 p2Var, int i10, TLRPC.User user, qg.k kVar, String str, boolean z10, f6 f6Var) {
        super(p2Var, i10, user, kVar, null, f6Var);
        this.R0 = str;
        pc.a((FrameLayout) this.containerView, new fa(15));
        if (!z10) {
            vl0 vl0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            vl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            ug.a aVar = new ug.a(getContext(), this.resourcesProvider);
            this.Q0 = aVar;
            aVar.setOnClickListener(new org.telegram.ui.web.c(this, 6));
            ug.a aVar2 = this.Q0;
            aVar2.e = true;
            bi.d dVar = aVar2.a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.b.setBackgroundColor(j6.v0(j6.h5, aVar2.c));
            this.containerView.addView(this.Q0, a6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static /* synthetic */ void c0(h0 h0Var, TLRPC.TL_error tL_error) {
        h0Var.Q0.b(false);
        i.c(tL_error, (FrameLayout) h0Var.containerView, h0Var.resourcesProvider, new e0(h0Var, 0));
    }

    public static void d0(h0 h0Var) {
        qg.m1 m1Var = new qg.m1(h0Var.n, UserConfig.selectedAccount, null, null, null, h0Var.resourcesProvider);
        m1Var.J0 = true;
        m1Var.K0 = true;
        m1Var.c0 = true;
        h0Var.n.showDialog(m1Var);
    }

    public static void e0(h0 h0Var) {
        String str = "https://t.me/giftcode/" + h0Var.R0;
        wy wyVar = new wy(a2.e(3, "onlySelect", "dialogsType", true));
        wyVar.C2 = new f0(0, h0Var, str);
        h0Var.n.presentFragment(wyVar);
        h0Var.dismiss();
    }

    @Override // qg.m1
    public final int X() {
        return 6;
    }

    @Override // qg.m1
    public final void Y(View view) {
        ((ug.t) view).setSlug(this.R0);
    }

    @Override // qg.m1
    public final View Z(Context context, int i10) {
        if (i10 != 6) {
            return null;
        }
        ug.t tVar = new ug.t(context, this.resourcesProvider);
        tVar.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        return tVar;
    }

    @Override // qg.m1
    public final void a0(boolean z10) {
        super.a0(z10);
        this.P0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.P0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), j6.gc, 0, new e0(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override // qg.m1
    public final void b0() {
        int i10 = this.f0;
        this.g0 = i10;
        this.h0 = i10 + 1;
        int i11 = i10 + 2;
        this.f0 = i11;
        this.i0 = i11;
        this.j0 = i11;
        int size = this.X.size() + i11;
        this.k0 = size;
        this.f0 = size + 1;
        this.l0 = size;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        S0 = null;
    }
}
