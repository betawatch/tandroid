package zf;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.er;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u0 implements yf.a1 {
    public final /* synthetic */ v0 a;

    public u0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // yf.a1
    public final void a() {
        v0 v0Var = this.a;
        v0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new lh.m2(v0Var, 22)).setInterpolator(er.h);
    }

    @Override // yf.a1
    public final boolean d() {
        return true;
    }

    @Override // yf.a1
    public final void e() {
        v0 v0Var = this.a;
        v0Var.b.a.g();
        v0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((xs0) v0Var).G;
        Drawable[] drawableArr = PhotoViewer.P8;
        photoViewer.X2(true, true);
    }

    @Override // yf.a1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // yf.a1
    public final /* synthetic */ void b() {
    }

    @Override // yf.a1
    public final void c() {
    }
}
