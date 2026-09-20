package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class vj extends ji.n {
    public Runnable W;
    public final /* synthetic */ zn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(zn znVar, zn znVar2, tj tjVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(znVar2, tjVar, f6Var);
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
        uj ujVar = new uj(this, 1);
        this.W = ujVar;
        AndroidUtilities.runOnUIThread(ujVar);
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
        org.telegram.ui.Components.af afVar = znVar.Y.X3;
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
        uj ujVar = new uj(this, 0);
        this.W = ujVar;
        AndroidUtilities.runOnUIThread(ujVar);
    }
}
