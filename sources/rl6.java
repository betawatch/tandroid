// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
