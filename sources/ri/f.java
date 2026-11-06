package ri;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.w;
import dh.i;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class f implements a, dh.b, pi.a {
    public final a a;
    public i c;
    public dh.g d;
    public int e;
    public a f;
    public oi.c h;
    public boolean n;
    public boolean r;
    public RecordingCanvas s;
    public final xe.b w = new xe.b();
    public final RenderNode b = w.c();

    public f(a aVar) {
        this.a = aVar;
    }

    @Override // pi.a
    public final int a() {
        oi.c cVar = this.h;
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

    @Override // pi.a
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        Canvas canvas2;
        dh.g gVar;
        oi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        oi.c cVar2 = cVar;
        if (this.f != null || cVar2 == null) {
            canvas.save();
            float f12 = 1.0f / i7;
            canvas.scale(f12, f12);
            canvas.translate(-f10, -f11);
            a aVar = this.f;
            if (aVar != null) {
                float f13 = i7 * 2;
                canvas2 = canvas;
                aVar.e(canvas2, rectF.left - f13, rectF.top - f13, rectF.right + f13, rectF.bottom + f13);
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

    @Override // ri.a
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        dh.g gVar;
        oi.c cVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.e(canvas, f10, f11, f12, f13);
                return;
            }
            return;
        }
        if (this.r) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.e(canvas, f10, f11, f12, f13);
        }
        canvas.save();
        if (!this.n) {
            canvas.clipRect(f10, f11, f12, f13);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && (cVar = this.h) != null) {
            cVar.e(canvas, f10, f11, f12, f13);
        } else if (i7 < 31 || (gVar = this.d) == null) {
            canvas.drawRenderNode(this.b);
        } else {
            gVar.c(canvas, this.e);
        }
        canvas.restore();
    }

    @Override // pi.a
    public final int f() {
        dh.g gVar;
        dh.e eVar;
        oi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.f();
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

    @Override // pi.a
    public final int g() {
        oi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.g();
        }
        return 0;
    }

    @Override // pi.a
    public final boolean h() {
        return f() > 1;
    }

    public final RecordingCanvas i(int i7, int i10) {
        if (this.r) {
            throw new IllegalStateException();
        }
        this.r = true;
        this.b.setPosition(0, 0, i7, i10);
        RecordingCanvas beginRecording = this.b.beginRecording(i7, i10);
        this.s = beginRecording;
        return beginRecording;
    }

    public final void j() {
        if (!this.r) {
            throw new IllegalStateException();
        }
        this.b.endRecording();
        this.r = false;
        this.s = null;
    }

    public final boolean k(int i7, int i10) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i7 && this.b.getHeight() == i10) ? false : true;
    }

    public final void l(float f10) {
        this.b.setRenderEffect(f10 > 0.0f ? RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP) : null);
    }

    public final void m(float f10, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void n(int i7, int i10) {
        this.b.setPosition(0, 0, i7, i10);
    }
}
