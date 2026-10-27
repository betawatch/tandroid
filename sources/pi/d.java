package pi;

import a8.lf;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.support.v4.media.session.x;
import java.util.Arrays;
import org.telegram.ui.Components.wc0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d extends lf {
    public final RenderNode a = x.o();
    public final RuntimeShader b = wc0.a();
    public int c = -1;
    public int d = -1;
    public int e;
    public RenderEffect[] f;
    public float[] g;
    public float[] h;
    public final /* synthetic */ e i;

    public d(e eVar) {
        this.i = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x002a  */
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
        int i12;
        float f13;
        float f14;
        e eVar;
        int i13;
        RenderEffect[] renderEffectArr;
        float f15;
        int i14;
        int i15;
        int i16;
        float f16;
        float f17;
        RenderEffect renderEffect;
        int i17;
        e eVar2 = this.i;
        oi.c cVar = eVar2.f;
        if (cVar != null) {
            oi.d dVar = cVar.b;
            if ((cVar.a == 3 ? dVar.k : dVar.j) > 0) {
                i10 = 1;
                if (i10 == 0) {
                    oi.d dVar2 = cVar.b;
                    i11 = cVar.a == 3 ? dVar2.k : dVar2.j;
                } else {
                    i11 = 1;
                }
                if (i10 == 0) {
                    float f18 = rectF.left;
                    oi.d dVar3 = cVar.b;
                    f7 = e.k(f18, cVar.a == 3 ? dVar3.o : dVar3.m, i11) - (i10 * i11);
                } else {
                    f7 = rectF.left;
                }
                float f19 = f7;
                if (i10 == 0) {
                    float f20 = rectF.top;
                    oi.d dVar4 = cVar.b;
                    f10 = e.k(f20, cVar.a == 3 ? dVar4.p : dVar4.n, i11) - (i10 * i11);
                } else {
                    f10 = rectF.top;
                }
                float f21 = f10;
                float f22 = f19 - rectF.left;
                f11 = f21 - rectF.top;
                f12 = i11;
                i12 = i10;
                int ceil = ((int) Math.ceil((rectF.right - f19) / f12)) + i12;
                int ceil2 = ((int) Math.ceil((rectF.bottom - f21) / f12)) + i12;
                if (eVar2.s && this.c == rect.width() && this.d == rect.height() && this.e == i11) {
                    f13 = f11;
                    f14 = f12;
                    eVar = eVar2;
                } else {
                    int i18 = eVar2.w;
                    float height = (i18 != 1 || i18 == 4) ? rect.height() : rect.width();
                    RuntimeShader runtimeShader = this.b;
                    f fVar = eVar2.x;
                    fVar.getClass();
                    float f23 = 0;
                    f13 = f11;
                    f14 = f12;
                    runtimeShader.setInputShader("alphaMask", e.l(eVar2, fVar, height, f23, -1, i11));
                    RuntimeShader runtimeShader2 = this.b;
                    f fVar2 = eVar2.y;
                    fVar2.getClass();
                    LinearGradient l4 = e.l(eVar2, fVar2, height, f23, eVar2.G, i11);
                    eVar = eVar2;
                    runtimeShader2.setInputShader("overlay", l4);
                    this.b.setFloatUniform("background_color_premultiplied", Color.red(eVar.G) / 255.0f, Color.green(eVar.G) / 255.0f, Color.blue(eVar.G) / 255.0f, 1.0f);
                    this.c = rect.width();
                    this.d = rect.height();
                    this.e = i11;
                    i13 = i11 * i11;
                    renderEffectArr = this.f;
                    if (renderEffectArr == null && renderEffectArr.length == i13) {
                        Arrays.fill(renderEffectArr, (Object) null);
                    } else {
                        this.f = new RenderEffect[i13];
                        this.g = new float[i13];
                        this.h = new float[i13];
                    }
                }
                if (i12 == 0) {
                    oi.d dVar5 = cVar.b;
                    if (cVar.a == 3) {
                        f15 = f13;
                        i17 = dVar5.o;
                    } else {
                        f15 = f13;
                        i17 = dVar5.m;
                    }
                    int i19 = i17 % i11;
                    if (i19 != 0) {
                        i14 = (((i17 ^ i11) >> 31) | 1) > 0 ? i19 : i19 + i11;
                        if (i12 != 0) {
                            oi.d dVar6 = cVar.b;
                            int i20 = cVar.a == 3 ? dVar6.p : dVar6.n;
                            int i21 = i20 % i11;
                            if (i21 != 0) {
                                i15 = (((i20 ^ i11) >> 31) | 1) > 0 ? i21 : i21 + i11;
                                i16 = (i15 * i11) + i14;
                                f16 = f22 / f14;
                                f17 = f15 / f14;
                                renderEffect = this.f[i16];
                                if (renderEffect != null || this.g[i16] != f16 || this.h[i16] != f17) {
                                    this.b.setFloatUniform("shader_offset", f16, f17);
                                    renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
                                    this.f[i16] = renderEffect;
                                    this.g[i16] = f16;
                                    this.h[i16] = f17;
                                }
                                RenderEffect renderEffect2 = renderEffect;
                                this.a.setPosition(0, 0, ceil, ceil2);
                                this.a.setPivotX(0.0f);
                                this.a.setPivotY(0.0f);
                                this.a.setScaleX(f14);
                                this.a.setScaleY(f14);
                                this.a.setTranslationX(f22);
                                this.a.setTranslationY(f15);
                                RecordingCanvas beginRecording = this.a.beginRecording();
                                if (i12 == 0) {
                                    oi.d.b(cVar.b, cVar.a, beginRecording, rectF, i11, f19, f21);
                                } else {
                                    beginRecording.save();
                                    beginRecording.translate(-rectF.left, -rectF.top);
                                    eVar.e.w(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
                                    beginRecording.restore();
                                }
                                this.a.endRecording();
                                this.a.setRenderEffect(renderEffect2);
                                eVar.s = false;
                            }
                        }
                        i15 = 0;
                        i16 = (i15 * i11) + i14;
                        f16 = f22 / f14;
                        f17 = f15 / f14;
                        renderEffect = this.f[i16];
                        if (renderEffect != null) {
                        }
                        this.b.setFloatUniform("shader_offset", f16, f17);
                        renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
                        this.f[i16] = renderEffect;
                        this.g[i16] = f16;
                        this.h[i16] = f17;
                        RenderEffect renderEffect22 = renderEffect;
                        this.a.setPosition(0, 0, ceil, ceil2);
                        this.a.setPivotX(0.0f);
                        this.a.setPivotY(0.0f);
                        this.a.setScaleX(f14);
                        this.a.setScaleY(f14);
                        this.a.setTranslationX(f22);
                        this.a.setTranslationY(f15);
                        RecordingCanvas beginRecording2 = this.a.beginRecording();
                        if (i12 == 0) {
                        }
                        this.a.endRecording();
                        this.a.setRenderEffect(renderEffect22);
                        eVar.s = false;
                    }
                } else {
                    f15 = f13;
                }
                i14 = 0;
                if (i12 != 0) {
                }
                i15 = 0;
                i16 = (i15 * i11) + i14;
                f16 = f22 / f14;
                f17 = f15 / f14;
                renderEffect = this.f[i16];
                if (renderEffect != null) {
                }
                this.b.setFloatUniform("shader_offset", f16, f17);
                renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
                this.f[i16] = renderEffect;
                this.g[i16] = f16;
                this.h[i16] = f17;
                RenderEffect renderEffect222 = renderEffect;
                this.a.setPosition(0, 0, ceil, ceil2);
                this.a.setPivotX(0.0f);
                this.a.setPivotY(0.0f);
                this.a.setScaleX(f14);
                this.a.setScaleY(f14);
                this.a.setTranslationX(f22);
                this.a.setTranslationY(f15);
                RecordingCanvas beginRecording22 = this.a.beginRecording();
                if (i12 == 0) {
                }
                this.a.endRecording();
                this.a.setRenderEffect(renderEffect222);
                eVar.s = false;
            }
        }
        i10 = 0;
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        float f192 = f7;
        if (i10 == 0) {
        }
        float f212 = f10;
        float f222 = f192 - rectF.left;
        f11 = f212 - rectF.top;
        f12 = i11;
        i12 = i10;
        int ceil3 = ((int) Math.ceil((rectF.right - f192) / f12)) + i12;
        int ceil22 = ((int) Math.ceil((rectF.bottom - f212) / f12)) + i12;
        if (eVar2.s) {
        }
        int i182 = eVar2.w;
        float height2 = (i182 != 1 || i182 == 4) ? rect.height() : rect.width();
        RuntimeShader runtimeShader3 = this.b;
        f fVar3 = eVar2.x;
        fVar3.getClass();
        float f232 = 0;
        f13 = f11;
        f14 = f12;
        runtimeShader3.setInputShader("alphaMask", e.l(eVar2, fVar3, height2, f232, -1, i11));
        RuntimeShader runtimeShader22 = this.b;
        f fVar22 = eVar2.y;
        fVar22.getClass();
        LinearGradient l42 = e.l(eVar2, fVar22, height2, f232, eVar2.G, i11);
        eVar = eVar2;
        runtimeShader22.setInputShader("overlay", l42);
        this.b.setFloatUniform("background_color_premultiplied", Color.red(eVar.G) / 255.0f, Color.green(eVar.G) / 255.0f, Color.blue(eVar.G) / 255.0f, 1.0f);
        this.c = rect.width();
        this.d = rect.height();
        this.e = i11;
        i13 = i11 * i11;
        renderEffectArr = this.f;
        if (renderEffectArr == null) {
        }
        this.f = new RenderEffect[i13];
        this.g = new float[i13];
        this.h = new float[i13];
        if (i12 == 0) {
        }
        i14 = 0;
        if (i12 != 0) {
        }
        i15 = 0;
        i16 = (i15 * i11) + i14;
        f16 = f222 / f14;
        f17 = f15 / f14;
        renderEffect = this.f[i16];
        if (renderEffect != null) {
        }
        this.b.setFloatUniform("shader_offset", f16, f17);
        renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
        this.f[i16] = renderEffect;
        this.g[i16] = f16;
        this.h[i16] = f17;
        RenderEffect renderEffect2222 = renderEffect;
        this.a.setPosition(0, 0, ceil3, ceil22);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f14);
        this.a.setScaleY(f14);
        this.a.setTranslationX(f222);
        this.a.setTranslationY(f15);
        RecordingCanvas beginRecording222 = this.a.beginRecording();
        if (i12 == 0) {
        }
        this.a.endRecording();
        this.a.setRenderEffect(renderEffect2222);
        eVar.s = false;
    }

    @Override // a8.lf
    public final void b() {
        this.a.discardDisplayList();
        this.c = -1;
    }

    @Override // a8.lf
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // a8.lf
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // a8.lf
    public final void e(float f7) {
        this.a.setAlpha(f7);
    }
}
