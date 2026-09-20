package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.qr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class w0 implements pg.d1 {
    public final /* synthetic */ x0 a;

    public w0(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // pg.d1
    public final void a() {
        x0 x0Var = this.a;
        x0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(x0Var, 8)).setInterpolator(qr.h);
    }

    @Override // pg.d1
    public final boolean d() {
        return true;
    }

    @Override // pg.d1
    public final void e() {
        x0 x0Var = this.a;
        x0Var.b.a.e();
        x0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((zt0) x0Var).K;
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
