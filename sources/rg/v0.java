package rg;

import android.graphics.drawable.Drawable;
import ei.i6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ht0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        PhotoViewer photoViewer = ((ht0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.X2(true, true);
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
