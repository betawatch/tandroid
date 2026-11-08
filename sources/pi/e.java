package pi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.support.v4.media.session.w;
import c8.ob;
import java.util.Arrays;
import org.telegram.ui.Components.ra0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class e extends ob {
    public final RenderNode a = w.o();
    public final RuntimeShader b = ra0.a();
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

    @Override // c8.ob
    public final void a(Rect rect, RectF rectF) {
        float f10;
        a aVar;
        int i7;
        int i10;
        int i11;
        int a10;
        int a11;
        int g10;
        int g11;
        f fVar = this.i;
        a aVar2 = fVar.h;
        int i12 = (aVar2 == null || !aVar2.h() || aVar2.f() <= 0) ? 0 : 1;
        int f11 = i12 != 0 ? aVar2.f() : 1;
        float l10 = i12 != 0 ? f.l(rectF.left, aVar2.g(), f11) - (i12 * f11) : rectF.left;
        float l11 = i12 != 0 ? f.l(rectF.top, aVar2.a(), f11) - (i12 * f11) : rectF.top;
        float f12 = l10 - rectF.left;
        float f13 = l11 - rectF.top;
        float f14 = f11;
        int ceil = ((int) Math.ceil((rectF.right - l10) / f14)) + i12;
        int ceil2 = ((int) Math.ceil((rectF.bottom - l11) / f14)) + i12;
        if (!fVar.w && this.c == rect.width() && this.d == rect.height() && this.e == f11) {
            aVar = aVar2;
            i10 = i12;
            i7 = ceil;
            f10 = f14;
            i11 = ceil2;
        } else {
            int i13 = fVar.y;
            float height = (i13 == 1 || i13 == 4) ? rect.height() : rect.width();
            RuntimeShader runtimeShader = this.b;
            g gVar = fVar.D;
            gVar.getClass();
            float f15 = 0;
            f10 = f14;
            aVar = aVar2;
            i7 = ceil;
            i10 = i12;
            i11 = ceil2;
            runtimeShader.setInputShader("alphaMask", f.k(fVar, gVar, height, f15, -1, f11));
            RuntimeShader runtimeShader2 = this.b;
            g gVar2 = fVar.E;
            gVar2.getClass();
            runtimeShader2.setInputShader("overlay", f.k(fVar, gVar2, height, f15, fVar.H, f11));
            this.b.setFloatUniform("background_color_premultiplied", Color.red(fVar.H) / 255.0f, Color.green(fVar.H) / 255.0f, Color.blue(fVar.H) / 255.0f, 1.0f);
            this.c = rect.width();
            this.d = rect.height();
            this.e = f11;
            int i14 = f11 * f11;
            RenderEffect[] renderEffectArr = this.f;
            if (renderEffectArr == null || renderEffectArr.length != i14) {
                this.f = new RenderEffect[i14];
                this.g = new float[i14];
                this.h = new float[i14];
            } else {
                Arrays.fill(renderEffectArr, (Object) null);
            }
        }
        int i15 = (((i10 == 0 || (a11 = (a10 = aVar.a()) % f11) == 0) ? 0 : (((a10 ^ f11) >> 31) | 1) > 0 ? a11 : a11 + f11) * f11) + ((i10 == 0 || (g11 = (g10 = aVar.g()) % f11) == 0) ? 0 : (((g10 ^ f11) >> 31) | 1) > 0 ? g11 : g11 + f11);
        float f16 = f12 / f10;
        float f17 = f13 / f10;
        RenderEffect renderEffect = this.f[i15];
        if (renderEffect == null || this.g[i15] != f16 || this.h[i15] != f17) {
            this.b.setFloatUniform("shader_offset", f16, f17);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
            this.f[i15] = renderEffect;
            this.g[i15] = f16;
            this.h[i15] = f17;
        }
        this.a.setPosition(0, 0, i7, i11);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f10);
        this.a.setScaleY(f10);
        this.a.setTranslationX(f12);
        this.a.setTranslationY(f13);
        RecordingCanvas beginRecording = this.a.beginRecording();
        if (i10 != 0) {
            fVar.h.d(l10, l11, f11, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            fVar.f.e(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        this.a.endRecording();
        this.a.setRenderEffect(renderEffect);
        fVar.w = false;
    }

    @Override // c8.ob
    public final void b() {
        this.a.discardDisplayList();
        this.c = -1;
    }

    @Override // c8.ob
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // c8.ob
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // c8.ob
    public final void e(float f10) {
        this.a.setAlpha(f10);
    }
}
