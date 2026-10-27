package p4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
