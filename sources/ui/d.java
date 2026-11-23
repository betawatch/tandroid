package ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.Iterator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class d implements a, dh.b, si.a {
    public final a a;
    public final a b;
    public final xe.b c = new xe.b();
    public float d;

    public d(a aVar, a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public static si.a h(a aVar) {
        if (aVar instanceof si.a) {
            si.a aVar2 = (si.a) aVar;
            if (aVar2.g()) {
                return aVar2;
            }
        }
        return null;
    }

    @Override // si.a
    public final int a() {
        return i().a();
    }

    @Override // dh.b
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        c(gVar);
        return gVar;
    }

    @Override // dh.b
    public final void c(fh.g gVar) {
        this.c.add(gVar);
    }

    @Override // si.a
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        float f12;
        float f13;
        int i10;
        Canvas canvas2;
        RectF rectF2;
        if (this.d < 1.0f) {
            f12 = f10;
            f13 = f11;
            i10 = i7;
            canvas2 = canvas;
            rectF2 = rectF;
            h(this.a).d(f12, f13, i10, canvas2, rectF2);
        } else {
            f12 = f10;
            f13 = f11;
            i10 = i7;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        float f14 = this.d;
        if (f14 > 0.0f) {
            if (f14 < 1.0f) {
                canvas2.saveLayerAlpha(null, (int) (f14 * 255.0f));
            }
            RectF rectF3 = rectF2;
            Canvas canvas3 = canvas2;
            int i11 = i10;
            h(this.b).d(f12, f13, i11, canvas3, rectF3);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }

    @Override // si.a
    public final int e() {
        return i().e();
    }

    @Override // si.a
    public final int f() {
        return i().f();
    }

    @Override // si.a
    public final boolean g() {
        return (h(this.a) == null || h(this.b) == null) ? false : true;
    }

    public final si.a i() {
        si.a h = h(this.a);
        si.a h7 = h(this.b);
        return h.e() <= h7.e() ? h : h7;
    }

    public final void j(float f10) {
        if (this.d != f10) {
            this.d = f10;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                fh.g gVar = (fh.g) it.next();
                gVar.updateColors();
                gVar.invalidateSelf();
            }
        }
    }

    @Override // ui.a
    public final void z(float f10, float f11, float f12, float f13, Canvas canvas) {
        float f14;
        float f15;
        float f16;
        float f17;
        Canvas canvas2;
        if (this.d < 1.0f) {
            this.a.z(f10, f11, f12, f13, canvas);
            f14 = f10;
            canvas2 = canvas;
            f17 = f13;
            f16 = f12;
            f15 = f11;
        } else {
            f14 = f10;
            f15 = f11;
            f16 = f12;
            f17 = f13;
            canvas2 = canvas;
        }
        float f18 = this.d;
        if (f18 > 0.0f) {
            if (f18 < 1.0f) {
                canvas2.saveLayerAlpha(f14, f15, f16, f17, (int) (f18 * 255.0f));
            }
            Canvas canvas3 = canvas2;
            this.b.z(f14, f15, f16, f17, canvas3);
            if (this.d < 1.0f) {
                canvas3.restore();
            }
        }
    }
}
