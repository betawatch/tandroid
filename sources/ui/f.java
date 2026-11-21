package ui;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.w;
import dh.i;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class f implements a, dh.b, si.a {
    public final a a;
    public i c;
    public dh.g d;
    public int e;
    public a f;
    public ri.c h;
    public boolean n;
    public boolean r;
    public RecordingCanvas s;
    public final xe.b w = new xe.b();
    public final RenderNode b = w.c();

    public f(a aVar) {
        this.a = aVar;
    }

    @Override // si.a
    public final int a() {
        ri.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.a();
        }
        return 0;
    }

    @Override // dh.b
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        c(gVar);
        return gVar;
    }

    @Override // dh.b
    public final void c(fh.g gVar) {
        this.w.add(gVar);
    }

    @Override // si.a
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        Canvas canvas2;
        dh.g gVar;
        ri.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        ri.c cVar2 = cVar;
        if (this.f != null || cVar2 == null) {
            canvas.save();
            float f12 = 1.0f / i7;
            canvas.scale(f12, f12);
            canvas.translate(-f10, -f11);
            a aVar = this.f;
            if (aVar != null) {
                float f13 = i7 * 2;
                aVar.o(rectF.left - f13, rectF.top - f13, rectF.right + f13, rectF.bottom + f13, canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            if (cVar2 == null && Build.VERSION.SDK_INT >= 31 && (gVar = this.d) != null) {
                gVar.c(canvas2, this.e);
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (cVar2 != null) {
            cVar2.d(f10, f11, i7, canvas2, rectF);
        }
    }

    @Override // si.a
    public final int e() {
        dh.g gVar;
        dh.e eVar;
        ri.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.e();
        }
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.d) == null) {
            return 1;
        }
        int i7 = this.e;
        if (!gVar.a || gVar.k == 0) {
            return 1;
        }
        dh.f fVar = (dh.f) gVar.j.get(0);
        return ((i7 == -2 || i7 == -4) && (eVar = fVar.c) != null) ? eVar.e : fVar.b.e;
    }

    @Override // si.a
    public final int f() {
        ri.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.f();
        }
        return 0;
    }

    @Override // si.a
    public final boolean g() {
        return e() > 1;
    }

    public final RecordingCanvas h(int i7, int i10) {
        if (this.r) {
            throw new IllegalStateException();
        }
        this.r = true;
        this.b.setPosition(0, 0, i7, i10);
        RecordingCanvas beginRecording = this.b.beginRecording(i7, i10);
        this.s = beginRecording;
        return beginRecording;
    }

    public final void i() {
        if (!this.r) {
            throw new IllegalStateException();
        }
        this.b.endRecording();
        this.r = false;
        this.s = null;
    }

    public final boolean j(int i7, int i10) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i7 && this.b.getHeight() == i10) ? false : true;
    }

    public final void k(float f10) {
        this.b.setRenderEffect(f10 > 0.0f ? RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP) : null);
    }

    public final void l(float f10, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void m(int i7, int i10) {
        this.b.setPosition(0, 0, i7, i10);
    }

    @Override // ui.a
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        dh.g gVar;
        ri.c cVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.o(f10, f11, f12, f13, canvas);
                return;
            }
            return;
        }
        if (this.r) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.o(f10, f11, f12, f13, canvas);
        }
        canvas.save();
        if (!this.n) {
            canvas.clipRect(f10, f11, f12, f13);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && (cVar = this.h) != null) {
            cVar.o(f10, f11, f12, f13, canvas);
        } else if (i7 < 31 || (gVar = this.d) == null) {
            canvas.drawRenderNode(this.b);
        } else {
            gVar.c(canvas, this.e);
        }
        canvas.restore();
    }
}
