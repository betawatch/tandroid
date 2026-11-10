package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zj0 extends TimerTask {
    public final /* synthetic */ ak0 a;

    public zj0(ak0 ak0Var) {
        this.a = ak0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ak0 ak0Var = this.a;
        if (ak0Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        ak0Var.D = (int) (ak0Var.D - (currentTimeMillis - ak0Var.F));
        ak0Var.F = currentTimeMillis;
        org.telegram.messenger.g0.h3(new hf0(this, 9));
    }
}
