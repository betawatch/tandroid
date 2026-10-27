package pi;

import a8.lf;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c extends lf {
    public final RenderNode a = new RenderNode("glass-fade-content");
    public final RenderNode b = new RenderNode("glass-fade-overlay");
    public final Paint c;
    public final Paint d;
    public final Matrix e;
    public LinearGradient f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ e j;

    public c(e eVar) {
        BlendMode blendMode;
        this.j = eVar;
        Paint paint = new Paint();
        this.c = paint;
        this.d = new Paint(1);
        this.e = new Matrix();
        this.g = -1;
        this.h = -1;
        blendMode = BlendMode.DST_IN;
        paint.setBlendMode(blendMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // a8.lf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Rect rect, RectF rectF) {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        float f12;
        int ceil;
        int ceil2;
        int i12;
        boolean z10;
        Paint paint;
        int i13;
        float f13;
        oi.c cVar;
        int i14;
        float f14;
        Paint paint2;
        e eVar;
        e eVar2 = this.j;
        oi.c cVar2 = eVar2.f;
        if (cVar2 != null) {
            oi.d dVar = cVar2.b;
            if ((cVar2.a == 3 ? dVar.k : dVar.j) > 0) {
                i10 = 1;
                if (i10 == 0) {
                    oi.d dVar2 = cVar2.b;
                    i11 = cVar2.a == 3 ? dVar2.k : dVar2.j;
                } else {
                    i11 = 1;
                }
                if (i10 == 0) {
                    float f15 = rectF.left;
                    oi.d dVar3 = cVar2.b;
                    f7 = e.k(f15, cVar2.a == 3 ? dVar3.o : dVar3.m, i11) - (i10 * i11);
                } else {
                    f7 = rectF.left;
                }
                f10 = f7;
                if (i10 == 0) {
                    float f16 = rectF.top;
                    oi.d dVar4 = cVar2.b;
                    f11 = e.k(f16, cVar2.a == 3 ? dVar4.p : dVar4.n, i11) - (i10 * i11);
                } else {
                    f11 = rectF.top;
                }
                float f17 = f10 - rectF.left;
                float f18 = f11 - rectF.top;
                f12 = i11;
                ceil = ((int) Math.ceil((rectF.right - f10) / f12)) + i10;
                ceil2 = ((int) Math.ceil((rectF.bottom - f11) / f12)) + i10;
                i12 = i10;
                int ceil3 = (int) Math.ceil(rect.width() / f12);
                float f19 = f11;
                int ceil4 = (int) Math.ceil(rect.height() / f12);
                z10 = eVar2.s;
                paint = this.c;
                if (z10 && this.g == rect.width() && this.h == rect.height() && this.i == i11) {
                    cVar = cVar2;
                    i13 = ceil;
                    f13 = f12;
                    i14 = ceil2;
                    f14 = f10;
                    eVar = eVar2;
                    paint2 = paint;
                } else {
                    int i15 = eVar2.w;
                    float height = (i15 != 1 || i15 == 4) ? rect.height() : rect.width();
                    i13 = ceil;
                    f fVar = eVar2.x;
                    fVar.getClass();
                    float f20 = 0;
                    f13 = f12;
                    cVar = cVar2;
                    i14 = ceil2;
                    f14 = f10;
                    paint2 = paint;
                    LinearGradient l4 = e.l(eVar2, fVar, height, f20, -1, i11);
                    this.f = l4;
                    paint2.setShader(l4);
                    f fVar2 = eVar2.y;
                    fVar2.getClass();
                    LinearGradient l10 = e.l(eVar2, fVar2, height, f20, eVar2.G, i11);
                    eVar = eVar2;
                    this.b.setPosition(0, 0, ceil3, ceil4);
                    this.b.setPivotX(0.0f);
                    this.b.setPivotY(0.0f);
                    this.b.setScaleX(f13);
                    this.b.setScaleY(f13);
                    Paint paint3 = this.d;
                    paint3.setShader(l10);
                    this.b.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint3);
                    this.b.endRecording();
                    paint3.setShader(null);
                    this.g = rect.width();
                    this.h = rect.height();
                    this.i = i11;
                }
                Matrix matrix = this.e;
                matrix.setTranslate((-f17) / f13, (-f18) / f13);
                this.f.setLocalMatrix(matrix);
                this.a.setPosition(0, 0, i13, i14);
                this.a.setPivotX(0.0f);
                this.a.setPivotY(0.0f);
                this.a.setScaleX(f13);
                this.a.setScaleY(f13);
                this.a.setTranslationX(f17);
                this.a.setTranslationY(f18);
                RecordingCanvas beginRecording = this.a.beginRecording();
                float f21 = i13;
                float f22 = i14;
                beginRecording.saveLayer(0.0f, 0.0f, f21, f22, null);
                beginRecording.drawColor((eVar.G & 16777215) | (-16777216));
                if (i12 == 0) {
                    oi.c cVar3 = cVar;
                    oi.d.b(cVar3.b, cVar3.a, beginRecording, rectF, i11, f14, f19);
                } else {
                    beginRecording.save();
                    beginRecording.translate(-rectF.left, -rectF.top);
                    eVar.e.w(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
                    beginRecording.restore();
                }
                beginRecording.drawRect(0.0f, 0.0f, f21, f22, paint2);
                beginRecording.restore();
                this.a.endRecording();
                eVar.s = false;
            }
        }
        i10 = 0;
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        f10 = f7;
        if (i10 == 0) {
        }
        float f172 = f10 - rectF.left;
        float f182 = f11 - rectF.top;
        f12 = i11;
        ceil = ((int) Math.ceil((rectF.right - f10) / f12)) + i10;
        ceil2 = ((int) Math.ceil((rectF.bottom - f11) / f12)) + i10;
        i12 = i10;
        int ceil32 = (int) Math.ceil(rect.width() / f12);
        float f192 = f11;
        int ceil42 = (int) Math.ceil(rect.height() / f12);
        z10 = eVar2.s;
        paint = this.c;
        if (z10) {
        }
        int i152 = eVar2.w;
        float height2 = (i152 != 1 || i152 == 4) ? rect.height() : rect.width();
        i13 = ceil;
        f fVar3 = eVar2.x;
        fVar3.getClass();
        float f202 = 0;
        f13 = f12;
        cVar = cVar2;
        i14 = ceil2;
        f14 = f10;
        paint2 = paint;
        LinearGradient l42 = e.l(eVar2, fVar3, height2, f202, -1, i11);
        this.f = l42;
        paint2.setShader(l42);
        f fVar22 = eVar2.y;
        fVar22.getClass();
        LinearGradient l102 = e.l(eVar2, fVar22, height2, f202, eVar2.G, i11);
        eVar = eVar2;
        this.b.setPosition(0, 0, ceil32, ceil42);
        this.b.setPivotX(0.0f);
        this.b.setPivotY(0.0f);
        this.b.setScaleX(f13);
        this.b.setScaleY(f13);
        Paint paint32 = this.d;
        paint32.setShader(l102);
        this.b.beginRecording().drawRect(0.0f, 0.0f, ceil32, ceil42, paint32);
        this.b.endRecording();
        paint32.setShader(null);
        this.g = rect.width();
        this.h = rect.height();
        this.i = i11;
        Matrix matrix2 = this.e;
        matrix2.setTranslate((-f172) / f13, (-f182) / f13);
        this.f.setLocalMatrix(matrix2);
        this.a.setPosition(0, 0, i13, i14);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f13);
        this.a.setScaleY(f13);
        this.a.setTranslationX(f172);
        this.a.setTranslationY(f182);
        RecordingCanvas beginRecording2 = this.a.beginRecording();
        float f212 = i13;
        float f222 = i14;
        beginRecording2.saveLayer(0.0f, 0.0f, f212, f222, null);
        beginRecording2.drawColor((eVar.G & 16777215) | (-16777216));
        if (i12 == 0) {
        }
        beginRecording2.drawRect(0.0f, 0.0f, f212, f222, paint2);
        beginRecording2.restore();
        this.a.endRecording();
        eVar.s = false;
    }

    @Override // a8.lf
    public final void b() {
        this.a.discardDisplayList();
        this.b.discardDisplayList();
        this.g = -1;
    }

    @Override // a8.lf
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
        canvas.drawRenderNode(this.b);
    }

    @Override // a8.lf
    public final boolean d() {
        return this.a.hasDisplayList() && this.b.hasDisplayList();
    }

    @Override // a8.lf
    public final void e(float f7) {
        this.a.setAlpha(f7);
        this.b.setAlpha(f7);
    }
}
