package s4;

import a8.qa;
import a8.t7;
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
import com.google.android.gms.internal.vision.h3;
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
import l2.q1;
import oi.y3;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.of;
import org.telegram.ui.nd0;
import org.telegram.ui.web.z0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ int F = 0;
    public n A;
    public int B;
    public nd0 C;
    public android.support.v4.media.session.a0 D;
    public final hn E;
    public final qe.h c;
    public v d;
    public q e;
    public com.google.android.gms.internal.cast.o f;
    public l5 g;
    public final Context h;
    public final h2.s n;
    public final c5 o;
    public final boolean p;
    public final boolean q;
    public k r;
    public final j0 s;
    public final q1 t;
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
        boolean z10;
        h3 h3Var;
        qe.h hVar;
        h2.s sVar = new h2.s();
        sVar.c = 0;
        sVar.d = 3;
        this.n = sVar;
        this.o = new c5(this);
        this.E = new hn(this, 14);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            int i10 = e0.b;
            Intent intent = new Intent(context, (Class<?>) e0.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z10 = true;
                this.q = z10;
                int i11 = t0.b;
                Intent intent2 = new Intent(context, (Class<?>) t0.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i7 >= 30 || !z10) ? null : new k(context, new of(this, 16));
                j0 f0Var = i7 < 24 ? new f0(context, this) : new j0(context, this);
                this.s = f0Var;
                z0 z0Var = new z0(this, 8);
                q1 q1Var = new q1();
                q1Var.d = new Handler(Looper.getMainLooper());
                q1Var.e = z0Var;
                this.t = q1Var;
                a(f0Var, true);
                h3Var = this.r;
                if (h3Var != null) {
                    a(h3Var, true);
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
                    handler.post((s0) hVar.h);
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
        this.r = (i7 >= 30 || !z10) ? null : new k(context, new of(this, 16));
        if (i7 < 24) {
        }
        this.s = f0Var;
        z0 z0Var2 = new z0(this, 8);
        q1 q1Var2 = new q1();
        q1Var2.d = new Handler(Looper.getMainLooper());
        q1Var2.e = z0Var2;
        this.t = q1Var2;
        a(f0Var, true);
        h3Var = this.r;
        if (h3Var != null) {
        }
        hVar = new qe.h(context, this);
        this.c = hVar;
        Handler handler2 = (Handler) hVar.d;
        if (hVar.a) {
        }
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.l.add(uVar);
            this.a.b(513, uVar);
            m(uVar, (ca.i) h3Var.n);
            x.b();
            h3Var.f = this.o;
            h3Var.h(this.z);
        }
    }

    public final String b(u uVar, String str) {
        String flattenToShortString = ((ComponentName) uVar.d.b).flattenToShortString();
        boolean z10 = uVar.c;
        String E = z10 ? str : a8.p0.E(flattenToShortString, ":", str);
        HashMap hashMap = this.k;
        if (!z10) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    i7 = -1;
                    break;
                }
                if (((v) arrayList.get(i7)).c.equals(E)) {
                    break;
                }
                i7++;
            }
            if (i7 >= 0) {
                Log.w("GlobalMediaRouter", p5.c.l("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i10 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = E + "_" + i10;
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
        hashMap.put(new q0.b(flattenToShortString, str), E);
        return E;
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

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            u uVar = (u) obj;
            if (uVar.a == h3Var) {
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
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.c();
            this.g = null;
        }
        l5 l5Var2 = new l5(eVar, vVar, qVar, i7, vVar2, collection);
        this.g = l5Var2;
        int i10 = 3;
        if (l5Var2.b != 3 || (oVar = this.f) == null) {
            l5Var2.i();
            return;
        }
        final v vVar3 = this.d;
        final v vVar4 = (v) l5Var2.h;
        com.google.android.gms.internal.cast.o.c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
        c0.l a10 = t7.a(new c0.j() { // from class: com.google.android.gms.internal.cast.n
            @Override // c0.j
            public final Object e(c0.i iVar) {
                o oVar2 = o.this;
                oVar2.getClass();
                return Boolean.valueOf(oVar2.b.post(new qa(oVar2, vVar3, vVar4, iVar, 2)));
            }
        });
        l5 l5Var3 = this.g;
        e eVar2 = (e) ((WeakReference) l5Var3.s).get();
        if (eVar2 == null || eVar2.g != l5Var3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            l5Var3.c();
        } else {
            if (((c0.l) l5Var3.w) != null) {
                throw new IllegalStateException("future is already set");
            }
            l5Var3.w = a10;
            z0 z0Var = new z0(l5Var3, 10);
            b bVar = eVar2.a;
            Objects.requireNonNull(bVar);
            a10.b.b(z0Var, new l2.d0(bVar, i10));
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
                h3 c10 = vVar.c();
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
                hn hnVar = this.E;
                synchronized (c10.a) {
                    try {
                        if (e10 == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (hnVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        c10.b = e10;
                        c10.c = hnVar;
                        ArrayList arrayList = c10.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            m mVar = c10.d;
                            ArrayList arrayList2 = c10.e;
                            c10.d = null;
                            c10.e = null;
                            c10.b.execute(new qa(c10, hnVar, mVar, arrayList2, false, 5));
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
        Message obtainMessage = this.a.obtainMessage(ks.l4, new q0.b(null, vVar));
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
        y3 y3Var;
        ArrayList arrayList;
        y3 y3Var2 = new y3();
        q1 q1Var = this.t;
        long j10 = 0;
        q1Var.a = 0L;
        int i7 = 0;
        q1Var.c = false;
        q1Var.b = SystemClock.elapsedRealtime();
        ((Handler) q1Var.d).removeCallbacks((z0) q1Var.e);
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            size--;
            boolean z11 = this.p;
            if (size < 0) {
                y3 y3Var3 = y3Var2;
                long j11 = j10;
                q1 q1Var2 = this.t;
                if (q1Var2.c) {
                    long j12 = q1Var2.a;
                    if (j12 > j11) {
                        ((Handler) q1Var2.d).postDelayed((z0) q1Var2.e, j12);
                    }
                }
                boolean z12 = q1Var2.c;
                this.B = i10;
                r f10 = z10 ? y3Var3.f() : r.c;
                r f11 = y3Var3.f();
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
                    h3 h3Var = ((u) obj).a;
                    if (h3Var != this.r) {
                        h3Var.h(this.z);
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
                            if (y3Var2.a == null) {
                                y3Var2.a = new ArrayList();
                            }
                            if (!y3Var2.a.contains(str)) {
                                y3Var2.a.add(str);
                            }
                        }
                    }
                    boolean z13 = (tVar.d & 1) != 0;
                    long j13 = tVar.e;
                    q1 q1Var3 = this.t;
                    if (z13) {
                        y3Var = y3Var2;
                        arrayList = arrayList2;
                        long j14 = q1Var3.b;
                        if (j14 - j13 < 30000) {
                            q1Var3.a = Math.max(q1Var3.a, (j13 + 30000) - j14);
                            q1Var3.c = true;
                        }
                    } else {
                        q1Var3.getClass();
                        y3Var = y3Var2;
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
                    j10 = j3;
                    y3Var2 = y3Var;
                    arrayList2 = arrayList;
                }
            }
            j10 = j10;
            y3Var2 = y3Var2;
            arrayList2 = arrayList2;
            i7 = 0;
        }
    }

    public final void l() {
        v vVar = this.d;
        if (vVar == null) {
            nd0 nd0Var = this.C;
            if (nd0Var != null) {
                nd0Var.n();
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
        nd0 nd0Var2 = this.C;
        if (nd0Var2 != null) {
            v vVar2 = this.d;
            v vVar3 = this.v;
            if (vVar3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (vVar2 == vVar3 || vVar2 == this.w) {
                nd0Var2.n();
                return;
            }
            int i10 = sVar.c == 1 ? 2 : 0;
            int i11 = sVar.b;
            int i12 = sVar.a;
            String str = (String) sVar.e;
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) nd0Var2.b;
            if (a0Var != null) {
                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) nd0Var2.c;
                if (qVar != null && i10 == 0 && i11 == 0) {
                    qVar.c = i12;
                    b2.g.a(qVar.c(), i12);
                    return;
                }
                androidx.emoji2.text.q qVar2 = new androidx.emoji2.text.q();
                qVar2.f = nd0Var2;
                qVar2.a = i10;
                qVar2.b = i11;
                qVar2.c = i12;
                qVar2.d = str;
                nd0Var2.c = qVar2;
                ((android.support.v4.media.session.u) a0Var.b).a.setPlaybackToRemote(qVar2.c());
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
        boolean z10;
        int i7;
        int size;
        int size2;
        Iterator it;
        boolean z11;
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
                            } else if (((v) arrayList.get(i12)).b.equals(d)) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (i12 < 0) {
                            it = it2;
                            z11 = z12;
                            v vVar = new v(uVar, d, b(uVar, d), mVar2.a.getBoolean("isSystemRoute", false));
                            int i13 = i11 + 1;
                            arrayList.add(i11, vVar);
                            arrayList2.add(vVar);
                            if (mVar2.c().isEmpty()) {
                                vVar.i(mVar2);
                                bVar.b(ks.g4, vVar);
                            } else {
                                arrayList3.add(new q0.b(vVar, mVar2));
                            }
                            i11 = i13;
                        } else {
                            it = it2;
                            z11 = z12;
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
                    v vVar3 = (v) bVar2.a;
                    vVar3.i((m) bVar2.b);
                    bVar.b(ks.g4, vVar3);
                }
                int size6 = arrayList4.size();
                boolean z14 = z13;
                while (i15 < size6) {
                    Object obj2 = arrayList4.get(i15);
                    i15++;
                    q0.b bVar3 = (q0.b) obj2;
                    v vVar4 = (v) bVar3.a;
                    if (n(vVar4, (m) bVar3.b) != 0 && vVar4 == this.d) {
                        z14 = true;
                    }
                }
                z10 = z14;
                i7 = i11;
                for (size = arrayList.size() - 1; size >= i7; size--) {
                    v vVar5 = (v) arrayList.get(size);
                    vVar5.i(null);
                    arrayList2.remove(vVar5);
                }
                o(z10);
                for (size2 = arrayList.size() - 1; size2 >= i7; size2--) {
                    bVar.b(ks.h4, (v) arrayList.remove(size2));
                }
                bVar.b(515, uVar);
            }
            z10 = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + iVar);
            i7 = 0;
            while (size >= i7) {
            }
            o(z10);
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
                bVar.b(ks.i4, vVar);
            }
            if ((i7 & 2) != 0) {
                bVar.b(ks.j4, vVar);
            }
            if ((i7 & 4) != 0) {
                bVar.b(ks.k4, vVar);
            }
        }
        return i7;
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
        if (z10) {
            g();
            l();
        }
    }
}
