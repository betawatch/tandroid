package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
