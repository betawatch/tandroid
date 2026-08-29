package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qm0 extends TimerTask {
    public final /* synthetic */ rm0 a;

    public qm0(rm0 rm0Var) {
        this.a = rm0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        rm0 rm0Var = this.a;
        if (rm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        rm0Var.y = (int) (rm0Var.y - (currentTimeMillis - rm0Var.B));
        rm0Var.B = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new vk0(this, 6));
    }
}
