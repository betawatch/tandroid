package sa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            StringBuilder m9 = l.d.m(p10, "Lossy conversion from ", " to byte; at path ");
            m9.append(aVar.j());
            throw new pa.j(m9.toString());
        } catch (NumberFormatException e6) {
            throw new pa.j(e6);
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
