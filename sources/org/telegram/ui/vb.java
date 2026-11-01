package org.telegram.ui;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb b;

    public /* synthetic */ vb(zb zbVar, int i10) {
        this.a = i10;
        this.b = zbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                zb zbVar = this.b;
                zbVar.a(countDownLatch, null);
                zbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.i0.g3(new vb(zbVar, 3));
                break;
            case 1:
                zb zbVar2 = this.b;
                zbVar2.G = false;
                zbVar2.d(true);
                break;
            case 2:
                zb zbVar3 = this.b;
                zbVar3.G = false;
                zbVar3.d(true);
                break;
            default:
                zb zbVar4 = this.b;
                zbVar4.G = false;
                zbVar4.d(true);
                break;
        }
    }
}
