package s4;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class k extends g3 {
    public final f D;
    public final l2.g0 E;
    public ArrayList F;
    public final ArrayMap G;
    public final MediaRouter2 r;
    public final rt s;
    public final ArrayMap w;
    public final MediaRouter2$RouteCallback x;
    public final j y;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public k(Context context, rt rtVar) {
        super(context, null);
        this.w = new ArrayMap();
        this.y = new j(this);
        this.D = new f(this);
        this.F = new ArrayList();
        this.G = new ArrayMap();
        this.r = MediaRouter2.getInstance(context);
        this.s = rtVar;
        this.E = new l2.g0(new Handler(Looper.getMainLooper()), 1);
        if (Build.VERSION.SDK_INT >= 34) {
            this.x = new i(this, 1);
        } else {
            this.x = new i(this, 0);
        }
    }

    public static Messenger n(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String p(q qVar) {
        MediaRouter2.RoutingController routingController;
        if ((qVar instanceof g) && (routingController = ((g) qVar).g) != null) {
            return routingController.getId();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final p c(String str) {
        Iterator it = this.w.entrySet().iterator();
        while (it.hasNext()) {
            g gVar = (g) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, gVar.f)) {
                return gVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final q d(String str) {
        return new h((String) this.G.get(str), null);
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final q e(String str, String str2) {
        String str3 = (String) this.G.get(str);
        for (g gVar : this.w.values()) {
            if (TextUtils.equals(str2, gVar.p())) {
                return new h(str3, gVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new h(str3, null);
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final void f(n nVar) {
        ArrayList<String> arrayList;
        r rVar;
        RouteDiscoveryPreference build;
        String str;
        int i7 = x.c == null ? 0 : x.c().B;
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.x;
        f fVar = this.D;
        j jVar = this.y;
        if (i7 <= 0) {
            this.r.unregisterRouteCallback(mediaRouter2$RouteCallback);
            this.r.unregisterTransferCallback(jVar);
            this.r.unregisterControllerCallback(fVar);
            return;
        }
        z zVar = x.c().u;
        boolean z9 = zVar == null ? false : zVar.d;
        if (nVar == null) {
            nVar = new n(r.c, false);
        }
        nVar.a();
        ArrayList c10 = nVar.b.c();
        if (!z9) {
            c10.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!c10.contains("android.media.intent.category.LIVE_AUDIO")) {
            c10.add("android.media.intent.category.LIVE_AUDIO");
        }
        if (c10.isEmpty()) {
            arrayList = null;
        } else {
            int size = c10.size();
            int i10 = 0;
            arrayList = null;
            while (i10 < size) {
                Object obj = c10.get(i10);
                i10++;
                String str2 = (String) obj;
                if (str2 == null) {
                    throw new IllegalArgumentException("category must not be null");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList == null) {
            rVar = r.c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            rVar = new r(bundle, arrayList);
        }
        boolean b10 = nVar.b();
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("selector", rVar.a);
        bundle2.putBoolean("activeScan", b10);
        MediaRouter2 mediaRouter2 = this.r;
        rVar.a();
        if (rVar.b.contains(null)) {
            build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        } else {
            boolean z10 = bundle2.getBoolean("activeScan");
            ArrayList arrayList2 = new ArrayList();
            ArrayList c11 = rVar.c();
            int size2 = c11.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = c11.get(i11);
                i11++;
                str = (String) obj2;
                str.getClass();
                switch (str) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str = "android.media.route.feature.LIVE_VIDEO";
                        break;
                }
                arrayList2.add(str);
            }
            build = new RouteDiscoveryPreference.Builder(arrayList2, z10).build();
        }
        l2.g0 g0Var = this.E;
        mediaRouter2.registerRouteCallback(g0Var, mediaRouter2$RouteCallback, build);
        this.r.registerTransferCallback(g0Var, jVar);
        this.r.registerControllerCallback(g0Var, fVar);
    }

    public final MediaRoute2Info o(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            MediaRoute2Info d = s0.b.d(obj);
            if (TextUtils.equals(d.getId(), str)) {
                return d;
            }
        }
        return null;
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator<MediaRoute2Info> it = this.r.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info d = s0.b.d(it.next());
            if (d != null && !arraySet.contains(d) && !d.isSystemRoute()) {
                arraySet.add(d);
                arrayList.add(d);
            }
        }
        if (arrayList.equals(this.F)) {
            return;
        }
        this.F = arrayList;
        ArrayMap arrayMap = this.G;
        arrayMap.clear();
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            MediaRoute2Info d2 = s0.b.d(obj);
            Bundle extras = d2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + d2);
            } else {
                arrayMap.put(d2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.F;
        int size2 = arrayList4.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList4.get(i11);
            i11++;
            MediaRoute2Info d10 = s0.b.d(obj2);
            m w10 = g0.f.w(d10);
            if (d10 != null) {
                arrayList3.add(w10);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i7 < size3) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                m mVar = (m) obj3;
                if (mVar == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList5.contains(mVar)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList5.add(mVar);
            }
        }
        g(new ca.i(arrayList5, true));
    }

    public final void r(MediaRouter2.RoutingController routingController) {
        l lVar;
        g gVar = (g) this.w.get(routingController);
        if (gVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList h = g0.f.h(selectedRoutes);
        int i7 = 0;
        m w10 = g0.f.w(s0.b.d(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.a.getString(R.string.mr_dialog_default_group_name);
        m mVar = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    mVar = new m(bundle);
                }
            } catch (Exception e10) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e10);
            }
        }
        if (mVar == null) {
            lVar = new l(routingController.getId(), string);
            Bundle bundle2 = lVar.a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            lVar = new l(mVar);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = lVar.a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        lVar.c.clear();
        lVar.a(w10.b());
        ArrayList arrayList = lVar.b;
        arrayList.clear();
        if (!h.isEmpty()) {
            int size = h.size();
            while (i7 < size) {
                Object obj = h.get(i7);
                i7++;
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("groupMemberId must not be empty");
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        m b10 = lVar.b();
        ArrayList h7 = g0.f.h(routingController.getSelectableRoutes());
        ArrayList h10 = g0.f.h(routingController.getDeselectableRoutes());
        ca.i iVar = (ca.i) this.n;
        if (iVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<m> list = (List) iVar.c;
        if (!list.isEmpty()) {
            for (m mVar2 : list) {
                String d = mVar2.d();
                arrayList2.add(new o(mVar2, h.contains(d) ? 3 : 1, h10.contains(d), h7.contains(d), true));
            }
        }
        gVar.o = b10;
        gVar.l(b10, arrayList2);
    }

    public final void s(String str) {
        MediaRoute2Info o4 = o(str);
        if (o4 != null) {
            this.r.transferTo(o4);
            return;
        }
        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
    }
}
