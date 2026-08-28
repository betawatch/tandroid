package yf;

import android.graphics.drawable.Drawable;
import kh.g4;
import org.telegram.ui.Components.gr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u0 implements xf.b1 {
    public final /* synthetic */ v0 a;

    public u0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // xf.b1
    public final void a() {
        v0 v0Var = this.a;
        v0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new g4(v0Var, 19)).setInterpolator(gr.h);
    }

    @Override // xf.b1
    public final boolean d() {
        return true;
    }

    @Override // xf.b1
    public final void e() {
        v0 v0Var = this.a;
        v0Var.b.a.e();
        v0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((ws0) v0Var).G;
        Drawable[] drawableArr = PhotoViewer.P8;
        photoViewer.X2(true, true);
    }

    @Override // xf.b1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // xf.b1
    public final /* synthetic */ void b() {
    }

    @Override // xf.b1
    public final void c() {
    }
}
