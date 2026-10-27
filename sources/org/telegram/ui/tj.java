package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tj extends mi.m {
    public Runnable W;
    public final /* synthetic */ wn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(wn wnVar, wn wnVar2, rj rjVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(wnVar2, rjVar, u6Var);
        this.X = wnVar;
    }

    @Override // s4.l
    public final void F() {
        wn wnVar = this.X;
        if (wnVar.X9 == -1) {
            wnVar.X9 = wnVar.getNotificationCenter().setAnimationInProgress(wnVar.X9, wn.ld, false);
        }
    }

    @Override // mi.m, s4.l
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

    @Override // mi.m
    public final void W() {
        wn wnVar = this.X;
        wnVar.X9 = wnVar.getNotificationCenter().setAnimationInProgress(wnVar.X9, wn.ld, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.z2 z2Var = wnVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(z2Var);
        z2Var.run();
        org.telegram.ui.Components.af afVar = wnVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(afVar);
        afVar.run();
    }

    @Override // mi.m, s4.l, s4.m0
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
