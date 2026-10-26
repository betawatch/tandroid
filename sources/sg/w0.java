package sg;

import android.graphics.drawable.Drawable;
import fi.e4;
import org.telegram.ui.Components.ds;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class w0 implements rg.b1 {
    public final /* synthetic */ x0 a;

    public w0(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // rg.b1
    public final void a() {
        x0 x0Var = this.a;
        x0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new e4(x0Var, 19)).setInterpolator(ds.h);
    }

    @Override // rg.b1
    public final boolean d() {
        return true;
    }

    @Override // rg.b1
    public final void e() {
        x0 x0Var = this.a;
        x0Var.b.a.a();
        x0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((mt0) x0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.Z2(true, true);
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
