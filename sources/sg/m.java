package sg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.fa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.pc;
import org.telegram.ui.kw0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m extends h3 {
    public static m e;
    public final k b;
    public final c1 c;
    public boolean d;

    public m(Activity activity, a0 a0Var, c1 c1Var, f6 f6Var, boolean z10) {
        super(1, (Context) activity, f6Var, true);
        this.c = c1Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.a.f(j6.v0(j6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        k kVar = new k(this, getContext(), c1Var, f6Var, a0Var);
        this.b = kVar;
        kVar.setOverScrollMode(2);
        kVar.setClipToPadding(false);
        kVar.setAdapter(new kw0(a0Var, c1Var));
        kVar.setPosition(0);
        setCustomView(kVar);
        a0Var.t0 = new j(this, 0);
        a0Var.r0 = new n7.a1(this, c1Var, false, 17);
        c1Var.u0 = new l(this, a0Var, f6Var);
        c1Var.s0 = new j(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        pc.a(this.container, new fa(13));
    }

    public static void m(p2 p2Var, f6 f6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (e != null) {
            return;
        }
        boolean z10 = f6Var instanceof zh.b;
        p2 o1Var = z10 ? new bi.o1(p2Var) : p2Var;
        m mVar = new m(p2Var.getParentActivity(), new a0(o1Var, j3, prepaidGiveaway), new c1(o1Var, j3), o1Var.getResourceProvider(), z10);
        mVar.show();
        e = mVar;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        e = null;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        k kVar = this.b;
        if (kVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        c1 c1Var = this.c;
        if (c1Var.S()) {
            return;
        }
        if (isKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(c1Var.getContainerView());
        }
        kVar.D(0);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
