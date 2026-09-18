package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.qr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class v0 implements pg.d1 {
    public final /* synthetic */ w0 a;

    public v0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // pg.d1
    public final void a() {
        w0 w0Var = this.a;
        w0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(w0Var, 8)).setInterpolator(qr.h);
    }

    @Override // pg.d1
    public final boolean d() {
        return true;
    }

    @Override // pg.d1
    public final void e() {
        w0 w0Var = this.a;
        w0Var.b.a.e();
        w0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((zt0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.W2(true, true);
    }

    @Override // pg.d1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // pg.d1
    public final /* synthetic */ void b() {
    }

    @Override // pg.d1
    public final void c() {
    }
}
