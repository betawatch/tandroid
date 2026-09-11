package rg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.pr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.yt0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class x0 implements qg.b1 {
    public final /* synthetic */ y0 a;

    public x0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // qg.b1
    public final void a() {
        y0 y0Var = this.a;
        y0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new ki.a(y0Var, 10)).setInterpolator(pr.h);
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
        PhotoViewer photoViewer = ((yt0) y0Var).K;
        Drawable[] drawableArr = PhotoViewer.T8;
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
