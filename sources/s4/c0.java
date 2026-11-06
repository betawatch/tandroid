package s4;

import android.media.MediaRouter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c0 extends MediaRouter.VolumeCallback {
    public final b0 a;

    public c0(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i7) {
        this.a.a(routeInfo, i7);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i7) {
        this.a.b(routeInfo, i7);
    }
}
