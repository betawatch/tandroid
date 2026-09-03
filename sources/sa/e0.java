package sa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class e0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        if (aVar.x() != 9) {
            return Double.valueOf(aVar.o());
        }
        aVar.t();
        return null;
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.n(number.doubleValue());
        }
    }
}
