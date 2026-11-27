// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qoa extends View {
    public final String E;
    public final gk0 F;
    public final gk0 G;
    public long H;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final TextPaint e;
    public final Path f;
    public final Paint h;
    public final Drawable n;
    public final int r;
    public final boolean s;
    public LinearGradient w;
    public LinearGradient x;
    public int y;

    public qoa(int i, vnb vnbVar, Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.b = paint3;
        Paint paint4 = new Paint(1);
        this.c = paint4;
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        this.f = new Path();
        this.h = new Paint(1);
        this.E = ob6.M0(2131744954, null).concat(" · ");
        this.F = new gk0(12, -1);
        this.G = new gk0(11, -1);
        int v0 = aob.v0(i, vnbVar);
        this.r = v0;
        this.s = hl.B(aob.v0(aob.d6, vnbVar)) >= 0.5f;
        aob.v0(aob.j5, vnbVar);
        paint.setColor(v0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(hl.N(1.6f));
        paint3.setColor(v0);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStrokeWidth(hl.N(3.0f));
        textPaint.setTextSize(hl.L(17.0f));
        Drawable mutate = activity.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
        this.n = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public static float a(float f) {
        return bp1.g((((float) Math.sin((f * 0.113f) + 0.4f)) * 0.5f) + 0.5f, 0.2f, (((((float) Math.sin((0.053f * f) + 1.7f)) * 0.5f) + 0.5f) * 0.35f) + (((((float) Math.sin(0.021f * f)) * 0.5f) + 0.5f) * 0.45f), 0.82f, 0.18f);
    }

    public final int b() {
        boolean z = this.s;
        int i = this.r;
        return z ? vm2.f(0.18f, i, -16777216) : vm2.f(0.22f, i, -1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        int i;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z;
        float f16;
        float f17;
        float L;
        float L2;
        float f18;
        float f19;
        float e;
        float f20;
        float f21;
        int i2;
        float f22;
        float f23;
        float f24;
        float f25;
        int i3;
        float f26;
        float f27;
        float f28;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0) {
            return;
        }
        float uptimeMillis = (SystemClock.uptimeMillis() % 1000000) / 1000.0f;
        float f29 = width;
        float f30 = f29 / 2.0f;
        float f31 = height;
        float f32 = f31 / 2.0f;
        float L3 = hl.L(36.0f);
        float L4 = uptimeMillis * hl.L(36.3f);
        float L5 = (f30 - L3) - hl.L(6.0f);
        float L6 = f30 + L3 + hl.L(10.0f);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f29, f31, null);
        float f33 = f29;
        float L7 = hl.L(6.0f);
        float f34 = (L5 - L7) + (L4 % L7);
        while (true) {
            float f35 = f34;
            f = f30;
            f2 = L4;
            if (f34 <= (-L7)) {
                break;
            }
            float f36 = L5 - f35;
            float w = qu6.w(f36, hl.L(34.0f), 1.0f, 0.0f);
            float z2 = xnb.z(w, 0.5f, 0.5f, (a(f35 - f2) * hl.L(24.0f)) + hl.L(5.0f));
            int z3 = (int) xnb.z(w, 0.8f, 0.2f, 255.0f);
            Paint paint = this.b;
            paint.setAlpha(z3);
            if (w > 0.35f) {
                float max = Math.max(0.0f, Math.min(1.0f, 1.0f - (f36 / hl.L(30.0f))));
                float B = xnb.B(max, 2.0f, 3.0f, max * max);
                if (B < 0.01f) {
                    float f37 = z2 / 2.0f;
                    f27 = L7;
                    canvas.drawLine(f35, f32 - f37, f35, f32 + f37, paint);
                    f26 = f35;
                    i3 = saveLayer;
                } else {
                    f26 = f35;
                    f27 = L7;
                    float max2 = Math.max(hl.L(8.0f), f - f26);
                    Path path = this.f;
                    path.rewind();
                    int i4 = 0;
                    while (i4 <= 8) {
                        float f38 = ((i4 / 8.0f) - 0.5f) * z2;
                        float f39 = max2;
                        int i5 = saveLayer;
                        double d = f38 / f39;
                        float cos = f - (((float) Math.cos(d)) * f39);
                        float sin = (((float) Math.sin(d)) * f39) + f32;
                        float A = qd4.A(cos, f26, B, f26);
                        float f40 = (((sin - f32) - f38) * B) + f32 + f38;
                        if (i4 == 0) {
                            path.moveTo(A, f40);
                        } else {
                            path.lineTo(A, f40);
                        }
                        i4++;
                        max2 = f39;
                        saveLayer = i5;
                    }
                    i3 = saveLayer;
                    Paint paint2 = this.h;
                    paint2.set(paint);
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeCap(Paint.Cap.ROUND);
                    paint2.setStrokeJoin(Paint.Join.ROUND);
                    canvas.drawPath(path, paint2);
                }
                f28 = f33;
            } else {
                i3 = saveLayer;
                f26 = f35;
                f27 = L7;
                float f41 = 1.0f - (w / 0.35f);
                float f42 = 2.0f;
                float B2 = xnb.B(f41, 2.0f, 3.0f, f41 * f41);
                float alpha = paint.getAlpha();
                float max3 = Math.max(hl.N(0.8f), (paint.getStrokeWidth() / 2.0f) * (1.0f - (B2 * 0.5f)));
                int i6 = 0;
                while (i6 < 5) {
                    float f43 = ((i6 / 4.0f) * f42) - 1.0f;
                    float f44 = f33;
                    int i7 = i6;
                    float f45 = z2;
                    float x = c00.x((float) Math.sin((r10 * 2.1f) + (0.37f * r22)), hl.L(1.5f), B2, (((Math.abs(f43) * hl.L(6.0f)) + hl.L(10.0f)) * Math.signum(f43) * B2) + qu6.d(f43, z2, 2.0f, f32));
                    float abs = (((Math.abs(f43) * 0.4f) + 0.6f) * hl.L(4.0f) * B2) + f26;
                    paint.setAlpha((int) ((f43 == 0.0f ? 1.0f - B2 : 1.0f - (B2 * 0.6f)) * alpha));
                    canvas.drawCircle(abs, x, max3, paint);
                    i6 = i7 + 1;
                    z2 = f45;
                    f33 = f44;
                    f42 = 2.0f;
                }
                f28 = f33;
                paint.setAlpha((int) alpha);
            }
            f34 = f26 - f27;
            L7 = f27;
            f30 = f;
            L4 = f2;
            saveLayer = i3;
            f33 = f28;
        }
        Canvas canvas2 = canvas;
        float f46 = f33;
        int i8 = saveLayer;
        LinearGradient linearGradient = this.x;
        Paint paint3 = this.e;
        if (linearGradient == null || this.y != width) {
            LinearGradient linearGradient2 = new LinearGradient(L6, 0.0f, L6 + 1.0f, 0.0f, b(), b(), Shader.TileMode.CLAMP);
            f3 = L6;
            this.x = linearGradient2;
            paint3.setShader(linearGradient2);
        } else {
            f3 = L6;
        }
        canvas2.save();
        canvas2.clipRect(f3, 0.0f, f46, f31);
        String str = this.E;
        float measureText = paint3.measureText(str);
        float descent = f32 - ((paint3.descent() + paint3.ascent()) / 2.0f);
        for (float L8 = (f3 + hl.L(4.0f)) - (measureText - ((hl.L(55.0f) * uptimeMillis) % measureText)); L8 < f46; L8 += measureText) {
            canvas2.drawText(str, L8, descent, paint3);
        }
        canvas2.restore();
        LinearGradient linearGradient3 = this.w;
        Paint paint4 = this.c;
        if (linearGradient3 == null || this.y != width) {
            this.y = width;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            f4 = f31;
            f5 = L3;
            f6 = descent;
            f7 = f32;
            f8 = f2;
            f9 = 2.0f;
            i = i8;
            LinearGradient linearGradient4 = new LinearGradient(0.0f, 0.0f, f46, 0.0f, new int[]{0, -16777216, -16777216, 0}, new float[]{0.0f, 0.22f, 0.78f, 1.0f}, tileMode);
            this.w = linearGradient4;
            paint4.setShader(linearGradient4);
            f10 = f3;
            LinearGradient linearGradient5 = new LinearGradient(f10, 0.0f, f3 + 1.0f, 0.0f, b(), b(), tileMode);
            this.x = linearGradient5;
            paint3.setShader(linearGradient5);
        } else {
            f10 = f3;
            f7 = f32;
            f6 = descent;
            f4 = f31;
            f5 = L3;
            f8 = f2;
            f9 = 2.0f;
            i = i8;
        }
        float f47 = f7;
        canvas2.drawRect(0.0f, 0.0f, f46, f4, paint4);
        canvas2.restoreToCount(i);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        long j = this.H;
        long min = j == 0 ? 16L : Math.min(64L, uptimeMillis2 - j);
        this.H = uptimeMillis2;
        gk0 gk0Var = this.F;
        float f48 = gk0Var.a;
        Paint paint5 = gk0Var.d;
        int i9 = this.r;
        boolean z4 = this.s;
        gk0 gk0Var2 = this.G;
        if (f48 == 0.0f) {
            gk0Var2.a = hl.L(1.0f) + f5;
            f11 = 1.0f;
            f12 = 0.6f;
            gk0Var2.b = (hl.L(12.0f) * 0.6f) + hl.L(1.0f) + f5;
            gk0Var.a = f5 + hl.L(7.0f);
            gk0Var.b = (hl.L(12.0f) * 0.6f) + f5 + hl.L(7.0f);
            gk0Var2.b();
            gk0Var.b();
            paint5.setColor(vm2.o(i9, z4 ? 20 : 48));
            gk0Var2.d.setColor(vm2.o(i9, z4 ? 32 : 72));
        } else {
            f11 = 1.0f;
            f12 = 0.6f;
        }
        float a = (a(-f8) * f12) + 0.25f;
        gk0Var.d(true, a);
        gk0Var2.d(false, a);
        gk0Var.f(min);
        gk0Var2.f(min);
        float f49 = 0.5f;
        gk0Var.e(gk0Var.t, 0.5f);
        gk0Var2.e(gk0Var2.t, 0.5f);
        canvas2.save();
        float f50 = (gk0Var.t * 0.5f) + 0.878f;
        canvas2.scale(f50, f50, f, f47);
        gk0Var.a(f, f47, canvas2, paint5);
        canvas2.restore();
        canvas2.save();
        float f51 = (gk0Var2.t * 0.5f) + 0.926f;
        canvas2.scale(f51, f51, f, f47);
        gk0Var2.a(f, f47, canvas2, gk0Var2.d);
        canvas2.restore();
        int i10 = 0;
        while (i10 < 96) {
            double d2 = i10;
            float abs2 = (float) (Math.abs(Math.sin(78.233d * d2) * 43758.5453d) % 1.0d);
            float abs3 = (float) (Math.abs(Math.sin((d2 * 12.9898d) + 4.1d) * 43758.5453d) % 1.0d);
            float f52 = (((abs3 * 7.0f) + uptimeMillis) / ((1.6f * abs2) + 2.4f)) % f11;
            float f53 = abs3 > f49 ? f11 : -1.0f;
            float f54 = f49;
            if (f52 < 0.55f) {
                float f55 = f52 / 0.55f;
                f16 = 0.45f;
                float f56 = f55 * f55;
                f15 = uptimeMillis;
                z = z4;
                float g = bp1.g(abs2, 0.4f, f12, ((1.25f * f56) + 0.15f) * f53 * 3.1415927f, 3.1415927f);
                float A2 = qd4.A(f11, f56, (hl.L(18.0f) * abs2) + hl.L(34.0f), hl.L(4.0f) + f5);
                double d3 = g;
                float cos2 = (((float) Math.cos(d3)) * A2) + f;
                float sin2 = f47 - (((abs2 * 0.2f) + 0.62f) * (((float) Math.sin(d3)) * A2));
                float L9 = (L5 - hl.L(f9)) - (hl.L(10.0f) * abs2);
                float g2 = bp1.g(hl.L(12.0f), abs3, hl.L(f9), f53, f47);
                float min2 = Math.min(1.0f, f55 / 0.35f);
                float f57 = f9;
                f13 = f5;
                f14 = abs3;
                float B3 = xnb.B(min2, f57, 3.0f, min2 * min2);
                float A3 = qd4.A(cos2, L9, B3, L9);
                L = qd4.A(sin2, g2, B3, g2);
                f17 = f57;
                L2 = A3;
            } else {
                float f58 = f9;
                f13 = f5;
                f14 = abs3;
                f15 = uptimeMillis;
                z = z4;
                f16 = 0.45f;
                float f59 = (f52 - 0.55f) / 0.45f;
                float f60 = f11 - f59;
                float f61 = f11 - (f60 * f60);
                float f62 = (f11 - f61) * f53 * 0.55f * 3.1415927f;
                float L10 = (hl.L(16.0f) * f61) + f13 + hl.L(3.0f);
                double d4 = f62;
                f17 = f58;
                float cos3 = (((float) Math.cos(d4)) * L10) + f;
                float v = bp1.v((float) Math.sin(d4), L10, 0.7f, f47);
                float f63 = f59 * f59;
                L = v + (((((f14 - f54) * hl.L(4.0f)) + (f6 - hl.L(6.0f))) - v) * f63);
                L2 = cos3 + ((((hl.L(26.0f) * abs2) + (f10 + hl.L(8.0f))) - cos3) * f63);
            }
            float sin3 = (float) Math.sin(f52 * 3.141592653589793d);
            if (f52 < 0.55f) {
                f18 = 1.0f;
                f11 = 1.0f;
            } else {
                f11 = 1.0f;
                f18 = 1.0f - (((f52 - 0.55f) / f16) * f54);
            }
            float f64 = sin3 * f18;
            int f65 = z ? vm2.f(f14 * 0.15f, i9, -16777216) : vm2.f((f14 * 0.25f) + 0.12f, i9, -1);
            Paint paint6 = this.d;
            paint6.setColor(f65);
            boolean z5 = abs2 > 0.87f;
            if (z5) {
                e = hl.N(1.1f);
                f19 = 0.6f;
            } else {
                f19 = 0.6f;
                e = bp1.e(0.6f, abs2, hl.N(f54));
            }
            if (z5) {
                i2 = i10;
                float sin4 = (((float) Math.sin((f15 * 6.0f) + i10)) * 0.4f) + f19;
                if (!z) {
                    paint6.setAlpha((int) (70.0f * f64 * sin4));
                    canvas2.drawCircle(L2, L, 3.2f * e, paint6);
                }
                paint6.setAlpha((int) (f64 * 255.0f * sin4));
                f21 = 0.6f;
                paint6.setStrokeWidth(hl.N(0.6f));
                float f66 = e * 3.0f * sin4;
                float f67 = f17;
                f24 = e;
                f25 = abs2;
                f22 = f67;
                canvas2.drawLine(L2 - f66, L, L2 + f66, L, paint6);
                float f68 = L2;
                f20 = L2;
                f23 = L;
                canvas2 = canvas;
                canvas2.drawLine(f20, L - f66, f68, L + f66, paint6);
            } else {
                f20 = L2;
                f21 = f19;
                i2 = i10;
                f22 = f17;
                f23 = L;
                f24 = e;
                f25 = abs2;
            }
            paint6.setAlpha((int) xnb.z(f25, 0.55f, f16, f64 * 255.0f));
            canvas2.drawCircle(f20, f23, f24, paint6);
            i10 = i2 + 1;
            f5 = f13;
            z4 = z;
            uptimeMillis = f15;
            f12 = f21;
            f49 = f54;
            f9 = f22;
        }
        canvas2.drawCircle(f, f47, f5, this.a);
        float L11 = hl.L(30.0f) / f9;
        Drawable drawable = this.n;
        drawable.setBounds((int) (f - L11), (int) (f47 - L11), (int) (f + L11), (int) (f47 + L11));
        drawable.draw(canvas2);
        invalidate();
    }
}
