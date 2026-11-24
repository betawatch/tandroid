// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t59 {
    public f69 a;
    public f69 b;
    public w56 c;
    public f84[] d;
    public boolean e;
    public short f;

    public final wk4 a() {
        fre.a("Must set register function", this.a != null);
        fre.a("Must set unregister function", this.b != null);
        fre.a("Must set holder", this.c != null);
        u56 u56Var = this.c.b;
        fre.i(u56Var, "Key must not be null");
        return new wk4((Object) new h2d(this, this.c, this.d, this.e, this.f), (Object) new v8b(this, u56Var, (byte) 9), (byte) 22);
    }
}
