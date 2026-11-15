package s4;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
