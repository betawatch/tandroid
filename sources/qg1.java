// default package

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qg1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tg1 b;

    public /* synthetic */ qg1(tg1 tg1Var, byte b) {
        this.a = b;
        this.b = tg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tg1 tg1Var = this.b;
        switch (b) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                tg1Var.a(countDownLatch, null);
                tg1Var.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                hl.c3(new qg1(tg1Var, (byte) 3));
                break;
            case 1:
                tg1Var.H = false;
                tg1Var.d(true);
                break;
            case 2:
                tg1Var.H = false;
                tg1Var.d(true);
                break;
            default:
                tg1Var.H = false;
                tg1Var.d(true);
                break;
        }
    }
}
