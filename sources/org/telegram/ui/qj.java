package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qj extends mi.m {
    public Runnable W;
    public final /* synthetic */ un X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(un unVar, un unVar2, oj ojVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(unVar2, ojVar, u6Var);
        this.X = unVar;
    }

    @Override // s4.l
    public final void F() {
        un unVar = this.X;
        if (unVar.T9 == -1) {
            unVar.T9 = unVar.getNotificationCenter().setAnimationInProgress(unVar.T9, un.hd, false);
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
        pj pjVar = new pj(this, 1);
        this.W = pjVar;
        AndroidUtilities.runOnUIThread(pjVar);
    }

    @Override // mi.m
    public final void W() {
        un unVar = this.X;
        unVar.T9 = unVar.getNotificationCenter().setAnimationInProgress(unVar.T9, un.hd, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.z2 z2Var = unVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(z2Var);
        z2Var.run();
        org.telegram.ui.Components.af afVar = unVar.Y.Y3;
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
        pj pjVar = new pj(this, 0);
        this.W = pjVar;
        AndroidUtilities.runOnUIThread(pjVar);
    }
}
