package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v1 {
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
    public final /* synthetic */ w1 r;
    public float c = 1.0f;
    public boolean q = true;

    public v1(w1 w1Var) {
        this.r = w1Var;
        int i10 = w1Var.S;
        w1Var.S = i10 + 1;
        this.b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j3, float f7) {
        float f10;
        float f11;
        w1 w1Var = this.r;
        boolean z10 = w1Var.G;
        RectF rectF = w1Var.c;
        float f12 = w1Var.A;
        if (z10) {
            int[] iArr = w1Var.E;
            int i10 = this.l;
            int i11 = iArr[i10];
            float[] fArr = w1Var.D[i10];
            int i12 = i11 * 2;
            this.h = fArr[i12];
            this.i = fArr[i12 + 1];
            iArr[i10] = i11 + 1;
        } else {
            this.h = this.d;
            this.i = this.e;
        }
        if (rectF.isEmpty() || !rectF.contains(this.h, this.i)) {
            canvas.save();
            canvas.translate(this.h, this.i);
            float f13 = this.n;
            if (f13 != 0.0f) {
                canvas.rotate(f13, w1Var.d[this.l].getWidth() / 2.0f, w1Var.d[this.l].getHeight() / 2.0f);
            }
            if (w1Var.I) {
                long j10 = this.a - j3;
                if (j10 < 200) {
                    f10 = Utilities.clamp(1.0f - (j10 / 150.0f), 1.0f, 0.0f);
                    f11 = this.o;
                    if (f11 >= 1.0f || zd.b != 1.0f) {
                        float interpolation = AndroidUtilities.overshootInterpolator.getInterpolation(f11) * zd.b;
                        canvas.scale(interpolation, interpolation, 0.0f, 0.0f);
                    }
                    if (w1Var.f[this.l]) {
                        float min = (Math.min(w1Var.o, 3.5f) * (f12 / 1000.0f)) + this.p;
                        this.p = min;
                        canvas.scale((float) Math.cos(min * 3.141592653589793d), 1.0f, 0.0f, 0.0f);
                    }
                    Utilities.CallbackReturn callbackReturn = w1Var.l;
                    Paint paint = callbackReturn == null ? (Paint) callbackReturn.run(Integer.valueOf(this.b)) : w1Var.i;
                    float f14 = 1.0f - f10;
                    paint.setAlpha((int) (this.m * f14 * f7));
                    Bitmap bitmap = w1Var.d[this.l];
                    if (w1Var.m) {
                        float f15 = this.c * f14 * f7 * this.o;
                        canvas.scale(f15, f15);
                    }
                    canvas.drawBitmap(bitmap, -(bitmap.getWidth() >> 1), -(bitmap.getHeight() >> 1), paint);
                    canvas.restore();
                }
            }
            f10 = 0.0f;
            f11 = this.o;
            if (f11 >= 1.0f) {
            }
            float interpolation2 = AndroidUtilities.overshootInterpolator.getInterpolation(f11) * zd.b;
            canvas.scale(interpolation2, interpolation2, 0.0f, 0.0f);
            if (w1Var.f[this.l]) {
            }
            Utilities.CallbackReturn callbackReturn2 = w1Var.l;
            if (callbackReturn2 == null) {
            }
            float f142 = 1.0f - f10;
            paint.setAlpha((int) (this.m * f142 * f7));
            Bitmap bitmap2 = w1Var.d[this.l];
            if (w1Var.m) {
            }
            canvas.drawBitmap(bitmap2, -(bitmap2.getWidth() >> 1), -(bitmap2.getHeight() >> 1), paint);
            canvas.restore();
        }
        if (w1Var.g) {
            return;
        }
        float dp = (f12 / 660.0f) * AndroidUtilities.dp(4.0f);
        float min2 = w1Var.f[this.l] ? Math.min(w1Var.o, 3.5f) * 4.0f * dp : dp * w1Var.o;
        this.d = (this.j * min2) + this.d;
        this.e = (this.k * min2) + this.e;
        float f16 = this.o;
        if (f16 != 1.0f) {
            float f17 = (f12 / 200.0f) + f16;
            this.o = f17;
            if (f17 > 1.0f) {
                this.o = 1.0f;
            }
        }
    }

    public final void b(long j3) {
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        w1 w1Var = this.r;
        int i11 = w1Var.N;
        ArrayList arrayList = w1Var.n;
        RectF rectF = w1Var.a;
        int i12 = 0;
        if (i11 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.l = 0;
            } else {
                this.l = (int) Math.floor((r2 * (w1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.l = Math.abs(Utilities.fastRandom.nextInt() % w1Var.d.length);
        }
        this.a = j3 + w1Var.x + Utilities.fastRandom.nextInt(w1Var.y * (w1Var.f[this.l] ? 3 : 1));
        this.n = 0.0f;
        if (w1Var.m) {
            this.c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (w1Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i13 = 0;
            float f14 = 0.0f;
            while (i13 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f15 = 2.14748365E9f;
                while (i12 < arrayList.size()) {
                    if (w1Var.h) {
                        f12 = ((v1) arrayList.get(i12)).f - abs3;
                        f13 = ((v1) arrayList.get(i12)).g;
                    } else {
                        f12 = ((v1) arrayList.get(i12)).d - abs3;
                        f13 = ((v1) arrayList.get(i12)).e;
                    }
                    float f16 = f13 - abs4;
                    float f17 = (f16 * f16) + (f12 * f12);
                    if (f17 < f15) {
                        f15 = f17;
                    }
                    i12++;
                }
                if (f15 > f14) {
                    abs2 = abs4;
                    f14 = f15;
                    abs = abs3;
                }
                i13++;
                i12 = 0;
            }
            f7 = 0.6f;
            f10 = 0.0f;
            this.d = abs;
            this.e = abs2;
        } else {
            f7 = 0.6f;
            f10 = 0.0f;
            if (w1Var.J) {
                float width = rectF.width();
                float f18 = w1Var.j;
                float z10 = e2.z(width, f18, r6.c(Utilities.fastRandom, MediaDataController.MAX_STYLE_RUNS_COUNT) / 1000.0f, f18);
                float c10 = r6.c(Utilities.fastRandom, 360);
                if (!w1Var.f[this.l] || this.q) {
                    f11 = 0.0f;
                } else {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                }
                double d = z10;
                double d10 = c10;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f11 + w1Var.k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (w1Var.f[this.l]) {
            this.p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        double radians = w1Var.f[this.l] ? Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f)) : w1Var.h ? Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d : Math.atan2(this.e - (rectF.centerY() + w1Var.k), this.d - (rectF.centerX() + f10));
        this.j = (float) Math.cos(radians);
        this.k = (float) Math.sin(radians);
        if (w1Var.e[this.l]) {
            this.m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i14 = w1Var.N;
        if ((i14 == 6 && ((i10 = this.l) == 1 || i10 == 2)) || i14 == 9 || i14 == 3 || i14 == 7 || i14 == 24 || i14 == 11 || i14 == 22 || i14 == 4) {
            this.n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (w1Var.N != 101) {
            this.o = 0.0f;
        }
        if (w1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f7)) / 2.0f;
            float cos = (((float) Math.cos(radians)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f = cos;
            float sin = (((float) Math.sin(radians)) * min) + rectF.centerY() + w1Var.k;
            this.e = sin;
            this.g = sin;
        }
        this.q = false;
    }
}
