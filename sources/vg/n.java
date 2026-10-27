package vg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.e5;
import bi.v4;
import fi.k8;
import m4.w1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class n extends k3 {
    public static n e;
    public final l b;
    public final z0 c;
    public boolean d;

    public n(Activity activity, a0 a0Var, z0 z0Var, u6 u6Var, boolean z10) {
        super(1, (Context) activity, u6Var, true);
        this.c = z0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.a.h(y6.w0(y6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        l lVar = new l(this, getContext(), z0Var, u6Var, a0Var);
        this.b = lVar;
        lVar.setOverScrollMode(2);
        lVar.setClipToPadding(false);
        lVar.setAdapter(new e5(a0Var, z0Var));
        lVar.setPosition(0);
        setCustomView(lVar);
        a0Var.t0 = new k(this, 0);
        a0Var.r0 = new w1(this, z0Var, false, 24);
        z0Var.u0 = new m(this, a0Var, u6Var);
        z0Var.s0 = new k(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().U();
        }
        qc.a(this.container, new k8(12));
    }

    public static void m(r2 r2Var, u6 u6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (e != null) {
            return;
        }
        boolean z10 = u6Var instanceof di.b;
        r2 v4Var = z10 ? new v4(r2Var) : r2Var;
        n nVar = new n(r2Var.getParentActivity(), new a0(v4Var, j10, prepaidGiveaway), new z0(v4Var, j10), v4Var.getResourceProvider(), z10);
        nVar.show();
        e = nVar;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        e = null;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        l lVar = this.b;
        if (lVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        z0 z0Var = this.c;
        if (z0Var.S()) {
            return;
        }
        if (isKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(z0Var.getContainerView());
        }
        lVar.E(0);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
