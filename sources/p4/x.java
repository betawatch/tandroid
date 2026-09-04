package p4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.ui.Cells.l7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class x {
    public static e c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public x(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static e c() {
        e eVar = c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static x d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        b();
        if (c == null) {
            c = new e(context.getApplicationContext());
        }
        ArrayList arrayList = c.i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                x xVar = new x(context);
                arrayList.add(new WeakReference(xVar));
                return xVar;
            }
            x xVar2 = (x) ((WeakReference) arrayList.get(size)).get();
            if (xVar2 == null) {
                arrayList.remove(size);
            } else if (xVar2.a == context) {
                return xVar2;
            }
        }
    }

    public static MediaSessionCompat$Token e() {
        e eVar = c;
        if (eVar == null) {
            return null;
        }
        m2.t tVar = eVar.C;
        if (tVar != null) {
            android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) tVar.b;
            if (c0Var != null) {
                return c0Var.a.c;
            }
            return null;
        }
        android.support.v4.media.session.c0 c0Var2 = eVar.D;
        if (c0Var2 != null) {
            return c0Var2.a.c;
        }
        return null;
    }

    public static v f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        z zVar = c().u;
        return zVar == null || (bundle = zVar.e) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static void i(z zVar) {
        b();
        e c10 = c();
        z zVar2 = c10.u;
        b bVar = c10.a;
        c10.u = zVar;
        if (c10.f()) {
            if (c10.r == null) {
                k kVar = new k(c10.h, new mg.n(c10, 10));
                c10.r = kVar;
                c10.a(kVar, true);
                c10.k();
                s0 s0Var = c10.c;
                ((Handler) s0Var.d).post((l7) s0Var.h);
            }
            if ((zVar2 != null && zVar2.d) != zVar.d) {
                k kVar2 = c10.r;
                kVar2.h = c10.A;
                if (!kVar2.b) {
                    kVar2.b = true;
                    ((androidx.mediarouter.app.c) kVar2.e).sendEmptyMessage(2);
                }
            }
        } else {
            k kVar3 = c10.r;
            if (kVar3 != null) {
                u d = c10.d(kVar3);
                if (d != null) {
                    b();
                    kVar3.f = null;
                    kVar3.h(null);
                    c10.m(d, null);
                    bVar.b(514, d);
                    c10.l.remove(d);
                }
                c10.r = null;
                s0 s0Var2 = c10.c;
                ((Handler) s0Var2.d).post((l7) s0Var2.h);
            }
        }
        bVar.b(769, zVar);
    }

    public static void j(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        e c10 = c();
        v c11 = c10.c();
        if (c10.e() != c11) {
            c10.i(c11, i10);
        }
    }

    public final void a(r rVar, s sVar, int i10) {
        t tVar;
        boolean z10;
        r rVar2;
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (sVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((t) arrayList.get(i12)).b == sVar) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            tVar = new t(this, sVar);
            arrayList.add(tVar);
        } else {
            tVar = (t) arrayList.get(i12);
        }
        boolean z11 = true;
        if (i10 != tVar.d) {
            tVar.d = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        tVar.e = elapsedRealtime;
        r rVar3 = tVar.c;
        rVar3.a();
        rVar.a();
        if (rVar3.b.containsAll(rVar.b)) {
            z11 = z10;
        } else {
            r rVar4 = tVar.c;
            if (rVar4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            rVar4.a();
            ArrayList<String> arrayList2 = !rVar4.b.isEmpty() ? new ArrayList<>(rVar4.b) : null;
            ArrayList c10 = rVar.c();
            if (!c10.isEmpty()) {
                int size2 = c10.size();
                while (i11 < size2) {
                    Object obj = c10.get(i11);
                    i11++;
                    String str = (String) obj;
                    if (str == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                rVar2 = r.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                rVar2 = new r(bundle, arrayList2);
            }
            tVar.c = rVar2;
        }
        if (z11) {
            c().k();
        }
    }

    public final void h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((t) arrayList.get(i10)).b == sVar) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            arrayList.remove(i10);
            c().k();
        }
    }
}
