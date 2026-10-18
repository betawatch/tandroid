package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        tm0Var.y = (int) (tm0Var.y - (currentTimeMillis - tm0Var.F));
        tm0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new ek0(this, 7));
    }
}
