// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wh3 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ wh3(Activity activity, byte b) {
        this.a = b;
        this.b = activity;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        Activity activity = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (bool.booleanValue()) {
                    if (!use.a()) {
                        use.f();
                        break;
                    } else {
                        activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                        break;
                    }
                }
                break;
            default:
                if (bool.booleanValue()) {
                    if (!use.a()) {
                        use.f();
                        break;
                    } else {
                        activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                        break;
                    }
                }
                break;
        }
    }
}
