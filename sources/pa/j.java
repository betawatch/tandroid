package pa;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j implements ma.v {
    public static final i c;
    public static final i d;
    public final g5.b a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i10 = 0;
        c = new i(i10);
        d = new i(i10);
    }

    public j(g5.b bVar) {
        this.a = bVar;
    }

    public final ma.u a(g5.b bVar, ma.g gVar, ta.a aVar, na.a aVar2, boolean z10) {
        ma.u uVar;
        Object f22 = bVar.l(new ta.a(aVar2.value())).f2();
        boolean nullSafe = aVar2.nullSafe();
        if (f22 instanceof ma.u) {
            uVar = (ma.u) f22;
        } else if (f22 instanceof ma.v) {
            ma.v vVar = (ma.v) f22;
            if (z10) {
                ma.v vVar2 = (ma.v) this.b.putIfAbsent(aVar.a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = f22 instanceof ma.o;
            if (!z11) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + f22.getClass().getName() + " as a @JsonAdapter for " + oa.d.k(aVar.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a0 a0Var = new a0(z11 ? (ma.o) f22 : null, gVar, aVar, z10 ? c : d, nullSafe);
            nullSafe = false;
            uVar = a0Var;
        }
        return (uVar == null || !nullSafe) ? uVar : uVar.nullSafe();
    }

    @Override // ma.v
    public final ma.u create(ma.g gVar, ta.a aVar) {
        na.a aVar2 = (na.a) aVar.a.getAnnotation(na.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.a, gVar, aVar, aVar2, true);
    }
}
