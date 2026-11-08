package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class zk extends fi.m3 {
    public final /* synthetic */ an W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(an anVar, Activity activity) {
        super(activity, 3);
        this.W0 = anVar;
    }

    @Override // fi.m3, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        setTranslationY(((-getTop()) - org.telegram.messenger.g0.L(120.0f)) + this.W0.Q1);
    }
}
