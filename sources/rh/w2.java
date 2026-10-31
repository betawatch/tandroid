package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w2 extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final RadialGradient[] d;
    public final Matrix e;
    public final org.telegram.ui.Components.t5 f;
    public final RadialGradient h;
    public final Path n;
    public int r;
    public int s;

    public w2(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new RadialGradient[2];
        this.e = new Matrix();
        this.f = new org.telegram.ui.Components.t5(1.0f, this, 0L, 420L, gr.h);
        this.h = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{0, -1, -1, 0}, new float[]{0.15f, 0.35f, 0.65f, 0.88f}, Shader.TileMode.CLAMP);
        this.n = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a(int i10, int i11) {
        if (this.r == i10 && this.s == i11) {
            return;
        }
        RadialGradient[] radialGradientArr = this.d;
        radialGradientArr[0] = radialGradientArr[1];
        this.r = i10;
        this.s = i11;
        radialGradientArr[1] = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f.e(true, 0.0f);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10 = 1.0f;
        float e = this.f.e(false, 1.0f);
        float currentTimeMillis = ((System.currentTimeMillis() % 15000) / 15000.0f) * 360.0f;
        if (getAlpha() > 0.0f) {
            invalidate();
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.b;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        Path path = this.n;
        path.rewind();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(getWidth(), getHeight()) / 2.0f;
        for (int i10 = 0; i10 < 6; i10++) {
            float d = sc.e.d(i10, 60.0f, 12.5f, currentTimeMillis);
            path.moveTo(width, height);
            double d10 = ((d - 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d10)) * min) + width, (((float) Math.sin(d10)) * min) + height);
            double d11 = ((d + 12.5f) / 180.0f) * 3.141592653589793d;
            path.lineTo((((float) Math.cos(d11)) * min) + width, (((float) Math.sin(d11)) * min) + height);
            path.lineTo(width, height);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), zs.e4, 31);
        int i11 = 0;
        while (true) {
            RadialGradient[] radialGradientArr = this.d;
            int length = radialGradientArr.length;
            Matrix matrix = this.e;
            if (i11 >= length) {
                matrix.reset();
                float f11 = min / 100.0f;
                matrix.postScale(f11, f11);
                matrix.postTranslate(width, height);
                RadialGradient radialGradient = this.h;
                radialGradient.setLocalMatrix(matrix);
                Paint paint2 = this.c;
                paint2.setShader(radialGradient);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint2);
                canvas.restore();
                return;
            }
            if (radialGradientArr[i11] == null) {
                f7 = e;
            } else {
                f7 = e;
                float pow = (float) Math.pow(f10 - Math.abs(i11 - e), 0.5d);
                if (pow > 0.0f) {
                    matrix.reset();
                    float f12 = min / 100.0f;
                    matrix.postScale(f12, f12);
                    matrix.postTranslate(width, height);
                    radialGradientArr[i11].setLocalMatrix(matrix);
                    RadialGradient radialGradient2 = radialGradientArr[i11];
                    Paint paint3 = this.a;
                    paint3.setShader(radialGradient2);
                    float f13 = pow * 255.0f;
                    paint3.setAlpha((int) (0.3f * f13));
                    paint.setShader(radialGradientArr[i11]);
                    paint.setAlpha((int) f13);
                    canvas.drawPath(path, paint3);
                    canvas.drawPath(path, paint);
                }
            }
            i11++;
            e = f7;
            f10 = 1.0f;
        }
    }
}
