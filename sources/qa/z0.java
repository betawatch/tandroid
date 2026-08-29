package qa;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class z0 extends na.u {
    @Override // na.u
    public final Object read(va.a aVar) {
        int x4 = aVar.x();
        if (x4 != 9) {
            return x4 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.v())) : Boolean.valueOf(aVar.n());
        }
        aVar.t();
        return null;
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        bVar.p((Boolean) obj);
    }
}
