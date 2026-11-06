package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class wb1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ec1 a;

    public wb1(ec1 ec1Var) {
        this.a = ec1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new qu0(this, 25));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l10(13));
    }
}
