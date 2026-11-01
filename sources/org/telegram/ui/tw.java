package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tw extends th.m {
    public final /* synthetic */ zx O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(zx zxVar, Context context, zx zxVar2, int i10, int i11) {
        super(context, zxVar2, i10, i11);
        this.O0 = zxVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.k2) this.O0).actionBar;
        return !lVar.u() && super.dispatchTouchEvent(motionEvent);
    }
}
