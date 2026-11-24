// default package

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r78 implements Runnable {
    public final /* synthetic */ PhotoViewer a;

    public r78(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PhotoViewer photoViewer = this.a;
        k27 k27Var = photoViewer.T4;
        if (k27Var == null) {
            return;
        }
        ba4.G(k27Var.K1).b0(photoViewer.T4.F0(), true, false);
    }
}
