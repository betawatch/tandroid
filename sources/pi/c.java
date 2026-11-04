package pi;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class c implements si.a, qi.a {
    public final int a;
    public final /* synthetic */ d b;

    public c(d dVar, int i3) {
        this.b = dVar;
        this.a = i3;
    }

    @Override // qi.a
    public final int a() {
        boolean d = f1.d(this.a);
        d dVar = this.b;
        return d ? dVar.s : dVar.q;
    }

    @Override // qi.a
    public final void c(float f10, float f11, int i3, Canvas canvas, RectF rectF) {
        d.b(this.b, this.a, canvas, rectF, i3, f10, f11);
    }

    @Override // qi.a
    public final int e() {
        boolean d = f1.d(this.a);
        d dVar = this.b;
        return d ? dVar.n : dVar.m;
    }

    @Override // qi.a
    public final int f() {
        boolean d = f1.d(this.a);
        d dVar = this.b;
        return d ? dVar.r : dVar.p;
    }

    @Override // qi.a
    public final boolean g() {
        return true;
    }

    @Override // si.a
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        d.a(this.b, canvas, this.a, f10, f11, f12, f13);
    }
}
