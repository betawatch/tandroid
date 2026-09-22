package q9;

import android.util.Log;
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
import org.telegram.ui.web.g1;
import w7.r6;
import w7.s6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class g implements b {
    public static final f n = new f(0);
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
        int i10 = 2;
        int i11 = 0;
        arrayList3.add(a.c(lVar, l.class, ma.b.class, ma.a.class));
        arrayList3.add(a.c(this, g.class, new Class[0]));
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((pa.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.b(componentRegistrar));
                        it.remove();
                    }
                } catch (m e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
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
                r6.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.a.keySet());
                arrayList6.addAll(arrayList3);
                r6.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                a aVar2 = (a) obj4;
                this.a.put(aVar2, new n(new k9.d(i10, this, aVar2)));
            }
            arrayList5.addAll(g(arrayList3));
            arrayList5.addAll(h());
            f();
        }
        int size4 = arrayList5.size();
        while (i11 < size4) {
            Object obj5 = arrayList5.get(i11);
            i11++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            a(this.a, bool.booleanValue());
        }
    }

    public final void a(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            a aVar = (a) entry.getKey();
            pa.b bVar = (pa.b) entry.getValue();
            int i10 = aVar.d;
            if (i10 == 1 || (i10 == 2 && z10)) {
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

    @Override // q9.b
    public final Object b(Class cls) {
        return m(s.a(cls));
    }

    @Override // q9.b
    public final q c(s sVar) {
        pa.b i10 = i(sVar);
        return i10 == null ? new q(q.c, q.d) : i10 instanceof q ? (q) i10 : new q(null, i10);
    }

    public final void d(boolean z10) {
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
        a(hashMap, z10);
    }

    @Override // q9.b
    public final pa.b e(Class cls) {
        return i(s.a(cls));
    }

    public final void f() {
        HashMap hashMap = this.b;
        HashMap hashMap2 = this.c;
        for (a aVar : this.a.keySet()) {
            for (j jVar : aVar.c) {
                boolean z10 = jVar.b == 2;
                s sVar = jVar.a;
                if (z10 && !hashMap2.containsKey(sVar)) {
                    Set set = Collections.EMPTY_SET;
                    o oVar = new o();
                    oVar.b = null;
                    oVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    oVar.a.addAll(set);
                    hashMap2.put(sVar, oVar);
                } else if (hashMap.containsKey(sVar)) {
                    continue;
                } else {
                    int i10 = jVar.b;
                    if (i10 == 1) {
                        throw new k("Unsatisfied dependency for component " + aVar + ": " + sVar);
                    }
                    if (i10 != 2) {
                        hashMap.put(sVar, new q(q.c, q.d));
                    }
                }
            }
        }
    }

    public final ArrayList g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar.e == 0) {
                pa.b bVar = (pa.b) this.a.get(aVar);
                for (s sVar : aVar.b) {
                    HashMap hashMap = this.b;
                    if (hashMap.containsKey(sVar)) {
                        arrayList2.add(new g1(9, (q) ((pa.b) hashMap.get(sVar)), bVar));
                    } else {
                        hashMap.put(sVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList h() {
        HashMap hashMap = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.e != 0) {
                pa.b bVar = (pa.b) entry.getValue();
                for (s sVar : aVar.b) {
                    if (!hashMap2.containsKey(sVar)) {
                        hashMap2.put(sVar, new HashSet());
                    }
                    ((Set) hashMap2.get(sVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                o oVar = (o) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new g1(10, oVar, (pa.b) it.next()));
                }
            } else {
                s sVar2 = (s) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.b = null;
                oVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.a.addAll(set);
                hashMap.put(sVar2, oVar2);
            }
        }
        return arrayList;
    }

    @Override // q9.b
    public final synchronized pa.b i(s sVar) {
        s6.a(sVar, "Null interface requested.");
        return (pa.b) this.b.get(sVar);
    }

    @Override // q9.b
    public final Set l(s sVar) {
        pa.b bVar;
        synchronized (this) {
            bVar = (o) this.c.get(sVar);
            if (bVar == null) {
                bVar = n;
            }
        }
        return (Set) bVar.get();
    }

    @Override // q9.b
    public final Object m(s sVar) {
        pa.b i10 = i(sVar);
        if (i10 == null) {
            return null;
        }
        return i10.get();
    }
}
