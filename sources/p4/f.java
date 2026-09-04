package p4;

import android.media.MediaRouter2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
