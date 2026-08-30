package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sj extends wh.n {
    public Runnable W;
    public final /* synthetic */ xn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(xn xnVar, xn xnVar2, qj qjVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(xnVar2, qjVar, f6Var);
        this.X = xnVar;
    }

    @Override // f2.l
    public final void F() {
        xn xnVar = this.X;
        if (xnVar.E9 == -1) {
            xnVar.E9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.E9, xn.Kc, false);
        }
    }

    @Override // wh.n, f2.l
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        rj rjVar = new rj(this, 1);
        this.W = rjVar;
        AndroidUtilities.runOnUIThread(rjVar);
    }

    @Override // wh.n
    public final void W() {
        xn xnVar = this.X;
        xnVar.E9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.E9, xn.Kc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.w2 w2Var = xnVar.V.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(w2Var);
        w2Var.run();
        org.telegram.ui.Components.re reVar = xnVar.V.U3;
        AndroidUtilities.cancelRunOnUIThread(reVar);
        reVar.run();
    }

    @Override // wh.n, f2.l, f2.t0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        rj rjVar = new rj(this, 0);
        this.W = rjVar;
        AndroidUtilities.runOnUIThread(rjVar);
    }
}
