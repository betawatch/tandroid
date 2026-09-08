package p4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c0 extends MediaRouter.VolumeCallback {
    public final b0 a;

    public c0(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.a.a(routeInfo, i10);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.a.b(routeInfo, i10);
    }
}
