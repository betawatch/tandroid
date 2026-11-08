package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class u2 extends VideoPlayerHolderBase {
    public final /* synthetic */ v2 a;

    public u2(v2 v2Var) {
        this.a = v2Var;
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
        v2 v2Var = this.a;
        v2Var.n.setAlpha(1.0f);
        TL_iv.pageBlockVideo pageblockvideo = v2Var.L;
        if (pageblockvideo != null) {
            o50 o50Var = v2Var.a;
            a0.h hVar = o50Var.D;
            long j3 = pageblockvideo.video_id;
            w2 a10 = w2.a(o50Var.x, v2Var);
            v2Var.c(a10);
            hVar.k(a10, j3);
        }
    }
}
