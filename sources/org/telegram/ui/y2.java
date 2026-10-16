package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
            z70 z70Var = z2Var.a;
            a0.h hVar = z70Var.y;
            long j10 = pageblockvideo.video_id;
            a3 a2 = a3.a(z70Var.w, z2Var);
            z2Var.c(a2);
            hVar.k(a2, j10);
        }
    }
}
