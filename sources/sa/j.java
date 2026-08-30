package sa;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class j implements pa.v {
    public static final i c;
    public static final i d;
    public final q5.g0 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i10 = 0;
        c = new i(i10);
        d = new i(i10);
    }

    public j(q5.g0 g0Var) {
        this.a = g0Var;
    }

    public final pa.u a(q5.g0 g0Var, pa.g gVar, wa.a aVar, qa.a aVar2, boolean z4) {
        pa.u uVar;
        Object s22 = g0Var.I(new wa.a(aVar2.value())).s2();
        boolean nullSafe = aVar2.nullSafe();
        if (s22 instanceof pa.u) {
            uVar = (pa.u) s22;
        } else if (s22 instanceof pa.v) {
            pa.v vVar = (pa.v) s22;
            if (z4) {
                pa.v vVar2 = (pa.v) this.b.putIfAbsent(aVar.a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z10 = s22 instanceof pa.o;
            if (!z10) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + s22.getClass().getName() + " as a @JsonAdapter for " + ra.d.k(aVar.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a0 a0Var = new a0(z10 ? (pa.o) s22 : null, gVar, aVar, z4 ? c : d, nullSafe);
            nullSafe = false;
            uVar = a0Var;
        }
        return (uVar == null || !nullSafe) ? uVar : uVar.nullSafe();
    }

    @Override // pa.v
    public final pa.u create(pa.g gVar, wa.a aVar) {
        qa.a aVar2 = (qa.a) aVar.a.getAnnotation(qa.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.a, gVar, aVar, aVar2, true);
    }
}
