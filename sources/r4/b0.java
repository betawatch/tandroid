package r4;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 extends MediaRouter.Callback {
    public final k0 a;

    public b0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        k0 k0Var = this.a;
        if (k0Var.n(routeInfo)) {
            k0Var.y();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        k0 k0Var = this.a;
        k0Var.getClass();
        if (k0.s(routeInfo) != null || (o10 = k0Var.o(routeInfo)) < 0) {
            return;
        }
        i0 i0Var = (i0) k0Var.H.get(o10);
        String str = i0Var.b;
        CharSequence name = i0Var.a.getName(k0Var.a);
        l lVar = new l(str, name != null ? name.toString() : "");
        k0Var.u(i0Var, lVar);
        i0Var.c = lVar.b();
        k0Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i3) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        k0 k0Var = this.a;
        int o10 = k0Var.o(routeInfo);
        if (o10 >= 0) {
            i0 i0Var = (i0) k0Var.H.get(o10);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != i0Var.c.a.getInt("presentationDisplayId", -1)) {
                m mVar = i0Var.c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar == null) {
                    throw new IllegalArgumentException("descriptor must not be null");
                }
                Bundle bundle = new Bundle(mVar.a);
                ArrayList c2 = mVar.c();
                ArrayList b10 = mVar.b();
                HashSet a10 = mVar.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c2));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(a10));
                i0Var.c = new m(bundle);
                k0Var.y();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        k0 k0Var = this.a;
        k0Var.getClass();
        if (k0.s(routeInfo) != null || (o10 = k0Var.o(routeInfo)) < 0) {
            return;
        }
        k0Var.H.remove(o10);
        k0Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i3, MediaRouter.RouteInfo routeInfo) {
        w a10;
        k0 k0Var = this.a;
        if (routeInfo != k0Var.s.getSelectedRoute(8388611)) {
            return;
        }
        j0 s6 = k0.s(routeInfo);
        if (s6 != null) {
            s6.a.l();
            return;
        }
        int o10 = k0Var.o(routeInfo);
        if (o10 >= 0) {
            i0 i0Var = (i0) k0Var.H.get(o10);
            e eVar = k0Var.r;
            String str = i0Var.b;
            eVar.a.removeMessages(hs.l4);
            v d = eVar.d(eVar.s);
            if (d == null || (a10 = d.a(str)) == null) {
                return;
            }
            a10.l();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i3, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        k0 k0Var = this.a;
        k0Var.getClass();
        if (k0.s(routeInfo) != null || (o10 = k0Var.o(routeInfo)) < 0) {
            return;
        }
        i0 i0Var = (i0) k0Var.H.get(o10);
        int volume = routeInfo.getVolume();
        if (volume != i0Var.c.a.getInt("volume")) {
            m mVar = i0Var.c;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (mVar == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(mVar.a);
            ArrayList c2 = mVar.c();
            ArrayList b10 = mVar.b();
            HashSet a10 = mVar.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c2));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(a10));
            i0Var.c = new m(bundle);
            k0Var.y();
        }
    }
}
