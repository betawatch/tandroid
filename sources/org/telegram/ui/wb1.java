package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wb1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ec1 a;

    public wb1(ec1 ec1Var) {
        this.a = ec1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new pu0(this, 25));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ih(19));
    }
}
