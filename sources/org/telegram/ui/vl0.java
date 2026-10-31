package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ vl0(long j10, int i10) {
        this.a = i10;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(un.ha(this.b));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(un.ha(this.b));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.b);
                    bundle.putBoolean("my_profile", true);
                    bundle.putBoolean("open_gifts", true);
                    T3.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(un.ha(this.b));
                    break;
                }
                break;
        }
    }
}
