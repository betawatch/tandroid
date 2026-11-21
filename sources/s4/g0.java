package s4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
