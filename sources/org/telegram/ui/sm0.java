package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        tm0Var.y = (int) (tm0Var.y - (currentTimeMillis - tm0Var.B));
        tm0Var.B = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new zk0(this, 6));
    }
}
