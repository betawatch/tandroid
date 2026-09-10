package xh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l8 {
    public final int a;
    public final ArrayList b;
    public final Bitmap d;
    public int e;
    public int j;
    public e0.i0 l;
    public final Paint m;
    public long n;
    public long o;
    public final RectF c = new RectF();
    public final Paint f = new Paint(3);
    public final Rect g = new Rect();
    public float h = 1.0f;
    public final float i = 1.0f;
    public boolean k = true;

    public l8(int i10, int i11) {
        this.a = i10;
        this.j = i11;
        this.b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.b.add(new k8(this));
        }
        int dp = AndroidUtilities.dp(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f7 = dp >> 1;
        int i13 = (int) (0.85f * f7);
        path.moveTo(0.0f, f7);
        float f10 = i13;
        path.lineTo(f10, f10);
        path.lineTo(f7, 0.0f);
        float f11 = dp - i13;
        path.lineTo(f11, f10);
        float f12 = dp;
        path.lineTo(f12, f7);
        path.lineTo(f11, f11);
        path.lineTo(f7, f12);
        path.lineTo(f10, f11);
        path.lineTo(0.0f, f7);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT < 29) {
            this.l = null;
            this.m = null;
            return;
        }
        e0.i0 i0Var = new e0.i0(i11);
        this.l = i0Var;
        float width = createBitmap.getWidth();
        float height = createBitmap.getHeight();
        for (int i14 = 0; i14 < i0Var.a; i14++) {
            e0.i0.b((float[]) i0Var.c, i14, 0.0f, 0.0f, width, height);
        }
        this.m = g0.a.a(createBitmap);
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (LiteMode.isEnabled(131072)) {
            int i11 = this.j;
            ArrayList arrayList = this.b;
            int min = Math.min(i11, arrayList.size());
            float f10 = 2.0f;
            if (this.l != null) {
                Bitmap bitmap = this.d;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                for (int i12 = 0; i12 < min; i12++) {
                    k8 k8Var = (k8) arrayList.get(i12);
                    float f11 = k8Var.i * k8Var.e * f7;
                    float f12 = (width / 2.0f) * f11;
                    float f13 = (height / 2.0f) * f11;
                    e0.i0 i0Var = this.l;
                    float f14 = k8Var.a;
                    float f15 = k8Var.b;
                    e0.i0.b((float[]) i0Var.b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                    this.l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(k8Var.h * f7) * 255.0f)));
                }
                g0.a.b(canvas, this.l, min, this.m);
            } else {
                if (this.e != i10) {
                    this.e = i10;
                    this.f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
                int i13 = 0;
                while (i13 < min) {
                    k8 k8Var2 = (k8) arrayList.get(i13);
                    float f16 = k8Var2.h * f7;
                    l8 l8Var = k8Var2.j;
                    Paint paint = l8Var.f;
                    Rect rect = l8Var.g;
                    Bitmap bitmap2 = l8Var.d;
                    paint.setAlpha((int) (f16 * 255.0f));
                    rect.set((int) (k8Var2.a - ((((bitmap2.getWidth() / f10) * k8Var2.i) * k8Var2.e) * f16)), (int) (k8Var2.b - ((((bitmap2.getHeight() / f10) * k8Var2.i) * k8Var2.e) * f16)), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f10) * k8Var2.i, k8Var2.e, f16, k8Var2.a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / 2.0f) * k8Var2.i, k8Var2.e, f16, k8Var2.b));
                    canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                    i13++;
                    f10 = 2.0f;
                }
            }
            this.k = false;
        }
    }

    public final void c(k8 k8Var, long j3, boolean z10) {
        k8Var.f = j3;
        long lerp = (long) (AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.i);
        k8Var.g = lerp;
        if (z10) {
            k8Var.f -= (long) (Utilities.clamp01(Utilities.fastRandom.nextFloat()) * lerp);
        }
        RectF rectF = this.c;
        k8Var.a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        k8Var.b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.a == 0) {
            k8Var.c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            k8Var.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            k8Var.c = rectF.centerX() - k8Var.a;
            k8Var.d = rectF.centerY() - k8Var.b;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat()));
            float f7 = k8Var.c;
            float f10 = k8Var.d;
            float sqrt = dp / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            k8Var.c *= sqrt;
            k8Var.d *= sqrt;
        }
        k8Var.i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        k8Var.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (Math.min(this.o - currentTimeMillis, 16L) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.j;
                ArrayList arrayList = this.b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                k8 k8Var = (k8) arrayList.get(i10);
                long j3 = k8Var.g;
                float f7 = j3 <= 0 ? 2.0f : (currentTimeMillis - k8Var.f) / j3;
                if (f7 > 1.0f) {
                    c(k8Var, currentTimeMillis, this.k);
                    f7 = 0.0f;
                }
                k8Var.a = (k8Var.c * min) + k8Var.a;
                k8Var.b = (k8Var.d * min) + k8Var.b;
                float f10 = 4.0f * f7;
                k8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.o = currentTimeMillis;
            long j10 = this.n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.a != 2) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            k8 k8Var = (k8) arrayList.get(i10);
            if (!this.c.contains((int) k8Var.a, (int) k8Var.b)) {
                c(k8Var, currentTimeMillis, this.k);
            }
            i10++;
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.c.set(rectF);
        e();
    }
}
