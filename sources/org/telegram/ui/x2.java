package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class x2 extends VideoPlayerHolderBase {
    public final /* synthetic */ y2 a;

    public x2(y2 y2Var) {
        this.a = y2Var;
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
        y2 y2Var = this.a;
        y2Var.n.setAlpha(1.0f);
        TL_iv.pageBlockVideo pageblockvideo = y2Var.L;
        if (pageblockvideo != null) {
            f70 f70Var = y2Var.a;
            a0.h hVar = f70Var.y;
            long j10 = pageblockvideo.video_id;
            z2 a2 = z2.a(f70Var.w, y2Var);
            y2Var.c(a2);
            hVar.k(a2, j10);
        }
    }
}
