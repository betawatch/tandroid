package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc b;

    public /* synthetic */ yb(cc ccVar, int i10) {
        this.a = i10;
        this.b = ccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                cc ccVar = this.b;
                ccVar.a(countDownLatch, null);
                ccVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new yb(ccVar, 3));
                break;
            case 1:
                cc ccVar2 = this.b;
                ccVar2.H = false;
                ccVar2.d(true);
                break;
            case 2:
                cc ccVar3 = this.b;
                ccVar3.H = false;
                ccVar3.d(true);
                break;
            default:
                cc ccVar4 = this.b;
                ccVar4.H = false;
                ccVar4.d(true);
                break;
        }
    }
}
