package rg;

import android.graphics.drawable.Drawable;
import ei.i6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ht0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
