// default package

import android.media.MediaRouter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vd8 extends vv6 {
    public final MediaRouter.RouteInfo a;

    public vd8(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // vv6
    public final void f(int i) {
        this.a.requestSetVolume(i);
    }

    @Override // vv6
    public final void i(int i) {
        this.a.requestUpdateVolume(i);
    }
}
