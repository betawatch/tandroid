package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class vb1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ec1 a;

    public vb1(ec1 ec1Var) {
        this.a = ec1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new ru0(this, 24));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
