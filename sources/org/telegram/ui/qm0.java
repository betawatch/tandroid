package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
