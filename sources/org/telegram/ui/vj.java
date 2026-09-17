package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                co coVar = wjVar.X;
                if (coVar.H9 != -1) {
                    coVar.getNotificationCenter().onAnimationFinish(coVar.H9);
                    coVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                wj wjVar2 = this.b;
                wjVar2.W = null;
                co coVar2 = wjVar2.X;
                if (coVar2.H9 != -1) {
                    coVar2.getNotificationCenter().onAnimationFinish(coVar2.H9);
                    coVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
