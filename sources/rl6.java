// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rl6 implements Runnable {
    public final /* synthetic */ MediaController a;

    public rl6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaController mediaController = this.a;
        k27 k27Var = mediaController.v0;
        if (k27Var == null) {
            return;
        }
        ba4.G(k27Var.K1).b0(mediaController.v0.F0(), true, false);
    }
}
