package ug;

import ai.a5;
import ai.j5;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ei.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class l extends h3 {
    public static l e;
    public final j b;
    public final x0 c;
    public boolean d;

    public l(Activity activity, y yVar, x0 x0Var, g6 g6Var, boolean z10) {
        super(1, (Context) activity, g6Var, true);
        this.c = x0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.a.h(k6.w0(k6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), x0Var, g6Var, yVar);
        this.b = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new j5(yVar, x0Var));
        jVar.setPosition(0);
        setCustomView(jVar);
        yVar.t0 = new i(this, 0);
        yVar.r0 = new n2.e(this, x0Var, false, 19);
        x0Var.u0 = new k(this, yVar, g6Var);
        x0Var.s0 = new i(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        qc.a(this.container, new o8(13));
    }

    public static void m(o2 o2Var, g6 g6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (e != null) {
            return;
        }
        boolean z10 = g6Var instanceof ci.b;
        o2 a5Var = z10 ? new a5(o2Var) : o2Var;
        l lVar = new l(o2Var.getParentActivity(), new y(a5Var, j10, prepaidGiveaway), new x0(a5Var, j10), a5Var.getResourceProvider(), z10);
        lVar.show();
        e = lVar;
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
        j jVar = this.b;
        if (jVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        x0 x0Var = this.c;
        if (x0Var.S()) {
            return;
        }
        if (isKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(x0Var.getContainerView());
        }
        jVar.D(0);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
