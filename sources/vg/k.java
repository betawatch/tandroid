package vg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import org.telegram.tgnet.TLObject;
import w7.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k {
    public static final h h = new h(TLObject.FLAG_22, 0);
    public static final j i = new j();
    public final long[] a = new long[3];
    public final i[] b = new i[3];
    public final int[] c = new int[3];
    public final PorterDuffColorFilter[] d = new PorterDuffColorFilter[3];
    public final Paint e = new Paint(2);
    public final float[] f = new float[8];
    public final Rect g = new Rect();

    public static float c(float f7, float f10, float f11) {
        return (f11 <= f10 || f11 <= 0.0f) ? f7 : Math.min(f7, f10 / f11);
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float[] fArr, g gVar, float f13) {
        float f14 = f11 - f7;
        float f15 = f12 - f10;
        if (f14 < 1.0f || f15 < 1.0f || f13 <= 0.0f) {
            return;
        }
        float c10 = c(c(c(c(1.0f, f14, fArr[0] + fArr[2]), f14, fArr[6] + fArr[4]), f15, fArr[1] + fArr[7]), f15, fArr[3] + fArr[5]);
        for (int i10 = 0; i10 < 8; i10++) {
            this.f[i10] = Math.max(0.0f, fArr[i10]) * c10;
        }
        if (gVar.e > 0.05f) {
            int i11 = gVar.f;
            if ((i11 >>> 24) != 0) {
                b(canvas, 2, f7, f10, f11, f12, gVar, i11, f13);
            }
        }
        if (gVar.a > 0.05f) {
            int i12 = gVar.b;
            if ((i12 >>> 24) != 0) {
                b(canvas, 0, f7, f10, f11, f12, gVar, i12, f13);
            }
        }
        if (gVar.c > 0.05f) {
            int i13 = gVar.d;
            if ((i13 >>> 24) != 0) {
                b(canvas, 1, f7, f10, f11, f12, gVar, i13, f13);
            }
        }
    }

    public final void b(Canvas canvas, int i10, float f7, float f10, float f11, float f12, g gVar, int i11, float f13) {
        float[] fArr;
        int i12;
        int i13;
        int round = Math.round(f11 - f7);
        int round2 = Math.round(f12 - f10);
        j jVar = i;
        jVar.a = i10;
        int[] iArr = jVar.b;
        int i14 = 0;
        while (true) {
            fArr = this.f;
            if (i14 >= 8) {
                break;
            }
            iArr[i14] = Math.round(fArr[i14] * 4.0f);
            i14++;
        }
        gVar.getClass();
        float f14 = gVar.e;
        double radians = Math.toRadians(0.0f);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        if (i10 == 2) {
            jVar.d = 0.0f;
            jVar.c = 0.0f;
            jVar.l = Math.round(16.0f * f14);
            jVar.m = 0;
            jVar.n = Math.round(1000.0f);
            jVar.o = Math.round(1000.0f);
            jVar.p = Math.round(1000.0f);
            jVar.q = 0;
        } else {
            float f15 = i10 == 0 ? gVar.a : -gVar.c;
            jVar.c = Math.round((sin * f15) * 8.0f) / 8.0f;
            jVar.d = Math.round((cos * f15) * 8.0f) / 8.0f;
            jVar.q = 0;
            jVar.p = 0;
            jVar.o = 0;
            jVar.n = 0;
            jVar.m = 0;
            jVar.l = 0;
        }
        float abs = Math.abs(jVar.c);
        float abs2 = Math.abs(jVar.d);
        jVar.e = ((int) Math.ceil(Math.max(fArr[0], fArr[6]) + abs)) + 1;
        jVar.g = ((int) Math.ceil(Math.max(fArr[2], fArr[4]) + abs)) + 1;
        jVar.f = ((int) Math.ceil(Math.max(fArr[1], fArr[3]) + abs2)) + 1;
        int ceil = ((int) Math.ceil(Math.max(fArr[5], fArr[7]) + abs2)) + 1;
        int i15 = jVar.e + jVar.g + 2;
        boolean z10 = round >= i15;
        jVar.j = z10;
        int i16 = jVar.f + ceil + 2;
        boolean z11 = round2 >= i16;
        jVar.k = z11;
        if (z10) {
            round = i15;
        }
        jVar.h = round;
        if (z11) {
            round2 = i16;
        }
        jVar.i = round2;
        long a2 = j.a(jVar.a, -3750763034362895579L);
        for (int i17 : iArr) {
            a2 = j.a(i17, a2);
        }
        long a10 = j.a(jVar.q, j.a(jVar.p, j.a(jVar.o, j.a(jVar.n, j.a(jVar.m, j.a(jVar.l, j.a(jVar.k ? -1 : jVar.i, j.a(jVar.j ? -1 : jVar.h, j.a(Float.floatToIntBits(jVar.d), j.a(Float.floatToIntBits(jVar.c), a2))))))))));
        i[] iVarArr = this.b;
        i iVar = iVarArr[i10];
        long[] jArr = this.a;
        if (iVar == null || jArr[i10] != a10) {
            Long valueOf = Long.valueOf(a10);
            h hVar = h;
            iVar = (i) hVar.get(valueOf);
            if (iVar == null) {
                int ceil2 = i10 == 2 ? ((int) Math.ceil(f14)) + 2 : 1;
                int i18 = ceil2 * 2;
                Bitmap createBitmap = Bitmap.createBitmap(jVar.h + i18, jVar.i + i18, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f16 = ceil2;
                RectF rectF = new RectF(f16, f16, jVar.h + ceil2, jVar.i + ceil2);
                float[] fArr2 = new float[8];
                int i19 = 0;
                for (int i20 = 8; i19 < i20; i20 = 8) {
                    fArr2[i19] = iArr[i19] / 4.0f;
                    i19++;
                    hVar = hVar;
                }
                h hVar2 = hVar;
                Paint paint = new Paint(1);
                paint.setColor(-1);
                if (i10 == 2) {
                    RectF rectF2 = new RectF(rectF);
                    float f17 = (-f14) / 2.0f;
                    rectF2.inset(f17, f17);
                    float[] fArr3 = new float[8];
                    for (int i21 = 0; i21 < 8; i21++) {
                        float f18 = fArr2[i21];
                        fArr3[i21] = f18 > 0.0f ? (f14 / 2.0f) + f18 : 0.0f;
                    }
                    Path path = new Path();
                    path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(f14);
                    paint.setAlpha(Math.round(Math.min(1.0f, 1.0f) * 255.0f));
                    canvas2.drawPath(path, paint);
                } else {
                    Path path2 = new Path();
                    Path.Direction direction = Path.Direction.CW;
                    path2.addRoundRect(rectF, fArr2, direction);
                    Path path3 = new Path();
                    float f19 = rectF.left;
                    float f20 = jVar.c;
                    float f21 = f19 + f20;
                    float f22 = rectF.top;
                    float f23 = jVar.d;
                    path3.addRoundRect(f21, f22 + f23, rectF.right + f20, rectF.bottom + f23, fArr2, direction);
                    canvas2.save();
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas2.clipOutPath(path3);
                    } else {
                        canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    }
                    canvas2.drawPath(path2, paint);
                    canvas2.restore();
                }
                createBitmap.prepareToDraw();
                boolean z12 = jVar.j;
                if (z12) {
                    i13 = jVar.e + ceil2;
                    i12 = 2;
                } else {
                    i12 = 2;
                    i13 = (jVar.h / 2) + ceil2;
                }
                int i22 = i13;
                boolean z13 = jVar.k;
                int i23 = z13 ? jVar.f + ceil2 : (jVar.i / 2) + ceil2;
                i iVar2 = new i(new NinePatch(createBitmap, k9.c(i22, i22 + (z12 ? i12 : 1), i23, i23 + (z13 ? i12 : 1), 0, 0, 0, 0, 1).array(), null), ceil2, createBitmap.getByteCount());
                hVar2.put(Long.valueOf(a10), iVar2);
                iVar = iVar2;
            }
            jArr[i10] = a10;
            iVarArr[i10] = iVar;
        }
        int i24 = iVar.b;
        int i25 = i11 | (-16777216);
        PorterDuffColorFilter[] porterDuffColorFilterArr = this.d;
        PorterDuffColorFilter porterDuffColorFilter = porterDuffColorFilterArr[i10];
        int[] iArr2 = this.c;
        if (porterDuffColorFilter == null || iArr2[i10] != i25) {
            iArr2[i10] = i25;
            porterDuffColorFilterArr[i10] = new PorterDuffColorFilter(i25, PorterDuff.Mode.SRC_IN);
        }
        PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilterArr[i10];
        Paint paint2 = this.e;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setAlpha(Math.round(Math.min(1.0f, f13) * Color.alpha(i11)));
        int round3 = Math.round(f7) - i24;
        int round4 = Math.round(f10) - i24;
        int round5 = Math.round(f11) + i24;
        int round6 = Math.round(f12) + i24;
        Rect rect = this.g;
        rect.set(round3, round4, round5, round6);
        iVar.a.draw(canvas, rect, paint2);
    }
}
