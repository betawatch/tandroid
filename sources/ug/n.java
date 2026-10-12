package ug;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.o3;
import di.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.sc;
import org.telegram.ui.ow0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class n extends e3 {
    public static n e;
    public final l b;
    public final z0 c;
    public boolean d;

    public n(Activity activity, a0 a0Var, z0 z0Var, c6 c6Var, boolean z10) {
        super(1, (Context) activity, c6Var, true);
        this.c = z0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.a.f(g6.w0(g6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        l lVar = new l(this, getContext(), z0Var, c6Var, a0Var);
        this.b = lVar;
        lVar.setOverScrollMode(2);
        lVar.setClipToPadding(false);
        lVar.setAdapter(new ow0(a0Var, z0Var));
        lVar.setPosition(0);
        setCustomView(lVar);
        a0Var.t0 = new k(this, 0);
        a0Var.r0 = new n6.o(this, z0Var, false, 18);
        z0Var.u0 = new m(this, a0Var, c6Var);
        z0Var.s0 = new k(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        sc.a(this.container, new z8(13));
    }

    public static void n(m2 m2Var, c6 c6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (e != null) {
            return;
        }
        boolean z10 = c6Var instanceof bi.b;
        m2 o3Var = z10 ? new o3(m2Var) : m2Var;
        n nVar = new n(m2Var.getParentActivity(), new a0(o3Var, j10, prepaidGiveaway), new z0(o3Var, j10), o3Var.getResourceProvider(), z10);
        nVar.show();
        e = nVar;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        e = null;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        l lVar = this.b;
        if (lVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        z0 z0Var = this.c;
        if (z0Var.T()) {
            return;
        }
        if (isKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(z0Var.getContainerView());
        }
        lVar.D(0);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
