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
import com.google.android.gms.internal.vision.h3;
import i2.q1;
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
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.ok0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ int F = 0;
    public n A;
    public int B;
    public m2.t C;
    public android.support.v4.media.session.c0 D;
    public final l.d E;
    public final s0 c;
    public v d;
    public q e;
    public com.google.android.gms.internal.cast.q f;
    public ok0 g;
    public final Context h;
    public final e2.q n;
    public final k2.g0 o;
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
        h3 h3Var;
        s0 s0Var;
        e2.q qVar = new e2.q();
        qVar.c = 0;
        qVar.d = 3;
        this.n = qVar;
        this.o = new k2.g0(this, 14);
        this.E = new l.d(this, 17);
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
                int i12 = t0.b;
                Intent intent2 = new Intent(context, (Class<?>) t0.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i10 >= 30 || !z10) ? null : new k(context, new mg.n(this, 10));
                j0 f0Var = i10 < 24 ? new f0(context, this) : new j0(context, this);
                this.s = f0Var;
                this.t = new q1(new org.telegram.ui.web.b(this, 9));
                a(f0Var, true);
                h3Var = this.r;
                if (h3Var != null) {
                    a(h3Var, true);
                }
                s0Var = new s0(context, this);
                this.c = s0Var;
                Handler handler = (Handler) s0Var.d;
                if (s0Var.a) {
                    s0Var.a = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    ((Context) s0Var.b).registerReceiver((androidx.mediarouter.app.g) s0Var.g, intentFilter, null, handler);
                    handler.post((l7) s0Var.h);
                    return;
                }
                return;
            }
        }
        z10 = false;
        this.q = z10;
        int i122 = t0.b;
        Intent intent22 = new Intent(context, (Class<?>) t0.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.r = (i10 >= 30 || !z10) ? null : new k(context, new mg.n(this, 10));
        if (i10 < 24) {
        }
        this.s = f0Var;
        this.t = new q1(new org.telegram.ui.web.b(this, 9));
        a(f0Var, true);
        h3Var = this.r;
        if (h3Var != null) {
        }
        s0Var = new s0(context, this);
        this.c = s0Var;
        Handler handler2 = (Handler) s0Var.d;
        if (s0Var.a) {
        }
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.l.add(uVar);
            this.a.b(513, uVar);
            m(uVar, (b2.p) h3Var.n);
            x.b();
            h3Var.f = this.o;
            h3Var.h(this.z);
        }
    }

    public final String b(u uVar, String str) {
        String flattenToShortString = ((ComponentName) uVar.d.b).flattenToShortString();
        boolean z10 = uVar.c;
        String C = z10 ? str : a4.a.C(flattenToShortString, ":", str);
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
                if (((v) arrayList.get(i10)).c.equals(C)) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", p6.j("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = C + "_" + i11;
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
        hashMap.put(new q0.b(flattenToShortString, str), C);
        return C;
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

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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
                    q e7 = vVar.c().e(vVar.b, this.d.b);
                    e7.e();
                    hashMap.put(vVar.c, e7);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        com.google.android.gms.internal.cast.q qVar2;
        ok0 ok0Var = this.g;
        if (ok0Var != null) {
            ok0Var.a();
            this.g = null;
        }
        ok0 ok0Var2 = new ok0(eVar, vVar, qVar, i10, vVar2, collection);
        this.g = ok0Var2;
        if (ok0Var2.b != 3 || (qVar2 = this.f) == null) {
            ok0Var2.b();
            return;
        }
        v vVar3 = this.d;
        v vVar4 = (v) ok0Var2.g;
        int i11 = 2;
        com.google.android.gms.internal.cast.q.c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
        c0.i iVar = new c0.i();
        iVar.c = new c0.l();
        c0.k kVar = new c0.k(iVar);
        c0.j jVar = kVar.b;
        iVar.b = kVar;
        iVar.a = com.google.android.gms.internal.cast.o.class;
        try {
            iVar.a = Boolean.valueOf(qVar2.b.post(new com.google.android.gms.internal.cast.p(qVar2, vVar3, vVar4, iVar, 0)));
        } catch (Exception e7) {
            jVar.l(e7);
        }
        ok0 ok0Var3 = this.g;
        e eVar2 = (e) ((WeakReference) ok0Var3.j).get();
        if (eVar2 == null || eVar2.g != ok0Var3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            ok0Var3.a();
        } else {
            if (((c0.k) ok0Var3.k) != null) {
                throw new IllegalStateException("future is already set");
            }
            ok0Var3.k = kVar;
            org.telegram.ui.web.b bVar = new org.telegram.ui.web.b(ok0Var3, 11);
            b bVar2 = eVar2.a;
            Objects.requireNonNull(bVar2);
            jVar.a(bVar, new k2.a0(bVar2, i11));
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
                h3 c10 = vVar.c();
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
        b2.p pVar;
        if (this.d == vVar) {
            return;
        }
        if (this.x != null) {
            this.x = null;
            p pVar2 = this.y;
            if (pVar2 != null) {
                pVar2.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (f() && (pVar = vVar.a.e) != null && pVar.b) {
            p c10 = vVar.c().c(vVar.b);
            if (c10 != null) {
                Executor e7 = f0.e.e(this.h);
                l.d dVar = this.E;
                synchronized (c10.a) {
                    try {
                        if (e7 == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (dVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        c10.b = e7;
                        c10.c = dVar;
                        ArrayList arrayList = c10.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            m mVar = c10.d;
                            ArrayList arrayList2 = c10.e;
                            c10.d = null;
                            c10.e = null;
                            c10.b.execute(new com.google.android.gms.internal.cast.p(c10, dVar, mVar, arrayList2, false, 2));
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
            h(this, vVar, d, i10, null, null);
            return;
        }
        this.d = vVar;
        this.e = d;
        Message obtainMessage = this.a.obtainMessage(262, new q0.b(null, vVar));
        obtainMessage.arg1 = i10;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0154, code lost:
    
        if (r26.A.b() == r1) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        long j3;
        l.d dVar;
        ArrayList arrayList;
        l.d dVar2 = new l.d(18);
        q1 q1Var = this.t;
        long j10 = 0;
        q1Var.a = 0L;
        q1Var.c = false;
        q1Var.b = SystemClock.elapsedRealtime();
        ((Handler) q1Var.d).removeCallbacks((org.telegram.ui.web.b) q1Var.e);
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            size--;
            boolean z11 = this.p;
            if (size < 0) {
                l.d dVar3 = dVar2;
                long j11 = j10;
                q1 q1Var2 = this.t;
                if (q1Var2.c) {
                    long j12 = q1Var2.a;
                    if (j12 > j11) {
                        ((Handler) q1Var2.d).postDelayed((org.telegram.ui.web.b) q1Var2.e, j12);
                    }
                }
                boolean z12 = q1Var2.c;
                this.B = i10;
                r j13 = z10 ? dVar3.j() : r.c;
                r j14 = dVar3.j();
                if (f()) {
                    n nVar = this.A;
                    if (nVar != null) {
                        nVar.a();
                        if (nVar.b.equals(j14)) {
                        }
                    }
                    if (!j14.d() || z12) {
                        this.A = new n(j14, z12);
                    } else if (this.A != null) {
                        this.A = null;
                    }
                    this.r.h(this.A);
                }
                n nVar2 = this.z;
                if (nVar2 != null) {
                    nVar2.a();
                    if (nVar2.b.equals(j13) && this.z.b() == z12) {
                        return;
                    }
                }
                if (!j13.d() || z12) {
                    this.z = new n(j13, z12);
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
                int i12 = 0;
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
                            if (((ArrayList) dVar2.b) == null) {
                                dVar2.b = new ArrayList();
                            }
                            if (!((ArrayList) dVar2.b).contains(str)) {
                                ((ArrayList) dVar2.b).add(str);
                            }
                        }
                    }
                    boolean z13 = (tVar.d & 1) != 0;
                    long j15 = tVar.e;
                    q1 q1Var3 = this.t;
                    if (z13) {
                        dVar = dVar2;
                        arrayList = arrayList2;
                        long j16 = q1Var3.b;
                        if (j16 - j15 < 30000) {
                            q1Var3.a = Math.max(q1Var3.a, (j15 + 30000) - j16);
                            q1Var3.c = true;
                        }
                    } else {
                        q1Var3.getClass();
                        dVar = dVar2;
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
                    dVar2 = dVar;
                    arrayList2 = arrayList;
                }
            }
            j10 = j10;
            dVar2 = dVar2;
            arrayList2 = arrayList2;
        }
    }

    public final void l() {
        v vVar = this.d;
        if (vVar == null) {
            m2.t tVar = this.C;
            if (tVar != null) {
                tVar.q();
                return;
            }
            return;
        }
        int i10 = vVar.p;
        e2.q qVar = this.n;
        qVar.a = i10;
        qVar.b = vVar.q;
        qVar.c = (!vVar.e() || x.g()) ? vVar.o : 0;
        qVar.d = this.d.m;
        if (f() && this.d.c() == this.r) {
            qVar.e = k.p(this.e);
        } else {
            qVar.e = null;
        }
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        m2.t tVar2 = this.C;
        if (tVar2 != null) {
            v vVar2 = this.d;
            v vVar3 = this.v;
            if (vVar3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (vVar2 == vVar3 || vVar2 == this.w) {
                tVar2.q();
                return;
            }
            int i11 = qVar.c == 1 ? 2 : 0;
            int i12 = qVar.b;
            int i13 = qVar.a;
            String str = (String) qVar.e;
            android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) tVar2.b;
            if (c0Var != null) {
                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) tVar2.c;
                if (pVar != null && i11 == 0 && i12 == 0) {
                    pVar.c = i13;
                    y1.g.a(pVar.c(), i13);
                    return;
                }
                androidx.emoji2.text.p pVar2 = new androidx.emoji2.text.p();
                pVar2.f = tVar2;
                pVar2.a = i11;
                pVar2.b = i12;
                pVar2.c = i13;
                pVar2.d = str;
                tVar2.c = pVar2;
                c0Var.a.a.setPlaybackToRemote(pVar2.c());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r21 == ((b2.p) r19.s.n)) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0191 A[LOOP:5: B:77:0x018f->B:78:0x0191, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac A[LOOP:6: B:81:0x01aa->B:82:0x01ac, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(u uVar, b2.p pVar) {
        boolean z10;
        int i10;
        int size;
        int size2;
        Iterator it;
        boolean z11;
        b2.p pVar2 = uVar.e;
        ArrayList arrayList = uVar.b;
        if (pVar2 != pVar) {
            uVar.e = pVar;
            ArrayList arrayList2 = this.j;
            b bVar = this.a;
            if (pVar != null) {
                List list = (List) pVar.c;
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
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + pVar);
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
