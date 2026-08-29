package qa;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class z implements na.v {
    public final ua.a a;
    public final boolean b;
    public final Class c;
    public final na.o d;

    public z(Object obj, ua.a aVar, boolean z10, Class cls) {
        na.o oVar = obj instanceof na.o ? (na.o) obj : null;
        this.d = oVar;
        pa.d.b(oVar != null);
        this.a = aVar;
        this.b = z10;
        this.c = cls;
    }

    @Override // na.v
    public final na.u create(na.g gVar, ua.a aVar) {
        ua.a aVar2 = this.a;
        if (aVar2 != null ? aVar2.equals(aVar) || (this.b && aVar2.b == aVar.a) : this.c.isAssignableFrom(aVar.a)) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
