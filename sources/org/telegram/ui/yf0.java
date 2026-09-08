package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class yf0 extends TimerTask {
    public final /* synthetic */ zf0 a;

    public yf0(zf0 zf0Var) {
        this.a = zf0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 24));
    }
}
