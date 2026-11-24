// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qpb extends fs5 {
    public final StringBuilder e;

    public qpb() {
        super(4, (byte) 2);
        this.e = new StringBuilder();
    }

    @Override // fs5
    public final fs5 s() {
        fs5.t(this.e);
        return this;
    }

    @Override // fs5
    public final String toString() {
        return "<!--" + this.e.toString() + "-->";
    }
}
