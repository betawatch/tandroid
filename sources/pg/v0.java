package pg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.wr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.yt0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v0 implements og.g1 {
    public final /* synthetic */ w0 a;

    public v0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // og.g1
    public final void a() {
        w0 w0Var = this.a;
        w0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new ai.a(w0Var, 24)).setInterpolator(wr.h);
    }

    @Override // og.g1
    public final boolean d() {
        return true;
    }

    @Override // og.g1
    public final void e() {
        w0 w0Var = this.a;
        w0Var.b.a.e();
        w0Var.w.setViewHidden(false);
        PhotoViewer photoViewer = ((yt0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.T8;
        photoViewer.X2(true, true);
    }

    @Override // og.g1
    public final void f() {
        this.a.w.setViewHidden(true);
    }

    @Override // og.g1
    public final /* synthetic */ void b() {
    }

    @Override // og.g1
    public final void c() {
    }
}
