package tg;

import ai.y3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ci.d9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.pc;
import org.telegram.ui.iw0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class m extends f3 {
    public static m e;
    public final k b;
    public final z0 c;
    public boolean d;

    public m(Activity activity, a0 a0Var, z0 z0Var, f6 f6Var, boolean z10) {
        super(1, (Context) activity, f6Var, true);
        this.c = z0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.a.f(j6.v0(j6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        k kVar = new k(this, getContext(), z0Var, f6Var, a0Var);
        this.b = kVar;
        kVar.setOverScrollMode(2);
        kVar.setClipToPadding(false);
        kVar.setAdapter(new iw0(a0Var, z0Var));
        kVar.setPosition(0);
        setCustomView(kVar);
        a0Var.t0 = new j(this, 0);
        a0Var.r0 = new m5.e(this, z0Var, false, 22);
        z0Var.u0 = new l(this, a0Var, f6Var);
        z0Var.s0 = new j(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        pc.a(this.container, new d9(13));
    }

    public static void m(n2 n2Var, f6 f6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (e != null) {
            return;
        }
        boolean z10 = f6Var instanceof ai.d;
        n2 y3Var = z10 ? new y3(n2Var) : n2Var;
        m mVar = new m(n2Var.getParentActivity(), new a0(y3Var, j3, prepaidGiveaway), new z0(y3Var, j3), y3Var.getResourceProvider(), z10);
        mVar.show();
        e = mVar;
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
        k kVar = this.b;
        if (kVar.getCurrentPosition() <= 0) {
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
        kVar.E(0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
