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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wz4 {
    public static final /* synthetic */ int F = 0;
    public bv6 A;
    public int B;
    public in3 C;
    public mx6 D;
    public final k44 E;
    public final pf3 c;
    public ew6 d;
    public vv6 e;
    public xdd f;
    public cw6 g;
    public final Context h;
    public final rh6 n;
    public final ai4 o;
    public final boolean p;
    public final boolean q;
    public gu6 r;
    public final yd8 s;
    public final tf2 t;
    public iw6 u;
    public ew6 v;
    public ew6 w;
    public ew6 x;
    public uv6 y;
    public bv6 z;
    public final tz4 a = new tz4(this);
    public final HashMap b = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wz4(Context context) {
        boolean z;
        wv6 wv6Var;
        pf3 pf3Var;
        rh6 rh6Var = new rh6();
        rh6Var.c = 0;
        rh6Var.d = 3;
        this.n = rh6Var;
        this.o = new ai4((Object) this, (byte) 4);
        this.E = new k44(this, (byte) 6);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            int i2 = g07.b;
            Intent intent = new Intent(context, (Class<?>) g07.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z = true;
                this.q = z;
                int i3 = jfb.b;
                Intent intent2 = new Intent(context, (Class<?>) jfb.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i >= 30 || !z) ? null : new gu6(context, new lj4(this));
                yd8 ud8Var = i < 24 ? new ud8(context, this) : new yd8(context, this);
                this.s = ud8Var;
                qn4 qn4Var = new qn4(this, (byte) 12);
                tf2 tf2Var = new tf2();
                tf2Var.d = new Handler(Looper.getMainLooper());
                tf2Var.e = qn4Var;
                this.t = tf2Var;
                a(ud8Var, true);
                wv6Var = this.r;
                if (wv6Var != null) {
                    a(wv6Var, true);
                }
                pf3Var = new pf3(context, this);
                this.c = pf3Var;
                Handler handler = (Handler) pf3Var.d;
                if (pf3Var.a) {
                    pf3Var.a = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    ((Context) pf3Var.b).registerReceiver((zk) pf3Var.g, intentFilter, null, handler);
                    handler.post((ei7) pf3Var.h);
                    return;
                }
                return;
            }
        }
        z = false;
        this.q = z;
        int i32 = jfb.b;
        Intent intent22 = new Intent(context, (Class<?>) jfb.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.r = (i >= 30 || !z) ? null : new gu6(context, new lj4(this));
        if (i < 24) {
        }
        this.s = ud8Var;
        qn4 qn4Var2 = new qn4(this, (byte) 12);
        tf2 tf2Var2 = new tf2();
        tf2Var2.d = new Handler(Looper.getMainLooper());
        tf2Var2.e = qn4Var2;
        this.t = tf2Var2;
        a(ud8Var, true);
        wv6Var = this.r;
        if (wv6Var != null) {
        }
        pf3Var = new pf3(context, this);
        this.c = pf3Var;
        Handler handler2 = (Handler) pf3Var.d;
        if (pf3Var.a) {
        }
    }

    public final void a(wv6 wv6Var, boolean z) {
        if (d(wv6Var) == null) {
            dw6 dw6Var = new dw6(wv6Var, z);
            this.l.add(dw6Var);
            this.a.b(513, dw6Var);
            m(dw6Var, (bo4) wv6Var.n);
            gw6.b();
            wv6Var.f = this.o;
            wv6Var.h(this.z);
        }
    }

    public final String b(dw6 dw6Var, String str) {
        String flattenToShortString = ((ComponentName) dw6Var.d.b).flattenToShortString();
        boolean z = dw6Var.c;
        String q = z ? str : td4.q(flattenToShortString, ":", str);
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
                if (((ew6) arrayList.get(i)).c.equals(q)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                Log.w("GlobalMediaRouter", b10.i("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = q + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            i3 = -1;
                            break;
                        }
                        if (((ew6) arrayList.get(i3)).c.equals(str2)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 < 0) {
                        hashMap.put(new mw7(flattenToShortString, str), str2);
                        return str2;
                    }
                    i2++;
                }
            }
        }
        hashMap.put(new mw7(flattenToShortString, str), q);
        return q;
    }

    public final ew6 c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ew6 ew6Var = (ew6) obj;
            if (ew6Var != this.v && ew6Var.c() == this.s && ew6Var.m("android.media.intent.category.LIVE_AUDIO") && !ew6Var.m("android.media.intent.category.LIVE_VIDEO") && ew6Var.f()) {
                return ew6Var;
            }
        }
        return this.v;
    }

    public final dw6 d(wv6 wv6Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dw6 dw6Var = (dw6) obj;
            if (dw6Var.a == wv6Var) {
                return dw6Var;
            }
        }
        return null;
    }

    public final ew6 e() {
        ew6 ew6Var = this.d;
        if (ew6Var != null) {
            return ew6Var;
        }
        dq9.m("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final boolean f() {
        if (!this.q) {
            return false;
        }
        iw6 iw6Var = this.u;
        return iw6Var == null || iw6Var.b;
    }

    public final void g() {
        if (this.d.e()) {
            List<ew6> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((ew6) it.next()).c);
            }
            HashMap hashMap = this.b;
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    vv6 vv6Var = (vv6) entry.getValue();
                    vv6Var.h(0);
                    vv6Var.d();
                    it2.remove();
                }
            }
            for (ew6 ew6Var : unmodifiableList) {
                if (!hashMap.containsKey(ew6Var.c)) {
                    vv6 e = ew6Var.c().e(ew6Var.b, this.d.b);
                    e.e();
                    hashMap.put(ew6Var.c, e);
                }
            }
        }
    }

    public final void h(wz4 wz4Var, ew6 ew6Var, vv6 vv6Var, int i, ew6 ew6Var2, ArrayList arrayList) {
        xdd xddVar;
        cw6 cw6Var = this.g;
        if (cw6Var != null) {
            cw6Var.e();
            this.g = null;
        }
        cw6 cw6Var2 = new cw6(wz4Var, ew6Var, vv6Var, i, ew6Var2, arrayList);
        this.g = cw6Var2;
        if (cw6Var2.b != 3 || (xddVar = this.f) == null) {
            cw6Var2.j();
            return;
        }
        ew6 ew6Var3 = this.d;
        ew6 ew6Var4 = (ew6) cw6Var2.h;
        byte b = 2;
        xdd.c.b("Prepare transfer from Route(%s) to Route(%s)", ew6Var3, ew6Var4);
        ta1 ta1Var = new ta1();
        ta1Var.c = new ec9();
        va1 va1Var = new va1(ta1Var);
        ua1 ua1Var = va1Var.b;
        ta1Var.b = va1Var;
        ta1Var.a = ycd.class;
        try {
            ta1Var.a = Boolean.valueOf(xddVar.b.post(new de1(xddVar, ew6Var3, ew6Var4, ta1Var, (byte) 1)));
        } catch (Exception e) {
            ua1Var.l(e);
        }
        cw6 cw6Var3 = this.g;
        wz4 wz4Var2 = (wz4) ((WeakReference) cw6Var3.s).get();
        if (wz4Var2 == null || wz4Var2.g != cw6Var3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            cw6Var3.e();
        } else {
            if (((va1) cw6Var3.w) != null) {
                dq9.m("future is already set");
                return;
            }
            cw6Var3.w = va1Var;
            bw6 bw6Var = new bw6(cw6Var3, (byte) 0);
            tz4 tz4Var = wz4Var2.a;
            Objects.requireNonNull(tz4Var);
            ua1Var.b(bw6Var, new rf2(tz4Var, b));
        }
    }

    public final void i(ew6 ew6Var, int i) {
        if (!this.j.contains(ew6Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + ew6Var);
        } else {
            if (!ew6Var.g) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + ew6Var);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                wv6 c = ew6Var.c();
                gu6 gu6Var = this.r;
                if (c == gu6Var && this.d != ew6Var) {
                    gu6Var.s(ew6Var.b);
                    return;
                }
            }
            j(ew6Var, i);
        }
    }

    public final void j(ew6 ew6Var, int i) {
        bo4 bo4Var;
        if (this.d == ew6Var) {
            return;
        }
        if (this.x != null) {
            this.x = null;
            uv6 uv6Var = this.y;
            if (uv6Var != null) {
                uv6Var.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (f() && (bo4Var = ew6Var.a.e) != null && bo4Var.c) {
            uv6 c = ew6Var.c().c(ew6Var.b);
            if (c != null) {
                Executor g = rs.g(this.h);
                k44 k44Var = this.E;
                synchronized (c.a) {
                    if (g == null) {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                    if (k44Var == null) {
                        throw new NullPointerException("Listener shouldn't be null");
                    }
                    c.b = g;
                    c.c = k44Var;
                    ArrayList arrayList = c.e;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        zu6 zu6Var = c.d;
                        ArrayList arrayList2 = c.e;
                        c.d = null;
                        c.e = null;
                        c.b.execute(new sv6(c, k44Var, zu6Var, arrayList2, (byte) 0));
                    }
                }
                this.x = ew6Var;
                this.y = c;
                c.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + ew6Var);
        }
        vv6 d = ew6Var.c().d(ew6Var.b);
        if (d != null) {
            d.e();
        }
        if (this.d != null) {
            h(this, ew6Var, d, i, null, null);
            return;
        }
        this.d = ew6Var;
        this.e = d;
        Message obtainMessage = this.a.obtainMessage(nm7.k4, new mw7(null, ew6Var));
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
        bv6 bv6Var;
        int i;
        boolean z;
        int i2;
        xv6 xv6Var = new xv6();
        tf2 tf2Var = this.t;
        long j = 0;
        tf2Var.a = 0L;
        int i3 = 0;
        tf2Var.c = false;
        tf2Var.b = SystemClock.elapsedRealtime();
        ((Handler) tf2Var.d).removeCallbacks((qn4) tf2Var.e);
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            size--;
            boolean z3 = this.p;
            if (size < 0) {
                long j2 = j;
                if (tf2Var.c) {
                    long j3 = tf2Var.a;
                    if (j3 > j2) {
                        ((Handler) tf2Var.d).postDelayed((qn4) tf2Var.e, j3);
                    }
                }
                boolean z4 = tf2Var.c;
                this.B = i4;
                yv6 g = z2 ? xv6Var.g() : yv6.c;
                yv6 g2 = xv6Var.g();
                if (f()) {
                    bv6 bv6Var2 = this.A;
                    if (bv6Var2 != null) {
                        bv6Var2.a();
                        if (bv6Var2.b.equals(g2)) {
                        }
                    }
                    if (!g2.d() || z4) {
                        bv6Var = new bv6(g2, z4);
                        this.A = bv6Var;
                    } else if (this.A != null) {
                        this.A = null;
                        bv6Var = null;
                    }
                    this.r.h(bv6Var);
                }
                bv6 bv6Var3 = this.z;
                if (bv6Var3 != null) {
                    bv6Var3.a();
                    if (bv6Var3.b.equals(g) && this.z.b() == z4) {
                        return;
                    }
                }
                if (!g.d() || z4) {
                    this.z = new bv6(g, z4);
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
                    wv6 wv6Var = ((dw6) obj).a;
                    if (wv6Var != this.r) {
                        wv6Var.h(this.z);
                    }
                }
                return;
            }
            gw6 gw6Var = (gw6) ((WeakReference) arrayList.get(size)).get();
            if (gw6Var == null) {
                arrayList.remove(size);
            } else {
                ArrayList arrayList3 = gw6Var.b;
                int size3 = arrayList3.size();
                i4 += size3;
                int i6 = i3;
                while (i6 < size3) {
                    aw6 aw6Var = (aw6) arrayList3.get(i6);
                    yv6 yv6Var = aw6Var.c;
                    if (yv6Var == null) {
                        u36.j("selector must not be null");
                        return;
                    }
                    xv6Var.f(yv6Var.c());
                    long j4 = j;
                    int i7 = (aw6Var.d & 1) != 0 ? 1 : i3;
                    ArrayList arrayList4 = arrayList;
                    long j5 = aw6Var.e;
                    if (i7 == 0) {
                        tf2Var.getClass();
                        i = i7;
                    } else {
                        i = i7;
                        long j6 = tf2Var.b;
                        if (j6 - j5 < 30000) {
                            tf2Var.a = Math.max(tf2Var.a, (j5 + 30000) - j6);
                            z = true;
                            tf2Var.c = true;
                            if (i != 0) {
                                z2 = z;
                            }
                            i2 = aw6Var.d;
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
                    i2 = aw6Var.d;
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
        ew6 ew6Var = this.d;
        if (ew6Var == null) {
            in3 in3Var = this.C;
            if (in3Var != null) {
                in3Var.o();
                return;
            }
            return;
        }
        int i = ew6Var.p;
        rh6 rh6Var = this.n;
        rh6Var.a = i;
        rh6Var.b = ew6Var.q;
        rh6Var.c = (!ew6Var.e() || gw6.g()) ? ew6Var.o : 0;
        rh6Var.d = this.d.m;
        if (f() && this.d.c() == this.r) {
            rh6Var.e = gu6.p(this.e);
        } else {
            rh6Var.e = null;
        }
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            ((vz4) arrayList.get(0)).getClass();
            throw null;
        }
        in3 in3Var2 = this.C;
        if (in3Var2 != null) {
            ew6 ew6Var2 = this.d;
            ew6 ew6Var3 = this.v;
            if (ew6Var3 == null) {
                dq9.m("There is no default route.  The media router has not yet been fully initialized.");
                return;
            }
            if (ew6Var2 == ew6Var3 || ew6Var2 == this.w) {
                in3Var2.o();
                return;
            }
            int i2 = rh6Var.c == 1 ? 2 : 0;
            int i3 = rh6Var.b;
            int i4 = rh6Var.a;
            String str = (String) rh6Var.e;
            mx6 mx6Var = (mx6) in3Var2.b;
            if (mx6Var != null) {
                dz3 dz3Var = (dz3) in3Var2.c;
                if (dz3Var != null && i2 == 0 && i3 == 0) {
                    dz3Var.c = i4;
                    vlc.a(dz3Var.b(), i4);
                } else {
                    dz3 dz3Var2 = new dz3(in3Var2, i2, i3, i4, str);
                    in3Var2.c = dz3Var2;
                    ((zw6) mx6Var.b).a.setPlaybackToRemote(dz3Var2.b());
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r21 == ((bo4) r19.s.n)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185 A[LOOP:5: B:76:0x0183->B:77:0x0185, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0 A[LOOP:6: B:80:0x019e->B:81:0x01a0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(dw6 dw6Var, bo4 bo4Var) {
        boolean z;
        int i;
        int size;
        int size2;
        Iterator it;
        boolean z2;
        bo4 bo4Var2 = dw6Var.e;
        ArrayList arrayList = dw6Var.b;
        if (bo4Var2 != bo4Var) {
            dw6Var.e = bo4Var;
            ArrayList arrayList2 = this.j;
            tz4 tz4Var = this.a;
            if (bo4Var != null) {
                List list = bo4Var.b;
                int size3 = list.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    zu6 zu6Var = (zu6) list.get(i2);
                    if (zu6Var != null && zu6Var.e()) {
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = list.iterator();
                int i3 = 0;
                boolean z3 = false;
                while (it2.hasNext()) {
                    zu6 zu6Var2 = (zu6) it2.next();
                    if (zu6Var2 == null || !zu6Var2.e()) {
                        it = it2;
                        z2 = z3;
                        Log.w("GlobalMediaRouter", "Ignoring invalid route descriptor: " + zu6Var2);
                    } else {
                        String d = zu6Var2.d();
                        int size4 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size4) {
                                i4 = -1;
                                break;
                            } else if (((ew6) arrayList.get(i4)).b.equals(d)) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (i4 < 0) {
                            it = it2;
                            z2 = z3;
                            ew6 ew6Var = new ew6(dw6Var, d, b(dw6Var, d), zu6Var2.a.getBoolean("isSystemRoute", false));
                            int i5 = i3 + 1;
                            arrayList.add(i3, ew6Var);
                            arrayList2.add(ew6Var);
                            if (zu6Var2.c().isEmpty()) {
                                ew6Var.i(zu6Var2);
                                tz4Var.b(nm7.f4, ew6Var);
                            } else {
                                arrayList3.add(new mw7(ew6Var, zu6Var2));
                            }
                            i3 = i5;
                        } else {
                            it = it2;
                            z2 = z3;
                            if (i4 < i3) {
                                Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + zu6Var2);
                            } else {
                                ew6 ew6Var2 = (ew6) arrayList.get(i4);
                                int i6 = i3 + 1;
                                Collections.swap(arrayList, i4, i3);
                                if (!zu6Var2.c().isEmpty()) {
                                    arrayList4.add(new mw7(ew6Var2, zu6Var2));
                                } else if (n(ew6Var2, zu6Var2) != 0 && ew6Var2 == this.d) {
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
                    mw7 mw7Var = (mw7) obj;
                    ew6 ew6Var3 = (ew6) mw7Var.a;
                    ew6Var3.i((zu6) mw7Var.b);
                    tz4Var.b(nm7.f4, ew6Var3);
                }
                int size6 = arrayList4.size();
                boolean z5 = z4;
                while (i7 < size6) {
                    Object obj2 = arrayList4.get(i7);
                    i7++;
                    mw7 mw7Var2 = (mw7) obj2;
                    ew6 ew6Var4 = (ew6) mw7Var2.a;
                    if (n(ew6Var4, (zu6) mw7Var2.b) != 0 && ew6Var4 == this.d) {
                        z5 = true;
                    }
                }
                z = z5;
                i = i3;
                for (size = arrayList.size() - 1; size >= i; size--) {
                    ew6 ew6Var5 = (ew6) arrayList.get(size);
                    ew6Var5.i(null);
                    arrayList2.remove(ew6Var5);
                }
                o(z);
                for (size2 = arrayList.size() - 1; size2 >= i; size2--) {
                    tz4Var.b(nm7.g4, (ew6) arrayList.remove(size2));
                }
                tz4Var.b(515, dw6Var);
            }
            z = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + bo4Var);
            i = 0;
            while (size >= i) {
            }
            o(z);
            while (size2 >= i) {
            }
            tz4Var.b(515, dw6Var);
        }
    }

    public final int n(ew6 ew6Var, zu6 zu6Var) {
        int i = ew6Var.i(zu6Var);
        if (i != 0) {
            int i2 = i & 1;
            tz4 tz4Var = this.a;
            if (i2 != 0) {
                tz4Var.b(nm7.h4, ew6Var);
            }
            if ((i & 2) != 0) {
                tz4Var.b(nm7.i4, ew6Var);
            }
            if ((i & 4) != 0) {
                tz4Var.b(nm7.j4, ew6Var);
            }
        }
        return i;
    }

    public final void o(boolean z) {
        ew6 ew6Var = this.v;
        if (ew6Var != null && !ew6Var.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        ew6 ew6Var2 = this.v;
        yd8 yd8Var = this.s;
        ArrayList arrayList = this.j;
        if (ew6Var2 == null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                ew6 ew6Var3 = (ew6) obj;
                if (ew6Var3.c() == yd8Var && ew6Var3.b.equals("DEFAULT_ROUTE") && ew6Var3.f()) {
                    this.v = ew6Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        ew6 ew6Var4 = this.w;
        if (ew6Var4 != null && !ew6Var4.f()) {
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
                ew6 ew6Var5 = (ew6) obj2;
                if (ew6Var5.c() == yd8Var && ew6Var5.m("android.media.intent.category.LIVE_AUDIO") && !ew6Var5.m("android.media.intent.category.LIVE_VIDEO") && ew6Var5.f()) {
                    this.w = ew6Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        ew6 ew6Var6 = this.d;
        if (ew6Var6 == null || !ew6Var6.g) {
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
