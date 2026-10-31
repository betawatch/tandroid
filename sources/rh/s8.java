package rh;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s8 {
    public final int a;
    public final ArrayList b;
    public final Bitmap d;
    public int e;
    public int j;
    public cc.f l;
    public final Paint m;
    public long n;
    public long o;
    public final RectF c = new RectF();
    public final Paint f = new Paint(3);
    public final Rect g = new Rect();
    public float h = 1.0f;
    public final float i = 1.0f;
    public boolean k = true;

    public s8(int i10, int i11) {
        this.a = i10;
        this.j = i11;
        this.b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.b.add(new r8(this));
        }
        int L = org.telegram.messenger.i0.L(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f7 = L >> 1;
        int i13 = (int) (0.85f * f7);
        path.moveTo(0.0f, f7);
        float f10 = i13;
        path.lineTo(f10, f10);
        path.lineTo(f7, 0.0f);
        float f11 = L - i13;
        path.lineTo(f11, f10);
        float f12 = L;
        path.lineTo(f12, f7);
        path.lineTo(f11, f11);
        path.lineTo(f7, f12);
        path.lineTo(f10, f11);
        path.lineTo(0.0f, f7);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT < 29) {
            this.l = null;
            this.m = null;
            return;
        }
        cc.f fVar = new cc.f(i11);
        this.l = fVar;
        float width = createBitmap.getWidth();
        float height = createBitmap.getHeight();
        for (int i14 = 0; i14 < fVar.b; i14++) {
            cc.f.a((float[]) fVar.d, i14, 0.0f, 0.0f, width, height);
        }
        this.m = g0.a.a(createBitmap);
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (sc.e(131072)) {
            int i11 = this.j;
            ArrayList arrayList = this.b;
            int min = Math.min(i11, arrayList.size());
            float f10 = 2.0f;
            if (this.l != null) {
                Bitmap bitmap = this.d;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                for (int i12 = 0; i12 < min; i12++) {
                    r8 r8Var = (r8) arrayList.get(i12);
                    float f11 = r8Var.i * r8Var.e * f7;
                    float f12 = (width / 2.0f) * f11;
                    float f13 = (height / 2.0f) * f11;
                    cc.f fVar = this.l;
                    float f14 = r8Var.a;
                    float f15 = r8Var.b;
                    cc.f.a((float[]) fVar.c, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                    this.l.f(i12, i0.b.o(i10, (int) (Utilities.l(r8Var.h * f7) * 255.0f)));
                }
                g0.a.b(canvas, this.l, min, this.m);
            } else {
                if (this.e != i10) {
                    this.e = i10;
                    this.f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
                int i13 = 0;
                while (i13 < min) {
                    r8 r8Var2 = (r8) arrayList.get(i13);
                    float f16 = r8Var2.h * f7;
                    s8 s8Var = r8Var2.j;
                    Paint paint = s8Var.f;
                    Rect rect = s8Var.g;
                    Bitmap bitmap2 = s8Var.d;
                    paint.setAlpha((int) (f16 * 255.0f));
                    float f17 = f10;
                    rect.set((int) org.telegram.ui.Cells.f1.x((bitmap2.getWidth() / f10) * r8Var2.i, r8Var2.e, f16, r8Var2.a), (int) org.telegram.ui.Cells.f1.x((bitmap2.getHeight() / f10) * r8Var2.i, r8Var2.e, f16, r8Var2.b), (int) c3.i0.u((bitmap2.getWidth() / f10) * r8Var2.i, r8Var2.e, f16, r8Var2.a), (int) c3.i0.u((bitmap2.getHeight() / f17) * r8Var2.i, r8Var2.e, f16, r8Var2.b));
                    canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                    i13++;
                    f10 = f17;
                }
            }
            this.k = false;
        }
    }

    public final void c(r8 r8Var, long j10, boolean z10) {
        r8Var.f = j10;
        d5.a aVar = Utilities.c;
        long W1 = (long) (org.telegram.messenger.i0.W1(aVar.nextFloat(), 500, 2500) * this.i);
        r8Var.g = W1;
        if (z10) {
            r8Var.f -= (long) (Utilities.l(aVar.nextFloat()) * W1);
        }
        RectF rectF = this.c;
        r8Var.a = org.telegram.messenger.i0.T1(rectF.left, rectF.right, aVar.nextFloat());
        r8Var.b = org.telegram.messenger.i0.T1(rectF.top, rectF.bottom, aVar.nextFloat());
        if (this.a == 0) {
            r8Var.c = org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-7.0f, -18.0f, aVar.nextFloat()));
            r8Var.d = org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-2.0f, 2.0f, aVar.nextFloat()));
        } else {
            r8Var.c = rectF.centerX() - r8Var.a;
            r8Var.d = rectF.centerY() - r8Var.b;
            float L = org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(1.0f, 4.0f, aVar.nextFloat()));
            float f7 = r8Var.c;
            float f10 = r8Var.d;
            float sqrt = L / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            r8Var.c *= sqrt;
            r8Var.d *= sqrt;
        }
        r8Var.i = org.telegram.messenger.i0.T1(0.4f, 1.0f, aVar.nextFloat());
        r8Var.e = org.telegram.messenger.i0.T1(0.8f, 1.2f, aVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        if (sc.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (Math.min(this.o - currentTimeMillis, 16L) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.j;
                ArrayList arrayList = this.b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                r8 r8Var = (r8) arrayList.get(i10);
                long j10 = r8Var.g;
                float f7 = j10 <= 0 ? 2.0f : (currentTimeMillis - r8Var.f) / j10;
                if (f7 > 1.0f) {
                    c(r8Var, currentTimeMillis, this.k);
                    f7 = 0.0f;
                }
                r8Var.a = (r8Var.c * min) + r8Var.a;
                r8Var.b = (r8Var.d * min) + r8Var.b;
                float f10 = 4.0f * f7;
                r8Var.h = f10 - (f7 * f10);
                i10++;
            }
            this.o = currentTimeMillis;
            long j11 = this.n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
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
            r8 r8Var = (r8) arrayList.get(i10);
            if (!this.c.contains((int) r8Var.a, (int) r8Var.b)) {
                c(r8Var, currentTimeMillis, this.k);
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
