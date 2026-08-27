package pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class z0 extends ma.u {
    @Override // ma.u
    public final Object read(ua.a aVar) {
        int x8 = aVar.x();
        if (x8 != 9) {
            return x8 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.v())) : Boolean.valueOf(aVar.n());
        }
        aVar.t();
        return null;
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        bVar.p((Boolean) obj);
    }
}
