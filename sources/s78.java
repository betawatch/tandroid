// default package

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class s78 implements ub5 {
    public final /* synthetic */ PhotoViewer a;

    public s78(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i) {
        PhotoViewer photoViewer = this.a;
        photoViewer.P4 = -1;
        jl5 jl5Var = photoViewer.j5;
        if (jl5Var != null) {
            jl5Var.a();
            photoViewer.j5 = null;
        }
        photoViewer.l5 = true;
        photoViewer.J1(i);
        photoViewer.l5 = false;
    }
}
