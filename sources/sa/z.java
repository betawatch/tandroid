package sa;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class z implements pa.v {
    public final wa.a a;
    public final boolean b;
    public final Class c;
    public final pa.o d;

    public z(Object obj, wa.a aVar, boolean z4, Class cls) {
        pa.o oVar = obj instanceof pa.o ? (pa.o) obj : null;
        this.d = oVar;
        ra.d.b(oVar != null);
        this.a = aVar;
        this.b = z4;
        this.c = cls;
    }

    @Override // pa.v
    public final pa.u create(pa.g gVar, wa.a aVar) {
        wa.a aVar2 = this.a;
        if (aVar2 != null ? aVar2.equals(aVar) || (this.b && aVar2.b == aVar.a) : this.c.isAssignableFrom(aVar.a)) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
