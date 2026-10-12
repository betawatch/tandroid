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
import ji.w4;
import org.telegram.ui.Wallet.m5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        li.k kVar = eVar.C;
        if (kVar != null) {
            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) kVar.b;
            if (b0Var != null) {
                return b0Var.a.c;
            }
            return null;
        }
        android.support.v4.media.session.b0 b0Var2 = eVar.D;
        if (b0Var2 != null) {
            return b0Var2.a.c;
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
        e c10 = c();
        a0 a0Var2 = c10.u;
        b bVar = c10.a;
        c10.u = a0Var;
        if (c10.f()) {
            if (c10.r == null) {
                k kVar = new k(c10.h, new w4(c10, 20));
                c10.r = kVar;
                c10.a(kVar, true);
                c10.k();
                t0 t0Var = c10.c;
                ((Handler) t0Var.d).post((m5) t0Var.h);
            }
            if ((a0Var2 != null && a0Var2.d) != a0Var.d) {
                k kVar2 = c10.r;
                kVar2.h = c10.A;
                if (!kVar2.b) {
                    kVar2.b = true;
                    ((ab.o0) kVar2.e).sendEmptyMessage(2);
                }
            }
        } else {
            k kVar3 = c10.r;
            if (kVar3 != null) {
                v d = c10.d(kVar3);
                if (d != null) {
                    b();
                    kVar3.f = null;
                    kVar3.h(null);
                    c10.m(d, null);
                    bVar.b(514, d);
                    c10.l.remove(d);
                }
                c10.r = null;
                t0 t0Var2 = c10.c;
                ((Handler) t0Var2.d).post((m5) t0Var2.h);
            }
        }
        bVar.b(769, a0Var);
    }

    public static void j(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        e c10 = c();
        w c11 = c10.c();
        if (c10.e() != c11) {
            c10.i(c11, i10);
        }
    }

    public final void a(s sVar, t tVar, int i10) {
        u uVar;
        boolean z10;
        s sVar2;
        if (sVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (tVar == null) {
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
            } else if (((u) arrayList.get(i12)).b == tVar) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            uVar = new u(this, tVar);
            arrayList.add(uVar);
        } else {
            uVar = (u) arrayList.get(i12);
        }
        boolean z11 = true;
        if (i10 != uVar.d) {
            uVar.d = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        uVar.e = elapsedRealtime;
        s sVar3 = uVar.c;
        sVar3.a();
        sVar.a();
        if (sVar3.b.containsAll(sVar.b)) {
            z11 = z10;
        } else {
            s sVar4 = uVar.c;
            if (sVar4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            sVar4.a();
            ArrayList<String> arrayList2 = !sVar4.b.isEmpty() ? new ArrayList<>(sVar4.b) : null;
            ArrayList c10 = sVar.c();
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
                sVar2 = s.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                sVar2 = new s(bundle, arrayList2);
            }
            uVar.c = sVar2;
        }
        if (z11) {
            c().k();
        }
    }

    public final void h(t tVar) {
        if (tVar == null) {
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
            } else if (((u) arrayList.get(i10)).b == tVar) {
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
