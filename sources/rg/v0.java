package rg;

import android.graphics.drawable.Drawable;
import ei.i6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ft0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class v0 implements qg.e1 {
    public final /* synthetic */ w0 a;

    public v0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // qg.e1
    public final void a() {
        w0 w0Var = this.a;
        w0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new i6(w0Var, 16)).setInterpolator(bs.h);
    }

    @Override // qg.e1
    public final boolean d() {
        return true;
    }

    @Override // qg.e1
    public final void e() {
        w0 w0Var = this.a;
        w0Var.b.a.e();
        w0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((ft0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.Z2(true, true);
    }

    @Override // qg.e1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // qg.e1
    public final /* synthetic */ void b() {
    }

    @Override // qg.e1
    public final void c() {
    }
}
