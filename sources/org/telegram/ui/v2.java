package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
            u70 u70Var = w2Var.a;
            a0.i iVar = u70Var.y;
            long j3 = pageblockvideo.video_id;
            x2 a2 = x2.a(u70Var.w, w2Var);
            w2Var.c(a2);
            iVar.k(a2, j3);
        }
    }
}
