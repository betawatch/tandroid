package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                if (wnVar.X9 != -1) {
                    wnVar.getNotificationCenter().onAnimationFinish(wnVar.X9);
                    wnVar.X9 = -1;
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
                if (wnVar2.X9 != -1) {
                    wnVar2.getNotificationCenter().onAnimationFinish(wnVar2.X9);
                    wnVar2.X9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
