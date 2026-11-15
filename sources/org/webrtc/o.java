package org.webrtc;

import android.view.Choreographer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
