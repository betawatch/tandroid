package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj b;

    public /* synthetic */ rj(sj sjVar, int i10) {
        this.a = i10;
        this.b = sjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sj sjVar = this.b;
                sjVar.W = null;
                xn xnVar = sjVar.X;
                if (xnVar.E9 != -1) {
                    xnVar.getNotificationCenter().onAnimationFinish(xnVar.E9);
                    xnVar.E9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                sj sjVar2 = this.b;
                sjVar2.W = null;
                xn xnVar2 = sjVar2.X;
                if (xnVar2.E9 != -1) {
                    xnVar2.getNotificationCenter().onAnimationFinish(xnVar2.E9);
                    xnVar2.E9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
