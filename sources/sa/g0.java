package sa;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class g0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        int x10 = aVar.x();
        if (x10 != 9) {
            return x10 == 8 ? Boolean.toString(aVar.n()) : aVar.v();
        }
        aVar.t();
        return null;
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.r((String) obj);
    }
}
