// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
