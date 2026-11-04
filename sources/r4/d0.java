package r4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d0 extends MediaRouter.VolumeCallback {
    public final c0 a;

    public d0(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i3) {
        this.a.a(routeInfo, i3);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i3) {
        this.a.b(routeInfo, i3);
    }
}
