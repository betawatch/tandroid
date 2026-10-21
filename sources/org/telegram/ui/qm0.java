package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
        rm0Var.y = (int) (rm0Var.y - (currentTimeMillis - rm0Var.F));
        rm0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new ck0(this, 7));
    }
}
