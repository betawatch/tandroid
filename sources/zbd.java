// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zbd implements fg1 {
    public final r8d a;

    public zbd(r8d r8dVar) {
        this.a = r8dVar;
    }

    @Override // fg1
    public final void a(oed oedVar) {
        fre.i(oedVar, "channel must not be null");
    }

    @Override // fg1
    public final void b(oed oedVar) {
        fre.i(oedVar, "channel must not be null");
    }

    @Override // fg1
    public final void c(oed oedVar) {
        fre.i(oedVar, "channel must not be null");
    }

    @Override // fg1
    public final void d(oed oedVar) {
        fre.i(oedVar, "channel must not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zbd.class == obj.getClass() && this.a == ((zbd) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
