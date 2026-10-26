package pi;

import a8.lf;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class a extends lf {
    public final boolean a;
    public final Paint b = new Paint();
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public final /* synthetic */ e g;

    public a(e eVar, boolean z10) {
        this.g = eVar;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.e = -1;
        this.f = -1;
        this.a = z10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // a8.lf
    public final void b() {
        this.e = -1;
    }

    @Override // a8.lf
    public final void c(Canvas canvas) {
        Paint paint;
        boolean z10;
        boolean z11;
        e eVar;
        float f7;
        float f10;
        e eVar2 = this.g;
        Rect bounds = eVar2.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f11 = width;
        int ceil = (int) Math.ceil(f11 / 5.0f);
        float f12 = height;
        int ceil2 = (int) Math.ceil(f12 / 5.0f);
        boolean z12 = this.a;
        boolean z13 = z12 ? eVar2.s : eVar2.v;
        Paint paint2 = this.c;
        Paint paint3 = this.d;
        if (!z13 && this.e == width && this.f == height) {
            eVar = eVar2;
            paint = paint3;
            z10 = z12;
        } else {
            int i10 = eVar2.w;
            if (i10 != 1 && i10 != 4) {
                f12 = f11;
            }
            if (z12) {
                f fVar = eVar2.x;
                fVar.getClass();
                float f13 = 0;
                paint = paint3;
                z10 = z12;
                z11 = false;
                paint2.setShader(e.l(eVar2, fVar, f12, f13, -1, 5));
                f fVar2 = eVar2.y;
                fVar2.getClass();
                paint.setShader(e.l(eVar2, fVar2, f12, f13, eVar2.G, 5));
                eVar = eVar2;
            } else {
                paint = paint3;
                z10 = z12;
                z11 = false;
                f fVar3 = eVar2.E;
                fVar3.getClass();
                eVar = eVar2;
                paint.setShader(e.l(eVar2, fVar3, f12, 0, eVar2.I, 5));
            }
            this.e = width;
            this.f = height;
            if (z10) {
                eVar.s = z11;
            } else {
                eVar.v = z11;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f14 = ceil;
        float f15 = ceil2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f14, f15, this.b);
        if (z10) {
            canvas.drawColor((eVar.G & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f16 = bounds.left;
            float f17 = eVar.c;
            float f18 = f16 + f17;
            float f19 = bounds.top;
            float f20 = eVar.d;
            float f21 = f19 + f20;
            canvas.translate(-f18, -f21);
            eVar.e.w(canvas, f18, f21, bounds.right + f17, bounds.bottom + f20);
            canvas.restore();
            f7 = f14;
            f10 = f15;
            canvas.drawRect(0.0f, 0.0f, f7, f10, paint2);
        } else {
            f7 = f14;
            f10 = f15;
        }
        canvas.drawRect(0.0f, 0.0f, f7, f10, paint);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
    }

    @Override // a8.lf
    public final boolean d() {
        return false;
    }

    @Override // a8.lf
    public final void e(float f7) {
        this.b.setAlpha(Math.round(f7 * 255.0f));
    }

    @Override // a8.lf
    public final void a(Rect rect, RectF rectF) {
    }
}
