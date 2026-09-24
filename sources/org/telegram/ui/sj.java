package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
