// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xv extends VideoPlayerHolderBase {
    public final /* synthetic */ yv a;

    public xv(yv yvVar) {
        this.a = yvVar;
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
        yv yvVar = this.a;
        yvVar.n.setAlpha(1.0f);
        TL_iv.pageBlockVideo pageblockvideo = yvVar.M;
        if (pageblockvideo != null) {
            xi5 xi5Var = yvVar.a;
            zh6 zh6Var = xi5Var.E;
            long j = pageblockvideo.video_id;
            zv a = zv.a(xi5Var.x, yvVar);
            yvVar.c(a);
            zh6Var.k(j, a);
        }
    }
}
