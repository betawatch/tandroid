package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y70 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ z70 b;

    public y70(z70 z70Var, String str) {
        this.b = z70Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        z70 z70Var = this.b;
        try {
            z70Var.f.cancel();
            z70Var.f = null;
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        AndroidUtilities.runOnUIThread(new x70(this, this.a, 0));
    }
}
