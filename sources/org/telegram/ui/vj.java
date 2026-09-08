package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
