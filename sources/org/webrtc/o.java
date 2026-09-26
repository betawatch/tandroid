package org.webrtc;

import android.view.Choreographer;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Choreographer.FrameCallback {
    public final /* synthetic */ RenderSynchronizer a;

    public /* synthetic */ o(RenderSynchronizer renderSynchronizer) {
        this.a = renderSynchronizer;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.a.onDisplayRefreshCycleBegin(j3);
    }
}
