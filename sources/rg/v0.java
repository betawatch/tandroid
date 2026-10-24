package rg;

import android.graphics.drawable.Drawable;
import ei.i6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.it0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class v0 implements qg.d1 {
    public final /* synthetic */ w0 a;

    public v0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // qg.d1
    public final void a() {
        w0 w0Var = this.a;
        w0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new i6(w0Var, 16)).setInterpolator(bs.h);
    }

    @Override // qg.d1
    public final boolean d() {
        return true;
    }

    @Override // qg.d1
    public final void e() {
        w0 w0Var = this.a;
        w0Var.b.a.e();
        w0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((it0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.Z2(true, true);
    }

    @Override // qg.d1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // qg.d1
    public final /* synthetic */ void b() {
    }

    @Override // qg.d1
    public final void c() {
    }
}
