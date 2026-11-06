package pi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import c8.ob;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class b extends ob {
    public final boolean a;
    public final Paint b = new Paint();
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public final /* synthetic */ f g;

    public b(f fVar, boolean z9) {
        this.g = fVar;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.e = -1;
        this.f = -1;
        this.a = z9;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // c8.ob
    public final void b() {
        this.e = -1;
    }

    @Override // c8.ob
    public final void c(Canvas canvas) {
        Paint paint;
        boolean z9;
        boolean z10;
        f fVar;
        float f10;
        float f11;
        f fVar2 = this.g;
        Rect bounds = fVar2.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f12 = width;
        int ceil = (int) Math.ceil(f12 / 5.0f);
        float f13 = height;
        int ceil2 = (int) Math.ceil(f13 / 5.0f);
        boolean z11 = this.a;
        boolean z12 = z11 ? fVar2.w : fVar2.x;
        Paint paint2 = this.c;
        Paint paint3 = this.d;
        if (!z12 && this.e == width && this.f == height) {
            fVar = fVar2;
            paint = paint3;
            z9 = z11;
        } else {
            int i7 = fVar2.y;
            if (i7 != 1 && i7 != 4) {
                f13 = f12;
            }
            if (z11) {
                g gVar = fVar2.D;
                gVar.getClass();
                float f14 = 0;
                paint = paint3;
                z9 = z11;
                z10 = false;
                paint2.setShader(f.k(fVar2, gVar, f13, f14, -1, 5));
                g gVar2 = fVar2.E;
                gVar2.getClass();
                paint.setShader(f.k(fVar2, gVar2, f13, f14, fVar2.H, 5));
                fVar = fVar2;
            } else {
                paint = paint3;
                z9 = z11;
                z10 = false;
                g gVar3 = fVar2.F;
                gVar3.getClass();
                fVar = fVar2;
                paint.setShader(f.k(fVar2, gVar3, f13, 0, fVar2.J, 5));
            }
            this.e = width;
            this.f = height;
            if (z9) {
                fVar.w = z10;
            } else {
                fVar.x = z10;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f15 = ceil;
        float f16 = ceil2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f15, f16, this.b);
        if (z9) {
            canvas.drawColor((fVar.H & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f17 = bounds.left;
            float f18 = fVar.d;
            float f19 = f17 + f18;
            float f20 = bounds.top;
            float f21 = fVar.e;
            float f22 = f20 + f21;
            canvas.translate(-f19, -f22);
            fVar.f.e(canvas, f19, f22, bounds.right + f18, bounds.bottom + f21);
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

    @Override // c8.ob
    public final boolean d() {
        return false;
    }

    @Override // c8.ob
    public final void e(float f10) {
        this.b.setAlpha(Math.round(f10 * 255.0f));
    }

    @Override // c8.ob
    public final void a(Rect rect, RectF rectF) {
    }
}
