package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                bo boVar = wjVar.X;
                if (boVar.H9 != -1) {
                    boVar.getNotificationCenter().onAnimationFinish(boVar.H9);
                    boVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                wj wjVar2 = this.b;
                wjVar2.W = null;
                bo boVar2 = wjVar2.X;
                if (boVar2.H9 != -1) {
                    boVar2.getNotificationCenter().onAnimationFinish(boVar2.H9);
                    boVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
