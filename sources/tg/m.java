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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.qc;
import org.telegram.ui.zv0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class m extends e3 {
    public static m e;
    public final k b;
    public final z0 c;
    public boolean d;

    public m(Activity activity, a0 a0Var, z0 z0Var, d6 d6Var, boolean z10) {
        super(1, (Context) activity, d6Var, true);
        this.c = z0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.a.f(h6.v0(h6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        k kVar = new k(this, getContext(), z0Var, d6Var, a0Var);
        this.b = kVar;
        kVar.setOverScrollMode(2);
        kVar.setClipToPadding(false);
        kVar.setAdapter(new zv0(a0Var, z0Var));
        kVar.setPosition(0);
        setCustomView(kVar);
        a0Var.t0 = new j(this, 0);
        a0Var.r0 = new o0.a(this, z0Var, false, 17);
        z0Var.u0 = new l(this, a0Var, d6Var);
        z0Var.s0 = new j(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        qc.a(this.container, new a9(13));
    }

    public static void m(m2 m2Var, d6 d6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (e != null) {
            return;
        }
        boolean z10 = d6Var instanceof ai.d;
        m2 y3Var = z10 ? new y3(m2Var) : m2Var;
        m mVar = new m(m2Var.getParentActivity(), new a0(y3Var, j3, prepaidGiveaway), new z0(y3Var, j3), y3Var.getResourceProvider(), z10);
        mVar.show();
        e = mVar;
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
        kVar.D(0);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
