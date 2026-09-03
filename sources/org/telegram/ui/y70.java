package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
