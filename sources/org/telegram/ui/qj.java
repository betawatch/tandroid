package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj b;

    public /* synthetic */ qj(rj rjVar, int i10) {
        this.a = i10;
        this.b = rjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rj rjVar = this.b;
                rjVar.W = null;
                sn snVar = rjVar.X;
                if (snVar.H9 != -1) {
                    snVar.getNotificationCenter().onAnimationFinish(snVar.H9);
                    snVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                rj rjVar2 = this.b;
                rjVar2.W = null;
                sn snVar2 = rjVar2.X;
                if (snVar2.H9 != -1) {
                    snVar2.getNotificationCenter().onAnimationFinish(snVar2.H9);
                    snVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
