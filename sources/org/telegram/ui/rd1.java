package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rd1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ be1 a;

    public rd1(be1 be1Var) {
        this.a = be1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        org.telegram.messenger.i0.g3(new wv0(this, 26));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
