package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
            j70 j70Var = w2Var.a;
            a0.h hVar = j70Var.y;
            long j10 = pageblockvideo.video_id;
            x2 a2 = x2.a(j70Var.w, w2Var);
            w2Var.c(a2);
            hVar.k(a2, j10);
        }
    }
}
