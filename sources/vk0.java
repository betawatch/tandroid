// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vk0 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ wk0 d;

    public vk0(wk0 wk0Var) {
        this.d = wk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        wk0 wk0Var = this.d;
        Paint paint = wk0Var.w;
        if (wk0Var.f == null) {
            wk0Var.f = new Bitmap[2];
            wk0Var.i = new Canvas[2];
        }
        int i = (int) (this.b / 15.0f);
        int i2 = 0;
        while (i2 < 2) {
            int i3 = (int) ((i2 == 0 ? wk0Var.s : this.c) / 15.0f);
            Bitmap bitmap2 = wk0Var.f[i2];
            if (bitmap2 != null && ((bitmap2.getHeight() != i3 || wk0Var.f[i2].getWidth() != i) && (bitmap = wk0Var.f[i2]) != null)) {
                bitmap.recycle();
                wk0Var.f[i2] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = wk0Var.f;
            if (bitmapArr[i2] == null) {
                try {
                    bitmapArr[i2] = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                    wk0Var.i[i2] = new Canvas(wk0Var.f[i2]);
                    wk0Var.i[i2].scale(i / wk0Var.e[i2].getWidth(), i3 / wk0Var.e[i2].getHeight());
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
            Bitmap[] bitmapArr2 = wk0Var.f;
            if (i2 == 1) {
                bitmapArr2[i2].eraseColor(aob.v0(aob.d6, wk0Var.y));
            } else {
                bitmapArr2[i2].eraseColor(0);
            }
            paint.setAlpha(jn7.d4);
            Utilities.stackBlurBitmap(wk0Var.e[i2], 15);
            Canvas canvas = wk0Var.i[i2];
            if (canvas != null) {
                canvas.drawBitmap(wk0Var.e[i2], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i2++;
            }
        }
        hl.c3(new pz(this, (byte) 10));
    }
}
