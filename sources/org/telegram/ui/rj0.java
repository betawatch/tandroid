package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ ek0 c;
    public final /* synthetic */ View d;

    public /* synthetic */ rj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ek0 ek0Var, View view, int i9, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = ek0Var;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.j0(this.c, this.d, false);
                break;
            case 1:
                this.b.d0(this.c, this.d);
                break;
            case 2:
                NotificationsCustomSettingsActivity.W(this.b, this.c, this.d);
                break;
            case 3:
                NotificationsCustomSettingsActivity.U(this.b, this.c, this.d);
                break;
            case 4:
                this.b.d0(this.c, this.d);
                break;
            default:
                this.b.j0(this.c, this.d, true);
                break;
        }
    }

    public /* synthetic */ rj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ek0 ek0Var, View view, boolean z10, int i9) {
        this.a = i9;
        this.b = notificationsCustomSettingsActivity;
        this.c = ek0Var;
        this.d = view;
    }
}
