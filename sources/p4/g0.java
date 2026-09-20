package p4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
