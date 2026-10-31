package xh;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m3 extends org.telegram.ui.ActionBar.k2 {
    @Override // org.telegram.ui.ActionBar.k2
    public final Context getContext() {
        return org.telegram.messenger.i0.W(LaunchActivity.I1);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.k2, org.telegram.ui.Components.s40
    public final Activity getParentActivity() {
        Activity W = org.telegram.messenger.i0.W(org.telegram.messenger.w0.b);
        return W == null ? LaunchActivity.I1 : W;
    }
}
