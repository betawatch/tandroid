package p4;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.vision.g3;
import i2.u1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import ji.h5;
import ji.w4;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.voip.m2;
import org.telegram.ui.Wallet.m5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ int F = 0;
    public n A;
    public int B;
    public li.k C;
    public android.support.v4.media.session.b0 D;
    public final l2.f E;
    public final t0 c;
    public w d;
    public q e;
    public com.google.android.gms.internal.cast.q f;
    public pl0 g;
    public final Context h;
    public final e2.s n;
    public final h5 o;
    public final boolean p;
    public final boolean q;
    public k r;
    public final k0 s;
    public final u1 t;
    public a0 u;
    public w v;
    public w w;
    public w x;
    public p y;
    public n z;
    public final b a = new b(this);
    public final HashMap b = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context) {
        boolean z10;
        g3 g3Var;
        t0 t0Var;
        e2.s sVar = new e2.s();
        sVar.c = 0;
        sVar.d = 3;
        this.n = sVar;
        this.o = new h5(this, 18);
        this.E = new l2.f(this, 13);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            int i11 = f0.b;
            Intent intent = new Intent(context, (Class<?>) f0.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z10 = true;
                this.q = z10;
                int i12 = u0.b;
                Intent intent2 = new Intent(context, (Class<?>) u0.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i10 >= 30 || !z10) ? null : new k(context, new w4(this, 20));
                k0 g0Var = i10 < 24 ? new g0(context, this) : new k0(context, this);
                this.s = g0Var;
                this.t = new u1(new m2(this, 12));
                a(g0Var, true);
                g3Var = this.r;
                if (g3Var != null) {
                    a(g3Var, true);
                }
                t0Var = new t0(context, this);
                this.c = t0Var;
                Handler handler = (Handler) t0Var.d;
                if (t0Var.a) {
                    t0Var.a = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    ((Context) t0Var.b).registerReceiver((androidx.mediarouter.app.f) t0Var.g, intentFilter, null, handler);
                    handler.post((m5) t0Var.h);
                    return;
                }
                return;
            }
        }
        z10 = false;
        this.q = z10;
        int i122 = u0.b;
        Intent intent22 = new Intent(context, (Class<?>) u0.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.r = (i10 >= 30 || !z10) ? null : new k(context, new w4(this, 20));
        if (i10 < 24) {
        }
        this.s = g0Var;
        this.t = new u1(new m2(this, 12));
        a(g0Var, true);
        g3Var = this.r;
        if (g3Var != null) {
        }
        t0Var = new t0(context, this);
        this.c = t0Var;
        Handler handler2 = (Handler) t0Var.d;
        if (t0Var.a) {
        }
    }

    public final void a(g3 g3Var, boolean z10) {
        if (d(g3Var) == null) {
            v vVar = new v(g3Var, z10);
            this.l.add(vVar);
            this.a.b(513, vVar);
            m(vVar, (b2.u) g3Var.n);
            y.b();
            g3Var.f = this.o;
            g3Var.h(this.z);
        }
    }

    public final String b(v vVar, String str) {
        String flattenToShortString = ((ComponentName) vVar.d.b).flattenToShortString();
        boolean z10 = vVar.c;
        String D = z10 ? str : a1.g.D(flattenToShortString, ":", str);
        HashMap hashMap = this.k;
        if (!z10) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                }
                if (((w) arrayList.get(i10)).c.equals(D)) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", org.telegram.ui.Cells.d0.j("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = D + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            i12 = -1;
                            break;
                        }
                        if (((w) arrayList.get(i12)).c.equals(str2)) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 < 0) {
                        hashMap.put(new q0.b(flattenToShortString, str), str2);
                        return str2;
                    }
                    i11++;
                }
            }
        }
        hashMap.put(new q0.b(flattenToShortString, str), D);
        return D;
    }

    public final w c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            if (wVar != this.v && wVar.c() == this.s && wVar.m("android.media.intent.category.LIVE_AUDIO") && !wVar.m("android.media.intent.category.LIVE_VIDEO") && wVar.f()) {
                return wVar;
            }
        }
        return this.v;
    }

    public final v d(g3 g3Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.a == g3Var) {
                return vVar;
            }
        }
        return null;
    }

    public final w e() {
        w wVar = this.d;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean f() {
        if (!this.q) {
            return false;
        }
        a0 a0Var = this.u;
        return a0Var == null || a0Var.b;
    }

    public final void g() {
        if (this.d.e()) {
            List<w> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((w) it.next()).c);
            }
            HashMap hashMap = this.b;
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    q qVar = (q) entry.getValue();
                    qVar.h(0);
                    qVar.d();
                    it2.remove();
                }
            }
            for (w wVar : unmodifiableList) {
                if (!hashMap.containsKey(wVar.c)) {
                    q e = wVar.c().e(wVar.b, this.d.b);
                    e.e();
                    hashMap.put(wVar.c, e);
                }
            }
        }
    }

    public final void h(e eVar, w wVar, q qVar, int i10, w wVar2, Collection collection) {
        final com.google.android.gms.internal.cast.q qVar2;
        pl0 pl0Var = this.g;
        if (pl0Var != null) {
            pl0Var.a();
            this.g = null;
        }
        pl0 pl0Var2 = new pl0(eVar, wVar, qVar, i10, wVar2, collection);
        this.g = pl0Var2;
        int i11 = 3;
        if (pl0Var2.b != 3 || (qVar2 = this.f) == null) {
            pl0Var2.b();
            return;
        }
        final w wVar3 = this.d;
        final w wVar4 = (w) pl0Var2.g;
        com.google.android.gms.internal.cast.q.c.b("Prepare transfer from Route(%s) to Route(%s)", wVar3, wVar4);
        c0.l a2 = v7.h0.a(new c0.j() { // from class: com.google.android.gms.internal.cast.o
            @Override // c0.j
            public final Object b(c0.i iVar) {
                q qVar3 = q.this;
                qVar3.getClass();
                return Boolean.valueOf(qVar3.b.post(new p(qVar3, wVar3, wVar4, iVar, 0)));
            }
        });
        pl0 pl0Var3 = this.g;
        e eVar2 = (e) ((WeakReference) pl0Var3.j).get();
        if (eVar2 == null || eVar2.g != pl0Var3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            pl0Var3.a();
        } else {
            if (((c0.l) pl0Var3.k) != null) {
                throw new IllegalStateException("future is already set");
            }
            pl0Var3.k = a2;
            m2 m2Var = new m2(pl0Var3, 14);
            b bVar = eVar2.a;
            Objects.requireNonNull(bVar);
            a2.b.a(m2Var, new i2.f0(bVar, i11));
        }
    }

    public final void i(w wVar, int i10) {
        if (!this.j.contains(wVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + wVar);
        } else {
            if (!wVar.g) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + wVar);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                g3 c10 = wVar.c();
                k kVar = this.r;
                if (c10 == kVar && this.d != wVar) {
                    kVar.s(wVar.b);
                    return;
                }
            }
            j(wVar, i10);
        }
    }

    public final void j(w wVar, int i10) {
        b2.u uVar;
        if (this.d == wVar) {
            return;
        }
        if (this.x != null) {
            this.x = null;
            p pVar = this.y;
            if (pVar != null) {
                pVar.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (f() && (uVar = wVar.a.e) != null && uVar.b) {
            p c10 = wVar.c().c(wVar.b);
            if (c10 != null) {
                Executor d = f0.c.d(this.h);
                l2.f fVar = this.E;
                synchronized (c10.a) {
                    try {
                        if (d == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (fVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        c10.b = d;
                        c10.c = fVar;
                        ArrayList arrayList = c10.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            m mVar = c10.d;
                            ArrayList arrayList2 = c10.e;
                            c10.d = null;
                            c10.e = null;
                            c10.b.execute(new com.google.android.gms.internal.cast.p(c10, fVar, mVar, arrayList2, false, 2));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.x = wVar;
                this.y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + wVar);
        }
        q d10 = wVar.c().d(wVar.b);
        if (d10 != null) {
            d10.e();
        }
        if (this.d != null) {
            h(this, wVar, d10, i10, null, null);
            return;
        }
        this.d = wVar;
        this.e = d10;
        Message obtainMessage = this.a.obtainMessage(262, new q0.b(null, wVar));
        obtainMessage.arg1 = i10;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x014d, code lost:
    
        if (r25.A.b() == r1) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        long j10;
        r rVar;
        ArrayList arrayList;
        r rVar2 = new r();
        u1 u1Var = this.t;
        long j11 = 0;
        u1Var.a = 0L;
        int i10 = 0;
        u1Var.c = false;
        u1Var.b = SystemClock.elapsedRealtime();
        ((Handler) u1Var.d).removeCallbacks((m2) u1Var.e);
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            size--;
            boolean z11 = this.p;
            if (size < 0) {
                r rVar3 = rVar2;
                long j12 = j11;
                u1 u1Var2 = this.t;
                if (u1Var2.c) {
                    long j13 = u1Var2.a;
                    if (j13 > j12) {
                        ((Handler) u1Var2.d).postDelayed((m2) u1Var2.e, j13);
                    }
                }
                boolean z12 = u1Var2.c;
                this.B = i11;
                s f7 = z10 ? rVar3.f() : s.c;
                s f10 = rVar3.f();
                if (f()) {
                    n nVar = this.A;
                    if (nVar != null) {
                        nVar.a();
                        if (nVar.b.equals(f10)) {
                        }
                    }
                    if (!f10.d() || z12) {
                        this.A = new n(f10, z12);
                    } else if (this.A != null) {
                        this.A = null;
                    }
                    this.r.h(this.A);
                }
                n nVar2 = this.z;
                if (nVar2 != null) {
                    nVar2.a();
                    if (nVar2.b.equals(f7) && this.z.b() == z12) {
                        return;
                    }
                }
                if (!f7.d() || z12) {
                    this.z = new n(f7, z12);
                } else if (this.z == null) {
                    return;
                } else {
                    this.z = null;
                }
                if (z10 && !z12 && z11) {
                    Log.i("GlobalMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                ArrayList arrayList3 = this.l;
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj = arrayList3.get(i12);
                    i12++;
                    g3 g3Var = ((v) obj).a;
                    if (g3Var != this.r) {
                        g3Var.h(this.z);
                    }
                }
                return;
            }
            y yVar = (y) ((WeakReference) arrayList2.get(size)).get();
            if (yVar == null) {
                arrayList2.remove(size);
            } else {
                ArrayList arrayList4 = yVar.b;
                int size3 = arrayList4.size();
                i11 += size3;
                int i13 = i10;
                while (i13 < size3) {
                    u uVar = (u) arrayList4.get(i13);
                    s sVar = uVar.c;
                    if (sVar == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    ArrayList c10 = sVar.c();
                    if (c10.isEmpty()) {
                        j10 = j11;
                    } else {
                        int size4 = c10.size();
                        j10 = j11;
                        int i14 = 0;
                        while (i14 < size4) {
                            Object obj2 = c10.get(i14);
                            i14++;
                            String str = (String) obj2;
                            if (str == null) {
                                throw new IllegalArgumentException("category must not be null");
                            }
                            if (rVar2.a == null) {
                                rVar2.a = new ArrayList();
                            }
                            if (!rVar2.a.contains(str)) {
                                rVar2.a.add(str);
                            }
                        }
                    }
                    boolean z13 = (uVar.d & 1) != 0;
                    long j14 = uVar.e;
                    u1 u1Var3 = this.t;
                    if (z13) {
                        rVar = rVar2;
                        arrayList = arrayList2;
                        long j15 = u1Var3.b;
                        if (j15 - j14 < 30000) {
                            u1Var3.a = Math.max(u1Var3.a, (j14 + 30000) - j15);
                            u1Var3.c = true;
                        }
                    } else {
                        u1Var3.getClass();
                        rVar = rVar2;
                        arrayList = arrayList2;
                    }
                    if (z13) {
                        z10 = true;
                    }
                    int i15 = uVar.d;
                    if ((i15 & 4) != 0 && !z11) {
                        z10 = true;
                    }
                    if ((i15 & 8) != 0) {
                        z10 = true;
                    }
                    i13++;
                    j11 = j10;
                    rVar2 = rVar;
                    arrayList2 = arrayList;
                }
            }
            j11 = j11;
            rVar2 = rVar2;
            arrayList2 = arrayList2;
            i10 = 0;
        }
    }

    public final void l() {
        w wVar = this.d;
        if (wVar == null) {
            li.k kVar = this.C;
            if (kVar != null) {
                kVar.s();
                return;
            }
            return;
        }
        int i10 = wVar.p;
        e2.s sVar = this.n;
        sVar.a = i10;
        sVar.b = wVar.q;
        sVar.c = (!wVar.e() || y.g()) ? wVar.o : 0;
        sVar.d = this.d.m;
        if (f() && this.d.c() == this.r) {
            sVar.e = k.p(this.e);
        } else {
            sVar.e = null;
        }
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        li.k kVar2 = this.C;
        if (kVar2 != null) {
            w wVar2 = this.d;
            w wVar3 = this.v;
            if (wVar3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (wVar2 == wVar3 || wVar2 == this.w) {
                kVar2.s();
                return;
            }
            int i11 = sVar.c == 1 ? 2 : 0;
            int i12 = sVar.b;
            int i13 = sVar.a;
            String str = (String) sVar.e;
            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) kVar2.b;
            if (b0Var != null) {
                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) kVar2.c;
                if (pVar != null && i11 == 0 && i12 == 0) {
                    pVar.c = i13;
                    y1.g.a(pVar.c(), i13);
                    return;
                }
                androidx.emoji2.text.p pVar2 = new androidx.emoji2.text.p();
                pVar2.f = kVar2;
                pVar2.a = i11;
                pVar2.b = i12;
                pVar2.c = i13;
                pVar2.d = str;
                kVar2.c = pVar2;
                b0Var.a.a.setPlaybackToRemote(pVar2.c());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r21 == ((b2.u) r19.s.n)) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0192 A[LOOP:5: B:77:0x0190->B:78:0x0192, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ad A[LOOP:6: B:81:0x01ab->B:82:0x01ad, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(v vVar, b2.u uVar) {
        boolean z10;
        int i10;
        int size;
        int size2;
        Iterator it;
        boolean z11;
        b2.u uVar2 = vVar.e;
        ArrayList arrayList = vVar.b;
        if (uVar2 != uVar) {
            vVar.e = uVar;
            ArrayList arrayList2 = this.j;
            b bVar = this.a;
            if (uVar != null) {
                List list = (List) uVar.c;
                int size3 = list.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    m mVar = (m) list.get(i11);
                    if (mVar != null && mVar.e()) {
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = list.iterator();
                int i12 = 0;
                boolean z12 = false;
                while (it2.hasNext()) {
                    m mVar2 = (m) it2.next();
                    if (mVar2 == null || !mVar2.e()) {
                        it = it2;
                        z11 = z12;
                        Log.w("GlobalMediaRouter", "Ignoring invalid route descriptor: " + mVar2);
                    } else {
                        String d = mVar2.d();
                        int size4 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size4) {
                                i13 = -1;
                                break;
                            } else if (((w) arrayList.get(i13)).b.equals(d)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (i13 < 0) {
                            it = it2;
                            z11 = z12;
                            w wVar = new w(vVar, d, b(vVar, d), mVar2.a.getBoolean("isSystemRoute", false));
                            int i14 = i12 + 1;
                            arrayList.add(i12, wVar);
                            arrayList2.add(wVar);
                            if (mVar2.c().isEmpty()) {
                                wVar.i(mVar2);
                                bVar.b(257, wVar);
                            } else {
                                arrayList3.add(new q0.b(wVar, mVar2));
                            }
                            i12 = i14;
                        } else {
                            it = it2;
                            z11 = z12;
                            if (i13 < i12) {
                                Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + mVar2);
                            } else {
                                w wVar2 = (w) arrayList.get(i13);
                                int i15 = i12 + 1;
                                Collections.swap(arrayList, i13, i12);
                                if (!mVar2.c().isEmpty()) {
                                    arrayList4.add(new q0.b(wVar2, mVar2));
                                } else if (n(wVar2, mVar2) != 0 && wVar2 == this.d) {
                                    i12 = i15;
                                    z11 = true;
                                }
                                i12 = i15;
                            }
                        }
                    }
                    it2 = it;
                    z12 = z11;
                }
                boolean z13 = z12;
                int i16 = 0;
                int size5 = arrayList3.size();
                int i17 = 0;
                while (i17 < size5) {
                    Object obj = arrayList3.get(i17);
                    i17++;
                    q0.b bVar2 = (q0.b) obj;
                    w wVar3 = (w) bVar2.a;
                    wVar3.i((m) bVar2.b);
                    bVar.b(257, wVar3);
                }
                int size6 = arrayList4.size();
                boolean z14 = z13;
                while (i16 < size6) {
                    Object obj2 = arrayList4.get(i16);
                    i16++;
                    q0.b bVar3 = (q0.b) obj2;
                    w wVar4 = (w) bVar3.a;
                    if (n(wVar4, (m) bVar3.b) != 0 && wVar4 == this.d) {
                        z14 = true;
                    }
                }
                z10 = z14;
                i10 = i12;
                for (size = arrayList.size() - 1; size >= i10; size--) {
                    w wVar5 = (w) arrayList.get(size);
                    wVar5.i(null);
                    arrayList2.remove(wVar5);
                }
                o(z10);
                for (size2 = arrayList.size() - 1; size2 >= i10; size2--) {
                    bVar.b(258, (w) arrayList.remove(size2));
                }
                bVar.b(515, vVar);
            }
            z10 = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + uVar);
            i10 = 0;
            while (size >= i10) {
            }
            o(z10);
            while (size2 >= i10) {
            }
            bVar.b(515, vVar);
        }
    }

    public final int n(w wVar, m mVar) {
        int i10 = wVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.a;
            if (i11 != 0) {
                bVar.b(259, wVar);
            }
            if ((i10 & 2) != 0) {
                bVar.b(260, wVar);
            }
            if ((i10 & 4) != 0) {
                bVar.b(261, wVar);
            }
        }
        return i10;
    }

    public final void o(boolean z10) {
        w wVar = this.v;
        if (wVar != null && !wVar.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        w wVar2 = this.v;
        k0 k0Var = this.s;
        ArrayList arrayList = this.j;
        if (wVar2 == null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                w wVar3 = (w) obj;
                if (wVar3.c() == k0Var && wVar3.b.equals("DEFAULT_ROUTE") && wVar3.f()) {
                    this.v = wVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        w wVar4 = this.w;
        if (wVar4 != null && !wVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.w);
            this.w = null;
        }
        if (this.w == null) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i11);
                i11++;
                w wVar5 = (w) obj2;
                if (wVar5.c() == k0Var && wVar5.m("android.media.intent.category.LIVE_AUDIO") && !wVar5.m("android.media.intent.category.LIVE_VIDEO") && wVar5.f()) {
                    this.w = wVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        w wVar6 = this.d;
        if (wVar6 == null || !wVar6.g) {
            Log.i("GlobalMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.d);
            j(c(), 0);
            return;
        }
        if (z10) {
            g();
            l();
        }
    }
}
