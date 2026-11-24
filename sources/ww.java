// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ww extends VideoPlayerHolderBase {
    public final /* synthetic */ xw a;

    public ww(xw xwVar) {
        this.a = xwVar;
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
        xw xwVar = this.a;
        xwVar.n.setAlpha(1.0f);
        TL_iv.pageBlockVideo pageblockvideo = xwVar.M;
        if (pageblockvideo != null) {
            ui5 ui5Var = xwVar.a;
            vh6 vh6Var = ui5Var.E;
            long j = pageblockvideo.video_id;
            yw a = yw.a(ui5Var.x, xwVar);
            xwVar.c(a);
            vh6Var.k(a, j);
        }
    }
}
