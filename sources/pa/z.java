package pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z implements ma.v {
    public final ta.a a;
    public final boolean b;
    public final Class c;
    public final ma.o d;

    public z(Object obj, ta.a aVar, boolean z10, Class cls) {
        ma.o oVar = obj instanceof ma.o ? (ma.o) obj : null;
        this.d = oVar;
        oa.d.b(oVar != null);
        this.a = aVar;
        this.b = z10;
        this.c = cls;
    }

    @Override // ma.v
    public final ma.u create(ma.g gVar, ta.a aVar) {
        ta.a aVar2 = this.a;
        if (aVar2 != null ? aVar2.equals(aVar) || (this.b && aVar2.b == aVar.a) : this.c.isAssignableFrom(aVar.a)) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
