package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wb1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ fc1 a;

    public wb1(fc1 fc1Var) {
        this.a = fc1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.g3(new qu0(this, 24));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
