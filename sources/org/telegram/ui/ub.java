package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb b;

    public /* synthetic */ ub(yb ybVar, int i10) {
        this.a = i10;
        this.b = ybVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                yb ybVar = this.b;
                ybVar.a(countDownLatch, null);
                ybVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new ub(ybVar, 3));
                break;
            case 1:
                yb ybVar2 = this.b;
                ybVar2.D = false;
                ybVar2.d(true);
                break;
            case 2:
                yb ybVar3 = this.b;
                ybVar3.D = false;
                ybVar3.d(true);
                break;
            default:
                yb ybVar4 = this.b;
                ybVar4.D = false;
                ybVar4.d(true);
                break;
        }
    }
}
