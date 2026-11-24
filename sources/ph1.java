// default package

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ph1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sh1 b;

    public /* synthetic */ ph1(sh1 sh1Var, byte b) {
        this.a = b;
        this.b = sh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sh1 sh1Var = this.b;
        switch (b) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                sh1Var.a(countDownLatch, null);
                sh1Var.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                gm.c3(new ph1(sh1Var, (byte) 3));
                break;
            case 1:
                sh1Var.H = false;
                sh1Var.d(true);
                break;
            case 2:
                sh1Var.H = false;
                sh1Var.d(true);
                break;
            default:
                sh1Var.H = false;
                sh1Var.d(true);
                break;
        }
    }
}
