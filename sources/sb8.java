// default package

import android.media.MediaRouter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sb8 extends vt6 {
    public final MediaRouter.RouteInfo a;

    public sb8(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // vt6
    public final void f(int i) {
        this.a.requestSetVolume(i);
    }

    @Override // vt6
    public final void i(int i) {
        this.a.requestUpdateVolume(i);
    }
}
