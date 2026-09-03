package sa;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class b1 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int p10 = aVar.p();
            if (p10 <= 255 && p10 >= -128) {
                return Byte.valueOf((byte) p10);
            }
            StringBuilder m9 = kf.k0.m(p10, "Lossy conversion from ", " to byte; at path ");
            m9.append(aVar.j());
            throw new pa.j(m9.toString());
        } catch (NumberFormatException e) {
            throw new pa.j(e);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        if (((Number) obj) == null) {
            bVar.i();
        } else {
            bVar.o(r4.byteValue());
        }
    }
}
