package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class su implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ su(Activity activity, int i7) {
        this.a = i7;
        this.b = activity;
    }

    @Override // org.telegram.messenger.y10
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
