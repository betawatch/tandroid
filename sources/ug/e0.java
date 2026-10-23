package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ei.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.ey;
import sg.m1;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class e0 extends m1 {
    public static e0 S0;
    public final wg.a Q0;
    public final String R0;

    public e0(o2 o2Var, int i10, TLRPC.User user, sg.k kVar, String str, boolean z10, g6 g6Var) {
        super(o2Var, i10, user, kVar, null, g6Var);
        this.R0 = str;
        qc.a((FrameLayout) this.containerView, new o8(15));
        if (!z10) {
            mm0 mm0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            mm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            wg.a aVar = new wg.a(getContext(), this.resourcesProvider);
            this.Q0 = aVar;
            aVar.setOnClickListener(new hg.r0(this, 22));
            wg.a aVar2 = this.Q0;
            aVar2.e = true;
            ei.d dVar = aVar2.a;
            dVar.setEnabled(true);
            dVar.i(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            r6.i(k6.h5, aVar2.b, aVar2.c);
            this.containerView.addView(this.Q0, z5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static /* synthetic */ void i0(e0 e0Var, TLRPC.TL_error tL_error) {
        e0Var.Q0.b(false);
        h.c(tL_error, (FrameLayout) e0Var.containerView, e0Var.resourcesProvider, new c0(e0Var, 0));
    }

    public static void j0(e0 e0Var) {
        m1 m1Var = new m1(e0Var.n, UserConfig.selectedAccount, null, null, null, e0Var.resourcesProvider);
        m1Var.J0 = true;
        m1Var.K0 = true;
        m1Var.c0 = true;
        e0Var.n.showDialog(m1Var);
    }

    public static void k0(e0 e0Var) {
        String str = "https://t.me/giftcode/" + e0Var.R0;
        ey eyVar = new ey(org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true));
        eyVar.C2 = new e8(19, e0Var, str);
        e0Var.n.presentFragment(eyVar);
        e0Var.dismiss();
    }

    @Override // sg.m1
    public final int c0() {
        return 6;
    }

    @Override // sg.m1
    public final void d0(View view) {
        ((wg.t) view).setSlug(this.R0);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        S0 = null;
    }

    @Override // sg.m1
    public final View e0(Context context, int i10) {
        if (i10 != 6) {
            return null;
        }
        wg.t tVar = new wg.t(context, this.resourcesProvider);
        tVar.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        return tVar;
    }

    @Override // sg.m1
    public final void g0(boolean z10) {
        super.g0(z10);
        this.P0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.P0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), k6.gc, 0, new c0(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override // sg.m1
    public final void h0() {
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
}
