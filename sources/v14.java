// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class v14 implements en5 {
    public final boolean a;

    public v14(boolean z) {
        this.a = z;
    }

    @Override // en5
    public final rj7 b() {
        return null;
    }

    @Override // en5
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
