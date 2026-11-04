package r4;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class k0 extends l0 implements c0 {
    public static final ArrayList J;
    public static final ArrayList K;
    public int E;
    public boolean F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public final e r;
    public final MediaRouter s;
    public final b0 w;
    public final MediaRouter.VolumeCallback x;
    public final MediaRouter.RouteCategory y;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        J = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        K = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public k0(Context context, e eVar) {
        super(context, new nh(new ComponentName("android", l0.class.getName()), 15));
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.s = mediaRouter;
        this.w = new b0(this);
        this.x = e0.a(this);
        this.y = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        B();
    }

    public static j0 s(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof j0) {
            return (j0) tag;
        }
        return null;
    }

    public void A() {
        boolean z10 = this.G;
        b0 b0Var = this.w;
        MediaRouter mediaRouter = this.s;
        if (z10) {
            mediaRouter.removeCallback(b0Var);
        }
        this.G = true;
        mediaRouter.addCallback(this.E, b0Var, (this.F ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z10 = false;
        for (int i3 = 0; i3 < routeCount; i3++) {
            arrayList.add(mediaRouter.getRouteAt(i3));
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z10 |= n((MediaRouter.RouteInfo) obj);
        }
        if (z10) {
            y();
        }
    }

    public void C(j0 j0Var) {
        MediaRouter.UserRouteInfo userRouteInfo = j0Var.b;
        w wVar = j0Var.a;
        userRouteInfo.setName(wVar.d);
        userRouteInfo.setPlaybackType(wVar.l);
        userRouteInfo.setPlaybackStream(wVar.m);
        userRouteInfo.setVolume(wVar.p);
        userRouteInfo.setVolumeMax(wVar.q);
        userRouteInfo.setVolumeHandling((!wVar.e() || y.g()) ? wVar.o : 0);
        userRouteInfo.setDescription(wVar.e);
    }

    @Override // r4.c0
    public final void a(MediaRouter.RouteInfo routeInfo, int i3) {
        j0 s6 = s(routeInfo);
        if (s6 != null) {
            s6.a.j(i3);
        }
    }

    @Override // r4.c0
    public final void b(MediaRouter.RouteInfo routeInfo, int i3) {
        j0 s6 = s(routeInfo);
        if (s6 != null) {
            s6.a.k(i3);
        }
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final q d(String str) {
        int p10 = p(str);
        if (p10 >= 0) {
            return new h0(((i0) this.H.get(p10)).a);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final void f(n nVar) {
        boolean z10;
        int i3 = 0;
        if (nVar != null) {
            nVar.a();
            ArrayList c2 = nVar.b.c();
            int size = c2.size();
            int i10 = 0;
            while (i3 < size) {
                String str = (String) c2.get(i3);
                i10 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i10 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i10 | 2 : i10 | TLObject.FLAG_23;
                i3++;
            }
            z10 = nVar.b();
            i3 = i10;
        } else {
            z10 = false;
        }
        if (this.E == i3 && this.F == z10) {
            return;
        }
        this.E = i3;
        this.F = z10;
        B();
    }

    public final boolean n(MediaRouter.RouteInfo routeInfo) {
        String format;
        String str;
        if (s(routeInfo) != null || o(routeInfo) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo r5 = r();
        Context context = this.a;
        if (r5 == routeInfo) {
            format = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = routeInfo.getName(context);
            format = String.format(locale, "ROUTE_%08x", Integer.valueOf((name != null ? name.toString() : "").hashCode()));
        }
        if (p(format) >= 0) {
            int i3 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str = format + "_" + i3;
                if (p(str) < 0) {
                    break;
                }
                i3++;
            }
            format = str;
        }
        i0 i0Var = new i0(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        l lVar = new l(format, name2 != null ? name2.toString() : "");
        u(i0Var, lVar);
        i0Var.c = lVar.b();
        this.H.add(i0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((i0) arrayList.get(i3)).a == routeInfo) {
                return i3;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((i0) arrayList.get(i3)).b.equals(str)) {
                return i3;
            }
        }
        return -1;
    }

    public final int q(w wVar) {
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((j0) arrayList.get(i3)).a == wVar) {
                return i3;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.s.getDefaultRoute();
    }

    public boolean t(i0 i0Var) {
        return i0Var.a.isConnecting();
    }

    public void u(i0 i0Var, l lVar) {
        MediaRouter.RouteInfo routeInfo = i0Var.a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            lVar.a(J);
        }
        if ((supportedTypes & 2) != 0) {
            lVar.a(K);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = lVar.a;
        Bundle bundle2 = lVar.a;
        bundle.putInt("playbackType", playbackType);
        bundle2.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle2.putInt("volume", routeInfo.getVolume());
        bundle2.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle2.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle2.putBoolean("isSystemRoute", (supportedTypes & TLObject.FLAG_23) == 0);
        if (!routeInfo.isEnabled()) {
            bundle2.putBoolean("enabled", false);
        }
        if (t(i0Var)) {
            bundle2.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle2.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle2.putString("status", description.toString());
        }
    }

    public final void v(w wVar) {
        g3 c2 = wVar.c();
        MediaRouter mediaRouter = this.s;
        if (c2 == this) {
            int o10 = o(mediaRouter.getSelectedRoute(8388611));
            if (o10 < 0 || !((i0) this.H.get(o10)).b.equals(wVar.b)) {
                return;
            }
            wVar.l();
            return;
        }
        MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.y);
        j0 j0Var = new j0(wVar, createUserRoute);
        createUserRoute.setTag(j0Var);
        createUserRoute.setVolumeCallback(this.x);
        C(j0Var);
        this.I.add(j0Var);
        mediaRouter.addUserRoute(createUserRoute);
    }

    public final void w(w wVar) {
        int q10;
        if (wVar.c() == this || (q10 = q(wVar)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((j0) this.I.remove(q10)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.s.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e10) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e10);
        }
    }

    public final void x(w wVar) {
        if (wVar.g()) {
            if (wVar.c() != this) {
                int q10 = q(wVar);
                if (q10 >= 0) {
                    z(((j0) this.I.get(q10)).b);
                    return;
                }
                return;
            }
            int p10 = p(wVar.b);
            if (p10 >= 0) {
                z(((i0) this.H.get(p10)).a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.H;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = ((i0) arrayList2.get(i3)).c;
            if (mVar == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList.contains(mVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList.add(mVar);
        }
        g(new ba.i(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.s.selectRoute(8388611, routeInfo);
    }
}
