package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class wj extends ji.n {
    public Runnable W;
    public final /* synthetic */ zn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(zn znVar, zn znVar2, uj ujVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(znVar2, ujVar, f6Var);
        this.X = znVar;
    }

    @Override // s4.j
    public final void F() {
        zn znVar = this.X;
        if (znVar.H9 == -1) {
            znVar.H9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.H9, zn.Mc, false);
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
        zn znVar = this.X;
        znVar.H9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.H9, zn.Mc, false);
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
        org.telegram.ui.Components.af afVar = znVar.Y.Y3;
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
        vj vjVar = new vj(this, 0);
        this.W = vjVar;
        AndroidUtilities.runOnUIThread(vjVar);
    }
}
