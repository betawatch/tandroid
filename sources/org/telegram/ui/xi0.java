package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xi0 extends ki.o {
    public Runnable W;

    @Override // ki.o, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        wi0 wi0Var = new wi0(this, 0);
        this.W = wi0Var;
        AndroidUtilities.runOnUIThread(wi0Var);
    }

    @Override // ki.o
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

    @Override // ki.o, s4.j, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        wi0 wi0Var = new wi0(this, 1);
        this.W = wi0Var;
        AndroidUtilities.runOnUIThread(wi0Var);
    }

    @Override // s4.j
    public final void F() {
    }
}
