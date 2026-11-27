// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wna {
    public final d2c a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public int g;
    public final boolean h;
    public final short i;
    public Bitmap j;
    public long k;
    public int n;
    public final Paint e = new Paint();
    public final int f = aob.A8;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public wna(int i) {
        this.h = i;
        short s = i == 0 ? (short) 100 : (short) 300;
        this.i = s;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(hl.L(1.5f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStrokeWidth(hl.L(0.5f));
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new d2c(s);
            this.b = t4.a(a(true));
        } else {
            this.a = null;
            this.b = null;
        }
        c();
        for (int i2 = 0; i2 < 20; i2++) {
            this.m.add(new vna(this));
        }
    }

    public static Bitmap a(boolean z) {
        Paint paint = new Paint(1);
        paint.setStrokeWidth(hl.L(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        Bitmap createBitmap = Bitmap.createBitmap(z ? hl.L(20.0f) : hl.L(10.0f), hl.L(10.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float N = hl.N(2.0f) * 2.0f;
        float f = (-hl.N(0.57f)) * 2.0f;
        float N2 = hl.N(1.55f) * 2.0f;
        float f2 = 5.0f;
        float L = hl.L(5.0f);
        float L2 = hl.L(5.0f);
        float f3 = -1.5707964f;
        int i = 0;
        while (i < 6) {
            double d = f3;
            float f4 = f2;
            float f5 = f3;
            float cos = ((float) Math.cos(d)) * N;
            Bitmap bitmap = createBitmap;
            float sin = ((float) Math.sin(d)) * N;
            float f6 = cos * 0.66f;
            float f7 = 0.66f * sin;
            canvas.drawLine(L, L2, cos + L, sin + L2, paint);
            float f8 = L;
            float f9 = L2;
            double d2 = (float) (d - 1.5707963267948966d);
            double d3 = f;
            double d4 = N2;
            float f10 = f8 + f6;
            float f11 = f9 + f7;
            canvas.drawLine(f10, f11, f8 + ((float) ((Math.cos(d2) * d3) - (Math.sin(d2) * d4))), ((float) ik8.d(d2, d4, Math.sin(d2) * d3)) + f9, paint);
            canvas.drawLine(f10, f11, f8 + ((float) (((-Math.cos(d2)) * d3) - (Math.sin(d2) * d4))), ((float) ik8.d(d2, d4, (-Math.sin(d2)) * d3)) + f9, paint);
            f3 = f5 + 1.0471976f;
            i++;
            L2 = f9;
            f2 = f4;
            createBitmap = bitmap;
            L = f8;
        }
        Bitmap bitmap2 = createBitmap;
        float f12 = f2;
        if (z) {
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(hl.L(1.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            canvas.drawPoint(hl.L(15.0f), hl.L(f12), paint2);
        }
        return bitmap2;
    }

    public final void b(Canvas canvas, View view) {
        short s;
        vna vnaVar;
        float f;
        float f2;
        if (view == null || canvas == null || !i86.e(32)) {
            return;
        }
        c();
        short s2 = this.i;
        d2c d2cVar = this.a;
        int i = 0;
        ArrayList arrayList = this.l;
        if (d2cVar != null) {
            int min = Math.min((int) s2, arrayList.size());
            int L = hl.L(10.0f);
            for (int i2 = 0; i2 < min; i2++) {
                vna vnaVar2 = (vna) arrayList.get(i2);
                float f3 = vnaVar2.a;
                float f4 = vnaVar2.b;
                if (vnaVar2.j == 0) {
                    f = L / 2.0f;
                    f2 = L;
                } else {
                    f = (L / 2.0f) * vnaVar2.i;
                    f2 = 0.0f;
                }
                d2cVar.s(i2, vm2.o(this.n, (int) (vnaVar2.f * 255.0f)));
                d2c.d((float[]) d2cVar.c, i2, f3 - f, f4 - f, f3 + f, f4 + f);
                float f5 = L;
                d2c.d((float[]) d2cVar.d, i2, f2, 0.0f, f2 + f5, f5);
            }
            t4.b(canvas, d2cVar, min, this.b);
        } else {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                vna vnaVar3 = (vna) arrayList.get(i3);
                int i4 = vnaVar3.j;
                wna wnaVar = vnaVar3.k;
                if (i4 != 0) {
                    Bitmap bitmap = wnaVar.j;
                    Paint paint = wnaVar.e;
                    if (bitmap == null) {
                        wnaVar.j = a(false);
                    }
                    paint.setAlpha((int) (vnaVar3.f * 255.0f));
                    canvas.save();
                    float f6 = vnaVar3.i;
                    canvas.scale(f6, f6, vnaVar3.a, vnaVar3.b);
                    canvas.drawBitmap(wnaVar.j, vnaVar3.a, vnaVar3.b, paint);
                    canvas.restore();
                } else {
                    wnaVar.c.setAlpha((int) (vnaVar3.f * 255.0f));
                    canvas.drawPoint(vnaVar3.a, vnaVar3.b, wnaVar.c);
                }
            }
        }
        boolean z = this.h;
        int i5 = !z ? 1 : 10;
        int size2 = arrayList.size();
        int i6 = 40;
        ArrayList arrayList2 = this.m;
        if (size2 < s2) {
            int i7 = 0;
            while (i7 < i5) {
                if (arrayList.size() < s2) {
                    SecureRandom secureRandom = Utilities.b;
                    if (secureRandom.nextFloat() > 0.7f) {
                        int i8 = hl.m;
                        float nextFloat = secureRandom.nextFloat() * view.getMeasuredWidth();
                        float nextFloat2 = !z ? (secureRandom.nextFloat() * qu6.x(20.0f, view.getMeasuredHeight(), i8)) + i8 : secureRandom.nextFloat() * view.getMeasuredHeight();
                        double nextInt = (secureRandom.nextInt(40) + 70) * 0.017453292519943295d;
                        s = s2;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (arrayList2.isEmpty()) {
                            vnaVar = new vna(this);
                        } else {
                            vnaVar = (vna) arrayList2.get(0);
                            arrayList2.remove(0);
                        }
                        vnaVar.a = nextFloat;
                        vnaVar.b = nextFloat2;
                        vnaVar.c = cos;
                        vnaVar.d = sin;
                        vnaVar.f = 0.0f;
                        vnaVar.h = 0.0f;
                        vnaVar.i = secureRandom.nextFloat() * 1.2f;
                        vnaVar.j = secureRandom.nextInt(2);
                        if (z) {
                            vnaVar.g = secureRandom.nextInt(2000) + 3000;
                        } else {
                            vnaVar.g = secureRandom.nextInt(100) + 2000;
                        }
                        vnaVar.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(vnaVar);
                        i7++;
                        s2 = s;
                    }
                }
                s = s2;
                i7++;
                s2 = s;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long min2 = Math.min(17L, currentTimeMillis - this.k);
        int size3 = arrayList.size();
        while (i < size3) {
            vna vnaVar4 = (vna) arrayList.get(i);
            float f7 = vnaVar4.h;
            float f8 = vnaVar4.g;
            if (f7 >= f8) {
                if (arrayList2.size() < i6) {
                    arrayList2.add(vnaVar4);
                }
                arrayList.remove(i);
                i--;
                size3--;
            } else {
                if (z) {
                    if (f7 < 200.0f) {
                        vnaVar4.f = hl.G.getInterpolation(f7 / 200.0f);
                    } else {
                        float f9 = f8 - f7;
                        if (f9 < 2000.0f) {
                            vnaVar4.f = hl.F.getInterpolation(f9 / 2000.0f);
                        }
                    }
                } else if (f7 < 200.0f) {
                    vnaVar4.f = hl.G.getInterpolation(f7 / 200.0f);
                } else {
                    vnaVar4.f = 1.0f - hl.F.getInterpolation((f7 - 200.0f) / (f8 - 200.0f));
                }
                float f10 = vnaVar4.a;
                float f11 = vnaVar4.c;
                float f12 = vnaVar4.e;
                float f13 = min2;
                vnaVar4.a = qu6.d(f11 * f12, f13, 500.0f, f10);
                vnaVar4.b = (((vnaVar4.d * f12) * f13) / 500.0f) + vnaVar4.b;
                vnaVar4.h += f13;
            }
            i++;
            i6 = 40;
        }
        this.k = currentTimeMillis;
        view.invalidate();
    }

    public final void c() {
        int i = this.g;
        if (i == 0) {
            i = aob.w0(null, this.f, false) & (-1644826);
        }
        if (this.n != i) {
            this.n = i;
            this.c.setColor(i);
            this.d.setColor(i);
        }
    }
}
