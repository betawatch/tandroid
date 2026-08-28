package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s10 {
    public LinearGradient b;
    public final Paint[] a = new Paint[4];
    public final Matrix c = new Matrix();

    public final void a(Canvas canvas, RectF rectF, float f10) {
        Paint[] paintArr = this.a;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader(this.b);
        paintArr[0].setAlpha((int) (f10 * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    public final void b(Canvas canvas, RectF rectF, int i9, float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        if (this.b == null) {
            this.b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        Paint[] paintArr = this.a;
        if (paintArr[i9] == null) {
            paintArr[i9] = new Paint(1);
            paintArr[i9].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i9].setShader(this.b);
        Matrix matrix = this.c;
        matrix.reset();
        if (i9 == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i9 == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i9 == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i9 == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        this.b.setLocalMatrix(matrix);
        paintArr[i9].setAlpha((int) (f10 * 255.0f));
        canvas.drawRect(rectF, paintArr[i9]);
    }
}
