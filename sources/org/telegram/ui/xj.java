package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj b;

    public /* synthetic */ xj(yj yjVar, int i10) {
        this.a = i10;
        this.b = yjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yj yjVar = this.b;
                yjVar.W = null;
                eo eoVar = yjVar.X;
                if (eoVar.H9 != -1) {
                    eoVar.getNotificationCenter().onAnimationFinish(eoVar.H9);
                    eoVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                yj yjVar2 = this.b;
                yjVar2.W = null;
                eo eoVar2 = yjVar2.X;
                if (eoVar2.H9 != -1) {
                    eoVar2.getNotificationCenter().onAnimationFinish(eoVar2.H9);
                    eoVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
