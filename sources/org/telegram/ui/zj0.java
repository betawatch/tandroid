package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        ak0Var.E = (int) (ak0Var.E - (currentTimeMillis - ak0Var.G));
        ak0Var.G = currentTimeMillis;
        org.telegram.messenger.g0.h3(new ef0(this, 9));
    }
}
