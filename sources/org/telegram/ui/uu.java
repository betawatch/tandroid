package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uu implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ uu(Activity activity, int i7) {
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
