package sg;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.y;
import java.util.Iterator;
import java.util.List;
import ng.g;
import ng.h;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d implements a {
    public final a a;
    public h c;
    public ng.e d;
    public int e;
    public a f;
    public boolean h;
    public boolean n;
    public RecordingCanvas r;
    public Runnable v;
    public final be.b s = new be.b(true);
    public final RenderNode b = y.c();

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // sg.a
    public final void X(Canvas canvas, float f10, float f11, float f12, float f13) {
        ng.e eVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.X(canvas, f10, f11, f12, f13);
                return;
            }
            return;
        }
        if (this.n) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.X(canvas, f10, f11, f12, f13);
        }
        canvas.save();
        if (!this.h) {
            canvas.clipRect(f10, f11, f12, f13);
        }
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.d) == null) {
            canvas.drawRenderNode(this.b);
        } else {
            eVar.c(canvas, this.e);
        }
        canvas.restore();
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (this.n) {
            throw new IllegalStateException();
        }
        this.n = true;
        this.b.setPosition(0, 0, i10, i11);
        RecordingCanvas beginRecording = this.b.beginRecording(i10, i11);
        this.r = beginRecording;
        return beginRecording;
    }

    public final void b() {
        if (!this.n) {
            throw new IllegalStateException();
        }
        this.b.endRecording();
        this.n = false;
        this.r = null;
    }

    public final int c(List list, int i10, int i11) {
        RectF rectF;
        Iterator it = this.s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            pg.c cVar = (pg.c) it.next();
            boolean v = cVar.v();
            pg.a aVar = cVar.h;
            if (v && cVar.j > 0 && !aVar.m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(aVar.m);
                rectF.offset(cVar.a, cVar.b);
                float f10 = -i11;
                rectF.inset(f10, f10);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void d() {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((pg.c) it.next()).M = true;
        }
    }

    public final boolean e(int i10, int i11) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i10 && this.b.getHeight() == i11) ? false : true;
    }

    @Override // sg.a
    public final void f() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void g(float f10) {
        this.b.setRenderEffect(f10 > 0.0f ? RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP) : null);
    }

    public final void h(float f10, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void i(int i10, int i11) {
        this.b.setPosition(0, 0, i10, i11);
    }

    public final void j(g gVar) {
        if (this.c == null) {
            this.c = new h(this.b, gVar);
        }
    }

    @Override // sg.a
    public final pg.b k() {
        pg.c cVar = new pg.c(this);
        this.s.add(cVar);
        return cVar;
    }

    public final void l() {
        this.c.a();
    }
}
