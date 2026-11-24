// default package

import android.media.MediaRouter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
