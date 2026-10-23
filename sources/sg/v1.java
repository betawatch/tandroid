package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sl;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
    public long o;
    public float p;
    public float q;
    public float r;
    public final /* synthetic */ w1 t;
    public float c = 1.0f;
    public boolean s = true;

    public v1(w1 w1Var) {
        this.t = w1Var;
        int i10 = w1Var.T;
        w1Var.T = i10 + 1;
        this.b = i10;
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
    public final void a(Canvas canvas, long j10, float f7) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        w1 w1Var = this.t;
        boolean z10 = w1Var.G;
        RectF rectF = w1Var.c;
        float f16 = w1Var.A;
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
            float f17 = this.n;
            if (f17 != 0.0f) {
                f11 = 1000.0f;
                f10 = 2.0f;
                canvas.rotate(f17, w1Var.d[this.l].getWidth() / 2.0f, w1Var.d[this.l].getHeight() / 2.0f);
            } else {
                f10 = 2.0f;
                f11 = 1000.0f;
            }
            if (w1Var.I) {
                long j11 = this.a - j10;
                if (j11 < 200) {
                    f12 = Utilities.clamp(1.0f - (j11 / 150.0f), 1.0f, 0.0f);
                    f13 = this.q;
                    if (f13 >= 1.0f || ai.r.b != 1.0f) {
                        float interpolation = AndroidUtilities.overshootInterpolator.getInterpolation(f13) * ai.r.b;
                        canvas.scale(interpolation, interpolation, 0.0f, 0.0f);
                    }
                    if (w1Var.f[this.l]) {
                        float min = (Math.min(w1Var.o, 3.5f) * (f16 / f11)) + this.r;
                        this.r = min;
                        canvas.scale((float) Math.cos(min * 3.141592653589793d), 1.0f, 0.0f, 0.0f);
                    }
                    Utilities.CallbackReturn callbackReturn = w1Var.l;
                    Paint paint = callbackReturn == null ? (Paint) callbackReturn.run(Integer.valueOf(this.b)) : w1Var.i;
                    if (w1Var.N) {
                        f14 = f16;
                        f15 = 1.0f;
                    } else {
                        f14 = f16;
                        long j12 = this.o;
                        float clamp = 1.0f - Utilities.clamp((j10 - j12) / Math.max(1L, this.a - j12), 1.0f, 0.0f);
                        f15 = k3.A((float) Math.sin((j10 * 0.011f) + this.p), 0.28f, 0.72f, k3.B(clamp, f10, 3.0f, clamp * clamp));
                        f12 = 0.0f;
                    }
                    float f18 = 1.0f - f12;
                    paint.setAlpha((int) k3.C(this.m, f18, f7, f15));
                    Bitmap bitmap = w1Var.d[this.l];
                    if (w1Var.m) {
                        float f19 = this.c * f18 * f7 * this.q * (w1Var.N ? 0.75f + (f15 * 0.25f) : 1.0f);
                        canvas.scale(f19, f19);
                    }
                    canvas.drawBitmap(bitmap, -(bitmap.getWidth() >> 1), -(bitmap.getHeight() >> 1), paint);
                    canvas.restore();
                }
            }
            f12 = 0.0f;
            f13 = this.q;
            if (f13 >= 1.0f) {
            }
            float interpolation2 = AndroidUtilities.overshootInterpolator.getInterpolation(f13) * ai.r.b;
            canvas.scale(interpolation2, interpolation2, 0.0f, 0.0f);
            if (w1Var.f[this.l]) {
            }
            Utilities.CallbackReturn callbackReturn2 = w1Var.l;
            if (callbackReturn2 == null) {
            }
            if (w1Var.N) {
            }
            float f182 = 1.0f - f12;
            paint.setAlpha((int) k3.C(this.m, f182, f7, f15));
            Bitmap bitmap2 = w1Var.d[this.l];
            if (w1Var.m) {
            }
            canvas.drawBitmap(bitmap2, -(bitmap2.getWidth() >> 1), -(bitmap2.getHeight() >> 1), paint);
            canvas.restore();
        } else {
            f14 = f16;
            f11 = 1000.0f;
        }
        if (w1Var.g) {
            return;
        }
        float dp = (f14 / 660.0f) * AndroidUtilities.dp(4.0f);
        float min2 = w1Var.f[this.l] ? Math.min(w1Var.o, 3.5f) * 4.0f * dp : dp * w1Var.o;
        if (w1Var.N) {
            long j13 = this.o;
            float clamp2 = 1.0f - Utilities.clamp((j10 - j13) / Math.max(1L, this.a - j13), 1.0f, 0.0f);
            min2 *= (2.2f * clamp2 * clamp2) + 0.15f;
            this.e = sl.x(f14, f11, AndroidUtilities.dp(5.0f), this.e);
        }
        this.d = (this.j * min2) + this.d;
        this.e = (this.k * min2) + this.e;
        float f20 = this.q;
        if (f20 != 1.0f) {
            float f21 = (f14 / 200.0f) + f20;
            this.q = f21;
            if (f21 > 1.0f) {
                this.q = 1.0f;
            }
        }
    }

    public final void b(long j10) {
        float f7;
        float f10;
        int i10;
        float f11;
        float f12;
        w1 w1Var = this.t;
        int i11 = w1Var.O;
        ArrayList arrayList = w1Var.n;
        RectF rectF = w1Var.a;
        if (i11 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.l = 0;
            } else {
                this.l = (int) Math.floor((r4 * (w1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.l = Math.abs(Utilities.fastRandom.nextInt() % w1Var.d.length);
        }
        this.a = Utilities.fastRandom.nextInt(w1Var.y * (w1Var.f[this.l] ? 3 : 1)) + w1Var.x + j10;
        this.o = j10;
        this.p = Utilities.fastRandom.nextFloat() * 6.28f;
        float f13 = 0.0f;
        this.n = 0.0f;
        if (w1Var.m) {
            this.c = org.telegram.ui.Cells.b1.d(Utilities.fastRandom, 0.6f, 0.4f);
        }
        if (w1Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            float f14 = 0.0f;
            int i12 = 0;
            while (i12 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f15 = 2.14748365E9f;
                float f16 = f13;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (w1Var.h) {
                        f11 = ((v1) arrayList.get(i13)).f - abs3;
                        f12 = ((v1) arrayList.get(i13)).g;
                    } else {
                        f11 = ((v1) arrayList.get(i13)).d - abs3;
                        f12 = ((v1) arrayList.get(i13)).e;
                    }
                    float f17 = f12 - abs4;
                    float f18 = (f17 * f17) + (f11 * f11);
                    if (f18 < f15) {
                        f15 = f18;
                    }
                }
                if (f15 > f14) {
                    abs2 = abs4;
                    f14 = f15;
                    abs = abs3;
                }
                i12++;
                f13 = f16;
            }
            f7 = f13;
            this.d = abs;
            this.e = abs2;
        } else {
            f7 = 0.0f;
            if (w1Var.J) {
                float width = rectF.width();
                float f19 = w1Var.j;
                float y3 = k3.y(width, f19, org.telegram.ui.Cells.b1.g(Utilities.fastRandom, MediaDataController.MAX_STYLE_RUNS_COUNT) / 1000.0f, f19);
                float g10 = org.telegram.ui.Cells.b1.g(Utilities.fastRandom, 360);
                if (!w1Var.f[this.l] || this.s) {
                    f10 = 0.0f;
                } else {
                    y3 = Math.min(y3, AndroidUtilities.dp(10.0f));
                    f10 = AndroidUtilities.dp(30.0f) + 0.0f;
                }
                double d = y3;
                double d10 = g10;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f10 + w1Var.k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (w1Var.f[this.l]) {
            this.r = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        double radians = w1Var.f[this.l] ? Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f)) : w1Var.h ? Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d : Math.atan2(this.e - (rectF.centerY() + w1Var.k), this.d - (rectF.centerX() + f7));
        this.j = (float) Math.cos(radians);
        this.k = (float) Math.sin(radians);
        if (w1Var.e[this.l]) {
            this.m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i14 = w1Var.O;
        if ((i14 == 6 && ((i10 = this.l) == 1 || i10 == 2)) || i14 == 9 || i14 == 3 || i14 == 7 || i14 == 24 || i14 == 11 || i14 == 22 || i14 == 4) {
            this.n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (w1Var.O != 101) {
            this.q = f7;
        }
        if (w1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * org.telegram.ui.Cells.b1.d(Utilities.fastRandom, 1.2f, 0.6f)) / 2.0f;
            float cos = (((float) Math.cos(radians)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f = cos;
            float sin = (((float) Math.sin(radians)) * min) + rectF.centerY() + w1Var.k;
            this.e = sin;
            this.g = sin;
        }
        this.s = false;
    }
}
