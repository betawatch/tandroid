package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                dcVar2.H = false;
                dcVar2.d(true);
                break;
            case 2:
                dc dcVar3 = this.b;
                dcVar3.H = false;
                dcVar3.d(true);
                break;
            default:
                dc dcVar4 = this.b;
                dcVar4.H = false;
                dcVar4.d(true);
                break;
        }
    }
}
