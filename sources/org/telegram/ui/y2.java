package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class y2 extends VideoPlayerHolderBase {
    public final /* synthetic */ z2 a;

    public y2(z2 z2Var) {
        this.a = z2Var;
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
        z2 z2Var = this.a;
        z2Var.n.setAlpha(1.0f);
        TL_iv.pageBlockVideo pageblockvideo = z2Var.L;
        if (pageblockvideo != null) {
            b70 b70Var = z2Var.a;
            a0.h hVar = b70Var.y;
            long j10 = pageblockvideo.video_id;
            a3 a2 = a3.a(b70Var.w, z2Var);
            z2Var.c(a2);
            hVar.k(a2, j10);
        }
    }
}
