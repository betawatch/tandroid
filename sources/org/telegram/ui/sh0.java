package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh0 implements org.telegram.ui.Components.pj0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ NotificationsSettingsActivity a;

    public /* synthetic */ sh0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.a = notificationsSettingsActivity;
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.pj0
    public void f(float f10, float f11, int i7, View view) {
        NotificationsSettingsActivity.d0(this.a, view, i7, f10);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        NotificationsSettingsActivity.e0(this.a);
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
