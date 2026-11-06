package s4;

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
import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class j0 extends k0 implements b0 {
    public static final ArrayList I;
    public static final ArrayList J;
    public int D;
    public boolean E;
    public boolean F;
    public final ArrayList G;
    public final ArrayList H;
    public final e r;
    public final MediaRouter s;
    public final a0 w;
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

    public j0(Context context, e eVar) {
        super(context, new uy(new ComponentName("android", k0.class.getName()), 15));
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.s = mediaRouter;
        this.w = new a0(this);
        this.x = d0.a(this);
        this.y = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        B();
    }

    public static i0 s(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof i0) {
            return (i0) tag;
        }
        return null;
    }

    public void A() {
        boolean z9 = this.F;
        a0 a0Var = this.w;
        MediaRouter mediaRouter = this.s;
        if (z9) {
            mediaRouter.removeCallback(a0Var);
        }
        this.F = true;
        mediaRouter.addCallback(this.D, a0Var, (this.E ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z9 = false;
        for (int i7 = 0; i7 < routeCount; i7++) {
            arrayList.add(mediaRouter.getRouteAt(i7));
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z9 |= n((MediaRouter.RouteInfo) obj);
        }
        if (z9) {
            y();
        }
    }

    public void C(i0 i0Var) {
        MediaRouter.UserRouteInfo userRouteInfo = i0Var.b;
        v vVar = i0Var.a;
        userRouteInfo.setName(vVar.d);
        userRouteInfo.setPlaybackType(vVar.l);
        userRouteInfo.setPlaybackStream(vVar.m);
        userRouteInfo.setVolume(vVar.p);
        userRouteInfo.setVolumeMax(vVar.q);
        userRouteInfo.setVolumeHandling((!vVar.e() || x.g()) ? vVar.o : 0);
        userRouteInfo.setDescription(vVar.e);
    }

    @Override // s4.b0
    public final void a(MediaRouter.RouteInfo routeInfo, int i7) {
        i0 s5 = s(routeInfo);
        if (s5 != null) {
            s5.a.j(i7);
        }
    }

    @Override // s4.b0
    public final void b(MediaRouter.RouteInfo routeInfo, int i7) {
        i0 s5 = s(routeInfo);
        if (s5 != null) {
            s5.a.k(i7);
        }
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final q d(String str) {
        int p10 = p(str);
        if (p10 >= 0) {
            return new g0(((h0) this.G.get(p10)).a);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final void f(n nVar) {
        boolean z9;
        int i7 = 0;
        if (nVar != null) {
            nVar.a();
            ArrayList c10 = nVar.b.c();
            int size = c10.size();
            int i10 = 0;
            while (i7 < size) {
                String str = (String) c10.get(i7);
                i10 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i10 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i10 | 2 : i10 | TLObject.FLAG_23;
                i7++;
            }
            z9 = nVar.b();
            i7 = i10;
        } else {
            z9 = false;
        }
        if (this.D == i7 && this.E == z9) {
            return;
        }
        this.D = i7;
        this.E = z9;
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
            int i7 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str = format + "_" + i7;
                if (p(str) < 0) {
                    break;
                }
                i7++;
            }
            format = str;
        }
        h0 h0Var = new h0(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        l lVar = new l(format, name2 != null ? name2.toString() : "");
        u(h0Var, lVar);
        h0Var.c = lVar.b();
        this.G.add(h0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((h0) arrayList.get(i7)).a == routeInfo) {
                return i7;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((h0) arrayList.get(i7)).b.equals(str)) {
                return i7;
            }
        }
        return -1;
    }

    public final int q(v vVar) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((i0) arrayList.get(i7)).a == vVar) {
                return i7;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.s.getDefaultRoute();
    }

    public boolean t(h0 h0Var) {
        return h0Var.a.isConnecting();
    }

    public void u(h0 h0Var, l lVar) {
        MediaRouter.RouteInfo routeInfo = h0Var.a;
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
        if (t(h0Var)) {
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

    public final void v(v vVar) {
        g3 c10 = vVar.c();
        MediaRouter mediaRouter = this.s;
        if (c10 == this) {
            int o4 = o(mediaRouter.getSelectedRoute(8388611));
            if (o4 < 0 || !((h0) this.G.get(o4)).b.equals(vVar.b)) {
                return;
            }
            vVar.l();
            return;
        }
        MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.y);
        i0 i0Var = new i0(vVar, createUserRoute);
        createUserRoute.setTag(i0Var);
        createUserRoute.setVolumeCallback(this.x);
        C(i0Var);
        this.H.add(i0Var);
        mediaRouter.addUserRoute(createUserRoute);
    }

    public final void w(v vVar) {
        int q10;
        if (vVar.c() == this || (q10 = q(vVar)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((i0) this.H.remove(q10)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.s.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e10) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e10);
        }
    }

    public final void x(v vVar) {
        if (vVar.g()) {
            if (vVar.c() != this) {
                int q10 = q(vVar);
                if (q10 >= 0) {
                    z(((i0) this.H.get(q10)).b);
                    return;
                }
                return;
            }
            int p10 = p(vVar.b);
            if (p10 >= 0) {
                z(((h0) this.G.get(p10)).a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.G;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = ((h0) arrayList2.get(i7)).c;
            if (mVar == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList.contains(mVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList.add(mVar);
        }
        g(new ca.i(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.s.selectRoute(8388611, routeInfo);
    }
}
