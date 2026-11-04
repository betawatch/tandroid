package qi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.support.v4.media.session.w;
import java.util.Arrays;
import org.telegram.ui.Components.ma0;
import v7.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class e extends q {
    public final RenderNode b = w.o();
    public final RuntimeShader c = ma0.a();
    public int d = -1;
    public int e = -1;
    public int f;
    public RenderEffect[] g;
    public float[] h;
    public float[] i;
    public final /* synthetic */ f j;

    public e(f fVar) {
        this.j = fVar;
    }

    @Override // v7.q
    public final void a(Rect rect, RectF rectF) {
        float f10;
        a aVar;
        int i3;
        int i10;
        int i11;
        int a10;
        int a11;
        int f11;
        int f12;
        f fVar = this.j;
        a aVar2 = fVar.h;
        int i12 = (aVar2 == null || !aVar2.g() || aVar2.e() <= 0) ? 0 : 1;
        int e10 = i12 != 0 ? aVar2.e() : 1;
        float l10 = i12 != 0 ? f.l(rectF.left, aVar2.f(), e10) - (i12 * e10) : rectF.left;
        float l11 = i12 != 0 ? f.l(rectF.top, aVar2.a(), e10) - (i12 * e10) : rectF.top;
        float f13 = l10 - rectF.left;
        float f14 = l11 - rectF.top;
        float f15 = e10;
        int ceil = ((int) Math.ceil((rectF.right - l10) / f15)) + i12;
        int ceil2 = ((int) Math.ceil((rectF.bottom - l11) / f15)) + i12;
        if (!fVar.w && this.d == rect.width() && this.e == rect.height() && this.f == e10) {
            aVar = aVar2;
            i10 = i12;
            i3 = ceil;
            f10 = f15;
            i11 = ceil2;
        } else {
            int i13 = fVar.y;
            float height = (i13 == 1 || i13 == 4) ? rect.height() : rect.width();
            RuntimeShader runtimeShader = this.c;
            g gVar = fVar.E;
            gVar.getClass();
            float f16 = 0;
            f10 = f15;
            aVar = aVar2;
            i3 = ceil;
            i10 = i12;
            i11 = ceil2;
            runtimeShader.setInputShader("alphaMask", f.k(fVar, gVar, height, f16, -1, e10));
            RuntimeShader runtimeShader2 = this.c;
            g gVar2 = fVar.F;
            gVar2.getClass();
            runtimeShader2.setInputShader("overlay", f.k(fVar, gVar2, height, f16, fVar.I, e10));
            this.c.setFloatUniform("background_color_premultiplied", Color.red(fVar.I) / 255.0f, Color.green(fVar.I) / 255.0f, Color.blue(fVar.I) / 255.0f, 1.0f);
            this.d = rect.width();
            this.e = rect.height();
            this.f = e10;
            int i14 = e10 * e10;
            RenderEffect[] renderEffectArr = this.g;
            if (renderEffectArr == null || renderEffectArr.length != i14) {
                this.g = new RenderEffect[i14];
                this.h = new float[i14];
                this.i = new float[i14];
            } else {
                Arrays.fill(renderEffectArr, (Object) null);
            }
        }
        int i15 = (((i10 == 0 || (a11 = (a10 = aVar.a()) % e10) == 0) ? 0 : (((a10 ^ e10) >> 31) | 1) > 0 ? a11 : a11 + e10) * e10) + ((i10 == 0 || (f12 = (f11 = aVar.f()) % e10) == 0) ? 0 : (((f11 ^ e10) >> 31) | 1) > 0 ? f12 : f12 + e10);
        float f17 = f13 / f10;
        float f18 = f14 / f10;
        RenderEffect renderEffect = this.g[i15];
        if (renderEffect == null || this.h[i15] != f17 || this.i[i15] != f18) {
            this.c.setFloatUniform("shader_offset", f17, f18);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.c, "content");
            this.g[i15] = renderEffect;
            this.h[i15] = f17;
            this.i[i15] = f18;
        }
        this.b.setPosition(0, 0, i3, i11);
        this.b.setPivotX(0.0f);
        this.b.setPivotY(0.0f);
        this.b.setScaleX(f10);
        this.b.setScaleY(f10);
        this.b.setTranslationX(f13);
        this.b.setTranslationY(f14);
        RecordingCanvas beginRecording = this.b.beginRecording();
        if (i10 != 0) {
            fVar.h.c(l10, l11, e10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f.l(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        this.b.endRecording();
        this.b.setRenderEffect(renderEffect);
        fVar.w = false;
    }

    @Override // v7.q
    public final void b() {
        this.b.discardDisplayList();
        this.d = -1;
    }

    @Override // v7.q
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.b);
    }

    @Override // v7.q
    public final boolean d() {
        return this.b.hasDisplayList();
    }

    @Override // v7.q
    public final void e(float f10) {
        this.b.setAlpha(f10);
    }
}
