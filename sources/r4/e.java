package r4;

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
import b8.cg;
import b8.v1;
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
import k2.u1;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ int F = 0;
    public n A;
    public int B;
    public p7.d C;
    public android.support.v4.media.session.a0 D;
    public final nh E;
    public final ne.h c;
    public w d;
    public q e;
    public com.google.android.gms.internal.cast.p f;
    public vi0 g;
    public final Context h;
    public final g2.t n;
    public final y00 o;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context) {
        boolean z10;
        g3 g3Var;
        ne.h hVar;
        g2.t tVar = new g2.t();
        tVar.c = 0;
        tVar.d = 3;
        this.n = tVar;
        this.o = new y00(this);
        this.E = new nh(this, 14);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            int i10 = f0.a;
            Intent intent = new Intent(context, (Class<?>) f0.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z10 = true;
                this.q = z10;
                int i11 = t0.b;
                Intent intent2 = new Intent(context, (Class<?>) t0.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i3 >= 30 || !z10) ? null : new k(context, new i9(this, 15));
                k0 g0Var = i3 < 24 ? new g0(context, this) : new k0(context, this);
                this.s = g0Var;
                d4 d4Var = new d4(this, 28);
                u1 u1Var = new u1();
                u1Var.d = new Handler(Looper.getMainLooper());
                u1Var.e = d4Var;
                this.t = u1Var;
                a(g0Var, true);
                g3Var = this.r;
                if (g3Var != null) {
                    a(g3Var, true);
                }
                hVar = new ne.h(context, this);
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
                    handler.post((lt) hVar.h);
                    return;
                }
                return;
            }
        }
        z10 = false;
        this.q = z10;
        int i112 = t0.b;
        Intent intent22 = new Intent(context, (Class<?>) t0.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.r = (i3 >= 30 || !z10) ? null : new k(context, new i9(this, 15));
        if (i3 < 24) {
        }
        this.s = g0Var;
        d4 d4Var2 = new d4(this, 28);
        u1 u1Var2 = new u1();
        u1Var2.d = new Handler(Looper.getMainLooper());
        u1Var2.e = d4Var2;
        this.t = u1Var2;
        a(g0Var, true);
        g3Var = this.r;
        if (g3Var != null) {
        }
        hVar = new ne.h(context, this);
        this.c = hVar;
        Handler handler2 = (Handler) hVar.d;
        if (hVar.a) {
        }
    }

    public final void a(g3 g3Var, boolean z10) {
        if (d(g3Var) == null) {
            v vVar = new v(g3Var, z10);
            this.l.add(vVar);
            this.a.b(513, vVar);
            m(vVar, (ba.i) g3Var.n);
            y.b();
            g3Var.f = this.o;
            g3Var.h(this.z);
        }
    }

    public final String b(v vVar, String str) {
        String flattenToShortString = ((ComponentName) vVar.d.b).flattenToShortString();
        boolean z10 = vVar.c;
        String C = z10 ? str : a1.g.C(flattenToShortString, ":", str);
        HashMap hashMap = this.k;
        if (!z10) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (((w) arrayList.get(i3)).c.equals(C)) {
                    break;
                }
                i3++;
            }
            if (i3 >= 0) {
                Log.w("GlobalMediaRouter", f1.q("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i10 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = C + "_" + i10;
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            i11 = -1;
                            break;
                        }
                        if (((w) arrayList.get(i11)).c.equals(str2)) {
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
        hashMap.put(new q0.b(flattenToShortString, str), C);
        return C;
    }

    public final w c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
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
                    q e10 = wVar.c().e(wVar.b, this.d.b);
                    e10.e();
                    hashMap.put(wVar.c, e10);
                }
            }
        }
    }

    public final void h(e eVar, w wVar, q qVar, int i3, w wVar2, Collection collection) {
        final com.google.android.gms.internal.cast.p pVar;
        vi0 vi0Var = this.g;
        if (vi0Var != null) {
            vi0Var.a();
            this.g = null;
        }
        vi0 vi0Var2 = new vi0(eVar, wVar, qVar, i3, wVar2, collection);
        this.g = vi0Var2;
        int i10 = 3;
        if (vi0Var2.b != 3 || (pVar = this.f) == null) {
            vi0Var2.b();
            return;
        }
        final w wVar3 = this.d;
        final w wVar4 = (w) vi0Var2.g;
        int i11 = 0;
        com.google.android.gms.internal.cast.p.c.b("Prepare transfer from Route(%s) to Route(%s)", wVar3, wVar4);
        c0.l a10 = v1.a(new c0.j() { // from class: com.google.android.gms.internal.cast.n
            @Override // c0.j
            public final Object a(c0.i iVar) {
                p pVar2 = p.this;
                pVar2.getClass();
                return Boolean.valueOf(pVar2.b.post(new cg(pVar2, wVar3, wVar4, iVar, 1)));
            }
        });
        vi0 vi0Var3 = this.g;
        e eVar2 = (e) ((WeakReference) vi0Var3.j).get();
        if (eVar2 == null || eVar2.g != vi0Var3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            vi0Var3.a();
        } else {
            if (((c0.l) vi0Var3.k) != null) {
                throw new IllegalStateException("future is already set");
            }
            vi0Var3.k = a10;
            u uVar = new u(vi0Var3, i11);
            b bVar = eVar2.a;
            Objects.requireNonNull(bVar);
            a10.b.b(uVar, new k2.g0(bVar, i10));
        }
    }

    public final void i(w wVar, int i3) {
        if (!this.j.contains(wVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + wVar);
        } else {
            if (!wVar.g) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + wVar);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                g3 c2 = wVar.c();
                k kVar = this.r;
                if (c2 == kVar && this.d != wVar) {
                    kVar.s(wVar.b);
                    return;
                }
            }
            j(wVar, i3);
        }
    }

    public final void j(w wVar, int i3) {
        ba.i iVar;
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
        if (f() && (iVar = wVar.a.e) != null && iVar.b) {
            p c2 = wVar.c().c(wVar.b);
            if (c2 != null) {
                Executor e10 = f0.d.e(this.h);
                nh nhVar = this.E;
                synchronized (c2.a) {
                    try {
                        if (e10 == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (nhVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        c2.b = e10;
                        c2.c = nhVar;
                        ArrayList arrayList = c2.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            m mVar = c2.d;
                            ArrayList arrayList2 = c2.e;
                            c2.d = null;
                            c2.e = null;
                            c2.b.execute(new cg(c2, nhVar, mVar, arrayList2, false, 4));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.x = wVar;
                this.y = c2;
                c2.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + wVar);
        }
        q d = wVar.c().d(wVar.b);
        if (d != null) {
            d.e();
        }
        if (this.d != null) {
            h(this, wVar, d, i3, null, null);
            return;
        }
        this.d = wVar;
        this.e = d;
        Message obtainMessage = this.a.obtainMessage(hs.l4, new q0.b(null, wVar));
        obtainMessage.arg1 = i3;
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
        e5.j jVar;
        ArrayList arrayList;
        e5.j jVar2 = new e5.j(2);
        u1 u1Var = this.t;
        long j11 = 0;
        u1Var.a = 0L;
        int i3 = 0;
        u1Var.c = false;
        u1Var.b = SystemClock.elapsedRealtime();
        ((Handler) u1Var.d).removeCallbacks((d4) u1Var.e);
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            size--;
            boolean z11 = this.p;
            if (size < 0) {
                e5.j jVar3 = jVar2;
                long j12 = j11;
                u1 u1Var2 = this.t;
                if (u1Var2.c) {
                    long j13 = u1Var2.a;
                    if (j13 > j12) {
                        ((Handler) u1Var2.d).postDelayed((d4) u1Var2.e, j13);
                    }
                }
                boolean z12 = u1Var2.c;
                this.B = i10;
                r f10 = z10 ? jVar3.f() : r.c;
                r f11 = jVar3.f();
                if (f()) {
                    n nVar = this.A;
                    if (nVar != null) {
                        nVar.a();
                        if (nVar.b.equals(f11)) {
                        }
                    }
                    if (!f11.d() || z12) {
                        this.A = new n(f11, z12);
                    } else if (this.A != null) {
                        this.A = null;
                    }
                    this.r.h(this.A);
                }
                n nVar2 = this.z;
                if (nVar2 != null) {
                    nVar2.a();
                    if (nVar2.b.equals(f10) && this.z.b() == z12) {
                        return;
                    }
                }
                if (!f10.d() || z12) {
                    this.z = new n(f10, z12);
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
                int i11 = 0;
                while (i11 < size2) {
                    Object obj = arrayList3.get(i11);
                    i11++;
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
                i10 += size3;
                int i12 = i3;
                while (i12 < size3) {
                    t tVar = (t) arrayList4.get(i12);
                    r rVar = tVar.c;
                    if (rVar == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    ArrayList c2 = rVar.c();
                    if (c2.isEmpty()) {
                        j10 = j11;
                    } else {
                        int size4 = c2.size();
                        j10 = j11;
                        int i13 = 0;
                        while (i13 < size4) {
                            Object obj2 = c2.get(i13);
                            i13++;
                            String str = (String) obj2;
                            if (str == null) {
                                throw new IllegalArgumentException("category must not be null");
                            }
                            if (jVar2.b == null) {
                                jVar2.b = new ArrayList();
                            }
                            if (!jVar2.b.contains(str)) {
                                jVar2.b.add(str);
                            }
                        }
                    }
                    boolean z13 = (tVar.d & 1) != 0;
                    long j14 = tVar.e;
                    u1 u1Var3 = this.t;
                    if (z13) {
                        jVar = jVar2;
                        arrayList = arrayList2;
                        long j15 = u1Var3.b;
                        if (j15 - j14 < 30000) {
                            u1Var3.a = Math.max(u1Var3.a, (j14 + 30000) - j15);
                            u1Var3.c = true;
                        }
                    } else {
                        u1Var3.getClass();
                        jVar = jVar2;
                        arrayList = arrayList2;
                    }
                    if (z13) {
                        z10 = true;
                    }
                    int i14 = tVar.d;
                    if ((i14 & 4) != 0 && !z11) {
                        z10 = true;
                    }
                    if ((i14 & 8) != 0) {
                        z10 = true;
                    }
                    i12++;
                    j11 = j10;
                    jVar2 = jVar;
                    arrayList2 = arrayList;
                }
            }
            j11 = j11;
            jVar2 = jVar2;
            arrayList2 = arrayList2;
            i3 = 0;
        }
    }

    public final void l() {
        w wVar = this.d;
        if (wVar == null) {
            p7.d dVar = this.C;
            if (dVar != null) {
                dVar.j();
                return;
            }
            return;
        }
        int i3 = wVar.p;
        g2.t tVar = this.n;
        tVar.a = i3;
        tVar.b = wVar.q;
        tVar.c = (!wVar.e() || y.g()) ? wVar.o : 0;
        tVar.d = this.d.m;
        if (f() && this.d.c() == this.r) {
            tVar.e = k.p(this.e);
        } else {
            tVar.e = null;
        }
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        p7.d dVar2 = this.C;
        if (dVar2 != null) {
            w wVar2 = this.d;
            w wVar3 = this.v;
            if (wVar3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (wVar2 == wVar3 || wVar2 == this.w) {
                dVar2.j();
                return;
            }
            int i10 = tVar.c == 1 ? 2 : 0;
            int i11 = tVar.b;
            int i12 = tVar.a;
            String str = (String) tVar.e;
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) dVar2.b;
            if (a0Var != null) {
                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) dVar2.d;
                if (qVar != null && i10 == 0 && i11 == 0) {
                    qVar.c = i12;
                    a2.g.a(qVar.c(), i12);
                    return;
                }
                androidx.emoji2.text.q qVar2 = new androidx.emoji2.text.q();
                qVar2.f = dVar2;
                qVar2.a = i10;
                qVar2.b = i11;
                qVar2.c = i12;
                qVar2.d = str;
                dVar2.d = qVar2;
                ((android.support.v4.media.session.u) a0Var.b).a.setPlaybackToRemote(qVar2.c());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r21 == ((ba.i) r19.s.n)) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0192 A[LOOP:5: B:77:0x0190->B:78:0x0192, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ad A[LOOP:6: B:81:0x01ab->B:82:0x01ad, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(v vVar, ba.i iVar) {
        boolean z10;
        int i3;
        int size;
        int size2;
        Iterator it;
        boolean z11;
        ba.i iVar2 = vVar.e;
        ArrayList arrayList = vVar.b;
        if (iVar2 != iVar) {
            vVar.e = iVar;
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
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size4) {
                                i12 = -1;
                                break;
                            } else if (((w) arrayList.get(i12)).b.equals(d)) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (i12 < 0) {
                            it = it2;
                            z11 = z12;
                            w wVar = new w(vVar, d, b(vVar, d), mVar2.a.getBoolean("isSystemRoute", false));
                            int i13 = i11 + 1;
                            arrayList.add(i11, wVar);
                            arrayList2.add(wVar);
                            if (mVar2.c().isEmpty()) {
                                wVar.i(mVar2);
                                bVar.b(hs.g4, wVar);
                            } else {
                                arrayList3.add(new q0.b(wVar, mVar2));
                            }
                            i11 = i13;
                        } else {
                            it = it2;
                            z11 = z12;
                            if (i12 < i11) {
                                Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + mVar2);
                            } else {
                                w wVar2 = (w) arrayList.get(i12);
                                int i14 = i11 + 1;
                                Collections.swap(arrayList, i12, i11);
                                if (!mVar2.c().isEmpty()) {
                                    arrayList4.add(new q0.b(wVar2, mVar2));
                                } else if (n(wVar2, mVar2) != 0 && wVar2 == this.d) {
                                    i11 = i14;
                                    z11 = true;
                                }
                                i11 = i14;
                            }
                        }
                    }
                    it2 = it;
                    z12 = z11;
                }
                boolean z13 = z12;
                int i15 = 0;
                int size5 = arrayList3.size();
                int i16 = 0;
                while (i16 < size5) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    q0.b bVar2 = (q0.b) obj;
                    w wVar3 = (w) bVar2.a;
                    wVar3.i((m) bVar2.b);
                    bVar.b(hs.g4, wVar3);
                }
                int size6 = arrayList4.size();
                boolean z14 = z13;
                while (i15 < size6) {
                    Object obj2 = arrayList4.get(i15);
                    i15++;
                    q0.b bVar3 = (q0.b) obj2;
                    w wVar4 = (w) bVar3.a;
                    if (n(wVar4, (m) bVar3.b) != 0 && wVar4 == this.d) {
                        z14 = true;
                    }
                }
                z10 = z14;
                i3 = i11;
                for (size = arrayList.size() - 1; size >= i3; size--) {
                    w wVar5 = (w) arrayList.get(size);
                    wVar5.i(null);
                    arrayList2.remove(wVar5);
                }
                o(z10);
                for (size2 = arrayList.size() - 1; size2 >= i3; size2--) {
                    bVar.b(hs.h4, (w) arrayList.remove(size2));
                }
                bVar.b(515, vVar);
            }
            z10 = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + iVar);
            i3 = 0;
            while (size >= i3) {
            }
            o(z10);
            while (size2 >= i3) {
            }
            bVar.b(515, vVar);
        }
    }

    public final int n(w wVar, m mVar) {
        int i3 = wVar.i(mVar);
        if (i3 != 0) {
            int i10 = i3 & 1;
            b bVar = this.a;
            if (i10 != 0) {
                bVar.b(hs.i4, wVar);
            }
            if ((i3 & 2) != 0) {
                bVar.b(hs.j4, wVar);
            }
            if ((i3 & 4) != 0) {
                bVar.b(hs.k4, wVar);
            }
        }
        return i3;
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
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
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
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i10);
                i10++;
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
