package s4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
