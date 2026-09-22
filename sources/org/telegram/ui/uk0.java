package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class uk0 implements org.telegram.ui.Components.nl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ NotificationsSettingsActivity a;

    public /* synthetic */ uk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.a = notificationsSettingsActivity;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.a, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsSettingsActivity.Z(this.a);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
