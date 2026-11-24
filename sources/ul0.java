// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ul0 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ vl0 d;

    public ul0(vl0 vl0Var) {
        this.d = vl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        vl0 vl0Var = this.d;
        Paint paint = vl0Var.w;
        if (vl0Var.f == null) {
            vl0Var.f = new Bitmap[2];
            vl0Var.i = new Canvas[2];
        }
        int i = (int) (this.b / 15.0f);
        int i2 = 0;
        while (i2 < 2) {
            int i3 = (int) ((i2 == 0 ? vl0Var.s : this.c) / 15.0f);
            Bitmap bitmap2 = vl0Var.f[i2];
            if (bitmap2 != null && ((bitmap2.getHeight() != i3 || vl0Var.f[i2].getWidth() != i) && (bitmap = vl0Var.f[i2]) != null)) {
                bitmap.recycle();
                vl0Var.f[i2] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = vl0Var.f;
            if (bitmapArr[i2] == null) {
                try {
                    bitmapArr[i2] = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                    vl0Var.i[i2] = new Canvas(vl0Var.f[i2]);
                    vl0Var.i[i2].scale(i / vl0Var.e[i2].getWidth(), i3 / vl0Var.e[i2].getHeight());
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
            }
            Bitmap[] bitmapArr2 = vl0Var.f;
            if (i2 == 1) {
                bitmapArr2[i2].eraseColor(cmb.v0(cmb.c6, vl0Var.y));
            } else {
                bitmapArr2[i2].eraseColor(0);
            }
            paint.setAlpha(nm7.d4);
            Utilities.stackBlurBitmap(vl0Var.e[i2], 15);
            Canvas canvas = vl0Var.i[i2];
            if (canvas != null) {
                canvas.drawBitmap(vl0Var.e[i2], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i2++;
            }
        }
        gm.c3(new f00(this, (byte) 12));
    }
}
