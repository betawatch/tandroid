package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
            d70 d70Var = z2Var.a;
            a0.h hVar = d70Var.y;
            long j10 = pageblockvideo.video_id;
            a3 a2 = a3.a(d70Var.w, z2Var);
            z2Var.c(a2);
            hVar.k(a2, j10);
        }
    }
}
