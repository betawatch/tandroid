package qi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import v7.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class b extends q {
    public final boolean b;
    public final Paint c = new Paint();
    public final Paint d;
    public final Paint e;
    public int f;
    public int g;
    public final /* synthetic */ f h;

    public b(f fVar, boolean z10) {
        this.h = fVar;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Paint(1);
        this.f = -1;
        this.g = -1;
        this.b = z10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // v7.q
    public final void b() {
        this.f = -1;
    }

    @Override // v7.q
    public final void c(Canvas canvas) {
        Paint paint;
        boolean z10;
        boolean z11;
        f fVar;
        float f10;
        float f11;
        f fVar2 = this.h;
        Rect bounds = fVar2.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f12 = width;
        int ceil = (int) Math.ceil(f12 / 5.0f);
        float f13 = height;
        int ceil2 = (int) Math.ceil(f13 / 5.0f);
        boolean z12 = this.b;
        boolean z13 = z12 ? fVar2.w : fVar2.x;
        Paint paint2 = this.d;
        Paint paint3 = this.e;
        if (!z13 && this.f == width && this.g == height) {
            fVar = fVar2;
            paint = paint3;
            z10 = z12;
        } else {
            int i3 = fVar2.y;
            if (i3 != 1 && i3 != 4) {
                f13 = f12;
            }
            if (z12) {
                g gVar = fVar2.E;
                gVar.getClass();
                float f14 = 0;
                paint = paint3;
                z10 = z12;
                z11 = false;
                paint2.setShader(f.k(fVar2, gVar, f13, f14, -1, 5));
                g gVar2 = fVar2.F;
                gVar2.getClass();
                paint.setShader(f.k(fVar2, gVar2, f13, f14, fVar2.I, 5));
                fVar = fVar2;
            } else {
                paint = paint3;
                z10 = z12;
                z11 = false;
                g gVar3 = fVar2.G;
                gVar3.getClass();
                fVar = fVar2;
                paint.setShader(f.k(fVar2, gVar3, f13, 0, fVar2.K, 5));
            }
            this.f = width;
            this.g = height;
            if (z10) {
                fVar.w = z11;
            } else {
                fVar.x = z11;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f15 = ceil;
        float f16 = ceil2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f15, f16, this.c);
        if (z10) {
            canvas.drawColor((fVar.I & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f17 = bounds.left;
            float f18 = fVar.d;
            float f19 = f17 + f18;
            float f20 = bounds.top;
            float f21 = fVar.e;
            float f22 = f20 + f21;
            canvas.translate(-f19, -f22);
            fVar.f.l(canvas, f19, f22, bounds.right + f18, bounds.bottom + f21);
            canvas.restore();
            f10 = f15;
            f11 = f16;
            canvas.drawRect(0.0f, 0.0f, f10, f11, paint2);
        } else {
            f10 = f15;
            f11 = f16;
        }
        canvas.drawRect(0.0f, 0.0f, f10, f11, paint);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
    }

    @Override // v7.q
    public final boolean d() {
        return false;
    }

    @Override // v7.q
    public final void e(float f10) {
        this.c.setAlpha(Math.round(f10 * 255.0f));
    }

    @Override // v7.q
    public final void a(Rect rect, RectF rectF) {
    }
}
