package zf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u1 {
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
    public float o;
    public float p;
    public final /* synthetic */ v1 r;
    public float c = 1.0f;
    public boolean q = true;

    public u1(v1 v1Var) {
        this.r = v1Var;
        int i9 = v1Var.S;
        v1Var.S = i9 + 1;
        this.b = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, float f10) {
        float f11;
        float f12;
        v1 v1Var = this.r;
        boolean z10 = v1Var.G;
        RectF rectF = v1Var.c;
        float f13 = v1Var.A;
        if (z10) {
            int[] iArr = v1Var.E;
            int i9 = this.l;
            int i10 = iArr[i9];
            float[] fArr = v1Var.D[i9];
            int i11 = i10 * 2;
            this.h = fArr[i11];
            this.i = fArr[i11 + 1];
            iArr[i9] = i10 + 1;
        } else {
            this.h = this.d;
            this.i = this.e;
        }
        if (rectF.isEmpty() || !rectF.contains(this.h, this.i)) {
            canvas.save();
            canvas.translate(this.h, this.i);
            float f14 = this.n;
            if (f14 != 0.0f) {
                canvas.rotate(f14, v1Var.d[this.l].getWidth() / 2.0f, v1Var.d[this.l].getHeight() / 2.0f);
            }
            if (v1Var.I) {
                long j11 = this.a - j10;
                if (j11 < 200) {
                    f11 = Utilities.clamp(1.0f - (j11 / 150.0f), 1.0f, 0.0f);
                    f12 = this.o;
                    if (f12 >= 1.0f || gh.m.b != 1.0f) {
                        float interpolation = AndroidUtilities.overshootInterpolator.getInterpolation(f12) * gh.m.b;
                        canvas.scale(interpolation, interpolation, 0.0f, 0.0f);
                    }
                    if (v1Var.f[this.l]) {
                        float min = (Math.min(v1Var.o, 3.5f) * (f13 / 1000.0f)) + this.p;
                        this.p = min;
                        canvas.scale((float) Math.cos(min * 3.141592653589793d), 1.0f, 0.0f, 0.0f);
                    }
                    Utilities.CallbackReturn callbackReturn = v1Var.l;
                    Paint paint = callbackReturn == null ? (Paint) callbackReturn.run(Integer.valueOf(this.b)) : v1Var.i;
                    float f15 = 1.0f - f11;
                    paint.setAlpha((int) (this.m * f15 * f10));
                    Bitmap bitmap = v1Var.d[this.l];
                    if (v1Var.m) {
                        float f16 = this.c * f15 * f10 * this.o;
                        canvas.scale(f16, f16);
                    }
                    canvas.drawBitmap(bitmap, -(bitmap.getWidth() >> 1), -(bitmap.getHeight() >> 1), paint);
                    canvas.restore();
                }
            }
            f11 = 0.0f;
            f12 = this.o;
            if (f12 >= 1.0f) {
            }
            float interpolation2 = AndroidUtilities.overshootInterpolator.getInterpolation(f12) * gh.m.b;
            canvas.scale(interpolation2, interpolation2, 0.0f, 0.0f);
            if (v1Var.f[this.l]) {
            }
            Utilities.CallbackReturn callbackReturn2 = v1Var.l;
            if (callbackReturn2 == null) {
            }
            float f152 = 1.0f - f11;
            paint.setAlpha((int) (this.m * f152 * f10));
            Bitmap bitmap2 = v1Var.d[this.l];
            if (v1Var.m) {
            }
            canvas.drawBitmap(bitmap2, -(bitmap2.getWidth() >> 1), -(bitmap2.getHeight() >> 1), paint);
            canvas.restore();
        }
        if (v1Var.g) {
            return;
        }
        float dp = (f13 / 660.0f) * AndroidUtilities.dp(4.0f);
        float min2 = v1Var.f[this.l] ? Math.min(v1Var.o, 3.5f) * 4.0f * dp : dp * v1Var.o;
        this.d = (this.j * min2) + this.d;
        this.e = (this.k * min2) + this.e;
        float f17 = this.o;
        if (f17 != 1.0f) {
            float f18 = (f13 / 200.0f) + f17;
            this.o = f18;
            if (f18 > 1.0f) {
                this.o = 1.0f;
            }
        }
    }

    public final void b(long j10) {
        float f10;
        float f11;
        float f12;
        int i9;
        float f13;
        float f14;
        v1 v1Var = this.r;
        int i10 = v1Var.N;
        ArrayList arrayList = v1Var.n;
        RectF rectF = v1Var.a;
        int i11 = 0;
        if (i10 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.l = 0;
            } else {
                this.l = (int) Math.floor((r2 * (v1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.l = Math.abs(Utilities.fastRandom.nextInt() % v1Var.d.length);
        }
        this.a = j10 + v1Var.x + Utilities.fastRandom.nextInt(v1Var.y * (v1Var.f[this.l] ? 3 : 1));
        this.n = 0.0f;
        if (v1Var.m) {
            this.c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (v1Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i12 = 0;
            float f15 = 0.0f;
            while (i12 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f16 = 2.14748365E9f;
                while (i11 < arrayList.size()) {
                    if (v1Var.h) {
                        f13 = ((u1) arrayList.get(i11)).f - abs3;
                        f14 = ((u1) arrayList.get(i11)).g;
                    } else {
                        f13 = ((u1) arrayList.get(i11)).d - abs3;
                        f14 = ((u1) arrayList.get(i11)).e;
                    }
                    float f17 = f14 - abs4;
                    float f18 = (f17 * f17) + (f13 * f13);
                    if (f18 < f16) {
                        f16 = f18;
                    }
                    i11++;
                }
                if (f16 > f15) {
                    abs2 = abs4;
                    f15 = f16;
                    abs = abs3;
                }
                i12++;
                i11 = 0;
            }
            f10 = 0.6f;
            f11 = 0.0f;
            this.d = abs;
            this.e = abs2;
        } else {
            f10 = 0.6f;
            f11 = 0.0f;
            if (v1Var.J) {
                float width = rectF.width();
                float f19 = v1Var.j;
                float z10 = e2.c.z(width, f19, j2.e(Utilities.fastRandom, MediaDataController.MAX_STYLE_RUNS_COUNT) / 1000.0f, f19);
                float e10 = j2.e(Utilities.fastRandom, 360);
                if (!v1Var.f[this.l] || this.q) {
                    f12 = 0.0f;
                } else {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f12 = AndroidUtilities.dp(30.0f) + 0.0f;
                }
                double d = z10;
                double d9 = e10;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d9)) * d));
                this.e = rectF.centerY() + f12 + v1Var.k + ((float) (Math.cos(Math.toRadians(d9)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (v1Var.f[this.l]) {
            this.p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        double radians = v1Var.f[this.l] ? Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f)) : v1Var.h ? Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d : Math.atan2(this.e - (rectF.centerY() + v1Var.k), this.d - (rectF.centerX() + f11));
        this.j = (float) Math.cos(radians);
        this.k = (float) Math.sin(radians);
        if (v1Var.e[this.l]) {
            this.m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i13 = v1Var.N;
        if ((i13 == 6 && ((i9 = this.l) == 1 || i9 == 2)) || i13 == 9 || i13 == 3 || i13 == 7 || i13 == 24 || i13 == 11 || i13 == 22 || i13 == 4) {
            this.n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (v1Var.N != 101) {
            this.o = 0.0f;
        }
        if (v1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f10)) / 2.0f;
            float cos = (((float) Math.cos(radians)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f = cos;
            float sin = (((float) Math.sin(radians)) * min) + rectF.centerY() + v1Var.k;
            this.e = sin;
            this.g = sin;
        }
        this.q = false;
    }
}
