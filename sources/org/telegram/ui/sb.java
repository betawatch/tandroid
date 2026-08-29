package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    public /* synthetic */ sb(wb wbVar, int i10) {
        this.a = i10;
        this.b = wbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                wb wbVar = this.b;
                wbVar.a(countDownLatch, null);
                wbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new sb(wbVar, 3));
                break;
            case 1:
                wb wbVar2 = this.b;
                wbVar2.D = false;
                wbVar2.d(true);
                break;
            case 2:
                wb wbVar3 = this.b;
                wbVar3.D = false;
                wbVar3.d(true);
                break;
            default:
                wb wbVar4 = this.b;
                wbVar4.D = false;
                wbVar4.d(true);
                break;
        }
    }
}
