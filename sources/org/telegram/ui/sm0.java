package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class sm0 extends TimerTask {
    public final /* synthetic */ tm0 a;

    public sm0(tm0 tm0Var) {
        this.a = tm0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        tm0 tm0Var = this.a;
        if (tm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        tm0Var.y = (int) (tm0Var.y - (currentTimeMillis - tm0Var.F));
        tm0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new ek0(this, 7));
    }
}
