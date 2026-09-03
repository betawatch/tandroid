package pa;

import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.telegram.tgnet.TLObject;
import q5.c0;
import sa.h1;
import sa.x;
import sa.x0;
import sa.y0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g {
    public static final c h = c.d;
    public static final p i = t.a;
    public static final q j = t.b;
    public final ThreadLocal a = new ThreadLocal();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final c0 c;
    public final sa.j d;
    public final List e;
    public final boolean f;
    public final c g;

    public g(ra.f fVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        c0 c0Var = new c0(7, hashMap, arrayList4);
        this.c = c0Var;
        this.f = true;
        this.g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        arrayList5.add(tVar == t.a ? sa.r.c : new sa.p(tVar, 1));
        arrayList5.add(fVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.p);
        arrayList5.add(h1.g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.e);
        arrayList5.add(h1.f);
        sa.c0 c0Var2 = h1.k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var2));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        arrayList5.add(tVar2 == t.b ? sa.q.b : new sa.p(new sa.q(tVar2), 0));
        arrayList5.add(h1.h);
        arrayList5.add(h1.i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var2, 0).nullSafe(), 0));
        int i10 = 0;
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var2, 1).nullSafe(), i10));
        arrayList5.add(h1.j);
        arrayList5.add(h1.l);
        arrayList5.add(h1.q);
        arrayList5.add(h1.r);
        arrayList5.add(new x0(BigDecimal.class, h1.m, i10));
        arrayList5.add(new x0(BigInteger.class, h1.n, i10));
        arrayList5.add(new x0(ra.h.class, h1.o, i10));
        arrayList5.add(h1.s);
        arrayList5.add(h1.t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.w);
        arrayList5.add(h1.y);
        arrayList5.add(h1.u);
        arrayList5.add(h1.b);
        arrayList5.add(sa.h.c);
        arrayList5.add(h1.x);
        if (va.f.a) {
            arrayList5.add(va.f.c);
            arrayList5.add(va.f.b);
            arrayList5.add(va.f.d);
        }
        arrayList5.add(sa.b.c);
        arrayList5.add(h1.a);
        arrayList5.add(new sa.d(0, c0Var));
        arrayList5.add(new sa.d(1, c0Var));
        sa.j jVar = new sa.j(c0Var);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(c0Var, fVar, jVar, arrayList4));
        this.e = DesugarCollections.unmodifiableList(arrayList5);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final u b(wa.a aVar) {
        boolean z4;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z4 = true;
        } else {
            u uVar2 = (u) map.get(aVar);
            if (uVar2 != null) {
                return uVar2;
            }
            z4 = false;
        }
        try {
            f fVar = new f();
            map.put(aVar, fVar);
            Iterator it = this.e.iterator();
            u uVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uVar3 = ((v) it.next()).create(this, aVar);
                if (uVar3 != null) {
                    if (fVar.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    fVar.a = uVar3;
                    map.put(aVar, uVar3);
                }
            }
            if (z4) {
                threadLocal.remove();
            }
            if (uVar3 != null) {
                if (z4) {
                    concurrentHashMap.putAll(map);
                }
                return uVar3;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + aVar);
        } catch (Throwable th2) {
            if (z4) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r3 == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r3 == r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u c(v vVar, wa.a aVar) {
        boolean z4;
        Objects.requireNonNull(vVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        sa.j jVar = this.d;
        jVar.getClass();
        ConcurrentHashMap concurrentHashMap = jVar.b;
        if (vVar != sa.j.c) {
            Class cls = aVar.a;
            v vVar2 = (v) concurrentHashMap.get(cls);
            if (vVar2 == null) {
                qa.a aVar2 = (qa.a) cls.getAnnotation(qa.a.class);
                if (aVar2 != null) {
                    Class value = aVar2.value();
                    if (v.class.isAssignableFrom(value)) {
                        v vVar3 = (v) jVar.a.E(new wa.a(value)).u2();
                        v vVar4 = (v) concurrentHashMap.putIfAbsent(cls, vVar3);
                        if (vVar4 != null) {
                            vVar3 = vVar4;
                        }
                    }
                }
            }
            z4 = false;
            for (v vVar5 : this.e) {
                if (z4) {
                    u create = vVar5.create(this, aVar);
                    if (create != null) {
                        return create;
                    }
                } else if (vVar5 == vVar) {
                    z4 = true;
                }
            }
            if (z4) {
                return b(aVar);
            }
            throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
        }
        vVar = jVar;
        z4 = false;
        while (r0.hasNext()) {
        }
        if (z4) {
        }
    }

    public final xa.b d(Writer writer) {
        xa.b bVar = new xa.b(writer);
        bVar.k(this.g);
        bVar.r = this.f;
        bVar.l(2);
        bVar.v = false;
        return bVar;
    }

    public final String e(TLObject tLObject) {
        if (tLObject == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new j(e);
            }
        }
        Class cls = tLObject.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(tLObject, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e6) {
            throw new j(e6);
        }
    }

    public final void f(Object obj, Class cls, xa.b bVar) {
        u b10 = b(new wa.a(cls));
        int i10 = bVar.n;
        if (i10 == 2) {
            bVar.n = 1;
        }
        boolean z4 = bVar.r;
        boolean z10 = bVar.v;
        bVar.r = this.f;
        bVar.v = false;
        try {
            try {
                b10.write(bVar, obj);
            } catch (IOException e) {
                throw new j(e);
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e6.getMessage(), e6);
            }
        } finally {
            bVar.l(i10);
            bVar.r = z4;
            bVar.v = z10;
        }
    }

    public final void g(xa.b bVar) {
        k kVar = k.a;
        int i10 = bVar.n;
        boolean z4 = bVar.r;
        boolean z10 = bVar.v;
        bVar.r = this.f;
        bVar.v = false;
        if (i10 == 2) {
            bVar.n = 1;
        }
        try {
            try {
                try {
                    ra.d.l(kVar, bVar);
                } catch (IOException e) {
                    throw new j(e);
                }
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e6.getMessage(), e6);
            }
        } finally {
            bVar.l(i10);
            bVar.r = z4;
            bVar.v = z10;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
