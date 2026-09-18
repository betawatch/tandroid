package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vj b;

    public /* synthetic */ uj(vj vjVar, int i10) {
        this.a = i10;
        this.b = vjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vj vjVar = this.b;
                vjVar.W = null;
                zn znVar = vjVar.X;
                if (znVar.H9 != -1) {
                    znVar.getNotificationCenter().onAnimationFinish(znVar.H9);
                    znVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                vj vjVar2 = this.b;
                vjVar2.W = null;
                zn znVar2 = vjVar2.X;
                if (znVar2.H9 != -1) {
                    znVar2.getNotificationCenter().onAnimationFinish(znVar2.H9);
                    znVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
