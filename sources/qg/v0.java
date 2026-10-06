package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.tr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ut0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class v0 implements pg.e1 {
    public final /* synthetic */ w0 a;

    public v0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // pg.e1
    public final void a() {
        w0 w0Var = this.a;
        w0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(w0Var, 8)).setInterpolator(tr.h);
    }

    @Override // pg.e1
    public final boolean d() {
        return true;
    }

    @Override // pg.e1
    public final void e() {
        w0 w0Var = this.a;
        w0Var.b.a.j();
        w0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((ut0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.X2(true, true);
    }

    @Override // pg.e1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // pg.e1
    public final /* synthetic */ void b() {
    }

    @Override // pg.e1
    public final void c() {
    }
}
