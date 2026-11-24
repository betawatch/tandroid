// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class v8a extends d {
    @Override // org.telegram.ui.ActionBar.d
    public final Context getContext() {
        return gl.W(LaunchActivity.H1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Activity getParentActivity() {
        Activity W = gl.W(a.b);
        return W == null ? LaunchActivity.H1 : W;
    }
}
