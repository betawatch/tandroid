package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class uj extends ji.n {
    public Runnable W;
    public final /* synthetic */ yn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(yn ynVar, yn ynVar2, sj sjVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(ynVar2, sjVar, d6Var);
        this.X = ynVar;
    }

    @Override // s4.j
    public final void F() {
        yn ynVar = this.X;
        if (ynVar.F9 == -1) {
            ynVar.F9 = ynVar.getNotificationCenter().setAnimationInProgress(ynVar.F9, yn.Hc, false);
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
        tj tjVar = new tj(this, 1);
        this.W = tjVar;
        AndroidUtilities.runOnUIThread(tjVar);
    }

    @Override // ji.n
    public final void W() {
        yn ynVar = this.X;
        ynVar.F9 = ynVar.getNotificationCenter().setAnimationInProgress(ynVar.F9, yn.Hc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.v2 v2Var = ynVar.W.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(v2Var);
        v2Var.run();
        org.telegram.ui.Components.cf cfVar = ynVar.W.Y3;
        AndroidUtilities.cancelRunOnUIThread(cfVar);
        cfVar.run();
    }

    @Override // ji.n, s4.j, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        tj tjVar = new tj(this, 0);
        this.W = tjVar;
        AndroidUtilities.runOnUIThread(tjVar);
    }
}
