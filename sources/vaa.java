// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class vaa extends d {
    @Override // org.telegram.ui.ActionBar.d
    public final Context getContext() {
        return gm.W(LaunchActivity.H1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Activity getParentActivity() {
        Activity W = gm.W(a.b);
        return W == null ? LaunchActivity.H1 : W;
    }
}
