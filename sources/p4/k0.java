package p4;

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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class k0 extends l0 implements c0 {
    public static final ArrayList I;
    public static final ArrayList J;
    public int D;
    public boolean E;
    public boolean F;
    public final ArrayList G;
    public final ArrayList H;
    public final e r;
    public final MediaRouter s;
    public final b0 w;
    public final MediaRouter.VolumeCallback x;
    public final MediaRouter.RouteCategory y;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        I = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        J = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public k0(Context context, e eVar) {
        super(context, new l2.f(new ComponentName("android", l0.class.getName()), 22));
        this.G = new ArrayList();
        this.H = new ArrayList();
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
        boolean z10 = this.F;
        b0 b0Var = this.w;
        MediaRouter mediaRouter = this.s;
        if (z10) {
            mediaRouter.removeCallback(b0Var);
        }
        this.F = true;
        mediaRouter.addCallback(this.D, b0Var, (this.E ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z10 = false;
        for (int i10 = 0; i10 < routeCount; i10++) {
            arrayList.add(mediaRouter.getRouteAt(i10));
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
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

    @Override // p4.c0
    public final void a(MediaRouter.RouteInfo routeInfo, int i10) {
        j0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.a.j(i10);
        }
    }

    @Override // p4.c0
    public final void b(MediaRouter.RouteInfo routeInfo, int i10) {
        j0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.a.k(i10);
        }
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final q d(String str) {
        int p5 = p(str);
        if (p5 >= 0) {
            return new h0(((i0) this.G.get(p5)).a);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final void f(n nVar) {
        boolean z10;
        int i10 = 0;
        if (nVar != null) {
            nVar.a();
            ArrayList c10 = nVar.b.c();
            int size = c10.size();
            int i11 = 0;
            while (i10 < size) {
                String str = (String) c10.get(i10);
                i11 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i11 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i11 | 2 : i11 | TLObject.FLAG_23;
                i10++;
            }
            z10 = nVar.b();
            i10 = i11;
        } else {
            z10 = false;
        }
        if (this.D == i10 && this.E == z10) {
            return;
        }
        this.D = i10;
        this.E = z10;
        B();
    }

    public final boolean n(MediaRouter.RouteInfo routeInfo) {
        String format;
        String str;
        if (s(routeInfo) != null || o(routeInfo) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo r10 = r();
        Context context = this.a;
        if (r10 == routeInfo) {
            format = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = routeInfo.getName(context);
            format = String.format(locale, "ROUTE_%08x", Integer.valueOf((name != null ? name.toString() : "").hashCode()));
        }
        if (p(format) >= 0) {
            int i10 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str = format + "_" + i10;
                if (p(str) < 0) {
                    break;
                }
                i10++;
            }
            format = str;
        }
        i0 i0Var = new i0(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        l lVar = new l(format, name2 != null ? name2.toString() : "");
        u(i0Var, lVar);
        i0Var.c = lVar.b();
        this.G.add(i0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((i0) arrayList.get(i10)).a == routeInfo) {
                return i10;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((i0) arrayList.get(i10)).b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final int q(w wVar) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((j0) arrayList.get(i10)).a == wVar) {
                return i10;
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
            lVar.a(I);
        }
        if ((supportedTypes & 2) != 0) {
            lVar.a(J);
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
        g3 c10 = wVar.c();
        MediaRouter mediaRouter = this.s;
        if (c10 == this) {
            int o10 = o(mediaRouter.getSelectedRoute(8388611));
            if (o10 < 0 || !((i0) this.G.get(o10)).b.equals(wVar.b)) {
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
        this.H.add(j0Var);
        mediaRouter.addUserRoute(createUserRoute);
    }

    public final void w(w wVar) {
        int q6;
        if (wVar.c() == this || (q6 = q(wVar)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((j0) this.H.remove(q6)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.s.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
        }
    }

    public final void x(w wVar) {
        if (wVar.g()) {
            if (wVar.c() != this) {
                int q6 = q(wVar);
                if (q6 >= 0) {
                    z(((j0) this.H.get(q6)).b);
                    return;
                }
                return;
            }
            int p5 = p(wVar.b);
            if (p5 >= 0) {
                z(((i0) this.G.get(p5)).a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.G;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = ((i0) arrayList2.get(i10)).c;
            if (mVar == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList.contains(mVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList.add(mVar);
        }
        g(new b2.u(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.s.selectRoute(8388611, routeInfo);
    }
}
