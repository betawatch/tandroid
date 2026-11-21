package ri;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class c implements ui.a, si.a {
    public final int a;
    public final /* synthetic */ d b;

    public c(d dVar, int i7) {
        this.b = dVar;
        this.a = i7;
    }

    @Override // si.a
    public final int a() {
        boolean a10 = p5.c.a(this.a);
        d dVar = this.b;
        return a10 ? dVar.s : dVar.q;
    }

    @Override // si.a
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        d.b(this.b, this.a, canvas, rectF, i7, f10, f11);
    }

    @Override // si.a
    public final int e() {
        boolean a10 = p5.c.a(this.a);
        d dVar = this.b;
        return a10 ? dVar.n : dVar.m;
    }

    @Override // si.a
    public final int f() {
        boolean a10 = p5.c.a(this.a);
        d dVar = this.b;
        return a10 ? dVar.r : dVar.p;
    }

    @Override // si.a
    public final boolean g() {
        return true;
    }

    @Override // ui.a
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        d.a(this.b, canvas, this.a, f10, f11, f12, f13);
    }
}
