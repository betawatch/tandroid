// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wv extends VideoPlayerHolderBase {
    public final /* synthetic */ xv a;

    public wv(xv xvVar) {
        this.a = xvVar;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return true;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
        if (this.firstFrameRendered) {
            return;
        }
        this.firstFrameRendered = true;
        xv xvVar = this.a;
        xvVar.n.setAlpha(1.0f);
        TL_iv.pageBlockVideo pageblockvideo = xvVar.M;
        if (pageblockvideo != null) {
            vg5 vg5Var = xvVar.a;
            vf6 vf6Var = vg5Var.E;
            long j = pageblockvideo.video_id;
            yv a = yv.a(vg5Var.x, xvVar);
            xvVar.c(a);
            vf6Var.k(a, j);
        }
    }
}
