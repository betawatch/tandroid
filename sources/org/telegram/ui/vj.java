package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class vj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj b;

    public /* synthetic */ vj(wj wjVar, int i10) {
        this.a = i10;
        this.b = wjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wj wjVar = this.b;
                wjVar.W = null;
                zn znVar = wjVar.X;
                if (znVar.H9 != -1) {
                    znVar.getNotificationCenter().onAnimationFinish(znVar.H9);
                    znVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                wj wjVar2 = this.b;
                wjVar2.W = null;
                zn znVar2 = wjVar2.X;
                if (znVar2.H9 != -1) {
                    znVar2.getNotificationCenter().onAnimationFinish(znVar2.H9);
                    znVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
