package p4;

import android.media.MediaRouter2;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class f extends MediaRouter2.ControllerCallback {
    public final /* synthetic */ k a;

    public f(k kVar) {
        this.a = kVar;
    }

    @Override // android.media.MediaRouter2.ControllerCallback
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.r(routingController);
    }
}
