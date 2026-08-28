package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb b;

    public /* synthetic */ tb(xb xbVar, int i9) {
        this.a = i9;
        this.b = xbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                xb xbVar = this.b;
                xbVar.a(countDownLatch, null);
                xbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new tb(xbVar, 3));
                break;
            case 1:
                xb xbVar2 = this.b;
                xbVar2.D = false;
                xbVar2.d(true);
                break;
            case 2:
                xb xbVar3 = this.b;
                xbVar3.D = false;
                xbVar3.d(true);
                break;
            default:
                xb xbVar4 = this.b;
                xbVar4.D = false;
                xbVar4.d(true);
                break;
        }
    }
}
