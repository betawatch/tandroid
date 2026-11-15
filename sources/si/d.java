package si;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import c8.hc;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class d extends hc {
    public final RenderNode a = new RenderNode("glass-fade-content");
    public final RenderNode b = new RenderNode("glass-fade-overlay");
    public final Paint c;
    public final Paint d;
    public final Matrix e;
    public LinearGradient f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ f j;

    public d(f fVar) {
        BlendMode blendMode;
        this.j = fVar;
        Paint paint = new Paint();
        this.c = paint;
        this.d = new Paint(1);
        this.e = new Matrix();
        this.g = -1;
        this.h = -1;
        blendMode = BlendMode.DST_IN;
        paint.setBlendMode(blendMode);
    }

    @Override // c8.hc
    public final void a(Rect rect, RectF rectF) {
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        f fVar = this.j;
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
        Paint paint = this.c;
        if (!z10 && this.g == rect.width() && this.h == rect.height() && this.i == e10) {
            f11 = l11;
            i11 = i12;
            f10 = l10;
            i10 = ceil;
            i7 = ceil2;
        } else {
            int i13 = fVar.y;
            float height = (i13 == 1 || i13 == 4) ? rect.height() : rect.width();
            g gVar = fVar.E;
            gVar.getClass();
            float f15 = 0;
            f10 = l10;
            f11 = l11;
            i7 = ceil2;
            i10 = ceil;
            i11 = i12;
            LinearGradient k10 = f.k(fVar, gVar, height, f15, -1, e10);
            this.f = k10;
            paint.setShader(k10);
            g gVar2 = fVar.F;
            gVar2.getClass();
            LinearGradient k11 = f.k(fVar, gVar2, height, f15, fVar.I, e10);
            this.b.setPosition(0, 0, ceil3, ceil4);
            this.b.setPivotX(0.0f);
            this.b.setPivotY(0.0f);
            this.b.setScaleX(f14);
            this.b.setScaleY(f14);
            Paint paint2 = this.d;
            paint2.setShader(k11);
            this.b.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint2);
            this.b.endRecording();
            paint2.setShader(null);
            this.g = rect.width();
            this.h = rect.height();
            this.i = e10;
        }
        Matrix matrix = this.e;
        matrix.setTranslate((-f12) / f14, (-f13) / f14);
        this.f.setLocalMatrix(matrix);
        this.a.setPosition(0, 0, i10, i7);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f14);
        this.a.setScaleY(f14);
        this.a.setTranslationX(f12);
        this.a.setTranslationY(f13);
        RecordingCanvas beginRecording = this.a.beginRecording();
        float f16 = i10;
        float f17 = i7;
        beginRecording.saveLayer(0.0f, 0.0f, f16, f17, null);
        beginRecording.drawColor((fVar.I & 16777215) | (-16777216));
        if (i11 != 0) {
            fVar.h.d(f10, f11, e10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f.b0(rectF.left, rectF.top, rectF.right, rectF.bottom, beginRecording);
            beginRecording.restore();
        }
        beginRecording.drawRect(0.0f, 0.0f, f16, f17, paint);
        beginRecording.restore();
        this.a.endRecording();
        fVar.w = false;
    }

    @Override // c8.hc
    public final void b() {
        this.a.discardDisplayList();
        this.b.discardDisplayList();
        this.g = -1;
    }

    @Override // c8.hc
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
        canvas.drawRenderNode(this.b);
    }

    @Override // c8.hc
    public final boolean d() {
        return this.a.hasDisplayList() && this.b.hasDisplayList();
    }

    @Override // c8.hc
    public final void e(float f10) {
        this.a.setAlpha(f10);
        this.b.setAlpha(f10);
    }
}
