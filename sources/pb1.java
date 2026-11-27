// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pb1 extends Drawable {
    public final Paint a;
    public final Paint b;
    public final ob1 c;
    public final ob1 d;
    public boolean e;
    public final mm f;
    public final Path g;
    public final byte h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public float o;
    public boolean p;
    public long q;
    public boolean r;
    public final float[] s;
    public final float[] t;
    public final float[] u;
    public final boolean[] v;
    public int w;

    /* JADX WARN: Multi-variable type inference failed */
    public pb1(int i) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        ob1 ob1Var = new ob1(this, (byte) 0);
        this.c = ob1Var;
        ob1 ob1Var2 = new ob1(this, (byte) 1);
        this.d = ob1Var2;
        this.e = false;
        fv0 fv0Var = new fv0(this, (byte) 19);
        k43 k43Var = k43.h;
        this.f = new mm(fv0Var, 350L, k43Var, 0);
        this.g = new Path();
        this.i = 21.0f;
        this.s = new float[12];
        this.t = new float[12];
        this.u = new float[12];
        this.v = new boolean[12];
        this.w = 1831565813;
        this.h = i;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        ob1Var.n(0.3f, 250L, k43Var);
        ob1Var.x(hl.n1("fonts/num.otf"));
        ob1Var.w(hl.N(12.0f));
        ob1Var.b = 17;
        ob1Var2.n(0.3f, 250L, k43Var);
        ob1Var2.x(hl.n1("fonts/num.otf"));
        ob1Var2.w(hl.N(12.0f));
        ob1Var2.b = 17;
        g(-1, -15033089, -1);
    }

    public static float a(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02c9 A[LOOP:2: B:52:0x02c7->B:53:0x02c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0324  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, float f) {
        ob1 ob1Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float d;
        int i;
        float f8;
        float a;
        float f9;
        float a2;
        float f10;
        float f11;
        ob1 ob1Var2;
        float f12;
        ob1 ob1Var3;
        Canvas canvas2 = canvas;
        boolean z = this.p;
        byte b = this.h;
        Paint paint = this.b;
        ob1 ob1Var4 = this.d;
        Paint paint2 = this.a;
        ob1 ob1Var5 = this.c;
        if (z) {
            f2 = 270.0f;
            f3 = 180.0f;
            f4 = 1.5f;
            if (this.q != 0) {
                f5 = 11.33f;
                f6 = 255.0f;
                long uptimeMillis = SystemClock.uptimeMillis() - this.q;
                if (uptimeMillis >= (this.r ? 380L : 320L)) {
                    ob1Var = ob1Var5;
                    f7 = 0.0f;
                    this.q = 0L;
                    float N = hl.N(this.i) / 2.0f;
                    d = this.f.d(this.e);
                    if (d > f7) {
                        paint.setAlpha((int) (f * f6 * d));
                        canvas2.drawCircle(this.n, this.o, hl.N(f5) * d, paint);
                    }
                    paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.l) * f));
                    RectF rectF = hl.P;
                    float f13 = this.n;
                    float f14 = this.o;
                    rectF.set(f13 - N, f14 - N, f13 + N, f14 + N);
                    canvas2.drawArc(rectF, 90.0f, 180.0f, false, paint2);
                    float f15 = ((b + 1) * f4) + (b * 1.0f);
                    float f16 = (1.0f / f15) * f3;
                    float f17 = (f4 / f15) * f3;
                    float f18 = f17;
                    for (i = 0; i < b; i++) {
                        canvas.drawArc(hl.P, f18 + f2, f16, false, paint2);
                        f18 += f16 + f17;
                    }
                    canvas.save();
                    canvas.translate(this.j + f7, this.k);
                    Rect rect = hl.Q;
                    rect.set((int) (this.n - hl.L(20.0f)), (int) (this.o - hl.L(20.0f)), (int) (this.n + hl.L(20.0f)), (int) (this.o + hl.L(20.0f)));
                    ob1Var.setBounds(rect);
                    ob1Var.C = (int) (Color.alpha(this.l) * f);
                    ob1Var.draw(canvas);
                    if (d > f7) {
                        Path path = this.g;
                        path.rewind();
                        path.addCircle(this.n, this.o + hl.L(1.0f), hl.N(f5) * d, Path.Direction.CW);
                        canvas.clipPath(path);
                        ob1Var4.setBounds(rect);
                        ob1Var4.C = (int) (f * f6);
                        ob1Var4.draw(canvas);
                    }
                    canvas.restore();
                }
                float N2 = hl.N(this.i) / 2.0f;
                float N3 = hl.N(11.33f);
                float f19 = uptimeMillis;
                float a3 = a(f19 / 320.0f);
                float interpolation = k43.h.getInterpolation(a3);
                if (this.r) {
                    float f20 = a3 - 1.0f;
                    f8 = (((1.9f * f20 * f20) + (2.9f * f20 * f20 * f20) + 1.0f) * 0.45f) + 0.55f;
                    float f21 = a3 / 0.6f;
                    a = a(f21);
                    f9 = 1.0f - (0.3f * interpolation);
                    a2 = 1.0f - a(f21);
                } else {
                    f8 = 1.0f - (0.4f * interpolation);
                    float f22 = a3 / 0.6f;
                    a = 1.0f - a(f22);
                    f9 = (0.3f * interpolation) + 0.7f;
                    a2 = a(f22);
                    interpolation = 1.0f - interpolation;
                }
                float f23 = interpolation * 90.0f;
                float f24 = f9;
                if (a > 0.0f) {
                    f10 = N2;
                    paint.setAlpha((int) (f * 255.0f * a));
                    f11 = N3;
                    ob1Var2 = ob1Var5;
                    canvas2.drawCircle(this.n, this.o, f11 * f8, paint);
                } else {
                    f10 = N2;
                    f11 = N3;
                    ob1Var2 = ob1Var5;
                }
                if (!this.r || uptimeMillis >= 380) {
                    f12 = a3;
                } else {
                    float f25 = f19 / 380.0f;
                    float exp = (1.0f - ((float) Math.exp((-5.0f) * f25))) / 0.99326205f;
                    int color = paint.getColor();
                    int f26 = vm2.f(0.35f, (-16777216) | color, -1);
                    int i2 = 0;
                    while (i2 < 12) {
                        float f27 = (this.t[i2] * exp) + f11;
                        float f28 = exp;
                        paint.setColor(this.v[i2] ? f26 : color);
                        float f29 = 1.0f - f25;
                        paint.setAlpha((int) (f * 255.0f * f29 * f29));
                        float f30 = this.n;
                        float[] fArr = this.s;
                        int i3 = i2;
                        canvas2.drawCircle((f27 * ((float) Math.cos(fArr[i2]))) + f30, (((float) Math.sin(fArr[i3])) * f27) + this.o, this.u[i3], paint);
                        i2 = i3 + 1;
                        exp = f28;
                        a3 = a3;
                        f25 = f25;
                    }
                    f12 = a3;
                    paint.setColor(color);
                }
                if (a2 > 0.0f) {
                    canvas2.save();
                    canvas2.rotate(f23, this.n, this.o);
                    canvas2.scale(f24, f24, this.n, this.o);
                    paint2.setAlpha((int) (Color.alpha(this.l) * a2 * f));
                    RectF rectF2 = hl.P;
                    float f31 = this.n;
                    float f32 = this.o;
                    rectF2.set(f31 - f10, f32 - f10, f31 + f10, f32 + f10);
                    ob1Var3 = ob1Var2;
                    canvas2.drawArc(rectF2, 90.0f, 180.0f, false, paint2);
                    float f33 = ((b + 1) * 1.5f) + (b * 1.0f);
                    float f34 = (1.0f / f33) * 180.0f;
                    float f35 = (1.5f / f33) * 180.0f;
                    float f36 = f35;
                    for (int i4 = 0; i4 < b; i4++) {
                        canvas.drawArc(hl.P, f36 + 270.0f, f34, false, paint2);
                        f36 += f34 + f35;
                    }
                    canvas2 = canvas;
                    canvas2.restore();
                } else {
                    ob1Var3 = ob1Var2;
                }
                float sin = (((float) Math.sin(f12 * 3.141592653589793d)) * 0.12f) + 1.0f;
                canvas2.save();
                canvas2.translate(this.j, this.k);
                canvas2.scale(sin, sin, this.n, this.o);
                Rect rect2 = hl.Q;
                rect2.set((int) (this.n - hl.L(20.0f)), (int) (this.o - hl.L(20.0f)), (int) (this.n + hl.L(20.0f)), (int) (this.o + hl.L(20.0f)));
                ob1Var3.setBounds(rect2);
                ob1Var3.C = (int) (Color.alpha(this.l) * f * (1.0f - a));
                ob1Var3.draw(canvas2);
                ob1Var4.setBounds(rect2);
                ob1Var4.C = (int) (f * 255.0f * a);
                ob1Var4.draw(canvas2);
                canvas2.restore();
                invalidateSelf();
                return;
            }
            ob1Var = ob1Var5;
        } else {
            ob1Var = ob1Var5;
            f2 = 270.0f;
            f3 = 180.0f;
            f4 = 1.5f;
        }
        f5 = 11.33f;
        f6 = 255.0f;
        f7 = 0.0f;
        float N4 = hl.N(this.i) / 2.0f;
        d = this.f.d(this.e);
        if (d > f7) {
        }
        paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.l) * f));
        RectF rectF3 = hl.P;
        float f132 = this.n;
        float f142 = this.o;
        rectF3.set(f132 - N4, f142 - N4, f132 + N4, f142 + N4);
        canvas2.drawArc(rectF3, 90.0f, 180.0f, false, paint2);
        float f152 = ((b + 1) * f4) + (b * 1.0f);
        float f162 = (1.0f / f152) * f3;
        float f172 = (f4 / f152) * f3;
        float f182 = f172;
        while (i < b) {
        }
        canvas.save();
        canvas.translate(this.j + f7, this.k);
        Rect rect3 = hl.Q;
        rect3.set((int) (this.n - hl.L(20.0f)), (int) (this.o - hl.L(20.0f)), (int) (this.n + hl.L(20.0f)), (int) (this.o + hl.L(20.0f)));
        ob1Var.setBounds(rect3);
        ob1Var.C = (int) (Color.alpha(this.l) * f);
        ob1Var.draw(canvas);
        if (d > f7) {
        }
        canvas.restore();
    }

    public final float c() {
        int i = this.w;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        this.w = i3 ^ (i3 << 5);
        return (r0 >>> 8) / 1.6777216E7f;
    }

    public final void d(boolean z) {
        if (this.m != z) {
            this.m = z;
            this.a.setXfermode(z ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
            this.c.a.setXfermode(z ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        b(canvas, 1.0f);
    }

    public final void e(float f) {
        this.d.w(hl.N(f));
        this.c.w(hl.N(f));
    }

    public final void f(int i, boolean z, boolean z2) {
        this.c.t(String.valueOf(i), z2, true);
        this.d.t(String.valueOf(i), z2, true);
        boolean z3 = this.p;
        mm mmVar = this.f;
        if (!z3 || !z2 || z == this.e) {
            if (z3 && !z2) {
                this.q = 0L;
            }
            this.e = z;
            if (!z2) {
                mmVar.f(z, true);
            }
            invalidateSelf();
            return;
        }
        this.q = SystemClock.uptimeMillis();
        this.r = z;
        if (z) {
            for (int i2 = 0; i2 < 12; i2++) {
                this.s[i2] = (float) Math.toRadians((((c() * 2.0f) - 1.0f) * 12.0f) + ((i2 * 360.0f) / 12.0f));
                this.t[i2] = hl.N((c() * 5.0f) + 7.0f);
                this.u[i2] = hl.N((c() * 0.8f) + 1.0f) / 2.0f;
                this.v[i2] = (i2 & 1) == 1;
            }
        }
        this.e = z;
        mmVar.f(z, true);
        invalidateSelf();
    }

    public final void g(int i, int i2, int i3) {
        this.l = i;
        this.a.setColor(i);
        this.c.u(i);
        this.d.u(i3);
        this.b.setColor(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.n = getBounds().centerX();
        this.o = getBounds().centerY();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.n = getBounds().centerX();
        this.o = getBounds().centerY();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
