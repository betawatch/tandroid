package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class wj extends ki.o {
    public Runnable W;
    public final /* synthetic */ co X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(co coVar, co coVar2, uj ujVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(coVar2, ujVar, f6Var);
        this.X = coVar;
    }

    @Override // s4.j
    public final void F() {
        co coVar = this.X;
        if (coVar.H9 == -1) {
            coVar.H9 = coVar.getNotificationCenter().setAnimationInProgress(coVar.H9, co.Nc, false);
        }
    }

    @Override // ki.o, s4.j
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

    @Override // ki.o
    public final void W() {
        co coVar = this.X;
        coVar.H9 = coVar.getNotificationCenter().setAnimationInProgress(coVar.H9, co.Nc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.v2 v2Var = coVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(v2Var);
        v2Var.run();
        org.telegram.ui.Components.bf bfVar = coVar.Y.X3;
        AndroidUtilities.cancelRunOnUIThread(bfVar);
        bfVar.run();
    }

    @Override // ki.o, s4.j, s4.m0
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
