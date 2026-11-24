// default package

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class uw4 extends xie {
    public final RenderNode a = new RenderNode("glass-fade-content");
    public final RenderNode b = new RenderNode("glass-fade-overlay");
    public final Paint c;
    public final Paint d;
    public final Matrix e;
    public LinearGradient f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ ww4 j;

    public uw4(ww4 ww4Var) {
        BlendMode blendMode;
        this.j = ww4Var;
        Paint paint = new Paint();
        this.c = paint;
        this.d = new Paint(1);
        this.e = new Matrix();
        this.g = -1;
        this.h = -1;
        blendMode = BlendMode.DST_IN;
        paint.setBlendMode(blendMode);
    }

    @Override // xie
    public final void a(Rect rect, RectF rectF) {
        float f;
        float f2;
        int i;
        int i2;
        float f3;
        int i3;
        int i4;
        float f4;
        float f5;
        ww4 ww4Var = this.j;
        rw4 rw4Var = ww4Var.h;
        int i5 = (rw4Var == null || !rw4Var.h() || rw4Var.f() <= 0) ? 0 : 1;
        if (i5 != 0) {
            int f6 = rw4Var.f();
            float f7 = i5 * f6;
            f = ww4.k(rectF.left, rw4Var.g(), f6) - f7;
            f2 = ww4.k(rectF.top, rw4Var.a(), f6) - f7;
            i = f6;
        } else {
            f = rectF.left;
            f2 = rectF.top;
            i = 1;
        }
        float f8 = f - rectF.left;
        float f9 = f2 - rectF.top;
        float f10 = i;
        int ceil = ((int) Math.ceil((rectF.right - f) / f10)) + i5;
        int ceil2 = ((int) Math.ceil((rectF.bottom - f2) / f10)) + i5;
        int ceil3 = (int) Math.ceil(rect.width() / f10);
        int ceil4 = (int) Math.ceil(rect.height() / f10);
        boolean z = ww4Var.w;
        Paint paint = this.c;
        if (!z && this.g == rect.width() && this.h == rect.height() && this.i == i) {
            f3 = f2;
            i2 = i5;
            f4 = f;
            i4 = ceil;
            i3 = ceil2;
            f5 = 0.0f;
        } else {
            int i6 = ww4Var.y;
            float height = (i6 == 1 || i6 == 4) ? rect.height() : rect.width();
            xw4 xw4Var = ww4Var.E;
            xw4Var.getClass();
            i2 = i5;
            f3 = f2;
            i3 = ceil2;
            i4 = ceil;
            f4 = f;
            f5 = 0.0f;
            LinearGradient l = ww4Var.l(xw4Var, height, 0.0f, -1, i);
            this.f = l;
            paint.setShader(l);
            xw4 xw4Var2 = ww4Var.F;
            xw4Var2.getClass();
            LinearGradient l2 = ww4Var.l(xw4Var2, height, 0.0f, ww4Var.I, i);
            this.b.setPosition(0, 0, ceil3, ceil4);
            this.b.setPivotX(0.0f);
            this.b.setPivotY(0.0f);
            this.b.setScaleX(f10);
            this.b.setScaleY(f10);
            Paint paint2 = this.d;
            paint2.setShader(l2);
            this.b.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint2);
            this.b.endRecording();
            paint2.setShader(null);
            this.g = rect.width();
            this.h = rect.height();
            this.i = i;
        }
        Matrix matrix = this.e;
        matrix.setTranslate((-f8) / f10, (-f9) / f10);
        this.f.setLocalMatrix(matrix);
        this.a.setPosition(0, 0, i4, i3);
        this.a.setPivotX(f5);
        this.a.setPivotY(f5);
        this.a.setScaleX(f10);
        this.a.setScaleY(f10);
        this.a.setTranslationX(f8);
        this.a.setTranslationY(f9);
        RecordingCanvas beginRecording = this.a.beginRecording();
        float f11 = i4;
        float f12 = i3;
        beginRecording.saveLayer(0.0f, 0.0f, f11, f12, null);
        beginRecording.drawColor((ww4Var.I & 16777215) | (-16777216));
        if (i2 != 0) {
            ww4Var.h.d(f4, f3, i, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            ww4Var.f.e(rectF.left, rectF.top, rectF.right, rectF.bottom, beginRecording);
            beginRecording.restore();
        }
        beginRecording.drawRect(0.0f, 0.0f, f11, f12, paint);
        beginRecording.restore();
        this.a.endRecording();
        ww4Var.w = false;
    }

    @Override // xie
    public final void b() {
        this.a.discardDisplayList();
        this.b.discardDisplayList();
        this.g = -1;
    }

    @Override // xie
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
        canvas.drawRenderNode(this.b);
    }

    @Override // xie
    public final boolean d() {
        return this.a.hasDisplayList() && this.b.hasDisplayList();
    }

    @Override // xie
    public final void e(float f) {
        this.a.setAlpha(f);
        this.b.setAlpha(f);
    }
}
