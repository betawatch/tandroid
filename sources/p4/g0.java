package p4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class g0 extends q {
    public final MediaRouter.RouteInfo a;

    public g0(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // p4.q
    public final void f(int i10) {
        this.a.requestSetVolume(i10);
    }

    @Override // p4.q
    public final void i(int i10) {
        this.a.requestUpdateVolume(i10);
    }
}
