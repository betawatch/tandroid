package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                yn ynVar = ujVar.X;
                if (ynVar.F9 != -1) {
                    ynVar.getNotificationCenter().onAnimationFinish(ynVar.F9);
                    ynVar.F9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                uj ujVar2 = this.b;
                ujVar2.W = null;
                yn ynVar2 = ujVar2.X;
                if (ynVar2.F9 != -1) {
                    ynVar2.getNotificationCenter().onAnimationFinish(ynVar2.F9);
                    ynVar2.F9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
