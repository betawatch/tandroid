package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class wj0 extends TimerTask {
    public final /* synthetic */ xj0 a;

    public wj0(xj0 xj0Var) {
        this.a = xj0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        xj0 xj0Var = this.a;
        if (xj0Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        xj0Var.D = (int) (xj0Var.D - (currentTimeMillis - xj0Var.F));
        xj0Var.F = currentTimeMillis;
        org.telegram.messenger.g0.h3(new ef0(this, 9));
    }
}
