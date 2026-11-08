package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class xb1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ fc1 a;

    public xb1(fc1 fc1Var) {
        this.a = fc1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new ru0(this, 25));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(15));
    }
}
