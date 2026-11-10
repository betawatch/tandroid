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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g implements b {
    public static final ab.m n = new ab.m(1);
    public final l e;
    public final e h;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f = new AtomicReference();

    public g(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        l lVar = new l(executor);
        this.e = lVar;
        this.h = eVar;
        ArrayList arrayList3 = new ArrayList();
        int i7 = 2;
        int i10 = 0;
        arrayList3.add(a.c(lVar, l.class, ra.b.class, ra.a.class));
        arrayList3.add(a.c(this, g.class, new Class[0]));
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
                } catch (m e10) {
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
                this.a.put(aVar2, new n(new o9.c(i7, this, aVar2)));
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
        return e(r.a(cls));
    }

    @Override // u9.b
    public final p b(r rVar) {
        ua.b f10 = f(rVar);
        return f10 == null ? new p(p.c, p.d) : f10 instanceof p ? (p) f10 : new p(null, f10);
    }

    @Override // u9.b
    public final ua.b c(Class cls) {
        return f(r.a(cls));
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
        l lVar = this.e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.b;
                if (arrayDeque != null) {
                    lVar.b = null;
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
    public final Object e(r rVar) {
        ua.b f10 = f(rVar);
        if (f10 == null) {
            return null;
        }
        return f10.get();
    }

    @Override // u9.b
    public final synchronized ua.b f(r rVar) {
        tc.a(rVar, "Null interface requested.");
        return (ua.b) this.b.get(rVar);
    }

    @Override // u9.b
    public final Set g(r rVar) {
        ua.b bVar;
        synchronized (this) {
            bVar = (o) this.c.get(rVar);
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
            for (j jVar : aVar.c) {
                boolean z9 = jVar.b == 2;
                r rVar = jVar.a;
                if (z9 && !hashMap2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    o oVar = new o();
                    oVar.b = null;
                    oVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    oVar.a.addAll(set);
                    hashMap2.put(rVar, oVar);
                } else if (hashMap.containsKey(rVar)) {
                    continue;
                } else {
                    int i7 = jVar.b;
                    if (i7 == 1) {
                        throw new k("Unsatisfied dependency for component " + aVar + ": " + rVar);
                    }
                    if (i7 != 2) {
                        hashMap.put(rVar, new p(p.c, p.d));
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
                for (r rVar : aVar.b) {
                    HashMap hashMap = this.b;
                    if (hashMap.containsKey(rVar)) {
                        arrayList2.add(new f(0, (p) ((ua.b) hashMap.get(rVar)), bVar));
                    } else {
                        hashMap.put(rVar, bVar);
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
                for (r rVar : aVar.b) {
                    if (!hashMap2.containsKey(rVar)) {
                        hashMap2.put(rVar, new HashSet());
                    }
                    ((Set) hashMap2.get(rVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                o oVar = (o) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new f(1, oVar, (ua.b) it.next()));
                }
            } else {
                r rVar2 = (r) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.b = null;
                oVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.a.addAll(set);
                hashMap.put(rVar2, oVar2);
            }
        }
        return arrayList;
    }
}
