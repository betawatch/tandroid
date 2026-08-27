package pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class c0 extends ma.u {
    @Override // ma.u
    public final Object read(ua.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            return Long.valueOf(aVar.q());
        } catch (NumberFormatException e9) {
            throw new ma.j(e9);
        }
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.o(number.longValue());
        }
    }
}
