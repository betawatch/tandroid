package sa;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class d1 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            return Integer.valueOf(aVar.p());
        } catch (NumberFormatException e) {
            throw new pa.j(e);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        if (((Number) obj) == null) {
            bVar.i();
        } else {
            bVar.o(r4.intValue());
        }
    }
}
