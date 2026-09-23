package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc b;

    public /* synthetic */ xb(bc bcVar, int i10) {
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
                AndroidUtilities.runOnUIThread(new xb(bcVar, 3));
                break;
            case 1:
                bc bcVar2 = this.b;
                bcVar2.H = false;
                bcVar2.d(true);
                break;
            case 2:
                bc bcVar3 = this.b;
                bcVar3.H = false;
                bcVar3.d(true);
                break;
            default:
                bc bcVar4 = this.b;
                bcVar4.H = false;
                bcVar4.d(true);
                break;
        }
    }
}
