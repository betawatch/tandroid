package p4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
