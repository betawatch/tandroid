package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ sv(Activity activity, int i9) {
        this.a = i9;
        this.b = activity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                dy.z0(this.b, (Boolean) obj);
                break;
            default:
                dy.q0(this.b, (Boolean) obj);
                break;
        }
    }
}
