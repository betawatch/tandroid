package s4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class g0 extends q {
    public final MediaRouter.RouteInfo a;

    public g0(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // s4.q
    public final void f(int i7) {
        this.a.requestSetVolume(i7);
    }

    @Override // s4.q
    public final void i(int i7) {
        this.a.requestUpdateVolume(i7);
    }
}
