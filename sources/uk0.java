// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uk0 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ vk0 d;

    public uk0(vk0 vk0Var) {
        this.d = vk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        vk0 vk0Var = this.d;
        Paint paint = vk0Var.w;
        if (vk0Var.f == null) {
            vk0Var.f = new Bitmap[2];
            vk0Var.i = new Canvas[2];
        }
        int i = (int) (this.b / 15.0f);
        int i2 = 0;
        while (i2 < 2) {
            int i3 = (int) ((i2 == 0 ? vk0Var.s : this.c) / 15.0f);
            Bitmap bitmap2 = vk0Var.f[i2];
            if (bitmap2 != null && ((bitmap2.getHeight() != i3 || vk0Var.f[i2].getWidth() != i) && (bitmap = vk0Var.f[i2]) != null)) {
                bitmap.recycle();
                vk0Var.f[i2] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = vk0Var.f;
            if (bitmapArr[i2] == null) {
                try {
                    bitmapArr[i2] = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                    vk0Var.i[i2] = new Canvas(vk0Var.f[i2]);
                    vk0Var.i[i2].scale(i / vk0Var.e[i2].getWidth(), i3 / vk0Var.e[i2].getHeight());
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
            }
            Bitmap[] bitmapArr2 = vk0Var.f;
            if (i2 == 1) {
                bitmapArr2[i2].eraseColor(bkb.v0(bkb.c6, vk0Var.y));
            } else {
                bitmapArr2[i2].eraseColor(0);
            }
            paint.setAlpha(kk7.d4);
            Utilities.stackBlurBitmap(vk0Var.e[i2], 15);
            Canvas canvas = vk0Var.i[i2];
            if (canvas != null) {
                canvas.drawBitmap(vk0Var.e[i2], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i2++;
            }
        }
        gl.c3(new oz(this, (byte) 10));
    }
}
