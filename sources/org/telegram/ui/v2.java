package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
            h70 h70Var = w2Var.a;
            a0.h hVar = h70Var.y;
            long j10 = pageblockvideo.video_id;
            x2 a2 = x2.a(h70Var.w, w2Var);
            w2Var.c(a2);
            hVar.k(a2, j10);
        }
    }
}
