package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xj extends ji.n {
    public Runnable W;
    public final /* synthetic */ bo X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(bo boVar, bo boVar2, vj vjVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(boVar2, vjVar, f6Var);
        this.X = boVar;
    }

    @Override // s4.j
    public final void F() {
        bo boVar = this.X;
        if (boVar.H9 == -1) {
            boVar.H9 = boVar.getNotificationCenter().setAnimationInProgress(boVar.H9, bo.Mc, false);
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
        wj wjVar = new wj(this, 1);
        this.W = wjVar;
        AndroidUtilities.runOnUIThread(wjVar);
    }

    @Override // ji.n
    public final void W() {
        bo boVar = this.X;
        boVar.H9 = boVar.getNotificationCenter().setAnimationInProgress(boVar.H9, bo.Mc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.w2 w2Var = boVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(w2Var);
        w2Var.run();
        org.telegram.ui.Components.ye yeVar = boVar.Y.X3;
        AndroidUtilities.cancelRunOnUIThread(yeVar);
        yeVar.run();
    }

    @Override // ji.n, s4.j, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        wj wjVar = new wj(this, 0);
        this.W = wjVar;
        AndroidUtilities.runOnUIThread(wjVar);
    }
}
