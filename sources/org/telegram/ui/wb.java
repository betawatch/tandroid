package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac b;

    public /* synthetic */ wb(ac acVar, int i10) {
        this.a = i10;
        this.b = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                ac acVar = this.b;
                acVar.a(countDownLatch, null);
                acVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new wb(acVar, 3));
                break;
            case 1:
                ac acVar2 = this.b;
                acVar2.E = false;
                acVar2.d(true);
                break;
            case 2:
                ac acVar3 = this.b;
                acVar3.E = false;
                acVar3.d(true);
                break;
            default:
                ac acVar4 = this.b;
                acVar4.E = false;
                acVar4.d(true);
                break;
        }
    }
}
