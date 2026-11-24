// default package

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ux4 {
    public static final /* synthetic */ int F = 0;
    public bt6 A;
    public int B;
    public xl3 C;
    public mv6 D;
    public final pj4 E;
    public final ee3 c;
    public eu6 d;
    public vt6 e;
    public vbd f;
    public cu6 g;
    public final Context h;
    public final rf6 n;
    public final z24 o;
    public final boolean p;
    public final boolean q;
    public fs6 r;
    public final vb8 s;
    public final ie2 t;
    public iu6 u;
    public eu6 v;
    public eu6 w;
    public eu6 x;
    public ut6 y;
    public bt6 z;
    public final rx4 a = new rx4(this);
    public final HashMap b = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ux4(Context context) {
        boolean z;
        wt6 wt6Var;
        ee3 ee3Var;
        rf6 rf6Var = new rf6();
        rf6Var.c = 0;
        rf6Var.d = 3;
        this.n = rf6Var;
        this.o = new z24((Object) this, (byte) 6);
        this.E = new pj4((Object) this, (byte) 3);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            int i2 = gy6.b;
            Intent intent = new Intent(context, (Class<?>) gy6.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z = true;
                this.q = z;
                int i3 = idb.b;
                Intent intent2 = new Intent(context, (Class<?>) idb.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i >= 30 || !z) ? null : new fs6(context, new gi3(this));
                vb8 rb8Var = i < 24 ? new rb8(context, this) : new vb8(context, this);
                this.s = rb8Var;
                iu4 iu4Var = new iu4(this, (byte) 5);
                ie2 ie2Var = new ie2();
                ie2Var.d = new Handler(Looper.getMainLooper());
                ie2Var.e = iu4Var;
                this.t = ie2Var;
                a(rb8Var, true);
                wt6Var = this.r;
                if (wt6Var != null) {
                    a(wt6Var, true);
                }
                ee3Var = new ee3(context, this);
                this.c = ee3Var;
                Handler handler = (Handler) ee3Var.d;
                if (ee3Var.a) {
                    ee3Var.a = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    ((Context) ee3Var.b).registerReceiver((zj) ee3Var.g, intentFilter, null, handler);
                    handler.post((bg7) ee3Var.h);
                    return;
                }
                return;
            }
        }
        z = false;
        this.q = z;
        int i32 = idb.b;
        Intent intent22 = new Intent(context, (Class<?>) idb.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.r = (i >= 30 || !z) ? null : new fs6(context, new gi3(this));
        if (i < 24) {
        }
        this.s = rb8Var;
        iu4 iu4Var2 = new iu4(this, (byte) 5);
        ie2 ie2Var2 = new ie2();
        ie2Var2.d = new Handler(Looper.getMainLooper());
        ie2Var2.e = iu4Var2;
        this.t = ie2Var2;
        a(rb8Var, true);
        wt6Var = this.r;
        if (wt6Var != null) {
        }
        ee3Var = new ee3(context, this);
        this.c = ee3Var;
        Handler handler2 = (Handler) ee3Var.d;
        if (ee3Var.a) {
        }
    }

    public final void a(wt6 wt6Var, boolean z) {
        if (d(wt6Var) == null) {
            du6 du6Var = new du6(wt6Var, z);
            this.l.add(du6Var);
            this.a.b(513, du6Var);
            m(du6Var, (am4) wt6Var.n);
            gu6.b();
            wt6Var.f = this.o;
            wt6Var.h(this.z);
        }
    }

    public final String b(du6 du6Var, String str) {
        String flattenToShortString = ((ComponentName) du6Var.d.b).flattenToShortString();
        boolean z = du6Var.c;
        String p = z ? str : tb4.p(flattenToShortString, ":", str);
        HashMap hashMap = this.k;
        if (!z) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (((eu6) arrayList.get(i)).c.equals(p)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                Log.w("GlobalMediaRouter", b00.i("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = p + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            i3 = -1;
                            break;
                        }
                        if (((eu6) arrayList.get(i3)).c.equals(str2)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 < 0) {
                        hashMap.put(new lu7(flattenToShortString, str), str2);
                        return str2;
                    }
                    i2++;
                }
            }
        }
        hashMap.put(new lu7(flattenToShortString, str), p);
        return p;
    }

    public final eu6 c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            eu6 eu6Var = (eu6) obj;
            if (eu6Var != this.v && eu6Var.c() == this.s && eu6Var.m("android.media.intent.category.LIVE_AUDIO") && !eu6Var.m("android.media.intent.category.LIVE_VIDEO") && eu6Var.f()) {
                return eu6Var;
            }
        }
        return this.v;
    }

    public final du6 d(wt6 wt6Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            du6 du6Var = (du6) obj;
            if (du6Var.a == wt6Var) {
                return du6Var;
            }
        }
        return null;
    }

    public final eu6 e() {
        eu6 eu6Var = this.d;
        if (eu6Var != null) {
            return eu6Var;
        }
        sc8.j("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final boolean f() {
        if (!this.q) {
            return false;
        }
        iu6 iu6Var = this.u;
        return iu6Var == null || iu6Var.b;
    }

    public final void g() {
        if (this.d.e()) {
            List<eu6> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((eu6) it.next()).c);
            }
            HashMap hashMap = this.b;
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    vt6 vt6Var = (vt6) entry.getValue();
                    vt6Var.h(0);
                    vt6Var.d();
                    it2.remove();
                }
            }
            for (eu6 eu6Var : unmodifiableList) {
                if (!hashMap.containsKey(eu6Var.c)) {
                    vt6 e = eu6Var.c().e(eu6Var.b, this.d.b);
                    e.e();
                    hashMap.put(eu6Var.c, e);
                }
            }
        }
    }

    public final void h(ux4 ux4Var, eu6 eu6Var, vt6 vt6Var, int i, eu6 eu6Var2, ArrayList arrayList) {
        vbd vbdVar;
        cu6 cu6Var = this.g;
        if (cu6Var != null) {
            cu6Var.d();
            this.g = null;
        }
        cu6 cu6Var2 = new cu6(ux4Var, eu6Var, vt6Var, i, eu6Var2, arrayList);
        this.g = cu6Var2;
        if (cu6Var2.b != 3 || (vbdVar = this.f) == null) {
            cu6Var2.i();
            return;
        }
        eu6 eu6Var3 = this.d;
        eu6 eu6Var4 = (eu6) cu6Var2.h;
        byte b = 2;
        vbd.c.b("Prepare transfer from Route(%s) to Route(%s)", eu6Var3, eu6Var4);
        k91 k91Var = new k91();
        k91Var.c = new ea9();
        m91 m91Var = new m91(k91Var);
        l91 l91Var = m91Var.b;
        k91Var.b = m91Var;
        k91Var.a = wad.class;
        try {
            k91Var.a = Boolean.valueOf(vbdVar.b.post(new vc1(vbdVar, eu6Var3, eu6Var4, k91Var, (byte) 1)));
        } catch (Exception e) {
            l91Var.l(e);
        }
        cu6 cu6Var3 = this.g;
        ux4 ux4Var2 = (ux4) ((WeakReference) cu6Var3.s).get();
        if (ux4Var2 == null || ux4Var2.g != cu6Var3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            cu6Var3.d();
        } else {
            if (((m91) cu6Var3.w) != null) {
                sc8.j("future is already set");
                return;
            }
            cu6Var3.w = m91Var;
            bu6 bu6Var = new bu6(cu6Var3, (byte) 0);
            rx4 rx4Var = ux4Var2.a;
            Objects.requireNonNull(rx4Var);
            l91Var.b(bu6Var, new ge2(rx4Var, b));
        }
    }

    public final void i(eu6 eu6Var, int i) {
        if (!this.j.contains(eu6Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + eu6Var);
        } else {
            if (!eu6Var.g) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + eu6Var);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                wt6 c = eu6Var.c();
                fs6 fs6Var = this.r;
                if (c == fs6Var && this.d != eu6Var) {
                    fs6Var.s(eu6Var.b);
                    return;
                }
            }
            j(eu6Var, i);
        }
    }

    public final void j(eu6 eu6Var, int i) {
        am4 am4Var;
        if (this.d == eu6Var) {
            return;
        }
        if (this.x != null) {
            this.x = null;
            ut6 ut6Var = this.y;
            if (ut6Var != null) {
                ut6Var.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (f() && (am4Var = eu6Var.a.e) != null && am4Var.c) {
            ut6 c = eu6Var.c().c(eu6Var.b);
            if (c != null) {
                Executor g = rr.g(this.h);
                pj4 pj4Var = this.E;
                synchronized (c.a) {
                    if (g == null) {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                    if (pj4Var == null) {
                        throw new NullPointerException("Listener shouldn't be null");
                    }
                    c.b = g;
                    c.c = pj4Var;
                    ArrayList arrayList = c.e;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        zs6 zs6Var = c.d;
                        ArrayList arrayList2 = c.e;
                        c.d = null;
                        c.e = null;
                        c.b.execute(new st6(c, pj4Var, zs6Var, arrayList2, (byte) 0));
                    }
                }
                this.x = eu6Var;
                this.y = c;
                c.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + eu6Var);
        }
        vt6 d = eu6Var.c().d(eu6Var.b);
        if (d != null) {
            d.e();
        }
        if (this.d != null) {
            h(this, eu6Var, d, i, null, null);
            return;
        }
        this.d = eu6Var;
        this.e = d;
        Message obtainMessage = this.a.obtainMessage(kk7.k4, new lu7(null, eu6Var));
        obtainMessage.arg1 = i;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
    
        if (r24.A.b() == r2) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        bt6 bt6Var;
        int i;
        boolean z;
        int i2;
        xt6 xt6Var = new xt6();
        ie2 ie2Var = this.t;
        long j = 0;
        ie2Var.a = 0L;
        int i3 = 0;
        ie2Var.c = false;
        ie2Var.b = SystemClock.elapsedRealtime();
        ((Handler) ie2Var.d).removeCallbacks((iu4) ie2Var.e);
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            size--;
            boolean z3 = this.p;
            if (size < 0) {
                long j2 = j;
                if (ie2Var.c) {
                    long j3 = ie2Var.a;
                    if (j3 > j2) {
                        ((Handler) ie2Var.d).postDelayed((iu4) ie2Var.e, j3);
                    }
                }
                boolean z4 = ie2Var.c;
                this.B = i4;
                yt6 b = z2 ? xt6Var.b() : yt6.c;
                yt6 b2 = xt6Var.b();
                if (f()) {
                    bt6 bt6Var2 = this.A;
                    if (bt6Var2 != null) {
                        bt6Var2.a();
                        if (bt6Var2.b.equals(b2)) {
                        }
                    }
                    if (!b2.d() || z4) {
                        bt6Var = new bt6(b2, z4);
                        this.A = bt6Var;
                    } else if (this.A != null) {
                        this.A = null;
                        bt6Var = null;
                    }
                    this.r.h(bt6Var);
                }
                bt6 bt6Var3 = this.z;
                if (bt6Var3 != null) {
                    bt6Var3.a();
                    if (bt6Var3.b.equals(b) && this.z.b() == z4) {
                        return;
                    }
                }
                if (!b.d() || z4) {
                    this.z = new bt6(b, z4);
                } else if (this.z == null) {
                    return;
                } else {
                    this.z = null;
                }
                if (z2 && !z4 && z3) {
                    Log.i("GlobalMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                ArrayList arrayList2 = this.l;
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj = arrayList2.get(i5);
                    i5++;
                    wt6 wt6Var = ((du6) obj).a;
                    if (wt6Var != this.r) {
                        wt6Var.h(this.z);
                    }
                }
                return;
            }
            gu6 gu6Var = (gu6) ((WeakReference) arrayList.get(size)).get();
            if (gu6Var == null) {
                arrayList.remove(size);
            } else {
                ArrayList arrayList3 = gu6Var.b;
                int size3 = arrayList3.size();
                i4 += size3;
                int i6 = i3;
                while (i6 < size3) {
                    au6 au6Var = (au6) arrayList3.get(i6);
                    yt6 yt6Var = au6Var.c;
                    if (yt6Var == null) {
                        w26.j("selector must not be null");
                        return;
                    }
                    xt6Var.a(yt6Var.c());
                    long j4 = j;
                    int i7 = (au6Var.d & 1) != 0 ? 1 : i3;
                    ArrayList arrayList4 = arrayList;
                    long j5 = au6Var.e;
                    if (i7 == 0) {
                        ie2Var.getClass();
                        i = i7;
                    } else {
                        i = i7;
                        long j6 = ie2Var.b;
                        if (j6 - j5 < 30000) {
                            ie2Var.a = Math.max(ie2Var.a, (j5 + 30000) - j6);
                            z = true;
                            ie2Var.c = true;
                            if (i != 0) {
                                z2 = z;
                            }
                            i2 = au6Var.d;
                            if ((i2 & 4) != 0 && !z3) {
                                z2 = z;
                            }
                            if ((i2 & 8) == 0) {
                                z2 = z;
                            }
                            i6++;
                            j = j4;
                            arrayList = arrayList4;
                            i3 = 0;
                        }
                    }
                    z = true;
                    if (i != 0) {
                    }
                    i2 = au6Var.d;
                    if ((i2 & 4) != 0) {
                        z2 = z;
                    }
                    if ((i2 & 8) == 0) {
                    }
                    i6++;
                    j = j4;
                    arrayList = arrayList4;
                    i3 = 0;
                }
            }
            j = j;
            arrayList = arrayList;
            i3 = 0;
        }
    }

    public final void l() {
        eu6 eu6Var = this.d;
        if (eu6Var == null) {
            xl3 xl3Var = this.C;
            if (xl3Var != null) {
                xl3Var.o();
                return;
            }
            return;
        }
        int i = eu6Var.p;
        rf6 rf6Var = this.n;
        rf6Var.a = i;
        rf6Var.b = eu6Var.q;
        rf6Var.c = (!eu6Var.e() || gu6.g()) ? eu6Var.o : 0;
        rf6Var.d = this.d.m;
        if (f() && this.d.c() == this.r) {
            rf6Var.e = fs6.p(this.e);
        } else {
            rf6Var.e = null;
        }
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            ((tx4) arrayList.get(0)).getClass();
            throw null;
        }
        xl3 xl3Var2 = this.C;
        if (xl3Var2 != null) {
            eu6 eu6Var2 = this.d;
            eu6 eu6Var3 = this.v;
            if (eu6Var3 == null) {
                sc8.j("There is no default route.  The media router has not yet been fully initialized.");
                return;
            }
            if (eu6Var2 == eu6Var3 || eu6Var2 == this.w) {
                xl3Var2.o();
                return;
            }
            int i2 = rf6Var.c == 1 ? 2 : 0;
            int i3 = rf6Var.b;
            int i4 = rf6Var.a;
            String str = (String) rf6Var.e;
            mv6 mv6Var = (mv6) xl3Var2.b;
            if (mv6Var != null) {
                tx3 tx3Var = (tx3) xl3Var2.c;
                if (tx3Var != null && i2 == 0 && i3 == 0) {
                    tx3Var.c = i4;
                    vjc.a(tx3Var.b(), i4);
                } else {
                    tx3 tx3Var2 = new tx3(xl3Var2, i2, i3, i4, str);
                    xl3Var2.c = tx3Var2;
                    ((zu6) mv6Var.b).a.setPlaybackToRemote(tx3Var2.b());
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r21 == ((am4) r19.s.n)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185 A[LOOP:5: B:76:0x0183->B:77:0x0185, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0 A[LOOP:6: B:80:0x019e->B:81:0x01a0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(du6 du6Var, am4 am4Var) {
        boolean z;
        int i;
        int size;
        int size2;
        Iterator it;
        boolean z2;
        am4 am4Var2 = du6Var.e;
        ArrayList arrayList = du6Var.b;
        if (am4Var2 != am4Var) {
            du6Var.e = am4Var;
            ArrayList arrayList2 = this.j;
            rx4 rx4Var = this.a;
            if (am4Var != null) {
                List list = am4Var.b;
                int size3 = list.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    zs6 zs6Var = (zs6) list.get(i2);
                    if (zs6Var != null && zs6Var.e()) {
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = list.iterator();
                int i3 = 0;
                boolean z3 = false;
                while (it2.hasNext()) {
                    zs6 zs6Var2 = (zs6) it2.next();
                    if (zs6Var2 == null || !zs6Var2.e()) {
                        it = it2;
                        z2 = z3;
                        Log.w("GlobalMediaRouter", "Ignoring invalid route descriptor: " + zs6Var2);
                    } else {
                        String d = zs6Var2.d();
                        int size4 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size4) {
                                i4 = -1;
                                break;
                            } else if (((eu6) arrayList.get(i4)).b.equals(d)) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (i4 < 0) {
                            it = it2;
                            z2 = z3;
                            eu6 eu6Var = new eu6(du6Var, d, b(du6Var, d), zs6Var2.a.getBoolean("isSystemRoute", false));
                            int i5 = i3 + 1;
                            arrayList.add(i3, eu6Var);
                            arrayList2.add(eu6Var);
                            if (zs6Var2.c().isEmpty()) {
                                eu6Var.i(zs6Var2);
                                rx4Var.b(kk7.f4, eu6Var);
                            } else {
                                arrayList3.add(new lu7(eu6Var, zs6Var2));
                            }
                            i3 = i5;
                        } else {
                            it = it2;
                            z2 = z3;
                            if (i4 < i3) {
                                Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + zs6Var2);
                            } else {
                                eu6 eu6Var2 = (eu6) arrayList.get(i4);
                                int i6 = i3 + 1;
                                Collections.swap(arrayList, i4, i3);
                                if (!zs6Var2.c().isEmpty()) {
                                    arrayList4.add(new lu7(eu6Var2, zs6Var2));
                                } else if (n(eu6Var2, zs6Var2) != 0 && eu6Var2 == this.d) {
                                    i3 = i6;
                                    z2 = true;
                                }
                                i3 = i6;
                            }
                        }
                    }
                    it2 = it;
                    z3 = z2;
                }
                boolean z4 = z3;
                int i7 = 0;
                int size5 = arrayList3.size();
                int i8 = 0;
                while (i8 < size5) {
                    Object obj = arrayList3.get(i8);
                    i8++;
                    lu7 lu7Var = (lu7) obj;
                    eu6 eu6Var3 = (eu6) lu7Var.a;
                    eu6Var3.i((zs6) lu7Var.b);
                    rx4Var.b(kk7.f4, eu6Var3);
                }
                int size6 = arrayList4.size();
                boolean z5 = z4;
                while (i7 < size6) {
                    Object obj2 = arrayList4.get(i7);
                    i7++;
                    lu7 lu7Var2 = (lu7) obj2;
                    eu6 eu6Var4 = (eu6) lu7Var2.a;
                    if (n(eu6Var4, (zs6) lu7Var2.b) != 0 && eu6Var4 == this.d) {
                        z5 = true;
                    }
                }
                z = z5;
                i = i3;
                for (size = arrayList.size() - 1; size >= i; size--) {
                    eu6 eu6Var5 = (eu6) arrayList.get(size);
                    eu6Var5.i(null);
                    arrayList2.remove(eu6Var5);
                }
                o(z);
                for (size2 = arrayList.size() - 1; size2 >= i; size2--) {
                    rx4Var.b(kk7.g4, (eu6) arrayList.remove(size2));
                }
                rx4Var.b(515, du6Var);
            }
            z = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + am4Var);
            i = 0;
            while (size >= i) {
            }
            o(z);
            while (size2 >= i) {
            }
            rx4Var.b(515, du6Var);
        }
    }

    public final int n(eu6 eu6Var, zs6 zs6Var) {
        int i = eu6Var.i(zs6Var);
        if (i != 0) {
            int i2 = i & 1;
            rx4 rx4Var = this.a;
            if (i2 != 0) {
                rx4Var.b(kk7.h4, eu6Var);
            }
            if ((i & 2) != 0) {
                rx4Var.b(kk7.i4, eu6Var);
            }
            if ((i & 4) != 0) {
                rx4Var.b(kk7.j4, eu6Var);
            }
        }
        return i;
    }

    public final void o(boolean z) {
        eu6 eu6Var = this.v;
        if (eu6Var != null && !eu6Var.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        eu6 eu6Var2 = this.v;
        vb8 vb8Var = this.s;
        ArrayList arrayList = this.j;
        if (eu6Var2 == null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                eu6 eu6Var3 = (eu6) obj;
                if (eu6Var3.c() == vb8Var && eu6Var3.b.equals("DEFAULT_ROUTE") && eu6Var3.f()) {
                    this.v = eu6Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        eu6 eu6Var4 = this.w;
        if (eu6Var4 != null && !eu6Var4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.w);
            this.w = null;
        }
        if (this.w == null) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                eu6 eu6Var5 = (eu6) obj2;
                if (eu6Var5.c() == vb8Var && eu6Var5.m("android.media.intent.category.LIVE_AUDIO") && !eu6Var5.m("android.media.intent.category.LIVE_VIDEO") && eu6Var5.f()) {
                    this.w = eu6Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        eu6 eu6Var6 = this.d;
        if (eu6Var6 == null || !eu6Var6.g) {
            Log.i("GlobalMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.d);
            j(c(), 0);
            return;
        }
        if (z) {
            g();
            l();
        }
    }
}
