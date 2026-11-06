package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ ru(Activity activity, int i7) {
        this.a = i7;
        this.b = activity;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!c8.ia.a()) {
                        c8.ia.f();
                        break;
                    } else {
                        this.b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                        break;
                    }
                }
                break;
            default:
                if (bool.booleanValue()) {
                    if (!c8.ia.a()) {
                        c8.ia.f();
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
