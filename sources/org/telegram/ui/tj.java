package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class tj extends ji.n {
    public Runnable W;
    public final /* synthetic */ wn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(wn wnVar, wn wnVar2, rj rjVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(wnVar2, rjVar, d6Var);
        this.X = wnVar;
    }

    @Override // s4.j
    public final void F() {
        wn wnVar = this.X;
        if (wnVar.H9 == -1) {
            wnVar.H9 = wnVar.getNotificationCenter().setAnimationInProgress(wnVar.H9, wn.Mc, false);
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
        wn wnVar = this.X;
        wnVar.H9 = wnVar.getNotificationCenter().setAnimationInProgress(wnVar.H9, wn.Mc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.u2 u2Var = wnVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(u2Var);
        u2Var.run();
        org.telegram.ui.Components.bf bfVar = wnVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(bfVar);
        bfVar.run();
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
