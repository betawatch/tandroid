// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum srb extends qsb {
    public srb() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        int[] c = aqbVar.c(null, false);
        if (c == null) {
            aqbVar.f('&');
        } else {
            aqbVar.h(new String(c, 0, c.length));
        }
        aqbVar.c = qsb.c;
    }
}
