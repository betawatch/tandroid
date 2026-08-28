package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rm0 extends TimerTask {
    public final /* synthetic */ sm0 a;

    public rm0(sm0 sm0Var) {
        this.a = sm0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        sm0 sm0Var = this.a;
        if (sm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        sm0Var.y = (int) (sm0Var.y - (currentTimeMillis - sm0Var.B));
        sm0Var.B = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new zk0(this, 6));
    }
}
