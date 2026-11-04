package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tj0 extends TimerTask {
    public final /* synthetic */ uj0 a;

    public tj0(uj0 uj0Var) {
        this.a = uj0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        uj0 uj0Var = this.a;
        if (uj0Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        uj0Var.E = (int) (uj0Var.E - (currentTimeMillis - uj0Var.G));
        uj0Var.G = currentTimeMillis;
        org.telegram.messenger.g0.h3(new sg0(this, 8));
    }
}
