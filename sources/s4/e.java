package s4;

import a8.pa;
import a8.q7;
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
import com.google.android.gms.internal.vision.g3;
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
import l2.u1;
import li.z3;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.vy;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ int F = 0;
    public n A;
    public int B;
    public hy0 C;
    public android.support.v4.media.session.a0 D;
    public final vy E;
    public final qe.h c;
    public v d;
    public q e;
    public com.google.android.gms.internal.cast.o f;
    public ri0 g;
    public final Context h;
    public final h2.s n;
    public final org.telegram.ui.Components.n o;
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
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context) {
        boolean z9;
        g3 g3Var;
        qe.h hVar;
        h2.s sVar = new h2.s();
        sVar.c = 0;
        sVar.d = 3;
        this.n = sVar;
        this.o = new org.telegram.ui.Components.n(this);
        this.E = new vy(this, 14);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            int i10 = e0.b;
            Intent intent = new Intent(context, (Class<?>) e0.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z9 = true;
                this.q = z9;
                int i11 = s0.b;
                Intent intent2 = new Intent(context, (Class<?>) s0.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i7 >= 30 || !z9) ? null : new k(context, new rt(this, 13));
                j0 f0Var = i7 < 24 ? new f0(context, this) : new j0(context, this);
                this.s = f0Var;
                m5 m5Var = new m5(this, 25);
                u1 u1Var = new u1();
                u1Var.d = new Handler(Looper.getMainLooper());
                u1Var.e = m5Var;
                this.t = u1Var;
                a(f0Var, true);
                g3Var = this.r;
                if (g3Var != null) {
                    a(g3Var, true);
                }
                hVar = new qe.h(context, this);
                this.c = hVar;
                Handler handler = (Handler) hVar.d;
                if (hVar.a) {
                    hVar.a = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    ((Context) hVar.b).registerReceiver((androidx.mediarouter.app.f) hVar.g, intentFilter, null, handler);
                    handler.post((et) hVar.h);
                    return;
                }
                return;
            }
        }
        z9 = false;
        this.q = z9;
        int i112 = s0.b;
        Intent intent22 = new Intent(context, (Class<?>) s0.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.r = (i7 >= 30 || !z9) ? null : new k(context, new rt(this, 13));
        if (i7 < 24) {
        }
        this.s = f0Var;
        m5 m5Var2 = new m5(this, 25);
        u1 u1Var2 = new u1();
        u1Var2.d = new Handler(Looper.getMainLooper());
        u1Var2.e = m5Var2;
        this.t = u1Var2;
        a(f0Var, true);
        g3Var = this.r;
        if (g3Var != null) {
        }
        hVar = new qe.h(context, this);
        this.c = hVar;
        Handler handler2 = (Handler) hVar.d;
        if (hVar.a) {
        }
    }

    public final void a(g3 g3Var, boolean z9) {
        if (d(g3Var) == null) {
            u uVar = new u(g3Var, z9);
            this.l.add(uVar);
            this.a.b(513, uVar);
            m(uVar, (ca.i) g3Var.n);
            x.b();
            g3Var.f = this.o;
            g3Var.h(this.z);
        }
    }

    public final String b(u uVar, String str) {
        String flattenToShortString = ((ComponentName) uVar.d.b).flattenToShortString();
        boolean z9 = uVar.c;
        String D = z9 ? str : a8.p0.D(flattenToShortString, ":", str);
        HashMap hashMap = this.k;
        if (!z9) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    i7 = -1;
                    break;
                }
                if (((v) arrayList.get(i7)).c.equals(D)) {
                    break;
                }
                i7++;
            }
            if (i7 >= 0) {
                Log.w("GlobalMediaRouter", f1.m("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i10 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = D + "_" + i10;
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            i11 = -1;
                            break;
                        }
                        if (((v) arrayList.get(i11)).c.equals(str2)) {
                            break;
                        }
                        i11++;
                    }
                    if (i11 < 0) {
                        hashMap.put(new q0.b(flattenToShortString, str), str2);
                        return str2;
                    }
                    i10++;
                }
            }
        }
        hashMap.put(new q0.b(flattenToShortString, str), D);
        return D;
    }

    public final v c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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
                    q e10 = vVar.c().e(vVar.b, this.d.b);
                    e10.e();
                    hashMap.put(vVar.c, e10);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i7, v vVar2, Collection collection) {
        final com.google.android.gms.internal.cast.o oVar;
        ri0 ri0Var = this.g;
        if (ri0Var != null) {
            ri0Var.a();
            this.g = null;
        }
        ri0 ri0Var2 = new ri0(eVar, vVar, qVar, i7, vVar2, collection);
        this.g = ri0Var2;
        int i10 = 3;
        if (ri0Var2.b != 3 || (oVar = this.f) == null) {
            ri0Var2.b();
            return;
        }
        final v vVar3 = this.d;
        final v vVar4 = (v) ri0Var2.g;
        com.google.android.gms.internal.cast.o.c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
        c0.l a10 = q7.a(new c0.j() { // from class: com.google.android.gms.internal.cast.n
            @Override // c0.j
            public final Object d(c0.i iVar) {
                o oVar2 = o.this;
                oVar2.getClass();
                return Boolean.valueOf(oVar2.b.post(new pa(oVar2, vVar3, vVar4, iVar, 2)));
            }
        });
        ri0 ri0Var3 = this.g;
        e eVar2 = (e) ((WeakReference) ri0Var3.j).get();
        if (eVar2 == null || eVar2.g != ri0Var3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            ri0Var3.a();
        } else {
            if (((c0.l) ri0Var3.k) != null) {
                throw new IllegalStateException("future is already set");
            }
            ri0Var3.k = a10;
            m5 m5Var = new m5(ri0Var3, 27);
            b bVar = eVar2.a;
            Objects.requireNonNull(bVar);
            a10.b.b(m5Var, new l2.g0(bVar, i10));
        }
    }

    public final void i(v vVar, int i7) {
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
            j(vVar, i7);
        }
    }

    public final void j(v vVar, int i7) {
        ca.i iVar;
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
        if (f() && (iVar = vVar.a.e) != null && iVar.b) {
            p c10 = vVar.c().c(vVar.b);
            if (c10 != null) {
                Executor e10 = f0.d.e(this.h);
                vy vyVar = this.E;
                synchronized (c10.a) {
                    try {
                        if (e10 == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (vyVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        c10.b = e10;
                        c10.c = vyVar;
                        ArrayList arrayList = c10.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            m mVar = c10.d;
                            ArrayList arrayList2 = c10.e;
                            c10.d = null;
                            c10.e = null;
                            c10.b.execute(new pa(c10, vyVar, mVar, arrayList2, false, 5));
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
        q d = vVar.c().d(vVar.b);
        if (d != null) {
            d.e();
        }
        if (this.d != null) {
            h(this, vVar, d, i7, null, null);
            return;
        }
        this.d = vVar;
        this.e = d;
        Message obtainMessage = this.a.obtainMessage(qs.l4, new q0.b(null, vVar));
        obtainMessage.arg1 = i7;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x014c, code lost:
    
        if (r25.A.b() == r1) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        long j3;
        z3 z3Var;
        ArrayList arrayList;
        z3 z3Var2 = new z3();
        u1 u1Var = this.t;
        long j10 = 0;
        u1Var.a = 0L;
        int i7 = 0;
        u1Var.c = false;
        u1Var.b = SystemClock.elapsedRealtime();
        ((Handler) u1Var.d).removeCallbacks((m5) u1Var.e);
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            size--;
            boolean z10 = this.p;
            if (size < 0) {
                z3 z3Var3 = z3Var2;
                long j11 = j10;
                u1 u1Var2 = this.t;
                if (u1Var2.c) {
                    long j12 = u1Var2.a;
                    if (j12 > j11) {
                        ((Handler) u1Var2.d).postDelayed((m5) u1Var2.e, j12);
                    }
                }
                boolean z11 = u1Var2.c;
                this.B = i10;
                r a10 = z9 ? z3Var3.a() : r.c;
                r a11 = z3Var3.a();
                if (f()) {
                    n nVar = this.A;
                    if (nVar != null) {
                        nVar.a();
                        if (nVar.b.equals(a11)) {
                        }
                    }
                    if (!a11.d() || z11) {
                        this.A = new n(a11, z11);
                    } else if (this.A != null) {
                        this.A = null;
                    }
                    this.r.h(this.A);
                }
                n nVar2 = this.z;
                if (nVar2 != null) {
                    nVar2.a();
                    if (nVar2.b.equals(a10) && this.z.b() == z11) {
                        return;
                    }
                }
                if (!a10.d() || z11) {
                    this.z = new n(a10, z11);
                } else if (this.z == null) {
                    return;
                } else {
                    this.z = null;
                }
                if (z9 && !z11 && z10) {
                    Log.i("GlobalMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                ArrayList arrayList3 = this.l;
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj = arrayList3.get(i11);
                    i11++;
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
                i10 += size3;
                int i12 = i7;
                while (i12 < size3) {
                    t tVar = (t) arrayList4.get(i12);
                    r rVar = tVar.c;
                    if (rVar == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    ArrayList c10 = rVar.c();
                    if (c10.isEmpty()) {
                        j3 = j10;
                    } else {
                        int size4 = c10.size();
                        j3 = j10;
                        int i13 = 0;
                        while (i13 < size4) {
                            Object obj2 = c10.get(i13);
                            i13++;
                            String str = (String) obj2;
                            if (str == null) {
                                throw new IllegalArgumentException("category must not be null");
                            }
                            if (z3Var2.a == null) {
                                z3Var2.a = new ArrayList();
                            }
                            if (!z3Var2.a.contains(str)) {
                                z3Var2.a.add(str);
                            }
                        }
                    }
                    boolean z12 = (tVar.d & 1) != 0;
                    long j13 = tVar.e;
                    u1 u1Var3 = this.t;
                    if (z12) {
                        z3Var = z3Var2;
                        arrayList = arrayList2;
                        long j14 = u1Var3.b;
                        if (j14 - j13 < 30000) {
                            u1Var3.a = Math.max(u1Var3.a, (j13 + 30000) - j14);
                            u1Var3.c = true;
                        }
                    } else {
                        u1Var3.getClass();
                        z3Var = z3Var2;
                        arrayList = arrayList2;
                    }
                    if (z12) {
                        z9 = true;
                    }
                    int i14 = tVar.d;
                    if ((i14 & 4) != 0 && !z10) {
                        z9 = true;
                    }
                    if ((i14 & 8) != 0) {
                        z9 = true;
                    }
                    i12++;
                    j10 = j3;
                    z3Var2 = z3Var;
                    arrayList2 = arrayList;
                }
            }
            j10 = j10;
            z3Var2 = z3Var2;
            arrayList2 = arrayList2;
            i7 = 0;
        }
    }

    public final void l() {
        v vVar = this.d;
        if (vVar == null) {
            hy0 hy0Var = this.C;
            if (hy0Var != null) {
                hy0Var.n();
                return;
            }
            return;
        }
        int i7 = vVar.p;
        h2.s sVar = this.n;
        sVar.a = i7;
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
        hy0 hy0Var2 = this.C;
        if (hy0Var2 != null) {
            v vVar2 = this.d;
            v vVar3 = this.v;
            if (vVar3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (vVar2 == vVar3 || vVar2 == this.w) {
                hy0Var2.n();
                return;
            }
            int i10 = sVar.c == 1 ? 2 : 0;
            int i11 = sVar.b;
            int i12 = sVar.a;
            String str = (String) sVar.e;
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) hy0Var2.b;
            if (a0Var != null) {
                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) hy0Var2.c;
                if (pVar != null && i10 == 0 && i11 == 0) {
                    pVar.c = i12;
                    b2.g.a(pVar.c(), i12);
                    return;
                }
                androidx.emoji2.text.p pVar2 = new androidx.emoji2.text.p();
                pVar2.f = hy0Var2;
                pVar2.a = i10;
                pVar2.b = i11;
                pVar2.c = i12;
                pVar2.d = str;
                hy0Var2.c = pVar2;
                ((android.support.v4.media.session.u) a0Var.b).a.setPlaybackToRemote(pVar2.c());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r21 == ((ca.i) r19.s.n)) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0192 A[LOOP:5: B:77:0x0190->B:78:0x0192, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ad A[LOOP:6: B:81:0x01ab->B:82:0x01ad, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(u uVar, ca.i iVar) {
        boolean z9;
        int i7;
        int size;
        int size2;
        Iterator it;
        boolean z10;
        ca.i iVar2 = uVar.e;
        ArrayList arrayList = uVar.b;
        if (iVar2 != iVar) {
            uVar.e = iVar;
            ArrayList arrayList2 = this.j;
            b bVar = this.a;
            if (iVar != null) {
                List list = (List) iVar.c;
                int size3 = list.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    m mVar = (m) list.get(i10);
                    if (mVar != null && mVar.e()) {
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = list.iterator();
                int i11 = 0;
                boolean z11 = false;
                while (it2.hasNext()) {
                    m mVar2 = (m) it2.next();
                    if (mVar2 == null || !mVar2.e()) {
                        it = it2;
                        z10 = z11;
                        Log.w("GlobalMediaRouter", "Ignoring invalid route descriptor: " + mVar2);
                    } else {
                        String d = mVar2.d();
                        int size4 = arrayList.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size4) {
                                i12 = -1;
                                break;
                            } else if (((v) arrayList.get(i12)).b.equals(d)) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (i12 < 0) {
                            it = it2;
                            z10 = z11;
                            v vVar = new v(uVar, d, b(uVar, d), mVar2.a.getBoolean("isSystemRoute", false));
                            int i13 = i11 + 1;
                            arrayList.add(i11, vVar);
                            arrayList2.add(vVar);
                            if (mVar2.c().isEmpty()) {
                                vVar.i(mVar2);
                                bVar.b(qs.g4, vVar);
                            } else {
                                arrayList3.add(new q0.b(vVar, mVar2));
                            }
                            i11 = i13;
                        } else {
                            it = it2;
                            z10 = z11;
                            if (i12 < i11) {
                                Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + mVar2);
                            } else {
                                v vVar2 = (v) arrayList.get(i12);
                                int i14 = i11 + 1;
                                Collections.swap(arrayList, i12, i11);
                                if (!mVar2.c().isEmpty()) {
                                    arrayList4.add(new q0.b(vVar2, mVar2));
                                } else if (n(vVar2, mVar2) != 0 && vVar2 == this.d) {
                                    i11 = i14;
                                    z10 = true;
                                }
                                i11 = i14;
                            }
                        }
                    }
                    it2 = it;
                    z11 = z10;
                }
                boolean z12 = z11;
                int i15 = 0;
                int size5 = arrayList3.size();
                int i16 = 0;
                while (i16 < size5) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    q0.b bVar2 = (q0.b) obj;
                    v vVar3 = (v) bVar2.a;
                    vVar3.i((m) bVar2.b);
                    bVar.b(qs.g4, vVar3);
                }
                int size6 = arrayList4.size();
                boolean z13 = z12;
                while (i15 < size6) {
                    Object obj2 = arrayList4.get(i15);
                    i15++;
                    q0.b bVar3 = (q0.b) obj2;
                    v vVar4 = (v) bVar3.a;
                    if (n(vVar4, (m) bVar3.b) != 0 && vVar4 == this.d) {
                        z13 = true;
                    }
                }
                z9 = z13;
                i7 = i11;
                for (size = arrayList.size() - 1; size >= i7; size--) {
                    v vVar5 = (v) arrayList.get(size);
                    vVar5.i(null);
                    arrayList2.remove(vVar5);
                }
                o(z9);
                for (size2 = arrayList.size() - 1; size2 >= i7; size2--) {
                    bVar.b(qs.h4, (v) arrayList.remove(size2));
                }
                bVar.b(515, uVar);
            }
            z9 = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + iVar);
            i7 = 0;
            while (size >= i7) {
            }
            o(z9);
            while (size2 >= i7) {
            }
            bVar.b(515, uVar);
        }
    }

    public final int n(v vVar, m mVar) {
        int i7 = vVar.i(mVar);
        if (i7 != 0) {
            int i10 = i7 & 1;
            b bVar = this.a;
            if (i10 != 0) {
                bVar.b(qs.i4, vVar);
            }
            if ((i7 & 2) != 0) {
                bVar.b(qs.j4, vVar);
            }
            if ((i7 & 4) != 0) {
                bVar.b(qs.k4, vVar);
            }
        }
        return i7;
    }

    public final void o(boolean z9) {
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
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                Object obj = arrayList.get(i7);
                i7++;
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
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i10);
                i10++;
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
        if (z9) {
            g();
            l();
        }
    }
}
