package rg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.es;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gu0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class x0 implements qg.b1 {
    public final /* synthetic */ y0 a;

    public x0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // qg.b1
    public final void a() {
        y0 y0Var = this.a;
        y0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new ki.a(y0Var, 9)).setInterpolator(es.h);
    }

    @Override // qg.b1
    public final boolean d() {
        return true;
    }

    @Override // qg.b1
    public final void e() {
        y0 y0Var = this.a;
        y0Var.b.a.f();
        y0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((gu0) y0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.X2(true, true);
    }

    @Override // qg.b1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // qg.b1
    public final /* synthetic */ void b() {
    }

    @Override // qg.b1
    public final void c() {
    }
}
