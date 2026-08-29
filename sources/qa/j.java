package qa;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j implements na.v {
    public static final i c;
    public static final i d;
    public final oc.i a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i10 = 0;
        c = new i(i10);
        d = new i(i10);
    }

    public j(oc.i iVar) {
        this.a = iVar;
    }

    public final na.u a(oc.i iVar, na.g gVar, ua.a aVar, oa.a aVar2, boolean z10) {
        na.u uVar;
        Object p22 = iVar.d2(new ua.a(aVar2.value())).p2();
        boolean nullSafe = aVar2.nullSafe();
        if (p22 instanceof na.u) {
            uVar = (na.u) p22;
        } else if (p22 instanceof na.v) {
            na.v vVar = (na.v) p22;
            if (z10) {
                na.v vVar2 = (na.v) this.b.putIfAbsent(aVar.a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = p22 instanceof na.o;
            if (!z11) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + p22.getClass().getName() + " as a @JsonAdapter for " + pa.d.k(aVar.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a0 a0Var = new a0(z11 ? (na.o) p22 : null, gVar, aVar, z10 ? c : d, nullSafe);
            nullSafe = false;
            uVar = a0Var;
        }
        return (uVar == null || !nullSafe) ? uVar : uVar.nullSafe();
    }

    @Override // na.v
    public final na.u create(na.g gVar, ua.a aVar) {
        oa.a aVar2 = (oa.a) aVar.a.getAnnotation(oa.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.a, gVar, aVar, aVar2, true);
    }
}
