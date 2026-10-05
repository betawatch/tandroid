package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class w2 extends VideoPlayerHolderBase {
    public final /* synthetic */ x2 a;

    public w2(x2 x2Var) {
        this.a = x2Var;
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
        x2 x2Var = this.a;
        x2Var.n.setAlpha(1.0f);
        TL_iv.pageBlockVideo pageblockvideo = x2Var.L;
        if (pageblockvideo != null) {
            t70 t70Var = x2Var.a;
            a0.i iVar = t70Var.y;
            long j3 = pageblockvideo.video_id;
            y2 a2 = y2.a(t70Var.w, x2Var);
            x2Var.c(a2);
            iVar.k(a2, j3);
        }
    }
}
