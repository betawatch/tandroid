package z8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import h7.u8;
import h7.v8;
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
import rh.o2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f implements b {
    public static final a9.l n = new a9.l(4);
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
        int i10 = 2;
        int i11 = 0;
        arrayList3.add(a.c(kVar, k.class, v9.b.class, v9.a.class));
        arrayList3.add(a.c(this, f.class, new Class[0]));
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            a aVar = (a) obj;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((y9.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.c(componentRegistrar));
                        it.remove();
                    }
                } catch (l e9) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e9);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).b.toArray();
                int length = array.length;
                int i14 = 0;
                while (true) {
                    if (i14 < length) {
                        Object obj3 = array[i14];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.d.add(obj3.toString());
                        }
                        i14++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                u8.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.a.keySet());
                arrayList6.addAll(arrayList3);
                u8.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                a aVar2 = (a) obj4;
                this.a.put(aVar2, new m(new t8.d(i10, this, aVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            h();
        }
        int size4 = arrayList5.size();
        while (i11 < size4) {
            Object obj5 = arrayList5.get(i11);
            i11++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            c(this.a, bool.booleanValue());
        }
    }

    @Override // z8.b
    public final Object a(Class cls) {
        return b(q.a(cls));
    }

    @Override // z8.b
    public final Object b(q qVar) {
        y9.b d = d(qVar);
        if (d == null) {
            return null;
        }
        return d.get();
    }

    public final void c(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            a aVar = (a) entry.getKey();
            y9.b bVar = (y9.b) entry.getValue();
            int i10 = aVar.d;
            if (i10 == 1 || (i10 == 2 && z10)) {
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
            } catch (Throwable th) {
                throw th;
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

    @Override // z8.b
    public final synchronized y9.b d(q qVar) {
        v8.a(qVar, "Null interface requested.");
        return (y9.b) this.b.get(qVar);
    }

    @Override // z8.b
    public final y9.b e(Class cls) {
        return d(q.a(cls));
    }

    public final void f(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.a);
        }
        c(hashMap, z10);
    }

    @Override // z8.b
    public final Set g(q qVar) {
        y9.b bVar;
        synchronized (this) {
            bVar = (n) this.c.get(qVar);
            if (bVar == null) {
                bVar = n;
            }
        }
        return (Set) bVar.get();
    }

    public final void h() {
        HashMap hashMap = this.b;
        HashMap hashMap2 = this.c;
        for (a aVar : this.a.keySet()) {
            for (i iVar : aVar.c) {
                boolean z10 = iVar.b == 2;
                q qVar = iVar.a;
                if (z10 && !hashMap2.containsKey(qVar)) {
                    Set set = Collections.EMPTY_SET;
                    n nVar = new n();
                    nVar.b = null;
                    nVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    nVar.a.addAll(set);
                    hashMap2.put(qVar, nVar);
                } else if (hashMap.containsKey(qVar)) {
                    continue;
                } else {
                    int i10 = iVar.b;
                    if (i10 == 1) {
                        throw new j("Unsatisfied dependency for component " + aVar + ": " + qVar);
                    }
                    if (i10 != 2) {
                        hashMap.put(qVar, new o(o.c, o.d));
                    }
                }
            }
        }
    }

    @Override // z8.b
    public final o i(q qVar) {
        y9.b d = d(qVar);
        return d == null ? new o(o.c, o.d) : d instanceof o ? (o) d : new o(null, d);
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar.e == 0) {
                y9.b bVar = (y9.b) this.a.get(aVar);
                for (q qVar : aVar.b) {
                    HashMap hashMap = this.b;
                    if (hashMap.containsKey(qVar)) {
                        arrayList2.add(new o2(8, (o) ((y9.b) hashMap.get(qVar)), bVar));
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
                y9.b bVar = (y9.b) entry.getValue();
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
                    arrayList.add(new o2(9, nVar, (y9.b) it.next()));
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
