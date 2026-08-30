package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ym0 extends TimerTask {
    public final /* synthetic */ zm0 a;

    public ym0(zm0 zm0Var) {
        this.a = zm0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zm0 zm0Var = this.a;
        if (zm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        zm0Var.y = (int) (zm0Var.y - (currentTimeMillis - zm0Var.C));
        zm0Var.C = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new el0(this, 6));
    }
}
