package sa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class f0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        if (v.length() == 1) {
            return Character.valueOf(v.charAt(0));
        }
        StringBuilder t6 = android.support.v4.media.a.t("Expecting character, got: ", v, "; at ");
        t6.append(aVar.j());
        throw new pa.j(t6.toString());
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        Character ch2 = (Character) obj;
        bVar.r(ch2 == null ? null : String.valueOf(ch2));
    }
}
