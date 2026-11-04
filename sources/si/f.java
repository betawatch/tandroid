package si;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.w;
import eh.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class f implements a, eh.b, qi.a {
    public final a a;
    public i c;
    public eh.g d;
    public int e;
    public a f;
    public pi.c h;
    public boolean n;
    public boolean r;
    public RecordingCanvas s;
    public final ue.b w = new ue.b();
    public final RenderNode b = w.c();

    public f(a aVar) {
        this.a = aVar;
    }

    @Override // qi.a
    public final int a() {
        pi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.a();
        }
        return 0;
    }

    @Override // eh.b
    public final gh.g b() {
        gh.g gVar = new gh.g(this, this, this);
        d(gVar);
        return gVar;
    }

    @Override // qi.a
    public final void c(float f10, float f11, int i3, Canvas canvas, RectF rectF) {
        Canvas canvas2;
        eh.g gVar;
        pi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        pi.c cVar2 = cVar;
        if (this.f != null || cVar2 == null) {
            canvas.save();
            float f12 = 1.0f / i3;
            canvas.scale(f12, f12);
            canvas.translate(-f10, -f11);
            a aVar = this.f;
            if (aVar != null) {
                float f13 = i3 * 2;
                canvas2 = canvas;
                aVar.l(canvas2, rectF.left - f13, rectF.top - f13, rectF.right + f13, rectF.bottom + f13);
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
            cVar2.c(f10, f11, i3, canvas2, rectF);
        }
    }

    @Override // eh.b
    public final void d(gh.g gVar) {
        this.w.add(gVar);
    }

    @Override // qi.a
    public final int e() {
        eh.g gVar;
        eh.e eVar;
        pi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.e();
        }
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.d) == null) {
            return 1;
        }
        int i3 = this.e;
        if (!gVar.a || gVar.k == 0) {
            return 1;
        }
        eh.f fVar = (eh.f) gVar.j.get(0);
        return ((i3 == -2 || i3 == -4) && (eVar = fVar.c) != null) ? eVar.e : fVar.b.e;
    }

    @Override // qi.a
    public final int f() {
        pi.c cVar = this.h;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.f();
        }
        return 0;
    }

    @Override // qi.a
    public final boolean g() {
        return e() > 1;
    }

    public final RecordingCanvas h(int i3, int i10) {
        if (this.r) {
            throw new IllegalStateException();
        }
        this.r = true;
        this.b.setPosition(0, 0, i3, i10);
        RecordingCanvas beginRecording = this.b.beginRecording(i3, i10);
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

    public final boolean j(int i3, int i10) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i3 && this.b.getHeight() == i10) ? false : true;
    }

    public final void k(float f10) {
        this.b.setRenderEffect(f10 > 0.0f ? RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP) : null);
    }

    @Override // si.a
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        eh.g gVar;
        pi.c cVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.l(canvas, f10, f11, f12, f13);
                return;
            }
            return;
        }
        if (this.r) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.l(canvas, f10, f11, f12, f13);
        }
        canvas.save();
        if (!this.n) {
            canvas.clipRect(f10, f11, f12, f13);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 && (cVar = this.h) != null) {
            cVar.l(canvas, f10, f11, f12, f13);
        } else if (i3 < 31 || (gVar = this.d) == null) {
            canvas.drawRenderNode(this.b);
        } else {
            gVar.c(canvas, this.e);
        }
        canvas.restore();
    }

    public final void m(float f10, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void n(int i3, int i10) {
        this.b.setPosition(0, 0, i3, i10);
    }
}
