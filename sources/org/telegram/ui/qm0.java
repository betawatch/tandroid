package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
