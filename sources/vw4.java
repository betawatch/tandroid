// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class vw4 extends xie {
    public final RenderNode a = mk1.q();
    public final RuntimeShader b = nm3.d();
    public int c = -1;
    public int d = -1;
    public int e;
    public RenderEffect[] f;
    public float[] g;
    public float[] h;
    public final /* synthetic */ ww4 i;

    public vw4(ww4 ww4Var) {
        this.i = ww4Var;
    }

    @Override // xie
    public final void a(Rect rect, RectF rectF) {
        float f;
        float f2;
        int i;
        rw4 rw4Var;
        int i2;
        float f3;
        float f4;
        int i3;
        int a;
        int a2;
        int g;
        int g2;
        ww4 ww4Var = this.i;
        rw4 rw4Var2 = ww4Var.h;
        int i4 = (rw4Var2 == null || !rw4Var2.h() || rw4Var2.f() <= 0) ? 0 : 1;
        if (i4 != 0) {
            int f5 = rw4Var2.f();
            float f6 = i4 * f5;
            f = ww4.k(rectF.left, rw4Var2.g(), f5) - f6;
            f2 = ww4.k(rectF.top, rw4Var2.a(), f5) - f6;
            i = f5;
        } else {
            f = rectF.left;
            f2 = rectF.top;
            i = 1;
        }
        int i5 = i4;
        float f7 = f2;
        float f8 = f - rectF.left;
        float f9 = f7 - rectF.top;
        float f10 = i;
        int ceil = ((int) Math.ceil((rectF.right - f) / f10)) + i5;
        int ceil2 = ((int) Math.ceil((rectF.bottom - f7) / f10)) + i5;
        if (!ww4Var.w && this.c == rect.width() && this.d == rect.height() && this.e == i) {
            rw4Var = rw4Var2;
            f4 = f7;
            i2 = ceil;
            f3 = f10;
            i3 = ceil2;
        } else {
            int i6 = ww4Var.y;
            float height = (i6 == 1 || i6 == 4) ? rect.height() : rect.width();
            RuntimeShader runtimeShader = this.b;
            xw4 xw4Var = ww4Var.E;
            xw4Var.getClass();
            rw4Var = rw4Var2;
            i2 = ceil;
            f3 = f10;
            f4 = f7;
            i3 = ceil2;
            runtimeShader.setInputShader("alphaMask", ww4Var.l(xw4Var, height, 0.0f, -1, i));
            RuntimeShader runtimeShader2 = this.b;
            xw4 xw4Var2 = ww4Var.F;
            xw4Var2.getClass();
            runtimeShader2.setInputShader("overlay", ww4Var.l(xw4Var2, height, 0.0f, ww4Var.I, i));
            this.b.setFloatUniform("background_color_premultiplied", Color.red(ww4Var.I) / 255.0f, Color.green(ww4Var.I) / 255.0f, Color.blue(ww4Var.I) / 255.0f, 1.0f);
            this.c = rect.width();
            this.d = rect.height();
            this.e = i;
            int i7 = i * i;
            RenderEffect[] renderEffectArr = this.f;
            if (renderEffectArr == null || renderEffectArr.length != i7) {
                this.f = new RenderEffect[i7];
                this.g = new float[i7];
                this.h = new float[i7];
            } else {
                Arrays.fill(renderEffectArr, (Object) null);
            }
        }
        int i8 = (((i5 == 0 || (a2 = (a = rw4Var.a()) % i) == 0) ? 0 : (((a ^ i) >> 31) | 1) > 0 ? a2 : a2 + i) * i) + ((i5 == 0 || (g2 = (g = rw4Var.g()) % i) == 0) ? 0 : (((g ^ i) >> 31) | 1) > 0 ? g2 : g2 + i);
        float f11 = f8 / f3;
        float f12 = f9 / f3;
        RenderEffect renderEffect = this.f[i8];
        if (renderEffect == null || this.g[i8] != f11 || this.h[i8] != f12) {
            this.b.setFloatUniform("shader_offset", f11, f12);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
            this.f[i8] = renderEffect;
            this.g[i8] = f11;
            this.h[i8] = f12;
        }
        this.a.setPosition(0, 0, i2, i3);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f3);
        this.a.setScaleY(f3);
        this.a.setTranslationX(f8);
        this.a.setTranslationY(f9);
        RecordingCanvas beginRecording = this.a.beginRecording();
        if (i5 != 0) {
            ww4Var.h.d(f, f4, i, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            ww4Var.f.e(rectF.left, rectF.top, rectF.right, rectF.bottom, beginRecording);
            beginRecording.restore();
        }
        this.a.endRecording();
        this.a.setRenderEffect(renderEffect);
        ww4Var.w = false;
    }

    @Override // xie
    public final void b() {
        this.a.discardDisplayList();
        this.c = -1;
    }

    @Override // xie
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // xie
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // xie
    public final void e(float f) {
        this.a.setAlpha(f);
    }
}
