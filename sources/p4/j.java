package p4;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.sw0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j extends MediaRouter2.TransferCallback {
    public final /* synthetic */ k a;

    public j(k kVar) {
        this.a = kVar;
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onStop(MediaRouter2.RoutingController routingController) {
        q qVar = (q) this.a.v.remove(routingController);
        if (qVar == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
            return;
        }
        e eVar = (e) this.a.s.b;
        if (qVar != eVar.e) {
            int i10 = e.F;
            return;
        }
        v c10 = eVar.c();
        if (eVar.e() != c10) {
            eVar.j(c10, 2);
        }
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        v vVar;
        this.a.v.remove(routingController);
        if (routingController2 == this.a.r.getSystemController()) {
            e eVar = (e) this.a.s.b;
            v c10 = eVar.c();
            if (eVar.e() != c10) {
                eVar.j(c10, 3);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        int i10 = 0;
        String id2 = sw0.e(selectedRoutes.get(0)).getId();
        this.a.v.put(routingController2, new g(this.a, routingController2, id2));
        e eVar2 = (e) this.a.s.b;
        ArrayList arrayList = eVar2.j;
        int size = arrayList.size();
        while (true) {
            if (i10 >= size) {
                vVar = null;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            vVar = (v) obj;
            if (vVar.c() == eVar2.r && TextUtils.equals(id2, vVar.b)) {
                break;
            }
        }
        if (vVar == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id2);
        } else {
            eVar2.j(vVar, 3);
        }
        this.a.r(routingController2);
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
