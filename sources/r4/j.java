package r4;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends MediaRouter2$TransferCallback {
    public final /* synthetic */ k a;

    public j(k kVar) {
        this.a = kVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        k kVar = this.a;
        q qVar = (q) kVar.w.remove(routingController);
        if (qVar == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
            return;
        }
        e eVar = (e) kVar.s.b;
        if (qVar != eVar.e) {
            int i3 = e.F;
            return;
        }
        w c2 = eVar.c();
        if (eVar.e() != c2) {
            eVar.j(c2, 2);
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        w wVar;
        this.a.w.remove(routingController);
        if (routingController2 == this.a.r.getSystemController()) {
            e eVar = (e) this.a.s.b;
            w c2 = eVar.c();
            if (eVar.e() != c2) {
                eVar.j(c2, 3);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        int i3 = 0;
        String id2 = org.telegram.utils.twidget.a.b(selectedRoutes.get(0)).getId();
        this.a.w.put(routingController2, new g(this.a, routingController2, id2));
        e eVar2 = (e) this.a.s.b;
        ArrayList arrayList = eVar2.j;
        int size = arrayList.size();
        while (true) {
            if (i3 >= size) {
                wVar = null;
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            wVar = (w) obj;
            if (wVar.c() == eVar2.r && TextUtils.equals(id2, wVar.b)) {
                break;
            }
        }
        if (wVar == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id2);
        } else {
            eVar2.j(wVar, 3);
        }
        this.a.r(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
