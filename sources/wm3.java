// default package

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wm3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CountDownLatch b;

    public /* synthetic */ wm3(CountDownLatch countDownLatch, byte b) {
        this.a = b;
        this.b = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CountDownLatch countDownLatch = this.b;
        switch (b) {
            case 0:
                try {
                    countDownLatch.await(20000L, TimeUnit.MILLISECONDS);
                    break;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                countDownLatch.countDown();
                break;
        }
    }
}
