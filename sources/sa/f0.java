package sa;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
