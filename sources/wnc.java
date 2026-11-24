// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wnc extends View {
    public ValueAnimator E;
    public final Paint a;
    public final Path b;
    public final PathMeasure c;
    public final String d;
    public final RectF e;
    public final float[] f;
    public final float[] h;
    public String n;
    public float[] r;
    public float s;
    public float w;
    public float x;
    public float y;

    public wnc(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        this.c = new PathMeasure();
        this.e = new RectF();
        this.f = new float[2];
        this.h = new float[2];
        this.d = goc.n0(str.toUpperCase().replace('_', ' ').replace('-', ' ')).concat("   ·   ");
        paint.setColor(-16747826);
        paint.setTextSize(gm.L(12.0f));
        paint.setTypeface(gm.n1("fonts/rmono.ttf"));
    }

    public final void a() {
        if (!isAttachedToWindow() || this.x <= 0.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.x);
        this.E = ofFloat;
        ofFloat.setDuration(Math.max(1L, (long) ((this.x / gm.L(24.0f)) * 1000.0f)));
        this.E.setInterpolator(new LinearInterpolator());
        this.E.setRepeatCount(-1);
        this.E.addUpdateListener(new oxb(this, (byte) 11));
        this.E.start();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.r == null || this.w <= 0.0f || this.x <= 0.0f) {
            return;
        }
        int i = 0;
        float f = 0.0f;
        while (i < this.n.length()) {
            float f2 = this.r[i] * this.s;
            float f3 = ((f2 / 2.0f) + f) - this.y;
            float f4 = this.w;
            float f5 = f3 % f4;
            if (f5 < 0.0f) {
                f5 += f4;
            }
            if (this.n.charAt(i) != ' ') {
                PathMeasure pathMeasure = this.c;
                float[] fArr = this.f;
                if (pathMeasure.getPosTan(f5, fArr, this.h)) {
                    canvas.save();
                    canvas.translate(fArr[0], fArr[1]);
                    canvas.rotate((float) Math.toDegrees(Math.atan2(r7[1], r7[0])));
                    canvas2 = canvas;
                    canvas2.drawText(this.n, i, i + 1, (-this.r[i]) / 2.0f, gm.L(3.0f), this.a);
                    canvas2.restore();
                    f += f2;
                    i++;
                    canvas = canvas2;
                }
            }
            canvas2 = canvas;
            f += f2;
            i++;
            canvas = canvas2;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float L = gm.L(12.0f) + gm.L(266.0f);
        RectF rectF = this.e;
        rectF.set(((i - gm.L(212.0f)) / 2.0f) - gm.L(12.0f), gm.L(22.0f) - gm.L(12.0f), ((gm.L(212.0f) + i) / 2.0f) + gm.L(12.0f), L);
        Path path = this.b;
        path.reset();
        path.addRoundRect(rectF, gm.L(32.0f), gm.L(32.0f), Path.Direction.CW);
        PathMeasure pathMeasure = this.c;
        pathMeasure.setPath(path, true);
        this.w = pathMeasure.getLength();
        Paint paint = this.a;
        String str = this.d;
        int max = Math.max(1, Math.round(this.w / paint.measureText(str)));
        StringBuilder sb = new StringBuilder(str.length() * max);
        int i5 = 0;
        for (int i6 = 0; i6 < max; i6++) {
            sb.append(str);
        }
        String sb2 = sb.toString();
        this.n = sb2;
        this.r = new float[sb2.length()];
        float f = 0.0f;
        while (i5 < this.n.length()) {
            int i7 = i5 + 1;
            this.r[i5] = paint.measureText(this.n, i5, i7);
            f += this.r[i5];
            i5 = i7;
        }
        float f2 = this.w;
        this.s = f2 / f;
        this.x = f2 / max;
        a();
    }
}
