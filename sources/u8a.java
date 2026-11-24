// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class u8a extends d {
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
