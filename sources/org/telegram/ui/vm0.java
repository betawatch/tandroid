package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class vm0 extends TimerTask {
    public final /* synthetic */ wm0 a;

    public vm0(wm0 wm0Var) {
        this.a = wm0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        wm0 wm0Var = this.a;
        if (wm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        wm0Var.y = (int) (wm0Var.y - (currentTimeMillis - wm0Var.F));
        wm0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new oj0(this, 8));
    }
}
