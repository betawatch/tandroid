package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        TL_iv.pageBlockVideo pageblockvideo = v2Var.M;
        if (pageblockvideo != null) {
            p50 p50Var = v2Var.a;
            a0.h hVar = p50Var.E;
            long j3 = pageblockvideo.video_id;
            w2 a10 = w2.a(p50Var.x, v2Var);
            v2Var.c(a10);
            hVar.k(a10, j3);
        }
    }
}
