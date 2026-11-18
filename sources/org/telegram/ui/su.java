package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class su implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ su(Activity activity, int i7) {
        this.a = i7;
        this.b = activity;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!c8.na.a()) {
                        c8.na.f();
                        break;
                    } else {
                        this.b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                        break;
                    }
                }
                break;
            default:
                if (bool.booleanValue()) {
                    if (!c8.na.a()) {
                        c8.na.f();
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
