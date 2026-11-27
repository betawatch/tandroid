// default package

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ow6 extends MediaRouter.Callback {
    public final kf8 a;

    public ow6(kf8 kf8Var) {
        this.a = kf8Var;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        kf8 kf8Var = this.a;
        if (kf8Var.n(routeInfo)) {
            kf8Var.y();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        kf8 kf8Var = this.a;
        kf8Var.getClass();
        if (kf8.s(routeInfo) != null || (o = kf8Var.o(routeInfo)) < 0) {
            return;
        }
        if8 if8Var = (if8) kf8Var.H.get(o);
        String str = if8Var.b;
        CharSequence name = if8Var.a.getName(kf8Var.a);
        dv6 dv6Var = new dv6(str, name != null ? name.toString() : "");
        kf8Var.u(if8Var, dv6Var);
        if8Var.c = dv6Var.b();
        kf8Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        kf8 kf8Var = this.a;
        int o = kf8Var.o(routeInfo);
        if (o >= 0) {
            if8 if8Var = (if8) kf8Var.H.get(o);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != if8Var.c.a.getInt("presentationDisplayId", -1)) {
                ev6 ev6Var = if8Var.c;
                if (ev6Var == null) {
                    lq5.j("descriptor must not be null");
                    return;
                }
                Bundle bundle = new Bundle(ev6Var.a);
                ArrayList c = ev6Var.c();
                ArrayList b = ev6Var.b();
                HashSet a = ev6Var.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                if8Var.c = new ev6(bundle);
                kf8Var.y();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        kf8 kf8Var = this.a;
        kf8Var.getClass();
        if (kf8.s(routeInfo) != null || (o = kf8Var.o(routeInfo)) < 0) {
            return;
        }
        kf8Var.H.remove(o);
        kf8Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        jw6 a;
        kf8 kf8Var = this.a;
        if (routeInfo == kf8Var.s.getSelectedRoute(8388611)) {
            jf8 s = kf8.s(routeInfo);
            if (s != null) {
                s.a.l();
                return;
            }
            int o = kf8Var.o(routeInfo);
            if (o >= 0) {
                if8 if8Var = (if8) kf8Var.H.get(o);
                a05 a05Var = kf8Var.r;
                String str = if8Var.b;
                a05Var.a.removeMessages(jn7.k4);
                iw6 d = a05Var.d(a05Var.s);
                if (d == null || (a = d.a(str)) == null) {
                    return;
                }
                a.l();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        kf8 kf8Var = this.a;
        kf8Var.getClass();
        if (kf8.s(routeInfo) != null || (o = kf8Var.o(routeInfo)) < 0) {
            return;
        }
        if8 if8Var = (if8) kf8Var.H.get(o);
        int volume = routeInfo.getVolume();
        if (volume != if8Var.c.a.getInt("volume")) {
            ev6 ev6Var = if8Var.c;
            if (ev6Var == null) {
                lq5.j("descriptor must not be null");
                return;
            }
            Bundle bundle = new Bundle(ev6Var.a);
            ArrayList c = ev6Var.c();
            ArrayList b = ev6Var.b();
            HashSet a = ev6Var.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
            if8Var.c = new ev6(bundle);
            kf8Var.y();
        }
    }
}
