package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ti0 implements org.telegram.ui.Components.hk0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ NotificationsSettingsActivity a;

    public /* synthetic */ ti0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.a = notificationsSettingsActivity;
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.c0(this.a, view, i10, f7);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        NotificationsSettingsActivity.d0(this.a);
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
