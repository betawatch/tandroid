package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc b;

    public /* synthetic */ zb(dc dcVar, int i10) {
        this.a = i10;
        this.b = dcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                dc dcVar = this.b;
                dcVar.a(countDownLatch, null);
                dcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new zb(dcVar, 3));
                break;
            case 1:
                dc dcVar2 = this.b;
                dcVar2.G = false;
                dcVar2.d(true);
                break;
            case 2:
                dc dcVar3 = this.b;
                dcVar3.G = false;
                dcVar3.d(true);
                break;
            default:
                dc dcVar4 = this.b;
                dcVar4.G = false;
                dcVar4.d(true);
                break;
        }
    }
}
