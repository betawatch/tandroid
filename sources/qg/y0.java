package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.qr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y0 implements pg.b1 {
    public final /* synthetic */ z0 a;

    public y0(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // pg.b1
    public final void a() {
        z0 z0Var = this.a;
        z0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(z0Var, 8)).setInterpolator(qr.h);
    }

    @Override // pg.b1
    public final boolean d() {
        return true;
    }

    @Override // pg.b1
    public final void e() {
        z0 z0Var = this.a;
        z0Var.b.a.e();
        z0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((zt0) z0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.W2(true, true);
    }

    @Override // pg.b1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // pg.b1
    public final /* synthetic */ void b() {
    }

    @Override // pg.b1
    public final void c() {
    }
}
