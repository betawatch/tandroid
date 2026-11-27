// default package

import android.graphics.Bitmap;
import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pk implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pk(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        switch (this.a) {
            case 0:
                boolean[] zArr = (boolean[]) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                zArr[0] = i == 0;
                countDownLatch.countDown();
                break;
            case 1:
                rr0 rr0Var = (rr0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                rr0Var.getClass();
                if (i == 0) {
                    float f = 0.0f;
                    for (int i2 = 0; i2 < 16; i2++) {
                        for (int i3 = 0; i3 < 4; i3++) {
                            f += hl.B(bitmap.getPixel(i2, i3));
                        }
                    }
                    float f2 = f / 64.0f;
                    bitmap.recycle();
                    if (Math.abs(f2 - rr0Var.r) >= 0.02f) {
                        rr0Var.r = f2;
                        rr0Var.checkSystemBarColors();
                        break;
                    }
                }
                break;
            default:
                jk6 jk6Var = (jk6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                jk6Var.h = false;
                if (!jk6Var.i && i == 0) {
                    jk6Var.f = jk6Var.e;
                    jk6Var.e = bitmap2;
                    jk6Var.a.run();
                    break;
                }
                break;
        }
    }
}
