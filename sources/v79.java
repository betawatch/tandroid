// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v79 {
    public h89 a;
    public h89 b;
    public w76 c;
    public o94[] d;
    public boolean e;
    public short f;

    public final wm4 a() {
        ite.a("Must set register function", this.a != null);
        ite.a("Must set unregister function", this.b != null);
        ite.a("Must set holder", this.c != null);
        u76 u76Var = this.c.b;
        ite.i(u76Var, "Key must not be null");
        return new wm4((Object) new j4d(this, this.c, this.d, this.e, this.f), (Object) new xab(this, u76Var, (byte) 9), (byte) 22);
    }
}
