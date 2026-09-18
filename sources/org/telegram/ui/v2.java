package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class v2 extends VideoPlayerHolderBase {
    public final /* synthetic */ w2 a;

    public v2(w2 w2Var) {
        this.a = w2Var;
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
        w2 w2Var = this.a;
        w2Var.n.setAlpha(1.0f);
        TL_iv.pageBlockVideo pageblockvideo = w2Var.L;
        if (pageblockvideo != null) {
            w70 w70Var = w2Var.a;
            a0.i iVar = w70Var.y;
            long j3 = pageblockvideo.video_id;
            x2 a2 = x2.a(w70Var.w, w2Var);
            w2Var.c(a2);
            iVar.k(a2, j3);
        }
    }
}
