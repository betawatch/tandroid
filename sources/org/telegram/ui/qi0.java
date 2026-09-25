package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class qi0 extends ji.n {
    public Runnable W;

    @Override // ji.n, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        pi0 pi0Var = new pi0(this, 0);
        this.W = pi0Var;
        AndroidUtilities.runOnUIThread(pi0Var);
    }

    @Override // ji.n
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
    }

    @Override // ji.n, s4.j, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        pi0 pi0Var = new pi0(this, 1);
        this.W = pi0Var;
        AndroidUtilities.runOnUIThread(pi0Var);
    }

    @Override // s4.j
    public final void F() {
    }
}
