package p4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
