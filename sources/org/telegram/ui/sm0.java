package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
