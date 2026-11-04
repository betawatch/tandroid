package qi;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import v7.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class d extends q {
    public final RenderNode b = new RenderNode("glass-fade-content");
    public final RenderNode c = new RenderNode("glass-fade-overlay");
    public final Paint d;
    public final Paint e;
    public final Matrix f;
    public LinearGradient g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ f k;

    public d(f fVar) {
        BlendMode blendMode;
        this.k = fVar;
        Paint paint = new Paint();
        this.d = paint;
        this.e = new Paint(1);
        this.f = new Matrix();
        this.h = -1;
        this.i = -1;
        blendMode = BlendMode.DST_IN;
        paint.setBlendMode(blendMode);
    }

    @Override // v7.q
    public final void a(Rect rect, RectF rectF) {
        float f10;
        float f11;
        int i3;
        int i10;
        int i11;
        f fVar = this.k;
        a aVar = fVar.h;
        int i12 = (aVar == null || !aVar.g() || aVar.e() <= 0) ? 0 : 1;
        int e10 = i12 != 0 ? aVar.e() : 1;
        float l10 = i12 != 0 ? f.l(rectF.left, aVar.f(), e10) - (i12 * e10) : rectF.left;
        float l11 = i12 != 0 ? f.l(rectF.top, aVar.a(), e10) - (i12 * e10) : rectF.top;
        float f12 = l10 - rectF.left;
        float f13 = l11 - rectF.top;
        float f14 = e10;
        int ceil = ((int) Math.ceil((rectF.right - l10) / f14)) + i12;
        int ceil2 = ((int) Math.ceil((rectF.bottom - l11) / f14)) + i12;
        int ceil3 = (int) Math.ceil(rect.width() / f14);
        int ceil4 = (int) Math.ceil(rect.height() / f14);
        boolean z10 = fVar.w;
        Paint paint = this.d;
        if (!z10 && this.h == rect.width() && this.i == rect.height() && this.j == e10) {
            f11 = l11;
            i11 = i12;
            f10 = l10;
            i10 = ceil;
            i3 = ceil2;
        } else {
            int i13 = fVar.y;
            float height = (i13 == 1 || i13 == 4) ? rect.height() : rect.width();
            g gVar = fVar.E;
            gVar.getClass();
            float f15 = 0;
            f10 = l10;
            f11 = l11;
            i3 = ceil2;
            i10 = ceil;
            i11 = i12;
            LinearGradient k10 = f.k(fVar, gVar, height, f15, -1, e10);
            this.g = k10;
            paint.setShader(k10);
            g gVar2 = fVar.F;
            gVar2.getClass();
            LinearGradient k11 = f.k(fVar, gVar2, height, f15, fVar.I, e10);
            this.c.setPosition(0, 0, ceil3, ceil4);
            this.c.setPivotX(0.0f);
            this.c.setPivotY(0.0f);
            this.c.setScaleX(f14);
            this.c.setScaleY(f14);
            Paint paint2 = this.e;
            paint2.setShader(k11);
            this.c.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint2);
            this.c.endRecording();
            paint2.setShader(null);
            this.h = rect.width();
            this.i = rect.height();
            this.j = e10;
        }
        Matrix matrix = this.f;
        matrix.setTranslate((-f12) / f14, (-f13) / f14);
        this.g.setLocalMatrix(matrix);
        this.b.setPosition(0, 0, i10, i3);
        this.b.setPivotX(0.0f);
        this.b.setPivotY(0.0f);
        this.b.setScaleX(f14);
        this.b.setScaleY(f14);
        this.b.setTranslationX(f12);
        this.b.setTranslationY(f13);
        RecordingCanvas beginRecording = this.b.beginRecording();
        float f16 = i10;
        float f17 = i3;
        beginRecording.saveLayer(0.0f, 0.0f, f16, f17, null);
        beginRecording.drawColor((fVar.I & 16777215) | (-16777216));
        if (i11 != 0) {
            fVar.h.c(f10, f11, e10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f.l(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        beginRecording.drawRect(0.0f, 0.0f, f16, f17, paint);
        beginRecording.restore();
        this.b.endRecording();
        fVar.w = false;
    }

    @Override // v7.q
    public final void b() {
        this.b.discardDisplayList();
        this.c.discardDisplayList();
        this.h = -1;
    }

    @Override // v7.q
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.b);
        canvas.drawRenderNode(this.c);
    }

    @Override // v7.q
    public final boolean d() {
        return this.b.hasDisplayList() && this.c.hasDisplayList();
    }

    @Override // v7.q
    public final void e(float f10) {
        this.b.setAlpha(f10);
        this.c.setAlpha(f10);
    }
}
