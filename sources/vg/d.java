package vg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;
import w7.k8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
    public final RectF i;
    public final /* synthetic */ f j;

    public d(f fVar) {
        this.j = fVar;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = true;
        this.i = new RectF();
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
        f fVar = this.j;
        e eVar = fVar.P;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int r12 = t6.r1(this.d.getAlpha() * fVar.U, fVar.x);
        int alpha = Color.alpha(r12);
        Paint paint = this.f;
        if (alpha != 0) {
            paint.setShadowLayer(fVar.S, 0.0f, fVar.T, r12);
            eVar.c(canvas, paint, fVar.R);
        }
        int r13 = t6.r1(this.d.getAlpha() * fVar.U, fVar.F);
        if (Color.alpha(r13) != 0) {
            paint.setShadowLayer(this.a, 0.0f, 0.0f, r13);
            eVar.c(canvas, paint, fVar.R);
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
        f fVar = this.j;
        Rect rect = fVar.P.m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.c;
        rect2.set(0, 0, width, height);
        float[] fArr = fVar.P.b;
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        int i10;
        f fVar;
        int i11;
        float f7;
        float f10;
        float f11;
        int i12;
        f fVar2;
        this.h = false;
        f fVar3 = this.j;
        e eVar = fVar3.P;
        Rect rect = eVar.m;
        float f12 = rect.left;
        float f13 = fVar3.d;
        float f14 = f12 + f13;
        float f15 = rect.top;
        float f16 = fVar3.e;
        float f17 = f15 + f16;
        float f18 = rect.right + f13;
        float f19 = rect.bottom + f16;
        if (this.g != null && Build.VERSION.SDK_INT >= 33) {
            hi.a aVar = fVar3.r;
            if (aVar instanceof fi.a) {
                fi.a aVar2 = (fi.a) aVar;
                if (aVar2.h()) {
                    i10 = Math.max(aVar2.f(), 1);
                    if (i10 <= 1) {
                        fi.a aVar3 = (fi.a) fVar3.r;
                        float f20 = i10;
                        float l4 = fi.g.l(f14, aVar3.g(), i10) - f20;
                        f10 = fi.g.l(f17, aVar3.a(), i10) - f20;
                        i11 = 1;
                        fVar = fVar3;
                        this.e.setPosition(0, 0, ((int) Math.ceil((f18 - l4) / f20)) + 1, ((int) Math.ceil((f19 - f10) / f20)) + 1);
                        f7 = l4;
                    } else {
                        fVar = fVar3;
                        i11 = 1;
                        this.e.setPosition(0, 0, rect.width(), rect.height());
                        f7 = f14;
                        f10 = f17;
                    }
                    this.e.setPivotX(0.0f);
                    this.e.setPivotY(0.0f);
                    float f21 = i10;
                    this.e.setScaleX(f21);
                    this.e.setScaleY(f21);
                    float f22 = f7 - f14;
                    this.e.setTranslationX(f22);
                    float f23 = f10 - f17;
                    this.e.setTranslationY(f23);
                    if (this.g != null || Build.VERSION.SDK_INT < 33) {
                        f11 = f7;
                        i12 = i10;
                        fVar2 = fVar;
                    } else {
                        int i13 = eVar.f;
                        if (i13 <= 0) {
                            i13 = i0.L(11.0f);
                        }
                        int max = Math.max(Math.min(i13, Math.min(rect.width(), rect.height()) / 5), i11);
                        tg.g gVar = this.g;
                        float width = rect.width();
                        float height = rect.height();
                        float[] fArr = eVar.c;
                        f11 = f7;
                        fVar2 = fVar;
                        int i14 = i10;
                        gVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, eVar.g, eVar.h, fVar2.y, f22, f23, i14);
                        i12 = i14;
                    }
                    RecordingCanvas beginRecording = this.e.beginRecording();
                    if (i12 <= 1) {
                        RectF rectF = this.i;
                        rectF.set(f14, f17, f18, f19);
                        ((fi.a) fVar2.r).d(f11, f10, i12, beginRecording, rectF);
                    } else {
                        beginRecording.save();
                        beginRecording.translate(-f14, -f17);
                        fVar2.r.e(beginRecording, f14, f17, f18, f19);
                        beginRecording.restore();
                    }
                    this.e.endRecording();
                    RecordingCanvas beginRecording2 = this.d.beginRecording();
                    if (Color.alpha(fVar2.y) != 255) {
                        beginRecording2.drawColor(fVar2.y);
                    } else {
                        beginRecording2.drawRenderNode(this.e);
                        if (this.g == null && Color.alpha(fVar2.y) != 0) {
                            beginRecording2.drawColor(fVar2.y);
                        }
                    }
                    this.d.endRecording();
                }
            }
        }
        i10 = 1;
        if (i10 <= 1) {
        }
        this.e.setPivotX(0.0f);
        this.e.setPivotY(0.0f);
        float f212 = i10;
        this.e.setScaleX(f212);
        this.e.setScaleY(f212);
        float f222 = f7 - f14;
        this.e.setTranslationX(f222);
        float f232 = f10 - f17;
        this.e.setTranslationY(f232);
        if (this.g != null) {
        }
        f11 = f7;
        i12 = i10;
        fVar2 = fVar;
        RecordingCanvas beginRecording3 = this.e.beginRecording();
        if (i12 <= 1) {
        }
        this.e.endRecording();
        RecordingCanvas beginRecording22 = this.d.beginRecording();
        if (Color.alpha(fVar2.y) != 255) {
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
