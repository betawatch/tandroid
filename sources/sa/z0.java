package sa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class z0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        int x10 = aVar.x();
        if (x10 != 9) {
            return x10 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.v())) : Boolean.valueOf(aVar.n());
        }
        aVar.t();
        return null;
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.p((Boolean) obj);
    }
}
