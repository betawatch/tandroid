package s4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
