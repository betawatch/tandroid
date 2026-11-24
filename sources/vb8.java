// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class vb8 extends wt6 implements ku6 {
    public static final ArrayList J;
    public static final ArrayList K;
    public int E;
    public boolean F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public final ux4 r;
    public final MediaRouter s;
    public final ju6 w;
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

    public vb8(Context context, ux4 ux4Var) {
        super(context, new z24((Object) new ComponentName("android", vb8.class.getName()), (byte) 18));
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.r = ux4Var;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.s = mediaRouter;
        this.w = new ju6(this);
        this.x = mu6.a(this);
        this.y = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        B();
    }

    public static ub8 s(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof ub8) {
            return (ub8) tag;
        }
        return null;
    }

    public void A() {
        boolean z = this.G;
        ju6 ju6Var = this.w;
        MediaRouter mediaRouter = this.s;
        if (z) {
            mediaRouter.removeCallback(ju6Var);
        }
        this.G = true;
        mediaRouter.addCallback(this.E, ju6Var, (this.F ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            z |= n((MediaRouter.RouteInfo) obj);
        }
        if (z) {
            y();
        }
    }

    public void C(ub8 ub8Var) {
        MediaRouter.UserRouteInfo userRouteInfo = ub8Var.b;
        eu6 eu6Var = ub8Var.a;
        userRouteInfo.setName(eu6Var.d);
        userRouteInfo.setPlaybackType(eu6Var.l);
        userRouteInfo.setPlaybackStream(eu6Var.m);
        userRouteInfo.setVolume(eu6Var.p);
        userRouteInfo.setVolumeMax(eu6Var.q);
        userRouteInfo.setVolumeHandling((!eu6Var.e() || gu6.g()) ? eu6Var.o : 0);
        userRouteInfo.setDescription(eu6Var.e);
    }

    @Override // ku6
    public final void a(MediaRouter.RouteInfo routeInfo, int i) {
        ub8 s = s(routeInfo);
        if (s != null) {
            s.a.j(i);
        }
    }

    @Override // ku6
    public final void b(MediaRouter.RouteInfo routeInfo, int i) {
        ub8 s = s(routeInfo);
        if (s != null) {
            s.a.k(i);
        }
    }

    @Override // wt6
    public final vt6 d(String str) {
        int p = p(str);
        if (p >= 0) {
            return new sb8(((tb8) this.H.get(p)).a);
        }
        return null;
    }

    @Override // wt6
    public final void f(bt6 bt6Var) {
        boolean z;
        int i = 0;
        if (bt6Var != null) {
            bt6Var.a();
            ArrayList c = bt6Var.b.c();
            int size = c.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) c.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | TLObject.FLAG_23;
                i++;
            }
            z = bt6Var.b();
            i = i2;
        } else {
            z = false;
        }
        if (this.E == i && this.F == z) {
            return;
        }
        this.E = i;
        this.F = z;
        B();
    }

    public final boolean n(MediaRouter.RouteInfo routeInfo) {
        String format;
        String str;
        if (s(routeInfo) != null || o(routeInfo) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo r = r();
        Context context = this.a;
        if (r == routeInfo) {
            format = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = routeInfo.getName(context);
            format = String.format(locale, "ROUTE_%08x", Integer.valueOf((name != null ? name.toString() : "").hashCode()));
        }
        if (p(format) >= 0) {
            int i = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str = format + "_" + i;
                if (p(str) < 0) {
                    break;
                }
                i++;
            }
            format = str;
        }
        tb8 tb8Var = new tb8(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        ys6 ys6Var = new ys6(format, name2 != null ? name2.toString() : "");
        u(tb8Var, ys6Var);
        tb8Var.c = ys6Var.b();
        this.H.add(tb8Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((tb8) arrayList.get(i)).a == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((tb8) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int q(eu6 eu6Var) {
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ub8) arrayList.get(i)).a == eu6Var) {
                return i;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.s.getDefaultRoute();
    }

    public boolean t(tb8 tb8Var) {
        return tb8Var.a.isConnecting();
    }

    public void u(tb8 tb8Var, ys6 ys6Var) {
        MediaRouter.RouteInfo routeInfo = tb8Var.a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            ys6Var.a(J);
        }
        if ((supportedTypes & 2) != 0) {
            ys6Var.a(K);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = ys6Var.a;
        Bundle bundle2 = ys6Var.a;
        bundle.putInt("playbackType", playbackType);
        bundle2.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle2.putInt("volume", routeInfo.getVolume());
        bundle2.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle2.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle2.putBoolean("isSystemRoute", (supportedTypes & TLObject.FLAG_23) == 0);
        if (!routeInfo.isEnabled()) {
            bundle2.putBoolean("enabled", false);
        }
        if (t(tb8Var)) {
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

    public final void v(eu6 eu6Var) {
        wt6 c = eu6Var.c();
        MediaRouter mediaRouter = this.s;
        if (c == this) {
            int o = o(mediaRouter.getSelectedRoute(8388611));
            if (o < 0 || !((tb8) this.H.get(o)).b.equals(eu6Var.b)) {
                return;
            }
            eu6Var.l();
            return;
        }
        MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.y);
        ub8 ub8Var = new ub8(eu6Var, createUserRoute);
        createUserRoute.setTag(ub8Var);
        createUserRoute.setVolumeCallback(this.x);
        C(ub8Var);
        this.I.add(ub8Var);
        mediaRouter.addUserRoute(createUserRoute);
    }

    public final void w(eu6 eu6Var) {
        int q;
        if (eu6Var.c() == this || (q = q(eu6Var)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((ub8) this.I.remove(q)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.s.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
        }
    }

    public final void x(eu6 eu6Var) {
        if (eu6Var.g()) {
            if (eu6Var.c() != this) {
                int q = q(eu6Var);
                if (q >= 0) {
                    z(((ub8) this.I.get(q)).b);
                    return;
                }
                return;
            }
            int p = p(eu6Var.b);
            if (p >= 0) {
                z(((tb8) this.H.get(p)).a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.H;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            zs6 zs6Var = ((tb8) arrayList2.get(i)).c;
            if (zs6Var == null) {
                w26.j("route must not be null");
                return;
            } else {
                if (arrayList.contains(zs6Var)) {
                    w26.j("route descriptor already added");
                    return;
                }
                arrayList.add(zs6Var);
            }
        }
        g(new am4(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.s.selectRoute(8388611, routeInfo);
    }
}
