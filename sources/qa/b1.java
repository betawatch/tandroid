package qa;

import j7.l1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class b1 extends na.u {
    @Override // na.u
    public final Object read(va.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int p10 = aVar.p();
            if (p10 <= 255 && p10 >= -128) {
                return Byte.valueOf((byte) p10);
            }
            StringBuilder o10 = l1.o(p10, "Lossy conversion from ", " to byte; at path ");
            o10.append(aVar.j());
            throw new na.j(o10.toString());
        } catch (NumberFormatException e10) {
            throw new na.j(e10);
        }
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        if (((Number) obj) == null) {
            bVar.i();
        } else {
            bVar.o(r4.byteValue());
        }
    }
}
