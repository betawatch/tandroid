package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yj extends ji.n {
    public Runnable W;
    public final /* synthetic */ zn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(zn znVar, zn znVar2, wj wjVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(znVar2, wjVar, e6Var);
        this.X = znVar;
    }

    @Override // s4.j
    public final void F() {
        zn znVar = this.X;
        if (znVar.H9 == -1) {
            znVar.H9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.H9, zn.Nc, false);
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
        xj xjVar = new xj(this, 1);
        this.W = xjVar;
        AndroidUtilities.runOnUIThread(xjVar);
    }

    @Override // ji.n
    public final void W() {
        zn znVar = this.X;
        znVar.H9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.H9, zn.Nc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.v2 v2Var = znVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(v2Var);
        v2Var.run();
        org.telegram.ui.Components.df dfVar = znVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(dfVar);
        dfVar.run();
    }

    @Override // ji.n, s4.j, s4.n0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        xj xjVar = new xj(this, 0);
        this.W = xjVar;
        AndroidUtilities.runOnUIThread(xjVar);
    }
}
