package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
            t70 t70Var = y2Var.a;
            a0.i iVar = t70Var.y;
            long j3 = pageblockvideo.video_id;
            z2 a2 = z2.a(t70Var.w, y2Var);
            y2Var.c(a2);
            iVar.k(a2, j3);
        }
    }
}
