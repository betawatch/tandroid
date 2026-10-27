package s9;

import aa.m1;
import android.util.Log;
import com.google.android.gms.internal.play_billing.s1;
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
import org.telegram.ui.Wallet.a6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h implements b {
    public static final f n = new f(0);
    public final m e;
    public final e h;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f = new AtomicReference();

    public h(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        m mVar = new m(executor);
        this.e = mVar;
        this.h = eVar;
        ArrayList arrayList3 = new ArrayList();
        int i10 = 2;
        int i11 = 0;
        arrayList3.add(a.c(mVar, m.class, oa.b.class, oa.a.class));
        arrayList3.add(a.c(this, h.class, new Class[0]));
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ra.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (n e) {
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
                m1.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.a.keySet());
                arrayList6.addAll(arrayList3);
                m1.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                a aVar2 = (a) obj4;
                this.a.put(aVar2, new o(new m9.d(i10, this, aVar2)));
            }
            arrayList5.addAll(g(arrayList3));
            arrayList5.addAll(i());
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
            c(this.a, bool.booleanValue());
        }
    }

    @Override // s9.b
    public final Object a(Class cls) {
        return n(s.a(cls));
    }

    @Override // s9.b
    public final synchronized ra.b b(s sVar) {
        s1.a(sVar, "Null interface requested.");
        return (ra.b) this.b.get(sVar);
    }

    public final void c(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            a aVar = (a) entry.getKey();
            ra.b bVar = (ra.b) entry.getValue();
            int i10 = aVar.d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        m mVar = this.e;
        synchronized (mVar) {
            try {
                arrayDeque = mVar.b;
                if (arrayDeque != null) {
                    mVar.b = null;
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
                throw a1.g.j(it);
            }
        }
    }

    @Override // s9.b
    public final ra.b d(Class cls) {
        return b(s.a(cls));
    }

    public final void e(boolean z10) {
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

    public final void f() {
        HashMap hashMap = this.b;
        HashMap hashMap2 = this.c;
        for (a aVar : this.a.keySet()) {
            for (k kVar : aVar.c) {
                boolean z10 = kVar.b == 2;
                s sVar = kVar.a;
                if (z10 && !hashMap2.containsKey(sVar)) {
                    Set set = Collections.EMPTY_SET;
                    p pVar = new p();
                    pVar.b = null;
                    pVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    pVar.a.addAll(set);
                    hashMap2.put(sVar, pVar);
                } else if (hashMap.containsKey(sVar)) {
                    continue;
                } else {
                    int i10 = kVar.b;
                    if (i10 == 1) {
                        throw new l("Unsatisfied dependency for component " + aVar + ": " + sVar);
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
                ra.b bVar = (ra.b) this.a.get(aVar);
                for (s sVar : aVar.b) {
                    HashMap hashMap = this.b;
                    if (hashMap.containsKey(sVar)) {
                        arrayList2.add(new a6(29, (q) ((ra.b) hashMap.get(sVar)), bVar));
                    } else {
                        hashMap.put(sVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // s9.b
    public final q h(s sVar) {
        ra.b b10 = b(sVar);
        return b10 == null ? new q(q.c, q.d) : b10 instanceof q ? (q) b10 : new q(null, b10);
    }

    public final ArrayList i() {
        HashMap hashMap = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.e != 0) {
                ra.b bVar = (ra.b) entry.getValue();
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
                p pVar = (p) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new g(0, pVar, (ra.b) it.next()));
                }
            } else {
                s sVar2 = (s) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                p pVar2 = new p();
                pVar2.b = null;
                pVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                pVar2.a.addAll(set);
                hashMap.put(sVar2, pVar2);
            }
        }
        return arrayList;
    }

    @Override // s9.b
    public final Set j(s sVar) {
        ra.b bVar;
        synchronized (this) {
            bVar = (p) this.c.get(sVar);
            if (bVar == null) {
                bVar = n;
            }
        }
        return (Set) bVar.get();
    }

    @Override // s9.b
    public final Object n(s sVar) {
        ra.b b10 = b(sVar);
        if (b10 == null) {
            return null;
        }
        return b10.get();
    }
}
