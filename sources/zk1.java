// default package

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zk1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b29 b;

    public /* synthetic */ zk1(b29 b29Var, byte b) {
        this.a = b;
        this.b = b29Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Bitmap createBitmap;
        boolean z;
        byte b = this.a;
        byte b2 = 1;
        b29 b29Var = this.b;
        switch (b) {
            case 0:
                b29Var.C(false);
                break;
            case 1:
                b29Var.getClass();
                try {
                    ek0 ek0Var = b29Var.C0;
                    if (ek0Var != null) {
                        ek0Var.b();
                    }
                } catch (Throwable unused) {
                }
                hl.c3(b29Var.A0);
                break;
            case 2:
                b29Var.Q = null;
                b29Var.k();
                break;
            case 3:
                b29Var.Y = true;
                if ((!b29Var.l0 && b29Var.X) || (b29Var.R == null && b29Var.S != null)) {
                    b29Var.s();
                }
                b29Var.k();
                break;
            case 4:
                if (!b29Var.m0 && !b29Var.W && b29Var.f() && b29Var.P == null) {
                    b29Var.y0 = true;
                    if (b29.U0 == null) {
                        b29.U0 = new uo3("cache generator queue", true);
                    }
                    ek0.A++;
                    uo3 uo3Var = b29.U0;
                    zk1 zk1Var = new zk1(b29Var, b2);
                    b29Var.P = zk1Var;
                    uo3Var.postRunnable(zk1Var);
                    break;
                }
                break;
            case 5:
                if (b29Var.P != null) {
                    ek0.c();
                    b29Var.P = null;
                }
                b29Var.y0 = false;
                b29Var.k();
                Runnable runnable = b29Var.B0;
                if (runnable != null) {
                    runnable.run();
                    b29Var.B0 = null;
                    break;
                }
                break;
            case 6:
                try {
                    i = b29Var.e();
                    if (i == 1) {
                        if (b29Var.T != null) {
                            createBitmap = b29Var.T;
                            z = true;
                        } else {
                            createBitmap = Bitmap.createBitmap(b29Var.b, b29Var.c, b29Var.H ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                            b29Var.T = createBitmap;
                            z = false;
                        }
                        int w = b29Var.w(createBitmap, z);
                        if (w == 1) {
                            b29Var.S = createBitmap;
                            b29Var.d();
                        }
                        i = w;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    i = 2;
                }
                if (i == 1) {
                    b29Var.H0 = 0;
                    hl.c3(b29Var.x0);
                } else if (i == 2) {
                    hl.d3(b29Var.w0, b29Var.H0);
                    b29Var.H0 = Math.min((Math.max(b29Var.H0, 2) * 3) / 2, 2000);
                } else if (i == 3) {
                    hl.c3(b29Var.w0);
                }
                CountDownLatch countDownLatch = b29Var.V;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    break;
                }
                break;
            case 7:
                b29Var.h();
                break;
            default:
                b29Var.start();
                break;
        }
    }
}
