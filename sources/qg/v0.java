package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.hs;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class v0 implements pg.d1 {
    public final /* synthetic */ w0 a;

    public v0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // pg.d1
    public final void a() {
        w0 w0Var = this.a;
        w0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(w0Var, 8)).setInterpolator(hs.h);
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
        PhotoViewer photoViewer = ((au0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.X2(true, true);
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
