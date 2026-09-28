package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tj b;

    public /* synthetic */ sj(tj tjVar, int i10) {
        this.a = i10;
        this.b = tjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tj tjVar = this.b;
                tjVar.W = null;
                wn wnVar = tjVar.X;
                if (wnVar.H9 != -1) {
                    wnVar.getNotificationCenter().onAnimationFinish(wnVar.H9);
                    wnVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                tj tjVar2 = this.b;
                tjVar2.W = null;
                wn wnVar2 = tjVar2.X;
                if (wnVar2.H9 != -1) {
                    wnVar2.getNotificationCenter().onAnimationFinish(wnVar2.H9);
                    wnVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
