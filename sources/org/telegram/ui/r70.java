package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class r70 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ s70 b;

    public r70(s70 s70Var, String str) {
        this.b = s70Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        s70 s70Var = this.b;
        try {
            s70Var.f.cancel();
            s70Var.f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new q70(this, this.a, 0));
    }
}
