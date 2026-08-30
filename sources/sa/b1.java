package sa;

import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
            StringBuilder m9 = a2.m(p10, "Lossy conversion from ", " to byte; at path ");
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
