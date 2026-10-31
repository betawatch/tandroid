package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ vv(Activity activity, int i10) {
        this.a = i10;
        this.b = activity;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!w7.c6.a()) {
                        w7.c6.f();
                        break;
                    } else {
                        this.b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                        break;
                    }
                }
                break;
            default:
                if (bool.booleanValue()) {
                    if (!w7.c6.a()) {
                        w7.c6.f();
                        break;
                    } else {
                        this.b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                        break;
                    }
                }
                break;
        }
    }
}
