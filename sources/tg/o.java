package tg;

import ai.y3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ci.a9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qc;
import org.telegram.ui.bw0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o extends f3 {
    public static o e;
    public final m b;
    public final a1 c;
    public boolean d;

    public o(Activity activity, b0 b0Var, a1 a1Var, d6 d6Var, boolean z10) {
        super(1, (Context) activity, d6Var, true);
        this.c = a1Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.a.f(h6.v0(h6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        m mVar = new m(this, getContext(), a1Var, d6Var, b0Var);
        this.b = mVar;
        mVar.setOverScrollMode(2);
        mVar.setClipToPadding(false);
        mVar.setAdapter(new bw0(b0Var, a1Var));
        mVar.setPosition(0);
        setCustomView(mVar);
        b0Var.t0 = new l(this, 0);
        b0Var.r0 = new o0.a(this, a1Var, false, 17);
        a1Var.u0 = new n(this, b0Var, d6Var);
        a1Var.s0 = new l(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        qc.a(this.container, new a9(13));
    }

    public static void m(n2 n2Var, d6 d6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (e != null) {
            return;
        }
        boolean z10 = d6Var instanceof ai.d;
        n2 y3Var = z10 ? new y3(n2Var) : n2Var;
        o oVar = new o(n2Var.getParentActivity(), new b0(y3Var, j3, prepaidGiveaway), new a1(y3Var, j3), y3Var.getResourceProvider(), z10);
        oVar.show();
        e = oVar;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        e = null;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        m mVar = this.b;
        if (mVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        a1 a1Var = this.c;
        if (a1Var.S()) {
            return;
        }
        if (isKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(a1Var.getContainerView());
        }
        mVar.D(0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
