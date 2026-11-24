// default package

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q78 implements Runnable {
    public final /* synthetic */ PhotoViewer a;

    public q78(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PhotoViewer photoViewer = this.a;
        k27 k27Var = photoViewer.S4;
        if (k27Var == null) {
            return;
        }
        ba4.G(k27Var.K1).b0(photoViewer.S4.F0(), true, false);
    }
}
