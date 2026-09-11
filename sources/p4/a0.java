package p4;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a0 extends MediaRouter.Callback {
    public final j0 a;

    public a0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        j0 j0Var = this.a;
        if (j0Var.n(routeInfo)) {
            j0Var.y();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o9;
        j0 j0Var = this.a;
        j0Var.getClass();
        if (j0.s(routeInfo) != null || (o9 = j0Var.o(routeInfo)) < 0) {
            return;
        }
        h0 h0Var = (h0) j0Var.G.get(o9);
        String str = h0Var.b;
        CharSequence name = h0Var.a.getName(j0Var.a);
        l lVar = new l(str, name != null ? name.toString() : "");
        j0Var.u(h0Var, lVar);
        h0Var.c = lVar.b();
        j0Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        j0 j0Var = this.a;
        int o9 = j0Var.o(routeInfo);
        if (o9 >= 0) {
            h0 h0Var = (h0) j0Var.G.get(o9);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != h0Var.c.a.getInt("presentationDisplayId", -1)) {
                m mVar = h0Var.c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar == null) {
                    throw new IllegalArgumentException("descriptor must not be null");
                }
                Bundle bundle = new Bundle(mVar.a);
                ArrayList c10 = mVar.c();
                ArrayList b10 = mVar.b();
                HashSet a2 = mVar.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                h0Var.c = new m(bundle);
                j0Var.y();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o9;
        j0 j0Var = this.a;
        j0Var.getClass();
        if (j0.s(routeInfo) != null || (o9 = j0Var.o(routeInfo)) < 0) {
            return;
        }
        j0Var.G.remove(o9);
        j0Var.y();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        v a2;
        j0 j0Var = this.a;
        if (routeInfo != j0Var.s.getSelectedRoute(8388611)) {
            return;
        }
        i0 s10 = j0.s(routeInfo);
        if (s10 != null) {
            s10.a.l();
            return;
        }
        int o9 = j0Var.o(routeInfo);
        if (o9 >= 0) {
            h0 h0Var = (h0) j0Var.G.get(o9);
            e eVar = j0Var.r;
            String str = h0Var.b;
            eVar.a.removeMessages(262);
            u d = eVar.d(eVar.s);
            if (d == null || (a2 = d.a(str)) == null) {
                return;
            }
            a2.l();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o9;
        j0 j0Var = this.a;
        j0Var.getClass();
        if (j0.s(routeInfo) != null || (o9 = j0Var.o(routeInfo)) < 0) {
            return;
        }
        h0 h0Var = (h0) j0Var.G.get(o9);
        int volume = routeInfo.getVolume();
        if (volume != h0Var.c.a.getInt("volume")) {
            m mVar = h0Var.c;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (mVar == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(mVar.a);
            ArrayList c10 = mVar.c();
            ArrayList b10 = mVar.b();
            HashSet a2 = mVar.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
            h0Var.c = new m(bundle);
            j0Var.y();
        }
    }
}
