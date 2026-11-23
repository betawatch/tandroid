package si;

import ai.t0;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.support.v4.media.session.w;
import c8.kc;
import java.util.Arrays;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class e extends kc {
    public final RenderNode a = w.o();
    public final RuntimeShader b = t0.d();
    public int c = -1;
    public int d = -1;
    public int e;
    public RenderEffect[] f;
    public float[] g;
    public float[] h;
    public final /* synthetic */ f i;

    public e(f fVar) {
        this.i = fVar;
    }

    @Override // c8.kc
    public final void a(Rect rect, RectF rectF) {
        float f10;
        a aVar;
        int i7;
        int i10;
        int i11;
        int a10;
        int a11;
        int f11;
        int f12;
        f fVar = this.i;
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
        if (!fVar.w && this.c == rect.width() && this.d == rect.height() && this.e == e10) {
            aVar = aVar2;
            i10 = i12;
            i7 = ceil;
            f10 = f15;
            i11 = ceil2;
        } else {
            int i13 = fVar.y;
            float height = (i13 == 1 || i13 == 4) ? rect.height() : rect.width();
            RuntimeShader runtimeShader = this.b;
            g gVar = fVar.E;
            gVar.getClass();
            float f16 = 0;
            f10 = f15;
            aVar = aVar2;
            i7 = ceil;
            i10 = i12;
            i11 = ceil2;
            runtimeShader.setInputShader("alphaMask", f.k(fVar, gVar, height, f16, -1, e10));
            RuntimeShader runtimeShader2 = this.b;
            g gVar2 = fVar.F;
            gVar2.getClass();
            runtimeShader2.setInputShader("overlay", f.k(fVar, gVar2, height, f16, fVar.I, e10));
            this.b.setFloatUniform("background_color_premultiplied", Color.red(fVar.I) / 255.0f, Color.green(fVar.I) / 255.0f, Color.blue(fVar.I) / 255.0f, 1.0f);
            this.c = rect.width();
            this.d = rect.height();
            this.e = e10;
            int i14 = e10 * e10;
            RenderEffect[] renderEffectArr = this.f;
            if (renderEffectArr == null || renderEffectArr.length != i14) {
                this.f = new RenderEffect[i14];
                this.g = new float[i14];
                this.h = new float[i14];
            } else {
                Arrays.fill(renderEffectArr, (Object) null);
            }
        }
        int i15 = (((i10 == 0 || (a11 = (a10 = aVar.a()) % e10) == 0) ? 0 : (((a10 ^ e10) >> 31) | 1) > 0 ? a11 : a11 + e10) * e10) + ((i10 == 0 || (f12 = (f11 = aVar.f()) % e10) == 0) ? 0 : (((f11 ^ e10) >> 31) | 1) > 0 ? f12 : f12 + e10);
        float f17 = f13 / f10;
        float f18 = f14 / f10;
        RenderEffect renderEffect = this.f[i15];
        if (renderEffect == null || this.g[i15] != f17 || this.h[i15] != f18) {
            this.b.setFloatUniform("shader_offset", f17, f18);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
            this.f[i15] = renderEffect;
            this.g[i15] = f17;
            this.h[i15] = f18;
        }
        this.a.setPosition(0, 0, i7, i11);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f10);
        this.a.setScaleY(f10);
        this.a.setTranslationX(f13);
        this.a.setTranslationY(f14);
        RecordingCanvas beginRecording = this.a.beginRecording();
        if (i10 != 0) {
            fVar.h.d(l10, l11, e10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f.o(rectF.left, rectF.top, rectF.right, rectF.bottom, beginRecording);
            beginRecording.restore();
        }
        this.a.endRecording();
        this.a.setRenderEffect(renderEffect);
        fVar.w = false;
    }

    @Override // c8.kc
    public final void b() {
        this.a.discardDisplayList();
        this.c = -1;
    }

    @Override // c8.kc
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // c8.kc
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // c8.kc
    public final void e(float f10) {
        this.a.setAlpha(f10);
    }
}
