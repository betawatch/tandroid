package qg;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.z;
import java.util.Iterator;
import java.util.List;
import lg.g;
import lg.h;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d implements a {
    public final a a;
    public h c;
    public lg.e d;
    public int e;
    public a f;
    public boolean h;
    public boolean n;
    public RecordingCanvas r;
    public Runnable v;
    public final zd.b s = new zd.b(true);
    public final RenderNode b = z.c();

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // qg.a
    public final void E0(Canvas canvas, float f9, float f10, float f11, float f12) {
        lg.e eVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.E0(canvas, f9, f10, f11, f12);
                return;
            }
            return;
        }
        if (this.n) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.E0(canvas, f9, f10, f11, f12);
        }
        canvas.save();
        if (!this.h) {
            canvas.clipRect(f9, f10, f11, f12);
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
            ng.e eVar = (ng.e) it.next();
            boolean v = eVar.v();
            ng.c cVar = eVar.h;
            if (v && eVar.j > 0 && !cVar.m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.m);
                rectF.offset(eVar.a, eVar.b);
                float f9 = -i11;
                rectF.inset(f9, f9);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void d() {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((ng.e) it.next()).M = true;
        }
    }

    public final boolean e(int i10, int i11) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i10 && this.b.getHeight() == i11) ? false : true;
    }

    public final void f(float f9) {
        this.b.setRenderEffect(f9 > 0.0f ? RenderEffect.createBlurEffect(f9, f9, Shader.TileMode.CLAMP) : null);
    }

    public final void g(float f9, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f9, f9, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void h(int i10, int i11) {
        this.b.setPosition(0, 0, i10, i11);
    }

    public final void i(g gVar) {
        if (this.c == null) {
            this.c = new h(this.b, gVar);
        }
    }

    public final void j() {
        this.c.a();
    }

    @Override // qg.a
    public final void q() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // qg.a
    public final ng.d v() {
        ng.e eVar = new ng.e(this);
        this.s.add(eVar);
        return eVar;
    }
}
