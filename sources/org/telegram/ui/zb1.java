package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zb1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ hc1 a;

    public zb1(hc1 hc1Var) {
        this.a = hc1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.g3(new ru0(this, 25));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(21));
    }
}
