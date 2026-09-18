package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj b;

    public /* synthetic */ wj(xj xjVar, int i10) {
        this.a = i10;
        this.b = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xj xjVar = this.b;
                xjVar.W = null;
                bo boVar = xjVar.X;
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
                xj xjVar2 = this.b;
                xjVar2.W = null;
                bo boVar2 = xjVar2.X;
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
