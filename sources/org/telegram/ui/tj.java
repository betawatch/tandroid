package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj b;

    public /* synthetic */ tj(uj ujVar, int i10) {
        this.a = i10;
        this.b = ujVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uj ujVar = this.b;
                ujVar.W = null;
                zn znVar = ujVar.X;
                if (znVar.E9 != -1) {
                    znVar.getNotificationCenter().onAnimationFinish(znVar.E9);
                    znVar.E9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                uj ujVar2 = this.b;
                ujVar2.W = null;
                zn znVar2 = ujVar2.X;
                if (znVar2.E9 != -1) {
                    znVar2.getNotificationCenter().onAnimationFinish(znVar2.E9);
                    znVar2.E9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
