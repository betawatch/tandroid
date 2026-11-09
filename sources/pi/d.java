package pi;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import c8.ob;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class d extends ob {
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

    @Override // c8.ob
    public final void a(Rect rect, RectF rectF) {
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        f fVar = this.j;
        a aVar = fVar.h;
        int i12 = (aVar == null || !aVar.h() || aVar.f() <= 0) ? 0 : 1;
        int f12 = i12 != 0 ? aVar.f() : 1;
        float l10 = i12 != 0 ? f.l(rectF.left, aVar.g(), f12) - (i12 * f12) : rectF.left;
        float l11 = i12 != 0 ? f.l(rectF.top, aVar.a(), f12) - (i12 * f12) : rectF.top;
        float f13 = l10 - rectF.left;
        float f14 = l11 - rectF.top;
        float f15 = f12;
        int ceil = ((int) Math.ceil((rectF.right - l10) / f15)) + i12;
        int ceil2 = ((int) Math.ceil((rectF.bottom - l11) / f15)) + i12;
        int ceil3 = (int) Math.ceil(rect.width() / f15);
        int ceil4 = (int) Math.ceil(rect.height() / f15);
        boolean z9 = fVar.w;
        Paint paint = this.c;
        if (!z9 && this.g == rect.width() && this.h == rect.height() && this.i == f12) {
            f11 = l11;
            i11 = i12;
            f10 = l10;
            i10 = ceil;
            i7 = ceil2;
        } else {
            int i13 = fVar.y;
            float height = (i13 == 1 || i13 == 4) ? rect.height() : rect.width();
            g gVar = fVar.D;
            gVar.getClass();
            float f16 = 0;
            f10 = l10;
            f11 = l11;
            i7 = ceil2;
            i10 = ceil;
            i11 = i12;
            LinearGradient k10 = f.k(fVar, gVar, height, f16, -1, f12);
            this.f = k10;
            paint.setShader(k10);
            g gVar2 = fVar.E;
            gVar2.getClass();
            LinearGradient k11 = f.k(fVar, gVar2, height, f16, fVar.H, f12);
            this.b.setPosition(0, 0, ceil3, ceil4);
            this.b.setPivotX(0.0f);
            this.b.setPivotY(0.0f);
            this.b.setScaleX(f15);
            this.b.setScaleY(f15);
            Paint paint2 = this.d;
            paint2.setShader(k11);
            this.b.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint2);
            this.b.endRecording();
            paint2.setShader(null);
            this.g = rect.width();
            this.h = rect.height();
            this.i = f12;
        }
        Matrix matrix = this.e;
        matrix.setTranslate((-f13) / f15, (-f14) / f15);
        this.f.setLocalMatrix(matrix);
        this.a.setPosition(0, 0, i10, i7);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f15);
        this.a.setScaleY(f15);
        this.a.setTranslationX(f13);
        this.a.setTranslationY(f14);
        RecordingCanvas beginRecording = this.a.beginRecording();
        float f17 = i10;
        float f18 = i7;
        beginRecording.saveLayer(0.0f, 0.0f, f17, f18, null);
        beginRecording.drawColor((fVar.H & 16777215) | (-16777216));
        if (i11 != 0) {
            fVar.h.d(f10, f11, f12, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f.e(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        beginRecording.drawRect(0.0f, 0.0f, f17, f18, paint);
        beginRecording.restore();
        this.a.endRecording();
        fVar.w = false;
    }

    @Override // c8.ob
    public final void b() {
        this.a.discardDisplayList();
        this.b.discardDisplayList();
        this.g = -1;
    }

    @Override // c8.ob
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
        canvas.drawRenderNode(this.b);
    }

    @Override // c8.ob
    public final boolean d() {
        return this.a.hasDisplayList() && this.b.hasDisplayList();
    }

    @Override // c8.ob
    public final void e(float f10) {
        this.a.setAlpha(f10);
        this.b.setAlpha(f10);
    }
}
