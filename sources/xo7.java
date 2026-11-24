// default package

import android.view.View;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xo7 implements g59, ee {
    public final /* synthetic */ NotificationsSettingsActivity a;

    public /* synthetic */ xo7(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.a = notificationsSettingsActivity;
    }

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        this.a.z0(f, i, view);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        this.a.B0();
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
