package tg;

import ai.y3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ci.d9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.oc;
import org.telegram.ui.iw0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class o extends f3 {
    public static o e;
    public final m b;
    public final a1 c;
    public boolean d;

    public o(Activity activity, b0 b0Var, a1 a1Var, e6 e6Var, boolean z10) {
        super(1, (Context) activity, e6Var, true);
        this.c = a1Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.a.f(i6.v0(i6.h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        m mVar = new m(this, getContext(), a1Var, e6Var, b0Var);
        this.b = mVar;
        mVar.setOverScrollMode(2);
        mVar.setClipToPadding(false);
        mVar.setAdapter(new iw0(b0Var, a1Var));
        mVar.setPosition(0);
        setCustomView(mVar);
        b0Var.t0 = new l(this, 0);
        b0Var.r0 = new o0.a(this, a1Var, false, 17);
        a1Var.u0 = new n(this, b0Var, e6Var);
        a1Var.s0 = new l(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        oc.a(this.container, new d9(13));
    }

    public static void m(n2 n2Var, e6 e6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (e != null) {
            return;
        }
        boolean z10 = e6Var instanceof ai.d;
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
