package pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class c1 extends ma.u {
    @Override // ma.u
    public final Object read(ua.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int p6 = aVar.p();
            if (p6 <= 65535 && p6 >= -32768) {
                return Short.valueOf((short) p6);
            }
            StringBuilder o10 = i0.a.o(p6, "Lossy conversion from ", " to short; at path ");
            o10.append(aVar.j());
            throw new ma.j(o10.toString());
        } catch (NumberFormatException e9) {
            throw new ma.j(e9);
        }
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        if (((Number) obj) == null) {
            bVar.i();
        } else {
            bVar.o(r4.shortValue());
        }
    }
}
