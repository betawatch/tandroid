package sg;

import android.graphics.drawable.Drawable;
import fi.e4;
import org.telegram.ui.Components.ds;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ot0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v0 implements rg.b1 {
    public final /* synthetic */ w0 a;

    public v0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // rg.b1
    public final void a() {
        w0 w0Var = this.a;
        w0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new e4(w0Var, 19)).setInterpolator(ds.h);
    }

    @Override // rg.b1
    public final boolean d() {
        return true;
    }

    @Override // rg.b1
    public final void e() {
        w0 w0Var = this.a;
        w0Var.b.a.a();
        w0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((ot0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.a3(true, true);
    }

    @Override // rg.b1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // rg.b1
    public final /* synthetic */ void b() {
    }

    @Override // rg.b1
    public final void c() {
    }
}
