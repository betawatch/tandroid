// default package

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pic implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ pic(Activity activity, Intent intent, byte b) {
        this.a = b;
        this.b = activity;
        this.c = intent;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        Intent intent = this.c;
        Activity activity = this.b;
        switch (b) {
            case 0:
                activity.startActivity(intent);
                break;
            default:
                activity.startActivity(intent);
                break;
        }
    }
}
