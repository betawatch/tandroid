// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
