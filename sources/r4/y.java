package r4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.lt;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y {
    public static e c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public y(Context context) {
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

    public static y d(Context context) {
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
                y yVar = new y(context);
                arrayList.add(new WeakReference(yVar));
                return yVar;
            }
            y yVar2 = (y) ((WeakReference) arrayList.get(size)).get();
            if (yVar2 == null) {
                arrayList.remove(size);
            } else if (yVar2.a == context) {
                return yVar2;
            }
        }
    }

    public static MediaSessionCompat$Token e() {
        e eVar = c;
        if (eVar == null) {
            return null;
        }
        p7.d dVar = eVar.C;
        if (dVar != null) {
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) dVar.b;
            if (a0Var != null) {
                return ((android.support.v4.media.session.u) a0Var.b).c;
            }
            return null;
        }
        android.support.v4.media.session.a0 a0Var2 = eVar.D;
        if (a0Var2 != null) {
            return ((android.support.v4.media.session.u) a0Var2.b).c;
        }
        return null;
    }

    public static w f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        a0 a0Var = c().u;
        return a0Var == null || (bundle = a0Var.e) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static void i(a0 a0Var) {
        b();
        e c2 = c();
        a0 a0Var2 = c2.u;
        b bVar = c2.a;
        c2.u = a0Var;
        if (c2.f()) {
            if (c2.r == null) {
                k kVar = new k(c2.h, new i9(c2, 15));
                c2.r = kVar;
                c2.a(kVar, true);
                c2.k();
                ne.h hVar = c2.c;
                ((Handler) hVar.d).post((lt) hVar.h);
            }
            if ((a0Var2 != null && a0Var2.d) != a0Var.d) {
                k kVar2 = c2.r;
                kVar2.h = c2.A;
                if (!kVar2.b) {
                    kVar2.b = true;
                    ((android.support.v4.media.session.q) kVar2.e).sendEmptyMessage(2);
                }
            }
        } else {
            k kVar3 = c2.r;
            if (kVar3 != null) {
                v d = c2.d(kVar3);
                if (d != null) {
                    b();
                    kVar3.f = null;
                    kVar3.h(null);
                    c2.m(d, null);
                    bVar.b(514, d);
                    c2.l.remove(d);
                }
                c2.r = null;
                ne.h hVar2 = c2.c;
                ((Handler) hVar2.d).post((lt) hVar2.h);
            }
        }
        bVar.b(769, a0Var);
    }

    public static void j(int i3) {
        if (i3 < 0 || i3 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        e c2 = c();
        w c10 = c2.c();
        if (c2.e() != c10) {
            c2.i(c10, i3);
        }
    }

    public final void a(r rVar, s sVar, int i3) {
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
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((t) arrayList.get(i11)).b == sVar) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            tVar = new t(this, sVar);
            arrayList.add(tVar);
        } else {
            tVar = (t) arrayList.get(i11);
        }
        boolean z11 = true;
        if (i3 != tVar.d) {
            tVar.d = i3;
            z10 = true;
        } else {
            z10 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i3 & 1) != 0) {
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
            ArrayList c2 = rVar.c();
            if (!c2.isEmpty()) {
                int size2 = c2.size();
                while (i10 < size2) {
                    Object obj = c2.get(i10);
                    i10++;
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
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((t) arrayList.get(i3)).b == sVar) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            arrayList.remove(i3);
            c().k();
        }
    }
}
