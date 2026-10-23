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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class m extends f3 {
    public static m e;
    public final k b;
    public final y0 c;
    public boolean d;

    public m(Activity activity, z zVar, y0 y0Var, d6 d6Var, boolean z10) {
        super(1, (Context) activity, d6Var, true);
        this.c = y0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.a.h(h6.w0(h6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        k kVar = new k(this, getContext(), y0Var, d6Var, zVar);
        this.b = kVar;
        kVar.setOverScrollMode(2);
        kVar.setClipToPadding(false);
        kVar.setAdapter(new j5(zVar, y0Var));
        kVar.setPosition(0);
        setCustomView(kVar);
        zVar.t0 = new j(this, 0);
        zVar.r0 = new n2.e(this, y0Var, false, 20);
        y0Var.u0 = new l(this, zVar, d6Var);
        y0Var.s0 = new j(this, 1);
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
        n2 a5Var = z10 ? new a5(n2Var) : n2Var;
        m mVar = new m(n2Var.getParentActivity(), new z(a5Var, j10, prepaidGiveaway), new y0(a5Var, j10), a5Var.getResourceProvider(), z10);
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
        y0 y0Var = this.c;
        if (y0Var.T()) {
            return;
        }
        if (isKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(y0Var.getContainerView());
        }
        kVar.D(0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
