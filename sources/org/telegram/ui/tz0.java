package org.telegram.ui;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tz0 implements org.telegram.ui.Components.r51, org.telegram.ui.Components.n51 {
    public final /* synthetic */ uz0 a;

    public /* synthetic */ tz0(uz0 uz0Var) {
        this.a = uz0Var;
    }

    @Override // org.telegram.ui.Components.n51
    public void F(boolean z9, float[] fArr) {
        this.a.V.e(z9, fArr);
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r51
    public void onStateChanged(boolean z9, int i7) {
        uz0 uz0Var = this.a;
        if (i7 == 4) {
            uz0Var.dismiss();
        } else {
            org.telegram.messenger.g0.r(uz0Var.Z);
            org.telegram.messenger.g0.i3(uz0Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.n51
    public boolean s() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.r51
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.h3(new tu0(this, 14));
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.r51
    public void onError(org.telegram.ui.Components.u51 u51Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.r51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
