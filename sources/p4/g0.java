package p4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
