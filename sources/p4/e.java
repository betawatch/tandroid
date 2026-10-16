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
import ji.d4;
import ji.w4;
import m.h3;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.voip.r2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ int F = 0;
    public n A;
    public int B;
    public h3 C;
    public android.support.v4.media.session.b0 D;
    public final m.h E;
    public final t0 c;
    public v d;
    public q e;
    public com.google.android.gms.internal.cast.q f;
    public pl0 g;
    public final Context h;
    public final e2.s n;
    public final w4 o;
    public final boolean p;
    public final boolean q;
    public k r;
    public final j0 s;
    public final u1 t;
    public z u;
    public v v;
    public v w;
    public v x;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
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
        this.o = new w4(this, 18);
        this.E = new m.h(this, 12);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            int i11 = e0.b;
            Intent intent = new Intent(context, (Class<?>) e0.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z10 = true;
                this.q = z10;
                int i12 = u0.b;
                Intent intent2 = new Intent(context, (Class<?>) u0.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i10 >= 30 || !z10) ? null : new k(context, new m.l(this));
                j0 f0Var = i10 < 24 ? new f0(context, this) : new j0(context, this);
                this.s = f0Var;
                this.t = new u1(new r2(this, 11));
                a(f0Var, true);
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
                    handler.post((s0) t0Var.h);
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
        this.r = (i10 >= 30 || !z10) ? null : new k(context, new m.l(this));
        if (i10 < 24) {
        }
        this.s = f0Var;
        this.t = new u1(new r2(this, 11));
        a(f0Var, true);
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
            u uVar = new u(g3Var, z10);
            this.l.add(uVar);
            this.a.b(513, uVar);
            m(uVar, (b2.u) g3Var.n);
            x.b();
            g3Var.f = this.o;
            g3Var.h(this.z);
        }
    }

    public final String b(u uVar, String str) {
        String flattenToShortString = ((ComponentName) uVar.d.b).flattenToShortString();
        boolean z10 = uVar.c;
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
                if (((v) arrayList.get(i10)).c.equals(D)) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", c1.i("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
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
                        if (((v) arrayList.get(i12)).c.equals(str2)) {
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

    public final v c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(g3 g3Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.a == g3Var) {
                return uVar;
            }
        }
        return null;
    }

    public final v e() {
        v vVar = this.d;
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean f() {
        if (!this.q) {
            return false;
        }
        z zVar = this.u;
        return zVar == null || zVar.b;
    }

    public final void g() {
        if (this.d.e()) {
            List<v> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((v) it.next()).c);
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
            for (v vVar : unmodifiableList) {
                if (!hashMap.containsKey(vVar.c)) {
                    q e = vVar.c().e(vVar.b, this.d.b);
                    e.e();
                    hashMap.put(vVar.c, e);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        final com.google.android.gms.internal.cast.q qVar2;
        pl0 pl0Var = this.g;
        if (pl0Var != null) {
            pl0Var.a();
            this.g = null;
        }
        pl0 pl0Var2 = new pl0(eVar, vVar, qVar, i10, vVar2, collection);
        this.g = pl0Var2;
        int i11 = 3;
        if (pl0Var2.b != 3 || (qVar2 = this.f) == null) {
            pl0Var2.b();
            return;
        }
        final v vVar3 = this.d;
        final v vVar4 = (v) pl0Var2.g;
        com.google.android.gms.internal.cast.q.c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
        c0.l a2 = v7.h0.a(new c0.j() { // from class: com.google.android.gms.internal.cast.o
            @Override // c0.j
            public final Object b(c0.i iVar) {
                q qVar3 = q.this;
                qVar3.getClass();
                return Boolean.valueOf(qVar3.b.post(new p(qVar3, vVar3, vVar4, iVar, 0)));
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
            r2 r2Var = new r2(pl0Var3, 13);
            b bVar = eVar2.a;
            Objects.requireNonNull(bVar);
            a2.b.a(r2Var, new i2.f0(bVar, i11));
        }
    }

    public final void i(v vVar, int i10) {
        if (!this.j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else {
            if (!vVar.g) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                g3 c10 = vVar.c();
                k kVar = this.r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.b);
                    return;
                }
            }
            j(vVar, i10);
        }
    }

    public final void j(v vVar, int i10) {
        b2.u uVar;
        if (this.d == vVar) {
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
        if (f() && (uVar = vVar.a.e) != null && uVar.b) {
            p c10 = vVar.c().c(vVar.b);
            if (c10 != null) {
                Executor d = f0.c.d(this.h);
                m.h hVar = this.E;
                synchronized (c10.a) {
                    try {
                        if (d == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (hVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        c10.b = d;
                        c10.c = hVar;
                        ArrayList arrayList = c10.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            m mVar = c10.d;
                            ArrayList arrayList2 = c10.e;
                            c10.d = null;
                            c10.e = null;
                            c10.b.execute(new com.google.android.gms.internal.cast.p(c10, hVar, mVar, arrayList2, false, 2));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.x = vVar;
                this.y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d10 = vVar.c().d(vVar.b);
        if (d10 != null) {
            d10.e();
        }
        if (this.d != null) {
            h(this, vVar, d10, i10, null, null);
            return;
        }
        this.d = vVar;
        this.e = d10;
        Message obtainMessage = this.a.obtainMessage(262, new q0.b(null, vVar));
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
        d4 d4Var;
        ArrayList arrayList;
        d4 d4Var2 = new d4();
        u1 u1Var = this.t;
        long j11 = 0;
        u1Var.a = 0L;
        int i10 = 0;
        u1Var.c = false;
        u1Var.b = SystemClock.elapsedRealtime();
        ((Handler) u1Var.d).removeCallbacks((r2) u1Var.e);
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            size--;
            boolean z11 = this.p;
            if (size < 0) {
                d4 d4Var3 = d4Var2;
                long j12 = j11;
                u1 u1Var2 = this.t;
                if (u1Var2.c) {
                    long j13 = u1Var2.a;
                    if (j13 > j12) {
                        ((Handler) u1Var2.d).postDelayed((r2) u1Var2.e, j13);
                    }
                }
                boolean z12 = u1Var2.c;
                this.B = i11;
                r a2 = z10 ? d4Var3.a() : r.c;
                r a10 = d4Var3.a();
                if (f()) {
                    n nVar = this.A;
                    if (nVar != null) {
                        nVar.a();
                        if (nVar.b.equals(a10)) {
                        }
                    }
                    if (!a10.d() || z12) {
                        this.A = new n(a10, z12);
                    } else if (this.A != null) {
                        this.A = null;
                    }
                    this.r.h(this.A);
                }
                n nVar2 = this.z;
                if (nVar2 != null) {
                    nVar2.a();
                    if (nVar2.b.equals(a2) && this.z.b() == z12) {
                        return;
                    }
                }
                if (!a2.d() || z12) {
                    this.z = new n(a2, z12);
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
                    g3 g3Var = ((u) obj).a;
                    if (g3Var != this.r) {
                        g3Var.h(this.z);
                    }
                }
                return;
            }
            x xVar = (x) ((WeakReference) arrayList2.get(size)).get();
            if (xVar == null) {
                arrayList2.remove(size);
            } else {
                ArrayList arrayList4 = xVar.b;
                int size3 = arrayList4.size();
                i11 += size3;
                int i13 = i10;
                while (i13 < size3) {
                    t tVar = (t) arrayList4.get(i13);
                    r rVar = tVar.c;
                    if (rVar == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    ArrayList c10 = rVar.c();
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
                            if (d4Var2.a == null) {
                                d4Var2.a = new ArrayList();
                            }
                            if (!d4Var2.a.contains(str)) {
                                d4Var2.a.add(str);
                            }
                        }
                    }
                    boolean z13 = (tVar.d & 1) != 0;
                    long j14 = tVar.e;
                    u1 u1Var3 = this.t;
                    if (z13) {
                        d4Var = d4Var2;
                        arrayList = arrayList2;
                        long j15 = u1Var3.b;
                        if (j15 - j14 < 30000) {
                            u1Var3.a = Math.max(u1Var3.a, (j14 + 30000) - j15);
                            u1Var3.c = true;
                        }
                    } else {
                        u1Var3.getClass();
                        d4Var = d4Var2;
                        arrayList = arrayList2;
                    }
                    if (z13) {
                        z10 = true;
                    }
                    int i15 = tVar.d;
                    if ((i15 & 4) != 0 && !z11) {
                        z10 = true;
                    }
                    if ((i15 & 8) != 0) {
                        z10 = true;
                    }
                    i13++;
                    j11 = j10;
                    d4Var2 = d4Var;
                    arrayList2 = arrayList;
                }
            }
            j11 = j11;
            d4Var2 = d4Var2;
            arrayList2 = arrayList2;
            i10 = 0;
        }
    }

    public final void l() {
        v vVar = this.d;
        if (vVar == null) {
            h3 h3Var = this.C;
            if (h3Var != null) {
                h3Var.t();
                return;
            }
            return;
        }
        int i10 = vVar.p;
        e2.s sVar = this.n;
        sVar.a = i10;
        sVar.b = vVar.q;
        sVar.c = (!vVar.e() || x.g()) ? vVar.o : 0;
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
        h3 h3Var2 = this.C;
        if (h3Var2 != null) {
            v vVar2 = this.d;
            v vVar3 = this.v;
            if (vVar3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (vVar2 == vVar3 || vVar2 == this.w) {
                h3Var2.t();
                return;
            }
            int i11 = sVar.c == 1 ? 2 : 0;
            int i12 = sVar.b;
            int i13 = sVar.a;
            String str = (String) sVar.e;
            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) h3Var2.b;
            if (b0Var != null) {
                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) h3Var2.c;
                if (pVar != null && i11 == 0 && i12 == 0) {
                    pVar.c = i13;
                    y1.g.a(pVar.c(), i13);
                    return;
                }
                androidx.emoji2.text.p pVar2 = new androidx.emoji2.text.p();
                pVar2.f = h3Var2;
                pVar2.a = i11;
                pVar2.b = i12;
                pVar2.c = i13;
                pVar2.d = str;
                h3Var2.c = pVar2;
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
    public final void m(u uVar, b2.u uVar2) {
        boolean z10;
        int i10;
        int size;
        int size2;
        Iterator it;
        boolean z11;
        b2.u uVar3 = uVar.e;
        ArrayList arrayList = uVar.b;
        if (uVar3 != uVar2) {
            uVar.e = uVar2;
            ArrayList arrayList2 = this.j;
            b bVar = this.a;
            if (uVar2 != null) {
                List list = (List) uVar2.c;
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
                            } else if (((v) arrayList.get(i13)).b.equals(d)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (i13 < 0) {
                            it = it2;
                            z11 = z12;
                            v vVar = new v(uVar, d, b(uVar, d), mVar2.a.getBoolean("isSystemRoute", false));
                            int i14 = i12 + 1;
                            arrayList.add(i12, vVar);
                            arrayList2.add(vVar);
                            if (mVar2.c().isEmpty()) {
                                vVar.i(mVar2);
                                bVar.b(257, vVar);
                            } else {
                                arrayList3.add(new q0.b(vVar, mVar2));
                            }
                            i12 = i14;
                        } else {
                            it = it2;
                            z11 = z12;
                            if (i13 < i12) {
                                Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + mVar2);
                            } else {
                                v vVar2 = (v) arrayList.get(i13);
                                int i15 = i12 + 1;
                                Collections.swap(arrayList, i13, i12);
                                if (!mVar2.c().isEmpty()) {
                                    arrayList4.add(new q0.b(vVar2, mVar2));
                                } else if (n(vVar2, mVar2) != 0 && vVar2 == this.d) {
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
                    v vVar3 = (v) bVar2.a;
                    vVar3.i((m) bVar2.b);
                    bVar.b(257, vVar3);
                }
                int size6 = arrayList4.size();
                boolean z14 = z13;
                while (i16 < size6) {
                    Object obj2 = arrayList4.get(i16);
                    i16++;
                    q0.b bVar3 = (q0.b) obj2;
                    v vVar4 = (v) bVar3.a;
                    if (n(vVar4, (m) bVar3.b) != 0 && vVar4 == this.d) {
                        z14 = true;
                    }
                }
                z10 = z14;
                i10 = i12;
                for (size = arrayList.size() - 1; size >= i10; size--) {
                    v vVar5 = (v) arrayList.get(size);
                    vVar5.i(null);
                    arrayList2.remove(vVar5);
                }
                o(z10);
                for (size2 = arrayList.size() - 1; size2 >= i10; size2--) {
                    bVar.b(258, (v) arrayList.remove(size2));
                }
                bVar.b(515, uVar);
            }
            z10 = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + uVar2);
            i10 = 0;
            while (size >= i10) {
            }
            o(z10);
            while (size2 >= i10) {
            }
            bVar.b(515, uVar);
        }
    }

    public final int n(v vVar, m mVar) {
        int i10 = vVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.a;
            if (i11 != 0) {
                bVar.b(259, vVar);
            }
            if ((i10 & 2) != 0) {
                bVar.b(260, vVar);
            }
            if ((i10 & 4) != 0) {
                bVar.b(261, vVar);
            }
        }
        return i10;
    }

    public final void o(boolean z10) {
        v vVar = this.v;
        if (vVar != null && !vVar.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        v vVar2 = this.v;
        j0 j0Var = this.s;
        ArrayList arrayList = this.j;
        if (vVar2 == null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                v vVar3 = (v) obj;
                if (vVar3.c() == j0Var && vVar3.b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.w;
        if (vVar4 != null && !vVar4.f()) {
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
                v vVar5 = (v) obj2;
                if (vVar5.c() == j0Var && vVar5.m("android.media.intent.category.LIVE_AUDIO") && !vVar5.m("android.media.intent.category.LIVE_VIDEO") && vVar5.f()) {
                    this.w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 == null || !vVar6.g) {
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
