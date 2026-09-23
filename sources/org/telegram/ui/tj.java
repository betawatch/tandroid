package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class tj extends ji.n {
    public Runnable W;
    public final /* synthetic */ xn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(xn xnVar, xn xnVar2, rj rjVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(xnVar2, rjVar, d6Var);
        this.X = xnVar;
    }

    @Override // s4.j
    public final void F() {
        xn xnVar = this.X;
        if (xnVar.H9 == -1) {
            xnVar.H9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.H9, xn.Mc, false);
        }
    }

    @Override // ji.n, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        sj sjVar = new sj(this, 1);
        this.W = sjVar;
        AndroidUtilities.runOnUIThread(sjVar);
    }

    @Override // ji.n
    public final void W() {
        xn xnVar = this.X;
        xnVar.H9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.H9, xn.Mc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.v2 v2Var = xnVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(v2Var);
        v2Var.run();
        org.telegram.ui.Components.af afVar = xnVar.Y.X3;
        AndroidUtilities.cancelRunOnUIThread(afVar);
        afVar.run();
    }

    @Override // ji.n, s4.j, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        sj sjVar = new sj(this, 0);
        this.W = sjVar;
        AndroidUtilities.runOnUIThread(sjVar);
    }
}
