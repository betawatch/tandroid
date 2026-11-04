package r4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h0 extends q {
    public final MediaRouter.RouteInfo a;

    public h0(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // r4.q
    public final void f(int i3) {
        this.a.requestSetVolume(i3);
    }

    @Override // r4.q
    public final void i(int i3) {
        this.a.requestUpdateVolume(i3);
    }
}
