package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.rr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class y0 implements pg.c1 {
    public final /* synthetic */ z0 a;

    public y0(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // pg.c1
    public final void a() {
        z0 z0Var = this.a;
        z0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(z0Var, 8)).setInterpolator(rr.h);
    }

    @Override // pg.c1
    public final boolean d() {
        return true;
    }

    @Override // pg.c1
    public final void e() {
        z0 z0Var = this.a;
        z0Var.b.a.e();
        z0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((st0) z0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.W2(true, true);
    }

    @Override // pg.c1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // pg.c1
    public final /* synthetic */ void b() {
    }

    @Override // pg.c1
    public final void c() {
    }
}
