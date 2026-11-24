// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
