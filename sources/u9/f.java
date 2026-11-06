package u9;

import android.util.Log;
import c8.sc;
import c8.tc;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class f implements b {
    public static final ab.m n = new ab.m(1);
    public final k e;
    public final e h;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f = new AtomicReference();

    public f(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        k kVar = new k(executor);
        this.e = kVar;
        this.h = eVar;
        ArrayList arrayList3 = new ArrayList();
        int i7 = 2;
        int i10 = 0;
        arrayList3.add(a.c(kVar, k.class, ra.b.class, ra.a.class));
        arrayList3.add(a.c(this, f.class, new Class[0]));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            a aVar = (a) obj;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ua.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.i(componentRegistrar));
                        it.remove();
                    }
                } catch (l e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).b.toArray();
                int length = array.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        Object obj3 = array[i13];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.d.add(obj3.toString());
                        }
                        i13++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                sc.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.a.keySet());
                arrayList6.addAll(arrayList3);
                sc.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.a.put(aVar2, new m(new o9.c(i7, this, aVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            d(this.a, bool.booleanValue());
        }
    }

    @Override // u9.b
    public final Object a(Class cls) {
        return e(q.a(cls));
    }

    @Override // u9.b
    public final o b(q qVar) {
        ua.b f10 = f(qVar);
        return f10 == null ? new o(o.c, o.d) : f10 instanceof o ? (o) f10 : new o(null, f10);
    }

    @Override // u9.b
    public final ua.b c(Class cls) {
        return f(q.a(cls));
    }

    public final void d(HashMap hashMap, boolean z9) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            a aVar = (a) entry.getKey();
            ua.b bVar = (ua.b) entry.getValue();
            int i7 = aVar.d;
            if (i7 == 1 || (i7 == 2 && z9)) {
                bVar.get();
            }
        }
        k kVar = this.e;
        synchronized (kVar) {
            try {
                arrayDeque = kVar.b;
                if (arrayDeque != null) {
                    kVar.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // u9.b
    public final Object e(q qVar) {
        ua.b f10 = f(qVar);
        if (f10 == null) {
            return null;
        }
        return f10.get();
    }

    @Override // u9.b
    public final synchronized ua.b f(q qVar) {
        tc.a(qVar, "Null interface requested.");
        return (ua.b) this.b.get(qVar);
    }

    @Override // u9.b
    public final Set g(q qVar) {
        ua.b bVar;
        synchronized (this) {
            bVar = (n) this.c.get(qVar);
            if (bVar == null) {
                bVar = n;
            }
        }
        return (Set) bVar.get();
    }

    public final void h(boolean z9) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f;
        Boolean valueOf = Boolean.valueOf(z9);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.a);
        }
        d(hashMap, z9);
    }

    public final void i() {
        HashMap hashMap = this.b;
        HashMap hashMap2 = this.c;
        for (a aVar : this.a.keySet()) {
            for (i iVar : aVar.c) {
                boolean z9 = iVar.b == 2;
                q qVar = iVar.a;
                if (z9 && !hashMap2.containsKey(qVar)) {
                    Set set = Collections.EMPTY_SET;
                    n nVar = new n();
                    nVar.b = null;
                    nVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    nVar.a.addAll(set);
                    hashMap2.put(qVar, nVar);
                } else if (hashMap.containsKey(qVar)) {
                    continue;
                } else {
                    int i7 = iVar.b;
                    if (i7 == 1) {
                        throw new j("Unsatisfied dependency for component " + aVar + ": " + qVar);
                    }
                    if (i7 != 2) {
                        hashMap.put(qVar, new o(o.c, o.d));
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            a aVar = (a) obj;
            if (aVar.e == 0) {
                ua.b bVar = (ua.b) this.a.get(aVar);
                for (q qVar : aVar.b) {
                    HashMap hashMap = this.b;
                    if (hashMap.containsKey(qVar)) {
                        arrayList2.add(new ti.p(4, (o) ((ua.b) hashMap.get(qVar)), bVar));
                    } else {
                        hashMap.put(qVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap hashMap = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.e != 0) {
                ua.b bVar = (ua.b) entry.getValue();
                for (q qVar : aVar.b) {
                    if (!hashMap2.containsKey(qVar)) {
                        hashMap2.put(qVar, new HashSet());
                    }
                    ((Set) hashMap2.get(qVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                n nVar = (n) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ti.p(5, nVar, (ua.b) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                n nVar2 = new n();
                nVar2.b = null;
                nVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar2.a.addAll(set);
                hashMap.put(qVar2, nVar2);
            }
        }
        return arrayList;
    }
}
