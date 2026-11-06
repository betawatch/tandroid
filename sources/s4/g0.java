package s4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
