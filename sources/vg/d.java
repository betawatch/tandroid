package vg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;
import w7.k8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d extends k8 {
    public final float a = i0.N(0.55f);
    public final Outline b = new Outline();
    public final Rect c = new Rect();
    public final RenderNode d;
    public final RenderNode e;
    public final Paint f;
    public tg.g g;
    public boolean h;
    public final /* synthetic */ f i;

    public d(f fVar) {
        this.i = fVar;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = true;
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        paint.setColor(0);
    }

    @Override // w7.k8
    public final void a() {
        this.d.discardDisplayList();
        this.e.discardDisplayList();
        this.h = true;
    }

    @Override // w7.k8
    public final void b(Canvas canvas, hi.a aVar) {
        f fVar = this.i;
        e eVar = fVar.M;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int r12 = t6.r1(this.d.getAlpha() * fVar.R, fVar.r);
        int alpha = Color.alpha(r12);
        Paint paint = this.f;
        if (alpha != 0) {
            paint.setShadowLayer(fVar.P, 0.0f, fVar.Q, r12);
            eVar.c(canvas, paint, fVar.O);
        }
        int r13 = t6.r1(this.d.getAlpha() * fVar.R, fVar.y);
        if (Color.alpha(r13) != 0) {
            paint.setShadowLayer(this.a, 0.0f, 0.0f, r13);
            eVar.c(canvas, paint, fVar.O);
        }
        Rect rect = eVar.m;
        canvas.save();
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        f fVar = this.i;
        Rect rect = fVar.M.m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.c;
        rect2.set(0, 0, width, height);
        float[] fArr = fVar.M.b;
        Outline outline = this.b;
        f.l(outline, rect2, fArr);
        outline.setAlpha(1.0f);
        if (rect.isEmpty()) {
            return;
        }
        this.e.setPosition(0, 0, rect.width(), rect.height());
        this.d.setPosition(0, 0, rect.width(), rect.height());
        this.d.setOutline(outline);
        this.h = true;
    }

    public final void e() {
        this.h = false;
        f fVar = this.i;
        e eVar = fVar.M;
        Rect rect = eVar.m;
        float f7 = rect.left;
        float f10 = fVar.d;
        float f11 = f7 + f10;
        float f12 = rect.top;
        float f13 = fVar.e;
        float f14 = f12 + f13;
        float f15 = rect.right + f10;
        float f16 = rect.bottom + f13;
        RecordingCanvas beginRecording = this.e.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f11, -f14);
        if (this.g != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = eVar.f;
            if (i10 <= 0) {
                i10 = i0.L(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect.width(), rect.height()) / 5), 1);
            tg.g gVar = this.g;
            float width = rect.width();
            float height = rect.height();
            float[] fArr = eVar.c;
            gVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, eVar.g, eVar.h, fVar.s);
        }
        fVar.f.e(beginRecording, f11, f14, f15, f16);
        beginRecording.restore();
        this.e.endRecording();
        RecordingCanvas beginRecording2 = this.d.beginRecording();
        if (Color.alpha(fVar.s) == 255) {
            beginRecording2.drawColor(fVar.s);
        } else {
            beginRecording2.drawRenderNode(this.e);
            if (this.g == null && Color.alpha(fVar.s) != 0) {
                beginRecording2.drawColor(fVar.s);
            }
        }
        this.d.endRecording();
    }

    public final void f(float f7) {
        this.d.setAlpha(f7);
    }

    public final void g(boolean z10) {
        this.d.setClipToOutline(z10);
    }

    public final void h(boolean z10) {
        if (z10 == (this.g != null) || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (z10) {
            this.g = new tg.g(this.e);
        } else {
            this.g = null;
            this.e.setRenderEffect(null);
        }
        this.h = true;
    }
}
