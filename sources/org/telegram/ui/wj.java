package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wj extends ji.n {
    public Runnable W;
    public final /* synthetic */ bo X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(bo boVar, bo boVar2, uj ujVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(boVar2, ujVar, e6Var);
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
        vj vjVar = new vj(this, 1);
        this.W = vjVar;
        AndroidUtilities.runOnUIThread(vjVar);
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
        org.telegram.ui.ActionBar.v2 v2Var = boVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(v2Var);
        v2Var.run();
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
        vj vjVar = new vj(this, 0);
        this.W = vjVar;
        AndroidUtilities.runOnUIThread(vjVar);
    }
}
