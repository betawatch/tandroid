package ug;

import ai.i5;
import ai.z4;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ei.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class l extends f3 {
    public static l e;
    public final j b;
    public final x0 c;
    public boolean d;

    public l(Activity activity, y yVar, x0 x0Var, d6 d6Var, boolean z10) {
        super(1, (Context) activity, d6Var, true);
        this.c = x0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.b.h(h6.w0(h6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), x0Var, d6Var, yVar);
        this.b = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new i5(yVar, x0Var));
        jVar.setPosition(0);
        setCustomView(jVar);
        yVar.t0 = new i(this, 0);
        yVar.r0 = new n2.e(this, x0Var, false, 20);
        x0Var.u0 = new k(this, yVar, d6Var);
        x0Var.s0 = new i(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        qc.a(this.container, new o8(13));
    }

    public static void n(n2 n2Var, d6 d6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (e != null) {
            return;
        }
        boolean z10 = d6Var instanceof ci.b;
        n2 z4Var = z10 ? new z4(n2Var) : n2Var;
        l lVar = new l(n2Var.getParentActivity(), new y(z4Var, j10, prepaidGiveaway), new x0(z4Var, j10), z4Var.getResourceProvider(), z10);
        lVar.show();
        e = lVar;
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
        j jVar = this.b;
        if (jVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        x0 x0Var = this.c;
        if (x0Var.T()) {
            return;
        }
        if (isKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(x0Var.getContainerView());
        }
        jVar.D(0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
