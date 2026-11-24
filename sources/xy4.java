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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class xy4 extends yke {
    public final RenderNode a = ul1.q();
    public final RuntimeShader b = yn3.d();
    public int c = -1;
    public int d = -1;
    public int e;
    public RenderEffect[] f;
    public float[] g;
    public float[] h;
    public final /* synthetic */ yy4 i;

    public xy4(yy4 yy4Var) {
        this.i = yy4Var;
    }

    @Override // yke
    public final void a(Rect rect, RectF rectF) {
        float f;
        float f2;
        int i;
        ty4 ty4Var;
        int i2;
        float f3;
        float f4;
        int i3;
        int a;
        int a2;
        int g;
        int g2;
        yy4 yy4Var = this.i;
        ty4 ty4Var2 = yy4Var.h;
        int i4 = (ty4Var2 == null || !ty4Var2.h() || ty4Var2.f() <= 0) ? 0 : 1;
        if (i4 != 0) {
            int f5 = ty4Var2.f();
            float f6 = i4 * f5;
            f = yy4.k(rectF.left, ty4Var2.g(), f5) - f6;
            f2 = yy4.k(rectF.top, ty4Var2.a(), f5) - f6;
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
        if (!yy4Var.w && this.c == rect.width() && this.d == rect.height() && this.e == i) {
            ty4Var = ty4Var2;
            f4 = f7;
            i2 = ceil;
            f3 = f10;
            i3 = ceil2;
        } else {
            int i6 = yy4Var.y;
            float height = (i6 == 1 || i6 == 4) ? rect.height() : rect.width();
            RuntimeShader runtimeShader = this.b;
            zy4 zy4Var = yy4Var.E;
            zy4Var.getClass();
            ty4Var = ty4Var2;
            i2 = ceil;
            f3 = f10;
            f4 = f7;
            i3 = ceil2;
            runtimeShader.setInputShader("alphaMask", yy4Var.l(zy4Var, height, 0.0f, -1, i));
            RuntimeShader runtimeShader2 = this.b;
            zy4 zy4Var2 = yy4Var.F;
            zy4Var2.getClass();
            runtimeShader2.setInputShader("overlay", yy4Var.l(zy4Var2, height, 0.0f, yy4Var.I, i));
            this.b.setFloatUniform("background_color_premultiplied", Color.red(yy4Var.I) / 255.0f, Color.green(yy4Var.I) / 255.0f, Color.blue(yy4Var.I) / 255.0f, 1.0f);
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
        int i8 = (((i5 == 0 || (a2 = (a = ty4Var.a()) % i) == 0) ? 0 : (((a ^ i) >> 31) | 1) > 0 ? a2 : a2 + i) * i) + ((i5 == 0 || (g2 = (g = ty4Var.g()) % i) == 0) ? 0 : (((g ^ i) >> 31) | 1) > 0 ? g2 : g2 + i);
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
            yy4Var.h.d(f, f4, i, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            yy4Var.f.e(rectF.left, rectF.top, rectF.right, rectF.bottom, beginRecording);
            beginRecording.restore();
        }
        this.a.endRecording();
        this.a.setRenderEffect(renderEffect);
        yy4Var.w = false;
    }

    @Override // yke
    public final void b() {
        this.a.discardDisplayList();
        this.c = -1;
    }

    @Override // yke
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // yke
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // yke
    public final void e(float f) {
        this.a.setAlpha(f);
    }
}
