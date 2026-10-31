package p4;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        e eVar = (e) kVar.s.a;
        if (qVar != eVar.e) {
            int i10 = e.F;
            return;
        }
        w c10 = eVar.c();
        if (eVar.e() != c10) {
            eVar.j(c10, 2);
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        w wVar;
        this.a.w.remove(routingController);
        if (routingController2 == this.a.r.getSystemController()) {
            e eVar = (e) this.a.s.a;
            w c10 = eVar.c();
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
        String id2 = org.telegram.utils.twidget.t.j(selectedRoutes.get(0)).getId();
        this.a.w.put(routingController2, new g(this.a, routingController2, id2));
        e eVar2 = (e) this.a.s.a;
        ArrayList arrayList = eVar2.j;
        int size = arrayList.size();
        while (true) {
            if (i10 >= size) {
                wVar = null;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
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
