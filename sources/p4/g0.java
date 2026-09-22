package p4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
