// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class upb extends vpb {
    @Override // vpb
    /* renamed from: B */
    public final vpb s() {
        super.s();
        this.m = new fy();
        return this;
    }

    @Override // vpb, fs5
    public final /* bridge */ /* synthetic */ fs5 s() {
        s();
        return this;
    }

    @Override // fs5
    public final String toString() {
        fy fyVar = this.m;
        if (fyVar == null || fyVar.a <= 0) {
            return "<" + z() + ">";
        }
        return "<" + z() + " " + this.m.toString() + ">";
    }
}
