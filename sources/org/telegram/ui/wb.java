package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc b;

    public /* synthetic */ wb(bc bcVar, int i10) {
        this.a = i10;
        this.b = bcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                bc bcVar = this.b;
                bcVar.a(countDownLatch, null);
                bcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new wb(bcVar, 3));
                break;
            case 1:
                bc bcVar2 = this.b;
                bcVar2.E = false;
                bcVar2.d(true);
                break;
            case 2:
                bc bcVar3 = this.b;
                bcVar3.E = false;
                bcVar3.d(true);
                break;
            default:
                bc bcVar4 = this.b;
                bcVar4.E = false;
                bcVar4.d(true);
                break;
        }
    }
}
