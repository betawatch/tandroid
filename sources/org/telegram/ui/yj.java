package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yj extends ii.n {
    public Runnable W;
    public final /* synthetic */ eo X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(eo eoVar, eo eoVar2, wj wjVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(eoVar2, wjVar, f6Var);
        this.X = eoVar;
    }

    @Override // s4.j
    public final void F() {
        eo eoVar = this.X;
        if (eoVar.H9 == -1) {
            eoVar.H9 = eoVar.getNotificationCenter().setAnimationInProgress(eoVar.H9, eo.Nc, false);
        }
    }

    @Override // ii.n, s4.j
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

    @Override // ii.n
    public final void W() {
        eo eoVar = this.X;
        eoVar.H9 = eoVar.getNotificationCenter().setAnimationInProgress(eoVar.H9, eo.Nc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.x2 x2Var = eoVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(x2Var);
        x2Var.run();
        org.telegram.ui.Components.bf bfVar = eoVar.Y.X3;
        AndroidUtilities.cancelRunOnUIThread(bfVar);
        bfVar.run();
    }

    @Override // ii.n, s4.j, s4.m0
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
