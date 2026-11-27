// default package

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yh2 {
    public float g;
    public float j;
    public final Path a = new Path();
    public final float[] b = new float[4];
    public final float[] c = new float[4];
    public final Matrix d = new Matrix();
    public final Random h = new Random();
    public final byte f = 6;
    public final float e = (float) (Math.tan(0.2617993877991494d) * 1.3333333333333333d);
    public final float[] i = new float[6];

    public yh2() {
        for (int i = 0; i < this.f; i++) {
            this.i[i] = (this.h.nextInt() % 100) / 100.0f;
        }
    }

    public final void a(float f, float f2, Canvas canvas, Paint paint) {
        yh2 yh2Var = this;
        float f3 = yh2Var.g;
        float f4 = (f3 - 0.0f) - 0.0f;
        float f5 = f3 + 0.0f + 0.0f;
        float max = Math.max(f4, f5);
        float f6 = yh2Var.e;
        float f7 = max * f6 * 1.0f;
        Path path = yh2Var.a;
        path.reset();
        int i = 0;
        while (true) {
            byte b = yh2Var.f;
            if (i >= b) {
                canvas.save();
                canvas.rotate(0.0f, f, f2);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            Matrix matrix = yh2Var.d;
            matrix.reset();
            float f8 = 360.0f / b;
            matrix.setRotate(i * f8, f, f2);
            float f9 = i % 2 == 0 ? f4 : f5;
            float f10 = yh2Var.j;
            float[] fArr = yh2Var.i;
            float f11 = (fArr[i] * f10) + f9;
            float[] fArr2 = yh2Var.b;
            fArr2[0] = f;
            float f12 = f2 - f11;
            fArr2[1] = f12;
            float f13 = f5;
            fArr2[2] = c00.x(f10, fArr[i], f6, f + f7);
            fArr2[3] = f12;
            matrix.mapPoints(fArr2);
            int i2 = i + 1;
            int i3 = i2 >= b ? 0 : i2;
            float f14 = i3 % 2 == 0 ? f4 : f13;
            float f15 = yh2Var.j;
            float f16 = (fArr[i3] * f15) + f14;
            float[] fArr3 = yh2Var.c;
            fArr3[0] = f;
            float f17 = f2 - f16;
            fArr3[1] = f17;
            float f18 = f4;
            fArr3[2] = c00.x(f15, fArr[i3], f6, f - f7);
            fArr3[3] = f17;
            matrix.reset();
            matrix.setRotate(f8 * i3, f, f2);
            matrix.mapPoints(fArr3);
            if (i == 0) {
                path.moveTo(fArr2[0], fArr2[1]);
            }
            path.cubicTo(fArr2[2], fArr2[3], fArr3[2], fArr3[3], fArr3[0], fArr3[1]);
            i = i2;
            f5 = f13;
            f4 = f18;
            yh2Var = this;
        }
    }
}
