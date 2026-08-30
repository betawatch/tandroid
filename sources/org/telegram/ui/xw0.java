package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xw0 implements u60, tg.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xw0(int i10, Object obj, boolean z4) {
        this.c = obj;
        this.a = i10;
        this.b = z4;
    }

    @Override // tg.e
    public void a(Canvas canvas, RectF rectF, float[] fArr) {
        Paint paint;
        Path.Direction direction;
        float f10;
        pg.b bVar = (pg.b) this.c;
        float[] fArr2 = pg.b.C;
        pg.a aVar = bVar.h;
        Path path = new Path();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction2);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.a);
        float f11 = bVar.l;
        if (f11 > 0.0f) {
            paint2.setShadowLayer(f11, 0.0f, bVar.m, bVar.d);
        }
        canvas.drawPath(path, paint2);
        if (bVar.l > 0.0f) {
            paint2.clearShadowLayer();
            canvas.drawPath(path, paint2);
        }
        if (this.b) {
            float[] copyOf = Arrays.copyOf(aVar.b, 8);
            boolean c3 = lf.l0.c(copyOf);
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            Paint paint3 = new Paint(1);
            if (Color.alpha(bVar.f) <= 0 || copyOf[0] <= 0.0f) {
                paint = paint3;
                direction = direction2;
                f10 = 0.0f;
            } else {
                Arrays.fill(fArr2, 0.0f);
                fArr2[0] = copyOf[0];
                fArr2[1] = copyOf[1];
                fArr2[2] = copyOf[2];
                fArr2[3] = copyOf[3];
                if (c3 && copyOf[0] > min) {
                    fArr2[3] = min;
                    fArr2[2] = min;
                    fArr2[1] = min;
                    fArr2[0] = min;
                }
                Path path2 = new Path();
                float f12 = rectF.left;
                float f13 = rectF.top;
                f10 = 0.0f;
                paint = paint3;
                path2.addRoundRect(f12, f13, rectF.right, Math.min(Math.max(copyOf[0], copyOf[2]) + f13, rectF.bottom), fArr2, direction2);
                direction = direction2;
                float f14 = rectF.left;
                float f15 = rectF.top;
                path2.addRoundRect(f14, aVar.i + f15, rectF.right, Math.min(Math.max(copyOf[0], copyOf[2]) + f15, rectF.bottom), fArr2, Path.Direction.CCW);
                paint.setColor(bVar.f);
                canvas.drawPath(path2, paint);
            }
            if (Color.alpha(bVar.g) <= 0 || copyOf[4] <= f10) {
                return;
            }
            Arrays.fill(fArr2, 0.0f);
            fArr2[4] = copyOf[4];
            fArr2[5] = copyOf[5];
            fArr2[6] = copyOf[6];
            fArr2[7] = copyOf[7];
            if (c3 && copyOf[0] > min) {
                fArr2[7] = min;
                fArr2[6] = min;
                fArr2[5] = min;
                fArr2[4] = min;
            }
            Path path3 = new Path();
            path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(copyOf[4], copyOf[6]), rectF.top), rectF.right, rectF.bottom, fArr2, direction);
            path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(copyOf[4], copyOf[6]), rectF.top), rectF.right, rectF.bottom - aVar.j, fArr2, Path.Direction.CCW);
            paint.setColor(bVar.g);
            canvas.drawPath(path3, paint);
        }
    }

    @Override // org.telegram.ui.u60
    public void b(ArrayList arrayList, boolean z4, boolean z10) {
        PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.c;
        boolean[] zArr = privacyControlActivity.B;
        int i10 = privacyControlActivity.Q;
        int i11 = this.a;
        boolean z11 = this.b;
        int i12 = 0;
        if (i11 == i10) {
            privacyControlActivity.E = arrayList;
            zArr[privacyControlActivity.F] = z11 && z10;
            while (i12 < privacyControlActivity.E.size()) {
                privacyControlActivity.D.remove(privacyControlActivity.E.get(i12));
                i12++;
            }
        } else {
            boolean[] zArr2 = privacyControlActivity.y;
            int i13 = privacyControlActivity.F;
            zArr2[i13 == 2 ? (char) 0 : (char) 1] = z4;
            zArr[i13] = z11 && z10;
            privacyControlActivity.D = arrayList;
            while (i12 < privacyControlActivity.D.size()) {
                privacyControlActivity.E.remove(privacyControlActivity.D.get(i12));
                i12++;
            }
        }
        privacyControlActivity.E0();
        privacyControlActivity.a.l();
    }
}
