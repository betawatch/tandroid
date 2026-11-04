package vg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.ui.g00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r1 {
    public long a;
    public final int b;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public int m;
    public float n;
    public long o;
    public float p;
    public float q;
    public float r;
    public final /* synthetic */ s1 t;
    public float c = 1.0f;
    public boolean s = true;

    public r1(s1 s1Var) {
        this.t = s1Var;
        int i3 = s1Var.T;
        s1Var.T = i3 + 1;
        this.b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        s1 s1Var = this.t;
        boolean z10 = s1Var.G;
        RectF rectF = s1Var.c;
        float f17 = s1Var.A;
        if (z10) {
            int[] iArr = s1Var.E;
            int i3 = this.l;
            int i10 = iArr[i3];
            float[] fArr = s1Var.D[i3];
            int i11 = i10 * 2;
            this.h = fArr[i11];
            this.i = fArr[i11 + 1];
            iArr[i3] = i10 + 1;
        } else {
            this.h = this.d;
            this.i = this.e;
        }
        if (rectF.isEmpty() || !rectF.contains(this.h, this.i)) {
            canvas.save();
            canvas.translate(this.h, this.i);
            float f18 = this.n;
            if (f18 != 0.0f) {
                f12 = 1000.0f;
                f11 = 2.0f;
                canvas.rotate(f18, s1Var.d[this.l].getWidth() / 2.0f, s1Var.d[this.l].getHeight() / 2.0f);
            } else {
                f11 = 2.0f;
                f12 = 1000.0f;
            }
            if (s1Var.I) {
                long j11 = this.a - j10;
                if (j11 < 200) {
                    f13 = Utilities.i(1.0f - (j11 / 150.0f), 1.0f, 0.0f);
                    f14 = this.q;
                    if (f14 >= 1.0f || g00.a != 1.0f) {
                        float interpolation = org.telegram.messenger.g0.H.getInterpolation(f14) * g00.a;
                        canvas.scale(interpolation, interpolation, 0.0f, 0.0f);
                    }
                    if (s1Var.f[this.l]) {
                        float min = (Math.min(s1Var.o, 3.5f) * (f17 / f12)) + this.r;
                        this.r = min;
                        canvas.scale((float) Math.cos(min * 3.141592653589793d), 1.0f, 0.0f, 0.0f);
                    }
                    v10 v10Var = s1Var.l;
                    Paint paint = v10Var == null ? (Paint) v10Var.a(Integer.valueOf(this.b)) : s1Var.i;
                    if (s1Var.N) {
                        f15 = f17;
                        f16 = 1.0f;
                    } else {
                        f15 = f17;
                        long j12 = this.o;
                        float i12 = 1.0f - Utilities.i((j10 - j12) / Math.max(1L, this.a - j12), 1.0f, 0.0f);
                        f16 = com.google.android.recaptcha.internal.a.A((float) Math.sin((j10 * 0.011f) + this.p), 0.28f, 0.72f, com.google.android.recaptcha.internal.a.B(i12, f11, 3.0f, i12 * i12));
                        f13 = 0.0f;
                    }
                    float f19 = 1.0f - f13;
                    paint.setAlpha((int) com.google.android.recaptcha.internal.a.C(this.m, f19, f10, f16));
                    Bitmap bitmap = s1Var.d[this.l];
                    if (s1Var.m) {
                        float f20 = this.c * f19 * f10 * this.q * (s1Var.N ? 0.75f + (f16 * 0.25f) : 1.0f);
                        canvas.scale(f20, f20);
                    }
                    canvas.drawBitmap(bitmap, -(bitmap.getWidth() >> 1), -(bitmap.getHeight() >> 1), paint);
                    canvas.restore();
                }
            }
            f13 = 0.0f;
            f14 = this.q;
            if (f14 >= 1.0f) {
            }
            float interpolation2 = org.telegram.messenger.g0.H.getInterpolation(f14) * g00.a;
            canvas.scale(interpolation2, interpolation2, 0.0f, 0.0f);
            if (s1Var.f[this.l]) {
            }
            v10 v10Var2 = s1Var.l;
            if (v10Var2 == null) {
            }
            if (s1Var.N) {
            }
            float f192 = 1.0f - f13;
            paint.setAlpha((int) com.google.android.recaptcha.internal.a.C(this.m, f192, f10, f16));
            Bitmap bitmap2 = s1Var.d[this.l];
            if (s1Var.m) {
            }
            canvas.drawBitmap(bitmap2, -(bitmap2.getWidth() >> 1), -(bitmap2.getHeight() >> 1), paint);
            canvas.restore();
        } else {
            f15 = f17;
            f12 = 1000.0f;
        }
        if (s1Var.g) {
            return;
        }
        float L = (f15 / 660.0f) * org.telegram.messenger.g0.L(4.0f);
        float min2 = s1Var.f[this.l] ? Math.min(s1Var.o, 3.5f) * 4.0f * L : L * s1Var.o;
        if (s1Var.N) {
            long j13 = this.o;
            float i13 = 1.0f - Utilities.i((j10 - j13) / Math.max(1L, this.a - j13), 1.0f, 0.0f);
            min2 *= (2.2f * i13 * i13) + 0.15f;
            this.e = org.telegram.messenger.camera.q.v(f15, f12, org.telegram.messenger.g0.L(5.0f), this.e);
        }
        this.d = (this.j * min2) + this.d;
        this.e = (this.k * min2) + this.e;
        float f21 = this.q;
        if (f21 != 1.0f) {
            float f22 = (f15 / 200.0f) + f21;
            this.q = f22;
            if (f22 > 1.0f) {
                this.q = 1.0f;
            }
        }
    }

    public final void b(long j10) {
        float f10;
        float f11;
        float f12;
        int i3;
        float f13;
        float f14;
        float f15;
        s1 s1Var = this.t;
        int i10 = s1Var.O;
        ArrayList arrayList = s1Var.n;
        RectF rectF = s1Var.a;
        if (i10 == 28) {
            if (Utilities.c.nextFloat() < 0.13f) {
                this.l = 0;
            } else {
                this.l = (int) Math.floor((r4 * (s1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.l = Math.abs(((int) Utilities.c.nextLong()) % s1Var.d.length);
        }
        long j11 = s1Var.x + j10;
        f5.a aVar = Utilities.c;
        this.a = aVar.nextInt(s1Var.y * (s1Var.f[this.l] ? 3 : 1)) + j11;
        this.o = j10;
        this.p = aVar.nextFloat() * 6.28f;
        float f16 = 0.0f;
        this.n = 0.0f;
        float f17 = 0.6f;
        if (s1Var.m) {
            this.c = (aVar.nextFloat() * 0.6f) + 0.4f;
        }
        if (s1Var.B) {
            float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
            float abs2 = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            float f18 = 0.0f;
            int i11 = 0;
            while (i11 < 10) {
                float f19 = rectF.left;
                f5.a aVar2 = Utilities.c;
                float f20 = f16;
                int i12 = i11;
                float abs3 = Math.abs(((int) aVar2.nextLong()) % rectF.width()) + f19;
                float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
                float f21 = 2.14748365E9f;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    if (s1Var.h) {
                        f14 = ((r1) arrayList.get(i13)).f - abs3;
                        f13 = f17;
                        f15 = ((r1) arrayList.get(i13)).g;
                    } else {
                        f13 = f17;
                        f14 = ((r1) arrayList.get(i13)).d - abs3;
                        f15 = ((r1) arrayList.get(i13)).e;
                    }
                    float f22 = f15 - abs4;
                    float f23 = (f22 * f22) + (f14 * f14);
                    if (f23 < f21) {
                        f21 = f23;
                    }
                    i13++;
                    f17 = f13;
                }
                float f24 = f17;
                if (f21 > f18) {
                    abs = abs3;
                    f18 = f21;
                    abs2 = abs4;
                }
                i11 = i12 + 1;
                f16 = f20;
                f17 = f24;
            }
            f10 = f16;
            f11 = f17;
            this.d = abs;
            this.e = abs2;
        } else {
            f10 = 0.0f;
            f11 = 0.6f;
            if (s1Var.J) {
                float width = rectF.width();
                float f25 = s1Var.j;
                float y9 = com.google.android.recaptcha.internal.a.y(width, f25, Math.abs(((int) aVar.nextLong()) % 1000) / 1000.0f, f25);
                float abs5 = Math.abs(((int) aVar.nextLong()) % 360);
                if (!s1Var.f[this.l] || this.s) {
                    f12 = 0.0f;
                } else {
                    y9 = Math.min(y9, org.telegram.messenger.g0.L(10.0f));
                    f12 = org.telegram.messenger.g0.L(30.0f) + 0.0f;
                }
                double d = y9;
                double d10 = abs5;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f12 + s1Var.k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
                this.e = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            }
        }
        if (s1Var.f[this.l]) {
            this.r = Math.abs(Utilities.c.nextFloat() * 2.0f);
        }
        double radians = s1Var.f[this.l] ? Math.toRadians(280.0f - (Utilities.c.nextFloat() * 200.0f)) : s1Var.h ? Utilities.c.nextDouble() * 3.141592653589793d * 2.0d : Math.atan2(this.e - (rectF.centerY() + s1Var.k), this.d - (rectF.centerX() + f10));
        this.j = (float) Math.cos(radians);
        this.k = (float) Math.sin(radians);
        if (s1Var.e[this.l]) {
            this.m = (int) (((Utilities.c.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.m = (int) (((Utilities.c.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i14 = s1Var.O;
        if ((i14 == 6 && ((i3 = this.l) == 1 || i3 == 2)) || i14 == 9 || i14 == 3 || i14 == 7 || i14 == 24 || i14 == 11 || i14 == 22 || i14 == 4) {
            this.n = (int) (((((int) Utilities.c.nextLong()) % 100) / 100.0f) * 45.0f);
        }
        if (s1Var.O != 101) {
            this.q = f10;
        }
        if (s1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.c.nextFloat() * 1.2f) + f11)) / 2.0f;
            float cos = (((float) Math.cos(radians)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f = cos;
            float sin = (((float) Math.sin(radians)) * min) + rectF.centerY() + s1Var.k;
            this.e = sin;
            this.g = sin;
        }
        this.s = false;
    }
}
