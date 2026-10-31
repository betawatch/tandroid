package p4;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ k a;

    public f(k kVar) {
        this.a = kVar;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.r(routingController);
    }
}
