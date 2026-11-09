package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class yj0 extends TimerTask {
    public final /* synthetic */ zj0 a;

    public yj0(zj0 zj0Var) {
        this.a = zj0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zj0 zj0Var = this.a;
        if (zj0Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        zj0Var.D = (int) (zj0Var.D - (currentTimeMillis - zj0Var.F));
        zj0Var.F = currentTimeMillis;
        org.telegram.messenger.g0.h3(new gf0(this, 9));
    }
}
